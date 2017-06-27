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
public class A11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            Integer value=map.get(ch);
            if(value!=null)
            {
                map.put(str.charAt(i), value+1);
            }
            else
            {
                if(ch!=' ')
                map.put(str.charAt(i), 1);
            }   
        }
        System.out.println(map);
    }
    
}
