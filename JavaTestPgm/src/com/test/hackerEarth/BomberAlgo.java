/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.hackerEarth;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class BomberAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String inputString=sc.next();
        System.out.print(bomberString(inputString));
    }

    private static String bomberString(String inString) {
        char[] ch=inString.toCharArray();
        for(int index=0;index<ch.length-1;index++)
        {
            if(ch[index]==ch[index+1]) 
            {
                char k=ch[index];
                for(int j=index+1;j<ch.length-1;j++)
                {
                    if(ch[j]==ch[j+1])
                    {
                      ch[index]=ch[index+2];  
                        continue;
                    }
                    else
                        break;
                }
            }
            else
                break;
        } 
        
        
        return inString;
    }
    
}
