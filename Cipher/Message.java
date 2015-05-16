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

    String message;
    
    public Message() {
        message = "Default message";
    }
    
    public Message(String s) {
        message = s;
    }
    
    public int getBit(char c, int position) {
        return (c & (1 << position)) >> position;
    }
    
    public char setBit(char c, int position) {
        c |= (1 << position);
        return c;
    }
    
    public char clearBit(char c, int position) {
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












