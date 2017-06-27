/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mahadev
 */
public class LargestNum {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(4);
        al.add(34);
        al.add(9);
        al.add(87);
        al.add(2);
        System.out.println(largestNum(al));
    }

    private static String largestNum(final ArrayList<Integer> al) {
        StringBuilder output=new StringBuilder();
        Collections.sort(al, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return (String.valueOf(o2)+String.valueOf(o1)).compareTo(String.valueOf(o1)+String.valueOf(o2));
            }
        });
       
        for(int i=0;i<al.size();i++)
        {
            output.append(al.get(i));
        }
        
        return output.toString();
    }
    
}
