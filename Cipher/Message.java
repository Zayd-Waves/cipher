/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Message                                             |
|   Description:    Model class that represents a single message.       |
|                                                                       |
|                                                                       | 
|   Author:         Minegrade Team                                      |
|   Date:           4/28/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package Cipher;

public class Message {

    private String message;
    
    public Message() {
        message = "Default message";
    }
    
    public Message(String s) {
        message = s;
    }
    
    
    
    public void encrypt(char key) {
    
        char[] msgArray = message.toCharArray();
        
        for (int i = 0; i < msgArray.length; i++) {
        
            if((key % 3) == 0){
                for(int j = 0; j <= 7; j+=2){
                    if((getBit(msgArray[i], j) ^ getBit(key, j)) == 0){
                        msgArray[i] = clearBit(msgArray[i], j);
                    }else{
                        msgArray[i] = setBit(msgArray[i], j);
                    }
                }   
            }
            else if((key % 3) == 1){
                for(int j = 1; j <= 7; j+=2){
                    if((getBit(msgArray[i], j) ^ getBit(key, j)) == 0)
                        msgArray[i] = clearBit(msgArray[i], j);
                    else
                        msgArray[i] = setBit(msgArray[i], j);
                }
            }
            else if((key % 3) == 2){
                for(int j = 0; j <= 7; j++){
                    if((getBit(msgArray[i], j) ^ getBit(key, j)) == 0)
                        msgArray[i] = clearBit(msgArray[i], j);
                    else
                        msgArray[i] = setBit(msgArray[i], i);
                }
            }
        
        }
        message = new String(msgArray);
    }
    
    public void decrypt(char key) {
        encrypt(key);
    }
    
    public String getMessage() { return message; }
    
    
    /* Some helper methods for the actual encryption.
       getBit(), setBit(), clearBit() and printBits().    
    */
    private int getBit(char c, int position) {
        return (c & (1 << position)) >> position;
    }
    
    private char setBit(char c, int position) {
        c |= (1 << position);
        return c;
    }
    
    private char clearBit(char c, int position) {
        c &= ~(1 << position);
        return c;
    }
    
    public String printBits(char c) {
        String temp = "";
        for (int i = 0; i != 8; ++i) {
            int b = getBit(c, i);
            temp += b;
        }
        return new StringBuilder(temp).reverse().toString();
    }
}












