/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

/**
 *
 * @author Mahadev
 */
public class SecondHighest {
    public static void main(String[] args) {
        int arr[]={1,4,6,19,8,2,0,7,15,17,22,99,45,67,88};
        int firstHighest=arr[0];
        int secondHighest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstHighest)
            {
                secondHighest=firstHighest;
                firstHighest=arr[i];
            }
            else if(secondHighest<arr[i])
            {
                secondHighest=arr[i];
            }
        
        }
        System.out.println("Second HIghest "+secondHighest);
    }
    
}
