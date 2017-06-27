/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.Arrays;

/**
 *
 * @author Mahadev
 */
class Emp implements Comparable {

    private int empId;
    private String empName;
    private Integer empAge;
    private Integer empSalary;

    public Emp(int empId, String empName, Integer empAge, Integer empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String toString() {
        return "Emp Id : " + empId + " Emp Name : " + empName + " Emp Age : " + empAge + " Emp Salary" + empSalary;
    }

    

    @Override
    public int compareTo(Object obj) {
         return (this.empId - ((Emp)obj).empId);
    }
// ((Emp)obj).empId)
}

public class EMpDataSort {

    public static void main(String[] args) {
        Emp[] empArr = new Emp[4];

        empArr[0] = new Emp(10, "Mikey", 25, 10000);
        empArr[1] = new Emp(20, "Arun", 29, 20000);
        empArr[2] = new Emp(5, "Lisa", 35, 5000);
        empArr[3] = new Emp(1, "Pankaj", 32, 50000);

        Arrays.sort(empArr);
        System.out.println(Arrays.toString(empArr));

    }
}
