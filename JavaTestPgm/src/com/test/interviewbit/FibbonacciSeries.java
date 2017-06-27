/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class FibbonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter range of fibbonaci no");
        Scanner sc=new Scanner(System.in);
        //int startPoint=sc.nextInt();
        int endPoint=sc.nextInt();
        int first=0,second=1,fibb;
        for(int i=2;i<endPoint;i++)
        {
            fibb=first+second;
            System.out.print(fibb+" ");
            first=second;
            second=fibb;
            
        }
                
    }
    
}
