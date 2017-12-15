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
public class NoPowerofTwo {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("No is power of two : "+isPowerOfTwo(num));
        System.out.println("Power of two : "+powerOfTwo(num));
    }

    private static boolean isPowerOfTwo(int num) {
        if(num<0)
            throw new IllegalArgumentException("number : "+num);
        
        if((num&-num)==num)
           return true;
       
        return false;
        
    }

    private static boolean powerOfTwo(int num) {
        int squre=1;
        while(num>=1)
        {
            if(num==squre)
            {
                return true;
            }
            squre=squre*2;
        }
        return false;
                
    }
    
}
