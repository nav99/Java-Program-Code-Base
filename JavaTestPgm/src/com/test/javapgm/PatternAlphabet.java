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
public class PatternAlphabet {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++)
        {
            int alphabet=65;
            for(int j=0;j<=i;j++)
            {
            System.out.print((char)alphabet);
            
            alphabet++;
            }
            System.out.println("");
        }
    }
    
}
