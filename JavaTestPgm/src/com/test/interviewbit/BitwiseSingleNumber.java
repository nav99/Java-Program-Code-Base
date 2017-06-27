/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class BitwiseSingleNumber {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(5);
        a.add(2);
        a.add(1);
        a.add(5);
        a.add(6);
        a.add(6);
        a.add(7);
        System.out.println(singleNumber(a));
    }

   static public int singleNumber(final List<Integer> a) {
       int result=0;
       for(int i=0;i<a.size();i++)
       {
           result=a.get(i)^result;
       }
       
       return result;
	}
    
}
