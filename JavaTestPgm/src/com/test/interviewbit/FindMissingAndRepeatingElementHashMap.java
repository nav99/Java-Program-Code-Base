/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mahadev
 */
public class FindMissingAndRepeatingElementHashMap 
{
    public static void main(String[] args) {
    
       ArrayList<Integer> a=new ArrayList<>(Arrays.asList(3,1,2,5,6,6));
        System.out.println(repeatedNumber(a));
    }

    static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        ArrayList<Integer> output=new ArrayList<>();
        int repeatedNo=0;
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        
        for(int i=0;i<a.size();i++)
        {
            Integer no=a.get(i);
            Integer value=map.get(no);
            
            
            if(value!=null)
            {
                map.put(no, value+1);
            }
            else
                map.put(no, 1);
        }
        System.out.println("map "+map);
       for(int i=1;i<=a.size();i++)
       {
           if(map.get(i)==null || map.get(i)==2)
           {
               output.add(i);
           }
       }
        
        return output;
        
    
    }
    
    
}
