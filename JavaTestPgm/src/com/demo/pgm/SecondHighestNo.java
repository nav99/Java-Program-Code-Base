/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

/**
 *
 * @author Mahadev
 */
public class SecondHighestNo {
    public static void main(String[] args) {
        int[] arr={12,4,6,8,9,7,15,45,16,88,21,10};
        int firstHigh=0;
        int secHigh=0;
        if(arr[0]<arr[1])
        {
            firstHigh=arr[1];
            secHigh=arr[0];
        }else
        {
            firstHigh=arr[0];
            secHigh=arr[1];
        }
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>firstHigh)
            {
                secHigh=firstHigh;
                firstHigh=arr[i];
            }
            else if(arr[i]<firstHigh && arr[i]>secHigh)
            {
                secHigh=arr[i];
            }
        }
        System.out.println("First Highest : "+firstHigh+" Second Highest : "+secHigh);
    }
    
}
