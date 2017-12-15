/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mahadev
 */
public class LargestNo {

    public static void main(String[] args) {

        int no = 12345;

        char[] digits = (" " + no).toCharArray();

        int n = digits.length;
        findNext(digits, n);

    }

    // Utility function to swap two digit
    static void swap(char ar[], int i, int j) 
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    
    
    private static void findNext(char[] arr, int n) {
        int i;
        for (i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            System.out.println("Not possible");
        }
          else
        {
            int x = arr[i - 1], min = i;
            
              // II) Find the smallest digit on right 
            // side of (i-1)'th digit that is greater 
            // than number[i-1]
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] > x && arr[j] < arr[min]) 
                {
                    min = j;
                }
            }
            
             // III) Swap the above found smallest 
            // digit with number[i-1]
            swap(arr, i - 1, min);
 
            // IV) Sort the digits after (i-1) 
            // in ascending order
            Arrays.sort(arr, i, n);
            System.out.print("Next number with same" +
                                    " set of digits is ");
            for (i = 0; i < n; i++)
                System.out.print(arr[i]);
        }
            
        }
    }


