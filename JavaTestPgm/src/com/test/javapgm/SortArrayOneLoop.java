/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

/**
 *
 * @author Mahadev
 */
public class SortArrayOneLoop {
    public static void main(String[] args) {
        int arr[]={5,1,7,3,9};
        int j=0,prevIndex=0;
        System.out.println(arr.length-1+"<-- Length");
        for(int i=0;i<arr.length-1;i++)
        {
            j++;
            if(j<arr.length)
            {
                i=prevIndex;
            }
            else
            {
                j=i+1;
            }
            if(arr[i]<arr[j])
            {
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            prevIndex=i;
        
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
