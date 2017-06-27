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
public class NumRecursion {
    public static void main(String[] args) {
        num(1);
    }

    private static void num(int i) {
        if(i<=10)
        {
            System.out.println(i);
            num(i+1);
        }
       
    }
    
}
