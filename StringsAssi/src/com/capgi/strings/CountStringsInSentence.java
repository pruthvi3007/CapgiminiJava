package com.capgi.strings;

public class CountStringsInSentence {
	public static void main(String args[])
	{
		String str= "I am Pruthvi";
		System.out.println(str.length());
		  
        int Count = 0;  
          
        for(int i = 0; i < str.length()-1; i++) {  
            //Counts all the spaces present in the string  
            //It doesn't include the first space as it won't be considered as a word  
            if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) {  
                Count++;  
            }  
        }  
        //To count the last word present in the string, increment wordCount by 1  
        Count++;  
          
        //Displays the total number of words present in the given string  
        System.out.println("Total number of words in the given string: " + Count);  
    }  
}  
		