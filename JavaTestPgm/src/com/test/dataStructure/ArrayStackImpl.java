/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

/**
 *
 * @author Mahadev
 */
 class ArrayStack {
   private int top;
   private int capacity;
   private int[] array;
   
   public ArrayStack()
   {
       int capacity=4;
       array=new int[capacity];
       top=-1;
   }
   
   public boolean isStackEmpty()
   {
       return (top==-1);
   }
   public boolean isStackFull()
   {
       return (top==array.length-1);
   }
   
   public void push(int data)
   {
       if(isStackFull())
           System.out.println("Stack Overflow ");
       else
       {
           System.out.println(data);
           array[++top]=data;
       }   
   }
   
   public int pop()
   {
       if(isStackEmpty())
       {
            System.out.println("Stack Underflow");
            return 0;
       }    
       else
       {
           return (array[top--]);
       }
       
   }
   
   
}


public class ArrayStackImpl
{
    public static void main(String[] args) {
        
        ArrayStack as=new ArrayStack();
        try{
        as.push(10);
        as.push(20);
        as.push(30);
        as.push(40);
        
            System.out.println("Pop "+as.pop());
            System.out.println("Pop "+as.pop());
        as.push(50);
        
        }catch(Exception e){ System.out.println(e.getMessage());}
        
    }
}

