/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mahadev
 */
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(9.67);
        al.add(12.5);
        al.add(99);
        al.add(55);
        al.add(23.6);
        al.add(35.4);
        al.add(35.4);
        al.add(99);
        // System.out.println(al.contains(99));
        System.out.println(al);

        Collections.sort(al, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if ((o1 instanceof Integer) && (o2 instanceof Integer)) {
                    return ((Integer) o1 - (Integer) o2);
                }
                if ((o1 instanceof Double) && (o2 instanceof Double)) {
                    Double v = ((Double) o1 - (Double) o2);
                    return v.intValue();
                }
                if ((o1 instanceof Integer) && (o2 instanceof Double)) {
                    Double v = ((Integer) o1 - (Double) o2);
                    return v.intValue();
                }
                if ((o1 instanceof Double) && (o2 instanceof Integer)) {
                    Double v = ((Double) o1 - (Integer) o2);
                    return v.intValue();
                }
                return 0;

            }
        });
        System.out.println(al);

    }

}
