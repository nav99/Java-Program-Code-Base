/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
public class FreqNo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(2, 4, 6, 4, 5, 9, 8,4,4,5,5, 7, 1, 5));
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Integer freq = list.get(i);
            Integer value = map.get(freq);
            if (value!=null) {
                map.put(freq, value + 1);
            }
            else
                map.put(freq, 1);

        }
        System.out.println(map);
    }
}
