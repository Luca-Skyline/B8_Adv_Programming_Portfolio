import java.io.*;
import java.util.Scanner;


public class Main {
	
	static Scanner scan;
	
	public static void main(String args[]) throws Exception {
		
		scan = new Scanner(System.in);

        
        clearScreen();
        System.out.println("Welcome to Pandora's Box, the securiest journal on the planet.\n");
        int my_key = getInput("Input magic number for this text file (1-50):", 50);
        
        infinite:
        while(true) {
        	
        	clearScreen();
        	
            switch(getInput("1) Add & Encrypt new Entry\n2) Decrypt Existing File\n3) Exit and Close", 3)) {
            case 1:
            	clearScreen();
            	System.out.println("Type your new entry:");
            	String input = scan.nextLine();
            	
            	//encode & write to file
            	char[] my_chars = input.toCharArray();
            	
            	FileWriter myWriter = new FileWriter("my_journal.txt", true);
            	myWriter.write("\n");
            	for(char c: my_chars) {
            		int code = c + my_key;
            		myWriter.write(code);
            	}
            	myWriter.close();
            	break;
            	
            	
            case 2:
            	
            	clearScreen();
            	
            	//file reader
                File file = new File("my_journal.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
            	
            	//read from file
                String st;
                                
                while ((st = br.readLine()) != null) {
                	char[] my_line = st.toCharArray();
                	for(char c: my_line) {
                		System.out.print((char) (c - my_key));
                	}
                	System.out.println();
                }                

                System.out.println("\nPress ENTER to continue...");
                scan.nextLine();
                
                break;
            	
            case 3:
            	break infinite;
            }
     
        }
        scan.close();
	}
	
    static int getInput(String prompt, int options) {
    	//System.out.println("Please select your action:");
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
    
    static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}
