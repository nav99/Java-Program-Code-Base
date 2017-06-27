/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

/**
 *
 * @author Mahadev
 */
 class Parent
{

  public void m1() 
 {
     System.out.println("Parent");
 }
}
class Child extends Parent
{
    @Override
    public void m1() 
    {                                                                                
        System.out.println("child");
    }

}
public class A extends Parent{
   
    public void m1(StringBuffer sb)
    {
        System.out.println("StringBuffer");
    }
    public void m1(String str)
    {
        System.out.println("String");
    }
    public void m2(Object o)
    {
        System.out.println("object");
    }
    public void m2(String s)
    {
        System.out.println("string version");
    }
    public static void main(String[] args) {
        Parent p=new A();
        p.m1();
        A a=new A();
        a.m1(new StringBuffer("durga"));
        a.m1("string");
        //a.m1(null);
        
        a.m2(new Object());
        a.m2("durga");
        a.m2(null);
        
       // A a=new Parent(); 
        //Child child=new Parent();
        
        
        
    }
    
}
