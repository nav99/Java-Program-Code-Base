/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

import java.util.Arrays;

/**
 *
 * @author Mahadev
 */
class MyQueue {

    private int front;
    private int rear;
    private int[] arr;
    private int capacity;

    public MyQueue() {
        this.front = 0;
        this.rear = -1;
        this.capacity = 4;
        this.arr = new int[capacity];
    }

    public boolean isQueueEmpty() {
        return (rear == 0);
    }

    public boolean isQueueFull() {
        return (rear == arr.length - 1);
    }

    public void enQueue(int data) {
        if (isQueueFull()) {
            System.out.println("Queue Overflow ");
        } else {
            System.out.println(data);
            arr[++rear] = data;

        }
    }

    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            front++;
            if(front==capacity-1)
            System.out.println("Element remove" + arr[front]);

            for (int i = front; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;

        }

    }

    public String toString() {
        return Arrays.toString(arr);
    }

}

public class QueueImpl {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.enQueue(10);
        mq.enQueue(20);
        mq.enQueue(30);
        mq.enQueue(40);
        mq.deQueue();
        mq.deQueue();
        mq.deQueue();
       // System.out.println(mq);
    }

}
