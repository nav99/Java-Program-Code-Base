/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.hackerEarth;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mahadev
 */
public class Pangram {
    public static void main(String[] args) {
        //String str="We promptly judged antique ivory buckles for the next prize ";
        String str="We promptly judged antique ivory";
        str=str.replaceAll(" ", "").toLowerCase();
        System.out.println(str);
        if(isPanagram(str))
        {
            System.out.println("Is Panagram");
        }
        else
            System.out.println("Not Pangram");
    }

    private static boolean isPanagram(String str) {
        char[] ch=str.toCharArray();
        Set output=new HashSet();
        if(str.length()<26)
            return false;
        else
        {
            for(int i=0;i<str.length();i++)
            {
                output.add(ch[i]);
                 if(output.size()==26)
                 {    return true;
                 
                 }
            
            }
           
            
                return false;
        }
            
    }
    
    
    
}
