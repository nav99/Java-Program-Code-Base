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
public class NOToHexadecimal {
    public static void main(String[] args) {
        System.out.println("ENter no ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int rem=0;
        String rev="";
        while(no!=0)
        {
            int alphabet=55;
            rem=no%16;
            if(rem>9&&rem<16)
            {
                rem=alphabet+rem;
                rev=rev+(char)rem;
                
            }
            else
            rev=rev+String.valueOf(rem);
            no=no/16;
        }
        for(int i=rev.length()-1;i>-1;i--)
        {
            char ch=rev.charAt(i);
            System.out.print(ch);
        }
    }
    
}
