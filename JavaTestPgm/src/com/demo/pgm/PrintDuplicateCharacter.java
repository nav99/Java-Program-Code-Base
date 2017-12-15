/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mahadev
 */
public class PrintDuplicateCharacter {
    
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       printDuplicateCharacter(str);
    }

    private static void printDuplicateCharacter(String str) {
        
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            Integer value=map.get(ch);
            if(value!=null)
            {
                map.put(ch, value+1);
            }
                    
            else
                map.put(ch, 1);
        }
        System.out.println("Map : "+map);
        
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        for(Map.Entry<Character,Integer> m:set)
        {
            if(m.getValue()>1)
            {
                System.out.println("CHaracter : "+m.getKey()+" Value : "+m.getValue());
            }
        }
        
        
    }
    
    
}
