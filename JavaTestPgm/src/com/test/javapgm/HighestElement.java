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
public class HighestElement {
    public static void main(String[] args) {
        int a[]={5,2,6,8,9,1,12,4,0};
        System.out.println(highestElement(a));
    }

    private static int highestElement(int[] a) {
        int highest=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>highest)
            {
                highest=a[i];
            }
        }
        
        return highest;
        
    }
    
}
