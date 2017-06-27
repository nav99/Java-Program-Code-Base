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
public class ToString {
    /*public String toString()
    {
        return "test";
    }*/
    public static void main(String[] args) {
        ToString toString=new ToString();
        String s=new String("Durga");
        Integer i=new Integer(10);
        StringBuffer sb=new StringBuffer("aaaa");
        
        System.out.println(sb); 
        System.out.println(toString);
        System.out.println(s);
        System.out.println(i);
    }
    
}
