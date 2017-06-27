/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class LargestNo {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(3);
        a.add(30);
        a.add(34);
        a.add(5);
        a.add(9);
        System.out.println(largestNumber(a));
    }

    public static String largestNumber(final List<Integer> a) {
        StringBuilder output = new StringBuilder();
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (String.valueOf(o2) + String.valueOf(o1)).compareTo((String.valueOf(o1) + String.valueOf(o2)));
               // return o2.compareTo(o1);
            }   
        });
        int i = 0;
        for (; i < a.size(); i++) {
            if (a.get(i) != 0) {
                break;
            }
        }
        
        if(i >= a.size()) return "0";
        
        for (;i<a.size() ;i++) {
            output.append(a.get(i));
        }

        return output.toString();
    }
}
