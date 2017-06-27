/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import static com.test.interviewbit.WaveArray.wave;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class RepeatedNoArray {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(4);
        System.out.println(repeatedNumber(a));

    }

    public static int repeatedNumber(final List<Integer> a) {
        int temp = 0;
        boolean[] boolArray = new boolean[a.size() +1];
        for (int i = 0; i < a.size(); i++) {
            temp = Math.abs(a.get(i));
            if (!boolArray[temp]) {
                boolArray[temp] = true;
            } else {
                return temp;
            }
        }
        
        return -1;
    }
}
