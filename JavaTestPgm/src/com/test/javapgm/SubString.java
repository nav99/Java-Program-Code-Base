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
public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String output="";
        if(str.length()<=2)
        {
            System.out.println(str);
            return;
        }
        char one=str.charAt(0);
        char two=str.charAt(1);
        String prevString=String.valueOf(one)+String.valueOf(two);
        for(int i=2;i<str.length();i++)
        {
            output=String.valueOf(one)+String.valueOf(two);
            for(int j=i;j<str.length();j++)
            {
                if((str.charAt(j)==one)||str.charAt(j)==two)
                {
                    output=output+str.charAt(j);
                }
                else
                    break;
            }
            if(output.length()>prevString.length())
            {
                prevString=output;
            }
            one=two;
            two=str.charAt(i);
            output=String.valueOf(one)+String.valueOf(two);
            if(one==two)
            {
                    for(i=i+1;i<str.length();i++)
                    {
                        two=str.charAt(i);
                        output=output+two;
                        if(one!=two)
                        {
                            break;
                        }
                    }
            }
        }
        
        System.out.println(prevString);
    }
    
}
