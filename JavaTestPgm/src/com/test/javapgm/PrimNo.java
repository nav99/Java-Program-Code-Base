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
public class PrimNo {
    public static void main(String as[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        for(;num1<=num2;num1++)
        {
            if(isPrimeNo(num1))
            {
                System.out.print(num1+" ");
            }
           
        }
    
    }

    private static boolean isPrimeNo(int num1) {
        for(int i=2;i<=num1/2;i++)
        {
            if(num1%i==0)
                return false;
            }
        return true;
    }
    
}
