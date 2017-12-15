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
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] one={1,3,5,7};
        int[] two={2,4,6,8,9,12};
        int totalLen=one.length+two.length;
        
        int[] third=new int[totalLen];
        myMergeSort(one,two,third);
        
        for(int z=0;z<totalLen;z++)
            System.out.print(third[z]+" ");
    }

    private static void myMergeSort(int[] one, int[] two, int[] third) {
        int i=0,j=0,k=0;
        while(i<one.length && j<two.length)
        {
            if(one[i]<two[j])
            {
                third[k]=one[i];
                i++;
                k++;
            }
            else
            {
                third[k]=two[j];
                k++;
                j++;
            }
        }
        while(i<one.length)
        {
            third[k]=one[i];
            k++;
            i++;
        }
        while(j<two.length)
        {
            third[k]=two[j];
            k++;
            j++;
        }
    }
    
}
