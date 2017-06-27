/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Mahadev
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,6,4,8,9,44,77,40,19};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        System.out.println("Position is "+binarySearchNo(arr,4));
    }

    private static int binarySearchNo(int[] arr,int no) {
        int start=0;
        int end=arr.length-1;
        int pivot=0;
        
        while(start<=end)
        {
            pivot=(start+end)/2;
            if(arr[pivot]==no)
            {
                return pivot+1;
            }
            else if(arr[pivot]>no)
            {
                --end;
            }
            else
                ++start;
        }
        
        return -1;
    }
    
}
