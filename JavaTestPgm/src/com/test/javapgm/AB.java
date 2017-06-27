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
class Mainn
{
    public void process() throws Exception 
    {
        throw new Exception();
        //System.out.println("main");
    }
}

class Sub extends Mainn
{
    public void process()
    {
        System.out.println("sub");
    }
}

public class AB {
    public static void main(String[] args) {
        Mainn m=new Sub();
        //m.process();
        
    }
            
    
}
