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
public class ThirdHighest {

    public static void main(String[] args) {
        int arr[] = {333,222,99,111,88,112, 55, 77, 88, 44, 11, 22, 33,};
        int largest=arr[0];
        int secondlargest=arr[1];
        int thirdlargest=arr[2];
        
        if(largest>secondlargest && largest<thirdlargest)
        {
            largest=arr[2];
            secondlargest=arr[0];
            thirdlargest=arr[1];
            
        }
        else if(largest<secondlargest && largest>thirdlargest)
        {
            largest=arr[1];
            secondlargest=arr[0];
            
            
        }

        for (int i = 3; i < arr.length; i++) {
            if (largest < arr[i]) {
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = arr[i];
            } else if (secondlargest < arr[i]) {
                thirdlargest = secondlargest;
                secondlargest = arr[i];
            } else if (thirdlargest < arr[i]) {
                thirdlargest = arr[i];
            }
        }
        
            System.out.println("thirdlargest is "+thirdlargest);
        
    }

}
