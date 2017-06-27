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
public class GCD1 {
    public static void main(String[] args) {
        int a=12,b=24,c=7;
        int maxNo=a>b?a:(b>c?b:c);
       int minNo=a>b?b:(a>c?c:a);
        System.out.println(maxNo+" "+minNo);
    }
    
}
