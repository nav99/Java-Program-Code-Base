/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
public class SumOfTwoIndex {

    public static void main(String[] args) {
        int[] arr = {22, 12, 4, 9, 7, 5,2};
        int target = 27;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
                
        for (int i = 0; i < arr.length;i++ ) 
        {
            int diff;
            diff=target-arr[i];
            
            if(diff>0 && map.containsKey(diff))
            {
                
                System.out.println(map.get(diff)+" "+i);
            }
            map.put(arr[i], i);
            
        }

    }
}
