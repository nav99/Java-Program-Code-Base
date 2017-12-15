/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

/**
 *
 * @author Mahadev
 */
public class PrintUniqCharacter {

    public static void main(String[] args) {
        String str = "abcdaaaeffghcbz";
        char[] ch = str.toCharArray();
        StringBuilder sb=new StringBuilder();
        boolean[] set = new boolean[256];
        
        
        for(int i=0;i<ch.length;i++)
        {
            if(!set[ch[i]])
            {
                set[ch[i]]=true;
                sb.append(ch[i]);
            }
        }
        
        System.out.println("Output "+sb);
        
    }

}
