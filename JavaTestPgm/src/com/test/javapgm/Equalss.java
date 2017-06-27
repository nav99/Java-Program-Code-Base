/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.io.Serializable;

/**
 *
 * @author Mahadev
 */
public class Equalss implements Serializable{
    String name;
    int rollNo;

    public Equalss(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public boolean equals(Object o)
    {
        try
        {
            Equalss e=(Equalss) o;
            if(name.equals(e.name)&&rollNo==e.rollNo)
            {
                return true;
            }
            else
                return false;
        }
        catch(ClassCastException c)
        {
            return false;
        }
        catch(NullPointerException npe)
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Equalss e1=new Equalss("Abcd", 101);
        Equalss e2=new Equalss("xyz", 102);
        Equalss e3=new Equalss("Abcd", 101);
        Equalss e4=e1;
        String a=new String("abcd");
        String b=new String("abcd");
        System.out.println(e1.equals(e4));
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(a.equals(b));
                
    }
    
}
