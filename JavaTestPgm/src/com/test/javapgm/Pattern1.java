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
public class Pattern1 {
    public static void main(String[] args) {
        int no=5;
        for(int i=0;i<no;i++)
        {
            for(int j=no-i;j>0;j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
    
}
