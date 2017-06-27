/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.hackerEarth;

import java.util.Scanner;

/**
 *
 * @author Tapreward
 */
public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int no=sc.nextInt();
        if(no==1)
            System.out.println("1");
        else
        {
            while(no>1)
            {
                fact=fact*no;
                no--;
            }
        }
        System.out.println(fact);
    }
    
}
