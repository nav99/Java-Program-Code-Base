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
public class B22 {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="ab";
        String s3=s2+"cd";
        System.out.println(s1==s3);
        System.out.println(4+2+" "+6+6+9);
        
        String s4=null;
        //System.out.println(s4.length());
        
        String s5="   abcd efg hij   ";
        System.out.println(s5.length());
        s5=s5.trim();
        System.out.println(s5.length());
        
        String s6="a1b2c3d4";
        System.out.println(s6.indexOf('a',4));
        System.out.println(s6.lastIndexOf('c',2));
        
        String s7="ab;xyz;opl;tr";
        String[] a7s=s7.split(";");
        for(String obj:a7s)
        {
            System.out.print(obj+"  ");
        }
    }
    
}
