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
public class MatrixZ {

    public static void main(String as[]) {
        System.out.println("Enter row and column ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter Data ");
           for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }            
        printZInMatrix(arr);

    }

    private static void printZInMatrix(int[][] arr) {
        int firstRow = 0;
        int lastRow = arr.length - 1;
        int row=arr.length-1;
        int col=arr.length-1;
        System.out.println("----------------------------------------------");
        
        for(int i=0;i<=row;i++)
        {
            for(int j=0;j<=col;j++)
            {
                if(i==0)
                {
                    System.out.print(arr[i][j]+" ");
                   
                }
                else if(i==firstRow && j==lastRow )
                { 
                    for(int k=lastRow;k>0;k--)
                    {
                        System.out.print("  ");
                    }
                    
                    System.out.print(arr[i][j]+" ");
                   
                }
                else
                {
                    if(i==col)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
            
                ++firstRow;
                --lastRow;
                System.out.println("");
        }
    }

}
