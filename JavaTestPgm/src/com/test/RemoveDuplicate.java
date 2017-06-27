/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str="abcaacdd";
        char[] ch=str.toCharArray();
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            Integer value=map.get(c);
            if(!map.containsValue(map.get(c)))
            {
                map.put(c, value+1);
                System.out.println("false");
            }
            else
                System.out.println("true");
        }
    }
    
}
