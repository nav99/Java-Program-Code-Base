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
public class MatrixAddition {

    public static void main(String[] args) {

        System.out.println("Enter row and column for first matrix ");
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
         System.out.println("Enter row and column for second matrix ");
         int row2=sc.nextInt();
         int col2=sc.nextInt();
        int[][] arr2=new int[row2][col2];
        System.out.println("Enter First Matrix Data ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
         System.out.println("Enter Second Matrix Data ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] add=new int[row1][col1];
       int[][] mul=new int[row1][col2];
        mul[0][0]=0;
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                for(int k=0;k<row2;k++)
                {
                sum =sum+arr1[i][k]*arr2[k][j];
                }
                mul[i][j]=sum;
                sum=0;
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println("");
        }

    }

}
