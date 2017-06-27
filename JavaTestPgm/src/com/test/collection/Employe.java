/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Mahadev
 */
class Emp1 {

    private int empId;
    private String empName;
    private Integer empAge;
    private Integer empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Integer getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Integer empSalary) {
        this.empSalary = empSalary;
    }
    
    

    public Emp1(int empId, String empName, Integer empAge, Integer empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String toString() {
        return "Emp Id : " + empId + " Emp Name : " + empName + " Emp Age : " + empAge + " Emp Salary" + empSalary;
    }

}

public class Employe {

    public static void main(String[] args) {

        Emp1 emp1 = new Emp1(10, "Mikey", 25, 10000);
        Emp1 emp2 = new Emp1(20, "Arun", 29, 20000);
        Emp1 emp3 = new Emp1(5, "Lisa", 35, 5000);
        Emp1 emp4 = new Emp1(1, "Pankaj", 32, 50000);
        ArrayList al = new ArrayList();
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);
        al.add(emp4);
        System.out.println(al);
        Collections.sort(al);
        System.out.println("ffff  "+al);
        Collections.sort(al, new Comparator<Emp1>() {

            @Override
            public int compare(Emp1 o1, Emp1 o2) {
                return o1.getEmpId()-o2.getEmpId();
            }
        });
        System.out.println("");
        Iterator itr=al.iterator();
        while (itr.hasNext()) {
            Object next = itr.next();
            System.out.println(next);
            
        }
        
        
    }

}
