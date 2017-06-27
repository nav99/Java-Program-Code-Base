/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.HashMap;

/**
 *
 * @author Tapreward
 */
public class Hello {
    
     public static void main(String args[]) {
         System.out.println("hello");
   // create hash map
   HashMap newmap = new HashMap();
      
   // populate hash map
   newmap.put(1, "tutorials");
   newmap.put(2, "point");
   newmap.put(null, "is best");
      
   // get value of key 3
   String val=(String)newmap.get(null);
      
   // check the value
   System.out.println("Value for key null is: " + val);
   }    
}
    
