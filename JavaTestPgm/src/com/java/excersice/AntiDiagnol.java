/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class AntiDiagnol {

    public static void main(String[] args) {
        System.out.println("Enter n*n matrix ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<col;i++)
        {
            for(int j=0;j>-1;j--)
            {
                System.out.print(arr[j][i]);
            }
            System.out.println("");
        }
    }

}
