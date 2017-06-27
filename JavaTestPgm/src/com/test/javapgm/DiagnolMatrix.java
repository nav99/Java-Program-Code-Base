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
public class DiagnolMatrix {
    
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
        printDiagnolMatrix(arr);

    }

    private static void printDiagnolMatrix(int[][] arr) {
        int row=arr.length-1;
        int col=arr.length-1;
        
        for(int i=0;i<=row;i++)
        {
            for(int j=0;j<=col;j++)
            {
                for(int k=0;k<i;k++)
                {
                    System.out.print(" ");
                }
                
                if(i==j)
                {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    
}
