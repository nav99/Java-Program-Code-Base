/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mahadev
 */
class Fruit1 implements Comparable{

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit1(String fruitName, String fruitDesc, int quantity) {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String toString()
    {
        return this.fruitName+" "+this.fruitDesc+" "+this.quantity;
    }

    
            @Override
    public int compareTo(Object o) {
        //String name=((Fruit1)o).getFruitName();
       return (this.getFruitName().compareTo(((Fruit1)o).getFruitName()));
    }
    
    
}


public class FruitCom {

    public static void main(String[] args) {
        Fruit1 pineappale = new Fruit1("Pineapple", "Pineapple description", 70);
        Fruit1 apple = new Fruit1("Apple", "Apple description", 100);
        Fruit1 orange = new Fruit1("Orange", "Orange description", 80);
        Fruit1 banana = new Fruit1("Banana", "Banana description", 90);
        
        ArrayList al=new ArrayList();
        al.add(pineappale);
        al.add(apple);
        al.add(orange);
        al.add(banana);
        
//        Collections.sort(al, new Comparator<Fruit>() {
//
//            @Override
//            public int compare(Fruit o1, Fruit o2) {
//               
//                return o1.getFruitName().compareTo( o2.getFruitName());
//            }
//        });
//        
        for(Object obj:al)
        {
            System.out.println(obj);
        }
        

    }

    }
    

