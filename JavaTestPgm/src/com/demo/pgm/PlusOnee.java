/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mahadev
 */
public class PlusOnee {

    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<Integer>();
        no.add(1);
        no.add(3);
        no.add(1);
        no.add(2);
        System.out.println(plusOne(no));
    }

    private static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int i = 0, j;
        boolean reminder = false;

        ArrayList<Integer> output = new ArrayList<Integer>();
        
        for (i = a.size() - 1; i >= 0;) {
            if (a.get(i) + 1 > 9) {
                output.add(0);

                reminder = true;
            } else {

                output.add(a.get(i) + 1);

                i--;
                reminder = false;
                break;
            }
        }
        Collections.reverse(output);
        return output;
    }

}
