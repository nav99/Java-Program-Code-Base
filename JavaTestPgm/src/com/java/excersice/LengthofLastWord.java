/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

/**
 *
 * @author Mahadev
 */
public class LengthofLastWord {
    public static void main(String[] args) {
        String str="Hell world India Delhi navneetgaur bangalore";
        System.out.println(leanthOfLastWord(str));
    }

    private static int leanthOfLastWord(String str) {
        String strNew=str.trim();
        int lastIndex=strNew.lastIndexOf(" ");
        if(lastIndex==-1)
            return strNew.length();
        int lengthOfWord=0;
        for(int i=lastIndex;i<strNew.length()-1;i++)
            ++lengthOfWord;
        
        
        return lengthOfWord;
    }
    
}
