/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
public class FreqNo {
    public static void main(String[] args) {
        Integer[] arr={12,45,65,11,22,11,9,65,55,12,12,12,12,45};
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            Integer value=map.get(arr[i]);
            if(value!=null)
            {
                map.put(arr[i], value+1);
            }
            else
                map.put(arr[i], 1);
        }
        
        System.out.println("Output "+map);
    }
    
}
