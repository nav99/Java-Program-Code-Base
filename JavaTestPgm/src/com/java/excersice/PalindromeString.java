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
public class PalindromeString {
    public static void main(String[] args) {
         String str = "A man, a plan, a canal: Panama\"";
        //String str="madam";
        System.out.println(isPalindrome(str));
    }
    
    public static boolean isPalindrome(String str)
    {
        char[] ch=str.replaceAll("[.:, \"]", "").toLowerCase().toCharArray();
        
        for(int i=0,j=ch.length-1;j>0;i++,j--)
        {
            if(ch[i]!=ch[j])
            {
                return false;
            }
        }
        return true;
        
    }
}
