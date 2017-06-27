/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

/**
 *
 * @author Mahadev
 */
public class StringReverseRecursion {
    public static void main(String[] args) {
        String str="vivek";
        System.out.println("Reverse string is "+reverseString(str));
    }

    private static String reverseString(String str) {
        if(null==str || str.length() < 1 )
            return str;
        else
        {
            //System.out.println("String :" +str);
            return reverseString(str.substring(1))+str.substring(0,1);
        }            
    }
    
}
