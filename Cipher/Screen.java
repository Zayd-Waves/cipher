/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Screen                                              |
|   Description:    UI class that prints out the program's menus and    |
|                   handles user input.                                 |
|                                                                       | 
|   Author:         Minegrade Team                                      |
|   Date:           5/15/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package Cipher;

import java.util.Scanner;

public class Screen {

	
	Scanner scan;
	
	public Screen(){ 
        scan = new Scanner(System.in);
	}
	
	public void printMainMenu(){
        System.out.println();
        System.out.println();
        System.out.println();
		String menu = "                                    -----Welcome to the Cipher Program!------\n"
						+ "Please Select an Option: \n"
						+"	(1) Encrypt or (2) Decrypt or (3) to exit? \n ";
			System.out.println(menu);
	}
	
	public void printEncryptMenu(){
		System.out.println("This is an encrypt menu");
	}
	
	public void printDecryptMenu(){
		System.out.println("This is a decrypt menu");
	}
	
	public int choice(){
        System.out.println();
        int input = -1;
        
        // Error handling
        while (input > 3 || input < 0) {
            System.out.println("Enter a number from 1 - 3 ");
            while (!scan.hasNextInt()) {
                System.out.println("Please enter a number from 1 - 3 only!");
                scan.nextLine();
            }
            input = scan.nextInt();
        }
        scan.nextLine(); // Clears the buffer
        
        return input;
	}
    
    public String takeMessageFromUser(){
        System.out.println();
        System.out.println("Please enter your message: ");
        String usrMsg = scan.nextLine();
        return usrMsg;
    }
    
    
    public int takeKeyFromUser() {
        System.out.println();
        int key = 0;
        
        // Error handling
        while (key < 6) {
            System.out.println("Please enter the secret key ( Any number greater than 5 ): ");
            while (!scan.hasNextInt()) {
                System.out.println("Please enter the secret key ( Any number greater than 5 ): ");
                scan.nextLine();
            }
            key = scan.nextInt();
        }
        scan.nextLine(); // Clears the buffer
        
        return key;
    }
    
    
    /* Prints the given encrypted message to the user */
    public void printEncryptedMessage(String s) {
        System.out.println();
        System.out.println("Here is your encrypted message: " + s);
    }
    
    /* Prints the given decrypted message to the user. Kind of
       redundant but it helps us avoid unnecessary print statements 
       in the Control. Could be merged later on.
    */
    public void printDecryptedMessage(String s) {
        System.out.println();
        System.out.println("Here is your decrypted message: " + s);
    }

}





