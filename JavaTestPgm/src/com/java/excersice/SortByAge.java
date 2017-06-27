/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mahadev
 */
public class SortByAge {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(44);
        list.add(99);
        list.add(11);
        list.add(33);
        list.add(88);
        list.add(66);
        
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        
        System.out.println(list);
    }
    
}
