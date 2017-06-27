/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class BinarySearch {
    public static void main(String[] args) {
        Integer arr[]={2,6,4,9,11,55,88,21,42,39,19};
        List asList = Arrays.asList(arr);
        Collections.sort(asList);
        System.out.println("ArrayList : "+asList);
        System.out.println("Index is "+binarySearch(arr,55));
    }


    private static int binarySearch(Integer[] arr, int data) {
          for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" : ");
        }
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
               --high;
           }
           else
               ++low;
        }
        
        
        return -1;
    }

}
