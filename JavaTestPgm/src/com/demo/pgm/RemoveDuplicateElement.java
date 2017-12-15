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
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        System.out.println("Enter length of array ");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    
                }
            }
        }
    }
}
