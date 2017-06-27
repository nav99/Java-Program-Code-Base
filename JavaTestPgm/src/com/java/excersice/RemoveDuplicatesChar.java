
package com.java.excersice;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class RemoveDuplicatesChar {
    public static void main(String[] args) {
        System.out.println("Enter String ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    if(i!=j)
                    {
                        ch[j]=32;
                    }
                
                }
            }
        }
        
                for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=32)
            System.out.print(ch[i]);
        
        }

    }
 }
