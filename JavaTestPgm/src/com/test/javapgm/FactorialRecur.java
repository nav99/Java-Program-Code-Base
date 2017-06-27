/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class FactorialRecur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println(factorial(no));
    }

    private static int factorial(int no) {
       if(no>0)
       {
           return factorial(no-1)*no;
       }
       else
           return 1;
    }
    
}
