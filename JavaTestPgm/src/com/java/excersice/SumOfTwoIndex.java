/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
public class SumOfTwoIndex {

    public static void main(String[] args) {

        int[] arr = {1, 10, 12, 8, 4,20,25,5,30};
        sumOfIndex(arr, 40);
        System.out.println("");
        sumOfValue(arr,40);
    }

    private static void sumOfIndex(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            int diff;
            diff=target-arr[i];
            if(diff>0 && map.containsKey(diff))
            {
                
                System.out.println(map.get(diff)+" "+i);
            }
            map.put(arr[i],i);
                    
            
        }
    }
    
    
     private static void sumOfValue(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            int diff;
            diff=target-arr[i];
            if(diff>0 && map.containsKey(diff))
            {
                
                System.out.println(map.get(diff)+" "+diff);
            }
            map.put(arr[i],diff);
                    
            
        }
    }

}
