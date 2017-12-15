/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class DuplicateStringElement {
    public static void main(String[] args) {
        System.out.println("Enter String element in array");
        Scanner sc=new Scanner(System.in);
        String[] str=new String[6];
        for(int i=0;i<str.length;i++)
        {
            str[i]=sc.next();
        }
        HashSet set=new HashSet();
        /*
        for(String s:str)
        {
            if(!set.add(s))
            {
                System.out.println("Duplicate Elements is "+s);
            }
        }
        */
        for(int i=0;i<str.length-1;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].equals(str[j]) && i!=j)
                {
                    set.add(str[j]);
                   // System.out.println("Dup Element is "+str[j]);
                }
            }
        }
        System.out.println("Repeated data : "+set);
    }
    
}
