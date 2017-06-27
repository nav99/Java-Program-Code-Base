/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.Stack;

/**
 *
 * @author Mahadev
 */
public class C11 {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.add(10);
        st.add("abc");
        st.add(12.99);
        st.add(true);
        
        System.out.println(st);
    }
}
