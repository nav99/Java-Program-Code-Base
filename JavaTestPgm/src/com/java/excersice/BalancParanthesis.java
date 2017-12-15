/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Mahadev
 */
public class BalancParanthesis {
    public static void main(String[] args) {
        System.out.println("Enter string ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(isParenthesisBalanced(str));
        
    }

    private static boolean isParenthesisBalanced(String str) {
       Stack<Character> stack=new Stack();
       for(int i=0;i<str.length();i++)
       {
          char ch=str.charAt(i);
          if(ch=='{'||ch=='[' || ch=='(')
          {
              stack.push(ch);
          }
          else if(ch==']')
          {
              if(stack.isEmpty())
                  return false;
              if(stack.pop()!='[')
                  return false;
          }
          else if(ch==')')
          {
              if(stack.isEmpty())
                  return false;
              if(stack.pop()!='(')
                  return false;
          }
          else if(ch=='}')
          {
              if(stack.isEmpty())
                  return false;
              if(stack.pop()!='{')
                  return false;
          }
       }
        
        return stack.isEmpty();
    }
    
}
