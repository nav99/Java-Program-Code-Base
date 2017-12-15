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
import java.util.HashMap;
import java.util.Map;
 
class PairSum
{
    private static final int MAX = 100000; // Max size of Hashmap
 
    static void printpairs(int arr[],int sum)
    {
        // Declares and initializes the whole array as false
        boolean[] binmap = new boolean[MAX];
        Map map=new HashMap();
 
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
            
            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
                
            }
            binmap[arr[i]] = true;
        }
    }
 
    // Main to test the above function
    public static void main (String[] args)
    {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A,  n);
    }
}
 