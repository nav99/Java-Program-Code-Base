/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Mahadev
 */
public class B {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put(null, null);
        map.put(null, null);
        map.put(null, 101);
        map.put(null, 102);
        map.put(111, 112);
        map.put(null, 109);
        
        
        System.out.println(map);
        
        Hashtable ht=new Hashtable();
        ht.put(null, 101);
       // ht.put(101, 102);
        // ht.put(101, 102);
        
        System.out.println(ht);
    }
    
}
