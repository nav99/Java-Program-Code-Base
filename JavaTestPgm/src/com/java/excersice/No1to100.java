/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

/**
 *
 * @author Mahadev
 */
public class No1to100 {
    public static void main(String[] args) {
        int i=1;
        printNo(i);
    }

    private static void printNo(int i) {
        if(i<=100)
        {
            System.out.print(i+" ");
            i=i+1;
            printNo(i);
        }
    }
}
