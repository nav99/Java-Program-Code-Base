/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;

/**
 *
 * @author Mahadev
 */
public class UnsortedSubArray {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(4);
        a.add(15);
        a.add(16);
        a.add(4);
        a.add(4);
        a.add(18);
        a.add(20);
        System.out.println(subUnsort(a));
    }

    public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int maxValue = Integer.MIN_VALUE;
        int minValueIndex = -1;
        int maxValueIndex = -1;
        int minValue = Integer.MAX_VALUE;

        for (int k = 0; k < A.size(); k++) {
            if (A.get(k) > maxValue) {
                maxValue = A.get(k);
                maxValueIndex = k;
            }
            if (A.get(k) < minValue) {
                minValue = A.get(k);
                minValueIndex = k;

            }
        }

        ArrayList<Integer> output = new ArrayList<>();
        int i = 0, j = A.size() - 1;
        for (; i < A.size() - 1; i++) {
            if (A.get(i + 1) >= A.get(i) && A.get(i) >= minValue && i >= minValueIndex) {
                continue;
            } else {
                break;
            }
        }
        if (i == A.size() - 1 || minValue == maxValue) {
            output.add(-1);
            return output;
        }
        for (; j > 0; j--) {
            if (A.get(j) >= A.get(j - 1) && A.get(j) == maxValue) {
                continue;
            }
            if (A.get(j) >= A.get(j - 1) && A.get(j) < maxValue && j <= maxValueIndex) {
                if ( A.get(j - 1) == A.get(minValueIndex) && A.get(j-1)<=A.get(j-2) ) {
                    j=j-1;
                     break;
                            
                } else {
                    continue;
                }
            }else {
                break;
            }
        }
        output.add(i);
        output.add(j);

        return output;
    }
}
