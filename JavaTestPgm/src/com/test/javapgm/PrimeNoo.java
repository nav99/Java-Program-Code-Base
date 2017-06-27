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
public class PrimeNoo {
    public static void main(String[] args) {
        System.out.println("Enter range ");
        Scanner sc=new Scanner(System.in);
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        for(;no1<=no2;no1++)
        {
            if(isNumber(no1))
            {
            System.out.println(no1);
            }
        }
    }

    private static boolean isNumber(int no1) {
      for(int i=2;i<=Math.sqrt(no1);i++)
      {
          if(no1%i==0)
              return false;
      }
      return true;
    }
    
}
