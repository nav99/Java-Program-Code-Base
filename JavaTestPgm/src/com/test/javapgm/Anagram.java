/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class Anagram {
    
    public static void main(String[] args) {
        System.out.println("Enter two string");
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(isAnagram(str1,str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
        
    }

    private static boolean isAnagram(String str1,String str2) {
        str1=str1.toLowerCase();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        if(str1.length()==str2.length())
        {
            for(int i=0;i<str1.length();i++)
            {
                char ch=str2.charAt(i);
                if(str2.indexOf(ch)==-1)
                {
                    return false;
                }
                else
                    return true;
            }
        }
        else
        {
            return false;
        }
        
        return false;
    }
    
}
