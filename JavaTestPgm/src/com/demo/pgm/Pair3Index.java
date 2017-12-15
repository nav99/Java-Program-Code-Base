/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.HashMap;

/**
 *
 * @author Mahadev
 */
public class Pair3Index {

    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int n = 20;
        printpairs(A, n);
    }

    private static void printpairs(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            int sum;
            sum=target-arr[i];
            for(int j=0;j<arr.length;j++)
            {
                 Integer diff=target-arr[i];
            if(diff>0 && map.containsKey(diff))
            {
                System.out.println(map.get(diff)+" "+i);
                
            }
            else
            map.put(arr[i],i);
     
            }
                    
        }
    }

}
