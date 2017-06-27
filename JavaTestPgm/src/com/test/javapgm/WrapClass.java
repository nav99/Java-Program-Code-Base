/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.ArrayList;

/**
 *
 * @author Mahadev
 */
public class WrapClass {
    public static void main(String[] args) {
        Boolean b1=new Boolean("Yes");
        Boolean b2=new Boolean("No");
        System.out.println(b1+" "+b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1==b2);
        Integer i=Integer.valueOf("1000");
        System.out.println(i);
        String str=String.valueOf(10);
        System.out.println(str);
        
        String strr="Nav";
        char[] ch=strr.toCharArray();
        for(int j=0;j<strr.length();j++)
        {
            System.out.println(ch[j]);
        }
        ArrayList al=new ArrayList();
        al.add(1099);
        System.out.println(al);
        
        int h=new Integer(10);
        System.out.println("h :"+h);
        Integer hh=99;
        System.out.println("");
        
        
    }
}
