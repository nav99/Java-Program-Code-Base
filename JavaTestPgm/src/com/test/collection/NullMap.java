/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Tapreward
 */
public class NullMap {
    public static void main(String[] args) {
   
 
/**
 * it creates an empty HashMap instance
 */
 Map map = new HashMap();
/**
 * to insert the values into map, we use put() method
 */
 map.put("ONE", 1);
 map.put("TWO", 2);
 map.put("THREE", 3);
 map.put("FOUR", 4);
 map.put("FIVE", 5);
 
/**
 * get the Set Of keys from HashMap
 */
 Set setOfKeys = map.keySet();
 
/**
 * get the Iterator instance from Set
 */
 Iterator iterator = setOfKeys.iterator();
 
/**
 * Loop the iterator until we reach the last element of the HashMap
 */
while (iterator.hasNext()) {
/**
 * next() method returns the next key from Iterator instance.
 * return type of next() method is Object so we need to do DownCasting to String
 */
String key = (String) iterator.next();
 
/**
 * once we know the 'key', we can get the value from the HashMap
 * by calling get() method
 */
 Integer value = (Integer)map.get(key);
 
System.out.println("Key: "+ key+", Value: "+ value);
 
 }
    
    }
}
