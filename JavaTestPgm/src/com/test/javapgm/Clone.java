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
public class Clone implements Cloneable{
    int i=11;
    int j=20;
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone c1=new Clone();
        Clone c2=(Clone) c1.clone();
        c2.i=88;
        c2.j=99;
        System.out.println(c1.i+"---"+c1.j);
        System.out.println(c2.i+"---"+c2.j);
        c1.i=50;
        System.out.println(c1.i+"---"+c1.j);
        System.out.println(c2.i+"---"+c2.j);
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        
    }
    
}
