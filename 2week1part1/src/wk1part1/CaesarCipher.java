package wk1part1;
import edu.duke.*;

public class CaesarCipher {
	
	    public String encrypt(String input, int key) {
	       
	        StringBuilder encrypted = new StringBuilder(input);
	        
	        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
	        for(int i = 0; i < encrypted.length(); i++) {
	            char currChar = encrypted.charAt(i);
	            int idx = alphabet.indexOf(Character.toUpperCase(currChar));
	            if(idx != -1){
	                if (currChar == Character.toUpperCase(currChar)){
	                    char newChar = shiftedAlphabet.charAt(idx);
	                    encrypted.setCharAt(i, newChar);
	                }
	                else{
	                   char newChar = shiftedAlphabet.charAt(idx);
	                    
	                    encrypted.setCharAt(i, Character.toLowerCase(newChar)); 
	                }
	            }
	            
	        }
	        
	        return encrypted.toString();
	    }
	    
	  
	    public String encryptTwoKeys(String input, int key1, int key2) {
	         
	        StringBuilder encrypted = new StringBuilder(input);
	        
	        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      
	        String shiftedAlphabet1 = alphabet.substring(key1)+alphabet.substring(0,key1);
	        String shiftedAlphabet2 = alphabet.substring(key2)+alphabet.substring(0,key2);
	       
	        for(int i = 0; i < encrypted.length(); i++) {
	            char currChar = encrypted.charAt(i);
	            
	            int idx = alphabet.indexOf( Character.toUpperCase(currChar));
	            
	            if(idx != -1 && i%2 ==0){
	               
	                if (currChar == Character.toUpperCase(currChar)){
	                    char newChar = shiftedAlphabet1.charAt(idx);
	                    encrypted.setCharAt(i, newChar);
	                }
	                else{
	                   char newChar = shiftedAlphabet1.charAt(idx);
	                    encrypted.setCharAt(i, Character.toLowerCase(newChar)); 
	                }
	            }
	            else if (idx != -1 && i%2 ==1){
	                if (currChar == Character.toUpperCase(currChar)){
	                    char newChar = shiftedAlphabet2.charAt(idx);
	                    encrypted.setCharAt(i, newChar);
	                }
	                else{
	                   char newChar = shiftedAlphabet2.charAt(idx);
	                    encrypted.setCharAt(i, Character.toLowerCase(newChar)); 
	                }
	            }
	            
	        }
	        
	        return encrypted.toString();
	    }

	    public void testCaesar() {
	        int key = 23,key2=17;
	        FileResource fr = new FileResource();
	        String message = fr.asString();
	        String encrypted = encrypt(message, key);
	        System.out.println("encrypted with one key  " + key + "\n" + encrypted);
	        String decrypted = encrypt(encrypted, 26-key);
	        System.out.println(decrypted);
	        String encryptedTwoKeys = encryptTwoKeys(message,key,key2);
	        System.out.println("encrypted with two keys    " + key      +"    " + key2+ "\n"+ encryptedTwoKeys);
	        String decryptedtwokeys = encryptTwoKeys(encryptedTwoKeys,26-key, 26-key2);
	        System.out.println(decryptedtwokeys);
	    }
	
	}


