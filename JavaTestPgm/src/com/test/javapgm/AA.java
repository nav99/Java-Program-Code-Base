/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */

public class AA {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(uniqueString(str));
        
    }

    private static String uniqueString(String str) {
       
        char[] inputString=str.toCharArray();
        HashSet output=new HashSet();
        for(int i=0,j=1;i<str.length()-1;i++,j++)
        {
            char ch=str.charAt(j);
            if(ch!=inputString[i])
            {
             output.add(inputString[i]);
            }
        }
        return output.toString();
    }
    
}
