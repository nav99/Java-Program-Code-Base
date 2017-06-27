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
public class NoToBinary {
    public static void main(String[] args) {
        
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int rem=0,binary;
        String reverse="";
        while(no!=0)
        {
            rem=no%2;
            reverse=reverse+String.valueOf(rem);
            no=no/2;
        }
        for(int i=reverse.length()-1;i>-1;i--)
        {
            char ch=reverse.charAt(i);
            System.out.print(ch);
        }
    }
            
    
}
