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
public class FindProducts {
    public static void main(String[] args) {
        long answer=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        
        int size=sc.nextInt();
        long arr[];
        arr = new long[size];
        System.out.println("Enter value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++)
        {
            answer=answer*arr[i]%(1000000000+7);
        }
        System.out.println(answer);
    }
    
}
