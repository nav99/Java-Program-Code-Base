/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;

/**
 *
 * @author Mahadev
 */
public class A {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(102, "Z");
        map.put(101, "C");
        map.put(101, "D");
        map.put(101, "E");
        System.out.println(map);
        
        TreeSet set =new TreeSet();
        set.add(102);
        set.add(103);
        set.add(101);
        set.add(101);
        set.add(101);
        set.add(108);
        System.out.println("Set "+set);
        
    }
    
}
