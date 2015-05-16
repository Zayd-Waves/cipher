package Cipher;
import java.util.Scanner;


public class Screen {
	
	Scanner scan;
	
	public Screen(){ 
		 scan = new Scanner(System.in);

	}
	
	public void printMainMenu(){
		String menu = "-----Welcome to the Cipher Program!------\n"
						+ "Please Select an Option: \n"
						+"	(1) Encrypt or (2) Decrypt or (3) to exit? \n ";
			System.out.println(menu);
		
		
		
		
	}
	
	public void printEncryptMenu(){
		System.out.println("This is an encrpyt menu");
	
	}
	
	public void printDecryptMenu(){
		System.out.println("This is a decrpyt menu");
	}
	
	public int choice(){
		int input = scan.nextInt();
		return input;
	
	}
    
    public String takeMessageFromUser(){
        System.out.println("Please enter your message: ");
        String usrMsg = scan.nextLine();
        return usrMsg
        
    }
	
	
	
	
}