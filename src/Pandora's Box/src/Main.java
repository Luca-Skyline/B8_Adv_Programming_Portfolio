import java.io.*;
import java.util.Scanner;


public class Main {
	
	static Scanner scan;
	
	public static void main(String args[]) throws Exception {
		
		scan = new Scanner(System.in);
		
        File file = new File("/Users/9608429/eclipse-workspace/Pandora's Box/src/my_journal.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        System.out.println("Welcome to Pandora's Box, the securiest journal on the planet.\n");
        
        infinite:
        while(true) {
            switch(getInput("1) Add & Encrypt new Entry\n2) Decrypt Existing File\n3) Exit and Close", 3)) {
            case 1:
            	System.out.println("Type your new entry:");
            	String input = scan.nextLine();
            	//encode
            	
            	//write to file
            	
            case 2:
            	
            	//read from file
                String st;
                
                while ((st = br.readLine()) != null)
                    System.out.println(st);
                
                //decode and output
            	
            case 3:
            	break infinite;
            }
     

        }
        scan.close();
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
    
    static void clearScreen() {  
        System.out.print("\033\033");  
        System.out.flush();  
    }

}
