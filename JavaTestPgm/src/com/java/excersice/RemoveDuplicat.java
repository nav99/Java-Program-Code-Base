/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.excersice;

public class RemoveDuplicat {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,3,4,5,6,7,7,8};
        int current=arr[0];
        boolean found=false;
        
        System.out.println("Before Remove");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("After Remove");
        for(int i=0;i<arr.length;i++)
        {
            if(current==arr[i]&&!found)
            {
                found=true;
            }
            else if(current!=arr[i])
            {
                System.out.print(current+" ");
                current=arr[i];
                found=false;
            }
        }
        
        
        int x=0;
        arr[x]=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[x]!=arr[i])
            {
                x++;
                arr[x]=arr[i];
            }
        }
        System.out.println("Resule is ");
        for(int i=0;i<arr.length;i++)
        {
                System.out.print(arr[i]+" ");
        }
    }
    
}
