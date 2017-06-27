/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class FreqChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            Integer value=map.get(c);
            if(value !=null)
            {
                map.put(c, value+1);
            }
            else
                map.put(c, 1);
            
        }
        System.out.println(map);
        
    }
    
}
