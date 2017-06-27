/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author Mahadev
 */
public class No1to100 {
    public static void main(String[] args) {
        printNo(1);
    }

    private static void printNo(int i) {
        if(i<=10)
        {
            System.out.print(i+" ");
            i=i+1;
            printNo(i);
        }
        else
            System.out.println("End");
    }
    
}
