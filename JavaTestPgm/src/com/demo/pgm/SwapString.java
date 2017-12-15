/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Mahadev
 */
public class SwapString {
    public static void main(String[] args) {
        String s1="abcdefgh";
        String s2="xyzmnop";
        
        s1=s1+s2;
        s2=s1.substring(0, s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("S1= "+s1+" S2="+s2);
        
        String s3="abcd";
        String s4="bc";
        
        int no1=1000;
        int no2=100;
        
        no1=no1+no2;//1100
        no2=no1-no2;//1000
        no1=no1-no2;//1100-1000
        System.out.println("No1 "+no1+" "+"No2 "+no2);
        ArrayList<Character> output1 = new ArrayList<Character>();
        for(int i=0;i<s3.length();i++)
        {
            char ch=s3.charAt(i);
            if(s4.indexOf(ch)==-1)
            {
                continue;
            }
            else
                output1.add(ch);
        }
        System.out.println("Output "+output1);
        
        
        
        
    }
    
}
