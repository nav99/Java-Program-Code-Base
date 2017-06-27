/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class FibbonaciRecursion {
static int first = 0, second = 1, fibb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int endPoint = sc.nextInt();
        System.out.println(first);
        System.out.println(second);
        fibbonaci(endPoint-2);
    }

    private static void fibbonaci(int endPoint) {
        
        
        if (endPoint > 0) {
            fibb = first + second;
            first = second;
            second = fibb;

            System.out.println(fibb);

             fibbonaci(endPoint - 1);
        }
    }

}
