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
public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        primeFactor(no);
    }

    private static void primeFactor(int no) {
        while(no%2==0)
        {
            System.out.println("2 "+" ");
            no=no/2;
        }
        for(int i=3;i<=Math.sqrt(no);i=i+2)
        {
            while(no%i==0)
            {
                System.out.println(i+" ");
                no=no/i;
            }
        }
        if(no>2)
            System.out.println(no);
    }
}
