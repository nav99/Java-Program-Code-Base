/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

import java.util.LinkedList;

/**
 *
 * @author Mahadev
 */
class ListNodeStructure {

    private int data;
    private ListNodeStructure next;

    public ListNodeStructure() {
    this.data=data;
    }

    
    public ListNodeStructure(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNodeStructure getNext() {
        return next;
    }

    public void setNext(ListNodeStructure next) {
        this.next = next;
    }
    public void add(int data)
    {
        ListNodeStructure ln=new ListNodeStructure();
        ln.data=data;
        
        
    
    }
    public int listLength(ListNodeStructure headNode) {
        int length = 0;
        ListNodeStructure currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }
}

public class ListNode {
    public static void main(String[] args) {
        ListNodeStructure lns=new ListNodeStructure(10);
        System.out.println(lns.getData());
        
        LinkedList l=new LinkedList();
        
        
    }

    private static void lns(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
