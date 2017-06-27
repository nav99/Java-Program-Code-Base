/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Mahadev
 */
public class WaveArray {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(1);
        System.out.println(wave(a));

    }

    public static ArrayList<Integer> wave(ArrayList<Integer> a) {
        Collections.sort(a);
        for(int i=0;i<a.size()-1;i=i+2)
        {
            
            int temp=a.get(i);
            a.set(i, a.get(i+1));
           a.set(i+1, temp);
        }

        return a;
    }
}
