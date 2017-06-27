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
class eH
{
    private int age;
    public eH(int age)
    {
        super();
        this.age=age;
    }
    
    public int hashcode()
    {
        return age;
    }
}

public class equalsHashcodeDemo {
    public static void main(String[] args) {
        eH eh=new eH(99);
        System.out.println("Hashcode "+eh.hashcode());
        
        
    }
    
    
}
