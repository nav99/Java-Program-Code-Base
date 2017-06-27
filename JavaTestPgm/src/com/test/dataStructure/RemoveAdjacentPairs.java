/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class RemoveAdjacentPairs {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //System.out.println(removeAdjacentPairs(str));
       String st=removeAdjacentPairs(str);
       char[] c=st.toCharArray();
       for(int i=0;i<c.length;i++)
            System.out.println(c[i]);
    }

    private static String removeAdjacentPairs(String str) {
        int j=0;
        char[] ch=str.toCharArray();
        for(int i=1;i<ch.length;i++)
        {
            
            while((ch[i]==ch[j]) && (j>=0))
            {
                i++;
                j--;
                
            }
            ch[++j]=ch[i];
           
        }
        return String.valueOf(ch);
    }
    
    
}
