/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
public class MissingAndRepetedNo {
    public static void main(String[] args) {
         ArrayList<Integer> a=new ArrayList<>(Arrays.asList(3,1,2,5,6,6));
        System.out.println(repeatedNumber(a));
        
    }

    private static ArrayList<Integer> repeatedNumber(ArrayList<Integer> a) {
        
        ArrayList<Integer> output=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<a.size();i++)
        {
            Integer repNo=a.get(i);
            Integer value=map.get(repNo);
            if(value!=null)
            {
                map.put(repNo, value+1);
            }
            else
                map.put(repNo, 1);
        
        }
        
        
        System.out.println("Map : "+map);
        
        for(int i=1;i<=a.size();i++)
        {
            if(map.get(i)==null || map.get(i)>1)
            {
                output.add(i);
            }
        }
        return output;
    }
    
}
