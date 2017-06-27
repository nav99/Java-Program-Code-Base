/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

class C1
{
    C1()
    {
        System.out.println("C1");
    }
}

class C2
{
    C2()
    {
        System.out.println("C2");
    }
}

class C3
{
    C3()
    {
        System.out.println("C3");
    }
}
public class C {
    public static void main(String[] args) {
        Object[] obj=new Object[10];
        obj[0]=new C1();
        obj[1]=new C2();
        obj[2]=new C3();
        for(Object o:obj)
        {
            System.out.println(o);
        }
    }
    
}
