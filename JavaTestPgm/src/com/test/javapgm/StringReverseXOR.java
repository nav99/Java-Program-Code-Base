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
public class StringReverseXOR {

    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverseString(str);

    }
    

    private static void reverseString(String str) {
        int end = str.length() - 1;
        int start = 0;
        char[] ch=str.toCharArray();
        while (start < end) {
           ch[start]=(char) (str.charAt(start)^str.charAt(end));
           ch[end]=(char) (str.charAt(end)^str.charAt(start));
           ch[start]=(char) (str.charAt(start)^str.charAt(end));
           ++start;
           --end;
                   
            
        }
        for(int i=0;i<str.length();i++)
        {
            System.out.println(ch[i]);
        }
            
    }
}
