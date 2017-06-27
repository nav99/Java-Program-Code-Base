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
class BalancingCharcater
{
    private int[] arr;
    private int capacity;
    private int top;

    public BalancingCharcater() {
        this.capacity=10;
        this.arr=new int[capacity];
        this.top=-1;
    }
    
    public boolean isStackEmpty()
    {
        return (top==-1);
    }
    
    public boolean isStackFull()
    {
        return (top==arr.length-1);
    }
    
    public void push(char ch)
    {
        
    }
}

public class BalancingSymbols {
    public static void main(String[] args) {
        System.out.println("Enter Symbole like (, { ,[");
        Scanner sc=new Scanner(System.in);
        
        
    }
    
}
