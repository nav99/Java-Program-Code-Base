
package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class BinarySearch {
    public static void main(String[] args) {
        Integer[] arr={44,66,54,12,18,99,54,21,89,77};
        List asList= Arrays.asList(arr);
        Collections.sort(asList);
        
        System.out.println("Index is :"+binarySeaarch(arr,77));
    }

    private static int binarySeaarch(Integer[] arr, int data) {
        System.out.println("Sorted Array");
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
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
