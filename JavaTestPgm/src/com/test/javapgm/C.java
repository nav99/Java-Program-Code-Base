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
class Aa
{
    int i;
    Aa(int i)
    {
       this.i=i; 
    }

    Aa() {
        
    }
}
public class C {
    public static void main(String[] args) {
        HashSet<Aa> a=new HashSet<Aa>();
       /* for(int i=0;i<100;i++)
        {
            a.add(new Aa());
        }*/
        Aa a1=new Aa(10);
        Aa a2=new Aa(20);
        Aa a3=new Aa(10);
        String str=null;
        
         a.add(a3);
         a.add(a2);
         a.add(a1);
         //System.out.println(a.size());
         //System.out.println(a1==a2);
         //System.out.println("equals: "+a1.equals(a3));
         //System.out.println("abc".equals(str));
         //System.out.println(str.equals("ab"));
         
         
         Integer i1=new Integer(10);
         Integer i2=new Integer(20);
         Integer i3=new Integer(10);
         
         System.out.println(i1.equals(i3));
         System.out.println(i1.equals(i2));
         
         
         
         
    }
    
}
