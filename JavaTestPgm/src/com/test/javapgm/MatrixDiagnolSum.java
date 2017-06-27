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
public class MatrixDiagnolSum {
    public static void main(String[] args) {
        
        System.out.println("Enter row and column for matrix ");
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int[][] transMatrix=new int[col][row];
        
        System.out.println("Enter Matrix Data ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k=col-1;
           for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++ ) {
                if(j==k)
                {
                    sum=sum+arr[i][j];
                    
                }
            }
            k--;
        }
           System.out.println("Sum is "+sum);
           
    }
    
}
