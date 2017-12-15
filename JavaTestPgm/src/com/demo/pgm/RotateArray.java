/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

/**
 *
 * @author Mahadev
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 3;
        for (int j = 0; j < d; j++) {
            rotateByOne(arr);

        }

    

        System.out.println("Resule Set is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    
    private static void rotateByOne(int[] arr) {
        int i = 0;
        int temp;
        temp = arr[0];
        for (; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }
    

    }

