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
public class Gcd {

    public static void main(String[] args) {
        int a = 60, b = 10;
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        
        while (a != 0 && b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return (a + b);
    }

}
