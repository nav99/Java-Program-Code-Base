/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.File;

/**
 *
 * @author Mahadev
 */
public class SeprateDigitAndAlphabet {

    public static void main(String[] args) {
        String str = "abcd123xyz98";
        char[] ch = str.toCharArray();
        for (int i = 0,j=0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if(ch[i]>=48 && ch[i]<=57)
            {
                char temp;
                temp=ch[j];
                ch[j]=ch[i];
                ch[i]=temp;
                i=j+1;
                j++;
            }
            
        }
        
        for(int i=0;i<str.length();i++)
            System.out.print(ch[i]);
    }

}
