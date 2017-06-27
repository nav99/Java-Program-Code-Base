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
public class SecondMax {

    public static void main(String[] args) {
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int firstMax=arr[0];
        int secondMax=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>firstMax)
            {
                secondMax=firstMax;
                firstMax=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]<firstMax)
            {
                secondMax=arr[i];
            }
        }
        
        System.out.println("Second Max element is "+secondMax);
        
        
    }

}
