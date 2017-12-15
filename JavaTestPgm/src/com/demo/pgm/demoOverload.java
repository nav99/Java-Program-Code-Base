/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

/**
 *
 * @author Mahadev
 */
class demoOL1
{
    protected int m1()
    {
        System.out.println("m1");
        return 100;
    }
}
class demoOL2 extends demoOL1
{
    @Override
    public int m1()
    {
        System.out.println("m1");
        return 100;
    }
}

public class demoOverload {
     static final int m1(int i)
    {
        System.out.println("i");
        return 0;
    }
    public Integer m1(int j,int i)
    {
        return 1;
    }
    public int m1(int i,int j,int k)
    {
        return 1;
    }
}
