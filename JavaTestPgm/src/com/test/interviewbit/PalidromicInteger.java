/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

/**
 *
 * @author Mahadev
 */
public class PalidromicInteger {
    public static void main(String[] args) {
        //int a=12345;
        System.out.println("No is "+isPalindrome(123));
        
    }
    	public static boolean isPalindrome(int a) {
            int rem=0;
            int rev=0;
            int no=a;
            while(a>0)
            {
                rem=a%10;
                rev=rev*10+rem;
                a=a/10;
            }
            System.out.println("rev "+rev);
            if(rev==no)
            return true;
            else
                return false;
	}
}
