/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.Arrays;
import static java.util.Arrays.binarySearch;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        Integer[] arr={5,77,4,99,43,71,11,22,50};
        List list=Arrays.asList(arr);
        Collections.sort(list);
        
        System.out.println("Index is: "+ binarySearchDemo(arr,43));
        
    }

    private static int binarySearchDemo(Integer[] arr, int data) {
        System.out.println("Sorted Array :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==data)
            {
                return mid+1;
            }
            else if(arr[mid]>data)
            {
                ++low;
            }
            else
                --high;
        }
        
        return -1;
    }
    
}
