/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Mahadev
 */
public class MapIterate {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(10,"Ab");
        map.put(20, "Cd");
        map.put(30, "Ef");
        map.put(40, "Gh");
        map.put(50, "Ij");
        map.put(60, "Kl");
        System.out.println("Map :"+map);
        
        Set set=map.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            Map.Entry m1=(Map.Entry) it.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
    
}
