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
public class CheckNoisBinary {
    public static void main(String[] args) {
        System.out.println("Enter no");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if(no>1)
            System.out.println("One");
        System.out.println("No is binary : "+isBinary(no));
        
    }

    private static boolean isBinary(int num) {
        int copyNo=num;
        
        
        while(copyNo!=0)
        {
            int rem=copyNo%10;
            if(rem>1)
            {
                return false;
                
            }
            else
            {
                copyNo=copyNo/10;
            }
            
        }
        
        
        return true;
        
    }
    
}
