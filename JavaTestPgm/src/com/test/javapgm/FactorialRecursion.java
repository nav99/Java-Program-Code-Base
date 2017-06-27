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
public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        System.out.println(factorailNo(no));
    }

    private static int factorailNo(int no) {
        if(no==0)
        {
            return 1;
        }
        else
        {
        return factorailNo(no-1)* no;
        }
       
    }
    
}
