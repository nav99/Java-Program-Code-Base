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
class DParent
{
    public void m1()
    {
        System.out.println("D Parent");
    }
}

class DChildFirst
{
public void m1()
    {
        System.out.println("D Child first");
    }
    
}

class DChildSecond extends DParent
{
public void m1()
    {
        System.out.println("D Child second");
    }
    
}


public class D extends DParent{
    public void m1()
    {
        System.out.println("D");
    }
    public static void main(String[] args) {
        
        DParent dp=new DParent();
        DParent d1=new D();
        d1.m1();
        DParent d2=new DChildSecond();
        d2.m1();
       // DParent d3=new DChildFirst();
    }
    
}
