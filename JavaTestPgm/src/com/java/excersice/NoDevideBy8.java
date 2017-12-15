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
public class NoDevideBy8 {
    public static void main(String[] args) {
        System.out.println("Enter no ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int devidend=0,quoient=0;
        devidend=no;
        quoient=no/8;
        int actualNo=quoient*8;
        if(actualNo==no)
            System.out.println("True");
        else
            System.out.println("false");
        
    }
    
}
