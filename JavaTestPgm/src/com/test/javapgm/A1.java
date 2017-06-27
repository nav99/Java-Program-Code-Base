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
public class A1 {
    String name;
    int rollNo;
    
    A1(String name,int rollNo)
    {
        this.name=name;
        this.rollNo=rollNo;
    }
    
    public String toString()
    {
        return name+" "+rollNo;
    }
    
    public static void main(String[] args) {
    
        A1 a=new A1("nav",101);
        A1 b=new A1("neet",102);
        System.out.println(a);
        System.out.println(b);
    }
    
}
