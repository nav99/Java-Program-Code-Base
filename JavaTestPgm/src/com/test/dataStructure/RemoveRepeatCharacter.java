/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Mahadev
 */
public class RemoveRepeatCharacter {

    public static void main(String[] args) {
        System.out.println("Enterr a string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(repeatCharacterRemove(str));
    }

    private static String repeatCharacterRemove(String str) {
        char[] ch = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        char lastCharacterRemoved = ' ';
        for (int i = 0; i < ch.length; i++) {
            if (stack.isEmpty()) {
                if (lastCharacterRemoved != ch[i]) {
                    stack.push(ch[i]);
                }
            } else if (stack.peek() == ch[i]) {
                lastCharacterRemoved = stack.pop();
            } else if (lastCharacterRemoved != ch[i]) {
                stack.push(ch[i]);
            }
        }

        return stack.toString();
    }

}
