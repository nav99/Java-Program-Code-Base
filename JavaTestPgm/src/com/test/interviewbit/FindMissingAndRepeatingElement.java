/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class FindMissingAndRepeatingElement {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 1, 2, 5, 3));
        System.out.println(repeatedNumber(a));
    }

    static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        int repeated = 0;
        ArrayList<Integer> output = new ArrayList<>();
        boolean[] temp = new boolean[a.size() + 1];
        Arrays.fill(temp, 0, temp.length, false);
        for (int i = 0; i < a.size(); i++) {
            if (temp[a.get(i)]) {
                temp[a.get(i)] = false;
                repeated = a.get(i);
            } else {
                temp[a.get(i)] = true;
            }
        }

        output.add(repeated);

        for (int i = 1; i < temp.length; i++) {
            if (!temp[i] && i != repeated) {
                output.add(i);
            }
        }
        return output;

    }
}
