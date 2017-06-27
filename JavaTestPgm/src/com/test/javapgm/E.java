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
class E1
{
    public void m1()
    {
        System.out.println("E1");
    }
}
class E2 extends E1
{
    public void m1()
    {
        System.out.println("E2");
    }
}

class E3
{
    public void m1()
    {
        System.out.println("E3");
    }
}

public class E extends E2 {
    public static void main(String[] args) {
        E1 e1=new E1();
        E2 e2=new E2();
        E3 e3=new E3();
        
       // E1 e11=new E2();
       E2 e21=(E2)new E1();
       // e21.m1();
        //e11.m1();
    }
    
}
