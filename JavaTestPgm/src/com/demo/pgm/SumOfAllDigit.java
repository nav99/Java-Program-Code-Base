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
public class SumOfAllDigit {

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println("Sum of all digit "+sumOfAllDigit(no));
        
    }

    private static int sumOfAllDigit(int no) {
        int sum=0,rem;
        while(no!=0)
        {
            rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        
        return sum;
    }

}
