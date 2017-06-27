/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class SortByName {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Sunil");
        list.add("Dilip");
        list.add("Naman");
        list.add("Abhi");
        list.add("Bhuvan");
        
        System.out.println(sortByName(list));
    }

    private static List<String> sortByName(List<String> list) {
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        
        return list;
        
    }
}
