/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class BinarySearch {
    public static void main(String[] args) {
        Integer arr[]={12,44,36,99,54,75,32,54,87,65,38};
        List asList=Arrays.asList(arr);
        Collections.sort(asList);
        System.out.println("Data : "+asList);
        System.out.println("Index is "+binarySearch(arr,32));
    }

    private static int binarySearch(Integer[] arr, int data) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==data)
            {
                return mid+1;
            }
            else if(arr[mid]>data)
            {
                --high;
            }
            else
                ++low;
        }
        return -1;
    }

    
    
}
