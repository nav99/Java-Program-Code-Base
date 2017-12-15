package com.java.excersice;

/**
 *
 * @author Mahadev
 */
public class SecondHighest {

    public static void main(String[] args) {
        int arr[] = {111,222, 4, 6, 19, 8, 2, 0, 7, 15, 17, 22, 99, 45, 67, 88,104};
        int firstHighest=0;
        int secondHighest=0;
        if(arr[0]>arr[1])
        {
            firstHighest=arr[0];
            secondHighest=arr[1];
        }
        else
        {
            firstHighest=arr[1];
            secondHighest=arr[0];
        }            
        
        
        for (int i = 2; i < arr.length; i++) {
                if (arr[i] > firstHighest) {
                    secondHighest = firstHighest;
                    firstHighest = arr[i];
                } else if (secondHighest < arr[i]) {
                    secondHighest = arr[i];
                }
            }

        
        System.out.println("Second HIghest " + secondHighest);
    }

}
