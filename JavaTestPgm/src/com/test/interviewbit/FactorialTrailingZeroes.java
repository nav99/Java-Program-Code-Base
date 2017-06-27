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
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(101));
    }
    	public static int trailingZeroes(int a) {
            int noOfTrailingZero=0;
            for(int i=5;i<=a;i=i*5)
            {
                noOfTrailingZero=noOfTrailingZero+a/i;
            }               
            
            
            
            return noOfTrailingZero;
	}
}
