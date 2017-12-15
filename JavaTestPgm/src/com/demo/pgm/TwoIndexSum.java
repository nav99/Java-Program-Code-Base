/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.pgm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class TwoIndexSum {

    public static void main(String[] args) {
        int num[] = {2, 7, 11, 15, 10, 18};
        int arr[]={1};
        System.out.println("Enter target no");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] a = twoSum(num, target);
        System.out.println("Result " + Arrays.toString(a));
        
        int no=searchInsert(arr,target);
        System.out.println("Index is "+no);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;

    }
    
     public static int searchInsert(int[] nums, int target) {
         int output;
         int i=0;
         int low=0,mid=0;
         int high=nums.length-1;
         
         if(target==0 || nums[0]>target)
             return 0;
         else if(nums[nums.length-1]<target)
             return nums.length;
                 
         while(low<=high)
         {
             mid=(low+high)/2;
             if(nums[mid]==target)
             {
                 return mid;
             }
             else if(nums[mid]>target)
             {
                 --high;
             }
             else if(nums[mid]<target)
             {
                 low++;
             }
         }
         
         for(;i<nums.length-1;i++)
         {
             if(nums[i]==target)
             {
                 return i;
             }
             else if(nums[i]!=target && nums[i+1]>target)
                 return i+1;
            
             
         }
         
         return nums.length;
    }

}
