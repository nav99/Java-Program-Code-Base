/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.ArrayList;

/**
 *
 * @author Mahadev
 */
public class MissingNo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(11);
        al.add(12);
        al.add(14);
        al.add(15);
        System.out.println(firstMissingPositiveNo(al));
    }

    private static int firstMissingPositiveNo(ArrayList<Integer> al) {
        int i=0;
        for(i=0;i<al.size();i++)
        {
            if(Math.abs(al.get(i)) <= al.size())
            {
                al.set(Math.abs(al.get(i)-1),- Math.abs(al.get(al.get(i)-1)));
               System.out.println(al.get(i));
            }
        }
        
        System.out.println(al);
        
        for( i=0;i<al.size();i++)
        {
            if(al.get(i)>=0)
                return i+1;
        }
        
        System.out.println(al);
        
       return al.size()+1;
    }
        
    
}
