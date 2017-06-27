/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class UniqueString {

    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(uniqueString(str));
    }

    private static String uniqueString(String str) {
        char[] ch = str.toCharArray();
        ArrayList output=new ArrayList();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1; j++) {
                char c = str.charAt(j);
                 if(ch[i]!=c)
                {
                    output.add(c);
                }
            }

        }
        System.out.println(output);
        String s=String.valueOf(output);
        return s;
    }

}
