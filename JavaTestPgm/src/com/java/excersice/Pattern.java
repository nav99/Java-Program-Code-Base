/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.Stack;

/**
 *
 * @author Mahadev
 */
public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter pattern");
        Stack stack=new Stack();
        stack.add("{");
        stack.add("(");
        stack.add("[");
        stack.add("]");
        stack.add(")");
        stack.add("}");
        System.out.println(stack);
    }
    
}
