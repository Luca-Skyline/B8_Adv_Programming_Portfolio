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
			switch(getInput("1) View My Collection\n"
					+ "2) Add New Card\n"
					+ "3) Edit/Remove Existing Card\n"
					+ "4) Exit Application", 4)) {
			
			case 1: //View my Collection
				while(true) {
					clearScreen();
					for(int i = 0; i < collection.size(); i++) {
						System.out.print((i+1));
						System.out.print(") ");
						Card my_card = collection.get(i);
						String str = my_card.displayOverview();
						System.out.println(str);
					}
						
					int my_input = getInput(collection.size() + ") Return to Main Menu\n"
							+ "#) View Specific Card", collection.size());
					
					if(my_input == collection.size()) {
						break;
					} //Return to Menu
									
					//else display Card Info
					clearScreen();
					Card my_card = collection.get(my_input);
					String output = my_card.displayDetail();
					System.out.println(output);
					
					my_input = getInput("1) Return to Main Menu\n"
							+ "2) Return to my collection", 2);
					
					if(my_input == 1) {
						break;
					}
				}			
					
				
				break;
			
			case 2: //Add New Card
				System.out.println("-- Name of Card --");
				String name = scan.nextLine();
				System.out.println("-- Card Type --");
				int my_type = getInput("1) LAND\n2) CREATURE\n3) INSTANT\n4) SORCERY\n5) ARTIFACT/n6) ENCHANTMENT/n7) PLANESWALKER/n8) TOKEN/n9) ARCANE/n10) BATTLE/n11) KINDRED", 11);
				System.out.println("-- Rarity --");
				int my_rarity = getInput("1) LAND\n2) COMMON\n3) UNCOMMON\n4) RARE\n5) MYTHIC", 5);
				int is_legendary = getInput("1) Legendary\n2) Not Legendary", 2);
				
			}
		}
	}
	
    static void clearScreen() {  
        System.out.print("\033\033");  
        System.out.flush();  
    }
    
    static int getInput(String prompt, int options) {
    	System.out.println("Please select your action:");
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
        	if (input < 0 || input > options) {
        		System.out.println("Please input an integer between 1 and " + Integer.toString(options));
        	}
        	else {
        		break;
        	}
    	}
    	
    	return input;
    	
    }
}
