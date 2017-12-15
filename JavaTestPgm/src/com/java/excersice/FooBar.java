/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class FooBar {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            if(i%3==0&&i%5==0)
                System.out.print("FooBar,");
            else if(i%3==0)
                System.out.print("Foo,");
            else if(i%5==0)
                System.out.print("Bar,");
            else
                System.out.print(i+",");
        
        }
    }
    
}
