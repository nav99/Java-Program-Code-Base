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
public class A2 {
    public static void main(String[] args) {
        String s="javasoft";
        String s1="abcdbbefgbbh";
        System.out.println(s.equals("java"));
        System.out.println(s.equalsIgnoreCase("Java"));
        s=s.concat("scjp");
        System.out.println(s);
        System.out.println(s.charAt(5));
        System.out.println(s1.substring(2));
        System.out.println(s1.replace('b', 'x'));
        System.out.println(s1.replace("bb", "zz"));
        System.out.println(s1);
        
        System.out.println(s1.lastIndexOf('b'));
        System.out.println(s1.indexOf('b'));
        
        
        
    }
    
}
