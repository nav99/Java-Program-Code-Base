/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

/**
 *
 * @author Mahadev
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("reverse no is "+reverse(-11464));
    }
    public static int reverse(int a) {
          long result = 0;
        while (a != 0) {
            result = result * 10 + (a % 10);
            a = a / 10;
        }
        System.out.println("result"+result);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}
