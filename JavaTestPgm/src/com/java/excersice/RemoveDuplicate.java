/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Mahadev
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "abaacddebbcc";
        String ourString = "";
        char[] ch = str.toCharArray();
        
         Set<Character> charSet = new LinkedHashSet<Character>();
         for(char c:ch)
         {
             charSet.add(c);
         }
         StringBuilder sb=new StringBuilder();
         for(Character character:charSet)
         {
             sb.append(character);
         }
         
        System.out.println("Unique String is " + String.valueOf(sb));
    }

}
