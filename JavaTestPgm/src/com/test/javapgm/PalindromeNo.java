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
public class PalindromeNo {
     public static void main(String[] args) {
        int reverse=0,rem=0;
        System.out.println("Enter no ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        while(no>-1)
        {
            rem=no%10;
            reverse=reverse*10+rem;
        }
        System.out.println("reverse no"+reverse);
        
    }

    
}
