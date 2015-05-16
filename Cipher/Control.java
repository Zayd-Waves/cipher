/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Control                                             |
|   Description:    Class that 'controls' the flow of the program.      |
|                   Main class hands over control via startProgram().   |
|                                                                       | 
|   Author:         Minegrade Team                                      |
|   Date:           4/28/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package Cipher;

public class Control {

	Screen screen;

    /* Control class constructor. Will complete later.
       - Waves
    */
    public Control(){
		screen = new Screen();
	}
	
	public void startProgram(){
		int choice = -1;
		while(choice!= 3){
			screen.printMainMenu();
			choice = screen.choice();
			if(choice == 1){
				//screen.printEncryptMenu();
                String m = screen.takeMessageFromUser();
                Message theMsg = new Message(m);
                int key = screen.takeKeyFromUser();
                theMsg.encrypt((char)key);
                screen.printEncryptedMessage(theMsg.getMessage());
			}else if(choice == 2){
				//screen.printDecryptMenu();
                String m = screen.takeMessageFromUser();
                Message theMsg = new Message(m);
                int key = screen.takeKeyFromUser();
                theMsg.decrypt((char)key);
                screen.printDecryptedMessage(theMsg.getMessage());
			}
		}
		
	
	}


}