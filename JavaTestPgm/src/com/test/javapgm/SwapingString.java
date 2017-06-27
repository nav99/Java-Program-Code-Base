/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.StringTokenizer;

/**
 *
 * @author Mahadev
 */
public class SwapingString {
    public static void main(String[] args) {
        String s1="Navneet";
        String s2="gaur";
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        System.out.println(s2);
        s1=s1.substring(s2.length());
        System.out.println("s1 : "+s1);
        
        String s3="my name is amar i born in ayodhya";
        StringTokenizer st=new StringTokenizer(s3, " ");
        String strReversedLine=" ";
        while(st.hasMoreElements())
        {
            strReversedLine=st.nextToken()+" "+strReversedLine;
        }
        System.out.println(strReversedLine);
        
    }
    
}
