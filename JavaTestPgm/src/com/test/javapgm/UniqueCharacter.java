/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class UniqueCharacter {
    public static void main(String[] args) {
        System.out.println("Enter two String");
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        
        ArrayList output1=new ArrayList();
        ArrayList output2=new ArrayList();
        
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(str2.indexOf(ch)==-1)
            {
                output1.add(ch);
            }
        }
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(str1.indexOf(ch)==-1)
            {
                output2.add(ch);
            }
        }
        System.out.println("Output 1 : "+output1);
        System.out.println("Output 2 : "+output2);
    }
    
}
