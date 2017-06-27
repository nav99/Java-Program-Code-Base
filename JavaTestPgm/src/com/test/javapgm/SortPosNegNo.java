/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

/**
 *
 * @author Mahadev
 */
public class SortPosNegNo {

    public static void main(String[] args) {
        int[] arr = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};
        int positive = 0, negative = 0,j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= 0) {
                
                    arr[j]=arr[i];
                    arr[i]=arr[i+1];
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    }


