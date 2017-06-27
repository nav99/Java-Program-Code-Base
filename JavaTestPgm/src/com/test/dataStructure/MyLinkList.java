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
public class MyLinkList
{
     Object data;
     MyLinkList next;
    
    
    public void add(Object data)
    {
        MyLinkList node=new MyLinkList();
        if(this.next==null)
        {
            this.next=node;
            this.data=data;
        }
        else
        {
                MyLinkList temp=this;
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
        MyLinkList node=this;
        while(node.next !=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }



    public static void main(String[] args) {
        MyLinkList list=new MyLinkList();
        list.add(10);
        list.add(80);
        list.add(60);
        list.add(70);
        list.add(99);
        list.add(88);
        
        list.display();
    }
    
}

