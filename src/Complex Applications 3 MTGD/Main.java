import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

public class Main {
	
	static ArrayList<Card> collection = new ArrayList<Card>(); // Create an ArrayList object
	static Scanner scan;
	
	public static void main(String args[]) {
		scan = new Scanner(System.in);
		
		while(true) {
			clearScreen();
			System.out.println("Welcome to the Magic the Gathering Database (MTGD)");
			switch(getInput("1) View & Filter My Collection\n"
					+ "2) Add New Card\n"
					+ "3) Edit Card or Quantity\n4) Exit Application", 4)) {
			
			case 1: //View my Collection
				
				displayCollection(collection);
		
				break;
			
			case 2: //Add New Card
				clearScreen();
				System.out.println("-- Name of Card --");
				String name = scan.nextLine();
				int my_quantity = getInput("--Quantity in Collection-", 1000);
				System.out.println("-- Card Type --");
				ArrayList<Integer> my_types = new ArrayList<Integer>();
				my_types.add(getInput("1) LAND\n2) CREATURE\n3) INSTANT\n4) SORCERY\n5) ARTIFACT\n6) ENCHANTMENT\n7) PLANESWALKER\n8) TOKEN\n9) ARCANE\n10) BATTLE\n11) KINDRED", 11));
				while(true) {
					clearScreen();
					System.out.println("-- Card Type --");
					System.out.println("Current card types: " + my_types);
					System.out.println("Add more card types?");
					int other_type = getInput("1) LAND\n2) CREATURE\n3) INSTANT\n4) SORCERY\n5) ARTIFACT\n6) ENCHANTMENT\n7) PLANESWALKER\n8) TOKEN\n9) ARCANE\n10) BATTLE\n11) KINDRED\n  12) No more types", 12);
					if(other_type == 12) {break;}
					my_types.add(other_type);
				}
				System.out.println("-- Rarity --");
				int my_rarity = getInput("1) LAND\n2) COMMON\n3) UNCOMMON\n4) RARE\n5) MYTHIC", 5);
				int my_legendary = getInput("1) Legendary\n2) Not Legendary", 2);
				
				boolean is_legendary = false;
				
				if(my_legendary == 1) {
					is_legendary = true;
				}
				
				Card new_card = new Card(name, my_quantity, my_types, my_rarity, is_legendary);
				
				collection.add(new_card);
				
				System.out.println("Card '" + name + "' Added!");
				System.out.println("Press ENTER to continue.");
				scan.nextLine();
				
				break;
			
			case 3:
				clearScreen();
				
				if(collection.size() == 0) {
					System.out.println("Nothing to see here :0");
					System.out.println("Press ENTER to continue.");
					scan.nextLine();
					break;
				}
				
				for(int i = 0; i < collection.size(); i++) {
					System.out.print((i+1));
					System.out.print(") ");
					Card my_card = collection.get(i);
					String str = my_card.name;
					System.out.println(str);
				}
				int my_input = getInput("Please input number of card you would like to edit/remove: ", collection.size());
				clearScreen();
				Card my_card = collection.get(my_input - 1);
				String output = my_card.displayDetails();
				System.out.println(output);
				switch(getInput("\n What would you like to edit?\n1) Change Quantity\n2) Delete from Database", 2)) {
				case 1:
					int new_quantity = getInput("Input Quantity:", 1000);
					collection.get(my_input - 1).edit(new_quantity);
					break;
				case 2:
					collection.remove(my_input - 1);
				}
				
				break;
			
				
			case 4: //Exit Application
				return;
				
			}
		}
	}
	
    static void clearScreen() {  
    	System.out.println("------------");
    	System.out.print("\033[H\033[2J");
    	System.out.flush(); 
    }
    
    static int getInput(String prompt, int options) {
    	System.out.print(prompt + "\n");
    	int input = 0;
    	while(true) {
        	while(true) {
        		try {
            		input = Integer.parseInt(scan.nextLine());
            		break;
            	}
        		catch(Exception e){
        			System.out.println("Please type a number.\n");
        		}
        	}
        	if (input < 1 || input > options) {
        		System.out.println("Please input an integer between 1 and " + Integer.toString(options));
        	}
        	else {
        		break;
        	}
    	}
    	
    	return input;
    	
    }
    
    static void displayCollection(ArrayList<Card> cards) {
		while(true) {
			clearScreen();
			for(Card c : cards) {
				System.out.println(c.name);
			}
			System.out.println();
			
			if(cards.size() == 0) {
				System.out.println("Nothing to see here :0");
				System.out.println("Press ENTER to continue.");
				scan.nextLine();
				return;
			}
				
			switch(getInput("1) Return to Previous Menu\n2) View Specific Card\n3) Filter by Card Type", 3)) {
			case 1:
				return;
			
			case 2:
				clearScreen();
				for(int i = 0; i < cards.size(); i++) {
					System.out.print((i+1));
					System.out.print(") ");
					Card my_card = cards.get(i);
					String str = my_card.name;
					System.out.println(str);
				}
				int my_input = getInput("Please input number of card you would like to view: ", cards.size());
				clearScreen();
				Card my_card = cards.get(my_input - 1);
				String output = my_card.displayDetails();
				System.out.println(output);
				System.out.println("Press ENTER to return to previous Card List.");
				scan.nextLine();
				
				break;
				
			case 3:
				System.out.println("Please select a card type to filter by:");
				int my_type = getInput("1) LAND\n2) CREATURE\n3) INSTANT/SORCERY\n4) ARTIFACT/ENCHANTMENT\n5) OTHER", 5);
				ArrayList<Card> new_cards = new ArrayList<Card>();
				switch(my_type) {
					case 1:
						for(Card c : cards) {
							if(c.my_type.contains(Card.Type.LAND)) {
								new_cards.add(c);
							}
						}
						break;
					case 2:
						for(Card c : cards) {
							if(c.my_type.contains(Card.Type.CREATURE)) {
								new_cards.add(c);
							}
						}
						break;
						
					case 3:
						for(Card c : cards) {
							if(c.my_type.contains(Card.Type.INSTANT) || c.my_type.contains(Card.Type.SORCERY)) {
								new_cards.add(c);
							}
						}
						break;
					case 4:
						for(Card c : cards) {
							if(c.my_type.contains(Card.Type.ARTIFACT) || c.my_type.contains(Card.Type.ENCHANTMENT)) {
								new_cards.add(c);
							} 
						}
						break;
					case 5:
						for(Card c : cards) {
							if(c.my_type.contains(Card.Type.PLANESWALKER) || c.my_type.contains(Card.Type.TOKEN) || c.my_type.contains(Card.Type.BATTLE) || c.my_type.contains(Card.Type.KINDRED)) {
								new_cards.add(c);
							} 
						}
					default:
						System.out.println("Congrats, you successfully broke my program :)");
				}
				
				displayCollection(new_cards);
								
				
			}
			

		}	
    }
    
}
