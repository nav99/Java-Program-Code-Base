/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter range of prime no");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        for(int i=1;i<=limit;i++)
        {
            if(isPrimeNo(i))
            {
                System.out.print(i+" ");
            }
            
        }
                
    }

    private static boolean isPrimeNo(int no) {
        for(int i=2;i<no;i++ )
        {
            if(no%i==0)
                return false;
        }
    return true;
    }
    
}
