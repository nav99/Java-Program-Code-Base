/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author Mahadev
 */

class Emp 
{
    public int empId;

    public Emp(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    

    
    @Override
    public String toString()
    {
        return "Emp Id : "+empId;
    }
    
}

public class Comparatorr {
    public static void main(String[] args) {
        Emp e1=new Emp(100);
        Emp e2=new Emp(700);
        Emp e3=new Emp(600);
        Emp e4=new Emp(300);
        Emp e5=new Emp(400);
        
        ArrayList<Emp> al=new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        
        Collections.sort(al,new Comparator<Emp>(){

            @Override
            public int compare(Emp o1, Emp o2) {
                return o1.getEmpId()-o2.getEmpId();
            }
        
    });
        
        System.out.println("ArrayList : "+al);
    }
    
}
