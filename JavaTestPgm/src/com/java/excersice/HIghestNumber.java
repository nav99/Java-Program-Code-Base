/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class HIghestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(34);
        al.add(5);
        al.add(88);
        al.add(55);
        al.add(99);
        System.out.println(" Largest no is "+largestNo(al));
    }

    private static String largestNo(final ArrayList<Integer> al) {
        StringBuilder sb=new StringBuilder();;
        Collections.sort(al, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return (String.valueOf(o2)+String.valueOf(o1)).compareTo(String.valueOf(o1)+String.valueOf(o2));
            }
        });
        
        System.out.println("Arraylist is "+al);
        
        for(int i=0;i<al.size();i++)
        {
            sb.append(al.get(i));
        }
        
        
        return sb.toString();
        
        
    }
    
}
