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
public class StarPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
