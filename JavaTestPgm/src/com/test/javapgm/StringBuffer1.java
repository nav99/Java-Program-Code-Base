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
public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer("Soft");
         
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnopq");
        System.out.println(sb.capacity());
        sb.setCharAt(1, 'd');
        System.out.println(sb);
        sb.append(9.99);
        sb.append(55454);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.trimToSize();
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        
        String sb2="gaur";
        System.out.println(sb2.concat("navneet"));
        
        System.out.println(sb1);
        
        
    }
    
}
