/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
class InvalidAgeException extends Exception
{
   
    InvalidAgeException(String s)
    {
        super(s);
    }

   

}

public class OwnException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        try
        {
            validate(age);
        }catch(Exception e){ 
            System.out.println("Exception occured "+e);
        }
    }

    private static void validate(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException("Not Adult");
        else
            System.out.println("Welcome to vote");
    }
    
}
