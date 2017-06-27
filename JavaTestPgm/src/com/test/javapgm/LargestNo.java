/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mahadev
 */
public class LargestNo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(25);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(98);
        al.add(984);
        System.out.println(largestNo(al));
        
    }

    private static String largestNo(ArrayList al) {
        StringBuilder output=new StringBuilder();
        Collections.sort(al, new Comparator<Integer>(){

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
