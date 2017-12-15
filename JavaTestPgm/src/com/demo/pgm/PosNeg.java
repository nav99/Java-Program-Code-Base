/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

/**
 *
 * @author Mahadev
 */
public class PosNeg {
    public static void main(String[] args) {
        int arr[]={4,5,2,-1,-9,7,99,-5};
        int i=-1,temp=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<0)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int pos=i+1,neg=0;
        while(pos<arr.length && neg<pos && arr[neg]<0)
        {
            int temp1=0;
            temp1=arr[pos];
            arr[pos]=arr[neg];
            arr[neg]=temp1;
            pos++;
            neg=neg+2;
        
        }
        for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");
        
        
    }
    
}
