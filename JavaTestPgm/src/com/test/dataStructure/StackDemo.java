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
class Stackk
{
    private int capacity;
    private int top;
    private int[] arr;
    
    public Stackk()
    {
        this.capacity=4;
        this.top=-1;
        this.arr=new int[capacity];
    }
    public boolean isStackEmpty()
    {
        return (top==-1);
    }
    public boolean  isStackFull()
    {
        return (top==arr.length-1);
    }
    public void push(int data)
    {
        if(isStackFull())
        {
            System.out.println("Stack is full ");
        }
        
        System.out.println(data);
        arr[++top]=data;
        
    }
    
}

public class StackDemo {
    public static void main(String[] args) {
        Stackk st=new Stackk();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(30);
        st.push(40);
        st.push(50);
    }
    
}
