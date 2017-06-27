/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
public class FreqChar {
    public static void main(String[] args) {
        String str="garden city bangalore";
        char[] ch=str.replaceAll(" ", "").toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<ch.length;i++)
        {
            Integer value=map.get(ch[i]);
            if(value!=null)
            {
                map.put(ch[i], value+1);
            }
            else
                map.put(ch[i], 1);
        }
        System.out.println("Output "+map);
    }
    
}
