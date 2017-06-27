
package com.test.dataStructure;

class DynamicStack
{
    private int capacity;
    private int[] arr;
    private int top;

    public DynamicStack() {
        capacity=1;
        arr=new int[capacity];
        top=-1;
    }
    public boolean isStackEmpty()
    {
        return (top==-1);
    }
    public boolean isStackFull()
    {
        return (top==arr.length-1);
    }
    public void push(int data)
    {
        if(isStackFull())
        {
             doubleStack();
        }
        System.out.println(data);
        arr[++top]=data;
    }

    private void doubleStack() {
        
        int[] newArray=new int[capacity*2];
        System.arraycopy(arr, 0, newArray, 0, capacity);
        capacity=capacity*2;
        arr=newArray;
        
    }
    
    public int pop()
    {
        if(isStackEmpty())
        {
            System.out.println("Stack Underflow ");
        }
        return (arr[--top]);
    }
    
}

public class DynamicArrayStack {
    public static void main(String[] args) {
        DynamicStack ds=new DynamicStack();
        ds.push(10);
        ds.push(55);
        ds.push(30);
        ds.push(70);
        ds.push(60);
        
    }
    
}
