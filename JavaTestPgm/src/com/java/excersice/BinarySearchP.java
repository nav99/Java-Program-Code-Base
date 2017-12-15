/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class BinarySearchP {
    public static void main(String[] args) {
        Integer[] arr={7,2,12,54,32,78,43,65,90,76,55};
        //ArrayList<Integer> list=new ArrayList(Arrays.asList(arr));
        List<Integer> list= Arrays.asList(arr);
       
        Collections.sort(list);
         System.out.println("List "+list);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("Position is "+binarySearchOfNo(arr,12));
    }

    private static int binarySearchOfNo(Integer[] arr, int data) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==data)
                return data;
            else if(arr[mid]<data)
                ++low;
            else
                --high;
                
        }
    
        
        return -1;
    }

    
}
