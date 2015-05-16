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
				screen.printEncryptMenu();
			}else if(choice == 2){
				screen.printDecryptMenu();
			}
		}
		
	
	}


}