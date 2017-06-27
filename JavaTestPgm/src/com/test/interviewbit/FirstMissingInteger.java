/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mahadev
 */
public class FirstMissingInteger {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(8);

        System.out.println(a);
        System.out.println(firstMissingPositive(a));

        // System.out.println("Missing No "+firstMissingPositive(a));
    }

    public static int firstMissingPositive(ArrayList<Integer> a) {
        int sum = 0;
        int j = 0;
        int i = 0;
        for (; i < a.size() && j < a.size();) {
            if (a.get(j) <= 0) {
                int temp;
                temp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
                i++;
            }
            j++;
        }

        a = new ArrayList<>(a.subList(i, a.size()));

        for (i = 0; i < a.size(); i++) {
            if (Math.abs(a.get(i)) <= a.size()) {
                a.set(Math.abs(a.get(i)) - 1, -Math.abs(a.get(Math.abs(a.get(i)) - 1)));
            }
        }
        
        for(i = 0 ; i < a.size() ; i++){
            if(a.get(i) > 0) {
                return i+1;
            }
        }
        return a.size() + 1;
    }

}
