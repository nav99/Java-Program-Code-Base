/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

/**
 *
 * @author Mahadev
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={4,6,9,7,2,8,3,1,2};
        int low=0;
        int high=arr.length-1;
        QuickSort(arr,low,high);
        
        for(int i=0;i<arr.length-1;i++)
            System.out.println(arr[i]);
    }

    private static void QuickSort(int[] arr,int low,int high) {
        int pivot;
        if(high>low)
        {
            pivot=partition(arr,low,high);
            QuickSort(arr, low, pivot-1);
            QuickSort(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
       int left,right,pivot_item=arr[low];
       left=low;
       right=high;
       while(left<right)
       {
           while(arr[left]<=pivot_item)
               left++;
           while(arr[right]> pivot_item)
               right--;
           if(left<right)
           {
               int temp;
               temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
           }
       }
       arr[low]=arr[right];
       arr[right]=pivot_item;
       
       return right;
    }

}
