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
public class MatrixSpiral {

    public static void main(String[] args) {
        System.out.println("Enter row and column ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter Data ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("-------------------------------");
        printSpiralMatrix(arr, row, col);

    }

    private static void printSpiralMatrix(int[][] arr, int row, int col) {
        int left = 0, top = 0, direction = 0;
        int right = col - 1;
        int bottom = row - 1;

        while (left <= right && top <= bottom) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + " ");
                }
                direction = 1;
                ++top;
            }
            else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(arr[i][right] + " ");
                }
                direction = 2;
                --right;
            }
            else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                --bottom;
                direction = 3;
            }
           else  if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                ++left;
                direction = 0;
            }
        }

    }

}
