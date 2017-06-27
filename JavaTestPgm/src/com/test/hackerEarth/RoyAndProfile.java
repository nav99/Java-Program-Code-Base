/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.hackerEarth;

import java.util.Scanner;

/**
 *
 * @author Tapreward
 */
public class RoyAndProfile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length");
        int length=sc.nextInt();
        System.out.println("Enter no of photos");
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
//         System.out.println("Enter width and hieght");
        int width=sc.nextInt();
        int height=sc.nextInt();
        
        if(width<length || height<length)
            System.out.println("upload another");
        
        else if(width==length && height==length)
                System.out.println("accepted");
            else
                System.out.println("crrop it");
        
        
                
        }
        
    }
    
}
