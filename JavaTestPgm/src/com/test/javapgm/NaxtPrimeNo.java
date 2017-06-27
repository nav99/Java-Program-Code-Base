/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class NaxtPrimeNo {

    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int nextPrimeNo = no + 1;
        if (isPrimeNo(nextPrimeNo)) {
            System.out.println(nextPrimeNo);
        } else {
            for (; !isPrimeNo(nextPrimeNo); nextPrimeNo++) {
                continue;

            }
            System.out.println(nextPrimeNo);

        
    }//else
}

private static boolean isPrimeNo(int no) {
        
        for(int i=2;i<Math.sqrt(no);i++)
        {
            if(no%i==0)
            {
                return false;
                
            }
        }
        return true;
        
    }
    
}
