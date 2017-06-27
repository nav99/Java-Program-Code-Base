/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.HashSet;

/**
 *
 * @author Mahadev
 */
class Demo
{
    private int i;
    Demo(int i)
    {
        i=i;
    }            

}

public class B {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        
        set.add(100);
        set.add(100);
        set.add(100);
        set.add(100);
        B b=new B();
        System.out.println("size: "+set.size());
        System.out.println(b.getClass().getName());
    }
    
}
