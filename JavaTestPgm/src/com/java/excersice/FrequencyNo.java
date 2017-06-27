package com.java.excersice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyNo {
    public static void main(String[] args) {
        Integer[] arr={12,45,65,11,22,11,9,65,55,12,12,12,12,45};
        Map map=new HashMap();
        for(int i=0;i<arr.length;i++)
        {
            Integer value=(Integer) map.get(arr[i]);
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
