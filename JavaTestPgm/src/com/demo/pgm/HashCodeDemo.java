/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahadev
 */
class Customer {
      private int customerID;
      private String firstName;
      private String lastName;

      public Customer(int customerID, String firstName, String lastName) {
        super();
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
      }

    
}
public class HashCodeDemo {

    public static void main(String[] args) {
        Map<Customer, String> m = new HashMap<Customer, String>();
        Customer cust = new Customer(1, "Roger", "Cox");
        m.put(cust,"Roger Cox");
           // retrieving using another instance
        System.out.println(m.get(new Customer(1, "Roger", "Cox")));
           // retrieving using same instance
        System.out.println(m.get(cust));               
    }
}