/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class EvenOddNo {
    
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
       /* if((num/2)*2==num)
            System.out.println("Even");
        else
            System.out.println("Odd"); */
        
        // Using Bitwis Operator
        
        if((num&1)==1)
            System.out.println("Odd");
        else
        System.out.println("Even");
        
        //Using Shift Operator
        
        if((num>>1)<<1==num)
        System.out.println("Even");
        else
            System.out.println("Odd");
        
        String s1="navneet";
        String s2="gaur";
        s1=s1+s2;
        s2=s1.substring(0, s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1+" "+s2);
    }
    
}
