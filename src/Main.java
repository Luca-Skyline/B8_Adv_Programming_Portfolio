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
						System.out.println(collection.get(i).display_overview());
					}
						
					int my_card = getInput("0) Return to Main Menu\n"
							+ "#) View Specific Card", collection.size());
					
					if(my_card == 0) {
						break;
					} //Return to Menu
									
					//else display Card Info
					clearScreen();
					collection.get()
				}			
					
				
				break;
			
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
