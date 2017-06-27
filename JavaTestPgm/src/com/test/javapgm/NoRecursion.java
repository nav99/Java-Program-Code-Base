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
public class NoRecursion {
    public static void main(String[] args) {
        System.out.println("Enter Start Point and End Point of No.");
        Scanner sc=new Scanner(System.in);
        int startPoint=sc.nextInt();
        int endPoint=sc.nextInt();
        
        number(startPoint,endPoint);
    }

    private static void number(int startPoint,int endPoint) {
        if(startPoint<=endPoint)
        {
            System.out.print(startPoint+" ");
            number(startPoint+1 , endPoint);
        }
    }
      
    
}
