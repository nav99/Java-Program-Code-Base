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
class Fruit {

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
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
    
}


public class FruitComparator {

    public static void main(String[] args) {
        Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana description", 90);
        
        ArrayList al=new ArrayList();
        al.add(pineappale);
        al.add(apple);
        al.add(orange);
        al.add(banana);
        
        Collections.sort(al, new Comparator<Fruit>() {

            @Override
            public int compare(Fruit o1, Fruit o2) {
               
                return o1.getFruitName().compareTo( o2.getFruitName());
            }
        });
        
        for(Object obj:al)
        {
            System.out.println(obj);
        }
    }

}
