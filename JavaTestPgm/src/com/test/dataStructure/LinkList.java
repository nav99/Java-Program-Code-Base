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
public class LinkList {
    Object data;
    LinkList next;
    
    public void add(Object data)
    {
        LinkList node=new LinkList();
        if(node.next==null)
        {
            node.data=data;
            node.next=node;
        }
        else
        {
           LinkList temp=this;
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next=node;
           temp.data=data;
        }
    
    }
    
    public void display()
    {
        LinkList node=this;
        while(node.next!=null)
        {
            System.out.println(this.data);
            node=node.next;;
        }
    }
    
    public static void main(String[] args) {
        LinkList link=new LinkList();
        link.add(88);
        link.add(65);
        link.add(05);
        link.add(99);
        link.add(11);
        link.add(54);
        link.add(44);
        link.add(66);
        link.display();
    }
    
}
