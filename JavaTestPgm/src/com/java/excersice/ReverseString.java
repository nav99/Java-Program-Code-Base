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
public class ReverseString {
    public static void main(String[] args) {
        String str="madamas abcd";
        char[] ch=str.toCharArray();
        
        for(int i=0,j=str.length()-1;i<str.length();i++,j--)
        {
           ch[i]=str.charAt(j);
            
        }
        
        
        System.out.println(ch);
    }
    
}
