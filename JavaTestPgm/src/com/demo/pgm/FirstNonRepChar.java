/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mahadev
 */
public class FirstNonRepChar {

    public static void main(String[] args) {
        String str = "navneetgaur";
        Map<Character, Integer> map = new LinkedHashMap(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer value = map.get(ch);
            if (value != null) {
                map.put(ch, value + 1);
            } else {
                map.put(ch, 1);
            }
        }
        
        Set s=map.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry<Character, Integer> m=(Map.Entry) itr.next();
            if(m.getValue()==1)
            {
                System.out.println(m.getKey()+" "+m.getValue() );
                break;
            }
        
        }
        
        
        
        
    }

}
