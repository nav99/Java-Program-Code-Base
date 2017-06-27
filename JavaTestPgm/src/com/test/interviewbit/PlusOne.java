/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Mahadev
 */
public class PlusOne {
    public static void main(String[] args) {
        ///Scanner sc=new Scanner(System.in);
        ArrayList<Integer> no=new ArrayList<Integer>();
        no.add(1);
        no.add(3);
        no.add(9);
        no.add(9);
     /*   no.add(3);
        no.add(7);
        no.add(6);
        no.add(4);
        no.add(0);
        no.add(5);
        no.add(5);
        no.add(5);*/
        System.out.println(plusOne(no));
        
    }
    
    	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
            
            int i=0,j;
            boolean reminder= false;
            
            ArrayList<Integer> output=new ArrayList<Integer>();
            for(j=0;j<a.size();j++)
            {
                if(a.get(j)!=0)
                {
                    break;
                }
               
            }
            
            if(j==a.size())
                {
                    return new ArrayList<>(Arrays.asList(1));
                }

            
            a = new ArrayList<>(a.subList(j, a.size()));
            
            for(i = a.size() - 1  ; i >= 0 ;){
                if(a.get(i) + 1 > 9) {
                    output.add(0);
                    
                    reminder = true;
                }
                else {
                    
                    output.add(a.get(i) + 1);
                    
                    i--;
                    reminder = false;
                    break;
                }
            }
            
            if(i > 0) {
                
            }
            
            if(reminder){
                output.add(1);
            }
            
           
         Collections.reverse(output);
        return output;   
	}
}
