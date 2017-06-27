/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.interviewbit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mahadev
 */
public class CoverPoints {
  public static void main(String as[])
  {
      ArrayList<Integer> x=new ArrayList<>();
      ArrayList<Integer> y=new ArrayList<>();
      x.add(0);
      x.add(0);
      x.add(3);
      y.add(0);
      y.add(4);
      y.add(0);
       System.out.println(coverPoints(x,y));
      }
  
  
  public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
      int totalSteps=0,first=0,second=0;
      for(int i=0;i<X.size()-1;i++)
      {
      first=Math.abs(X.get(i)-X.get(i+1));
      second=Math.abs(Y.get(i)-Y.get(i+1));
      if(first>second)
      {
          totalSteps+=first;
      }
      else
          totalSteps+=second;
      
          
      }
      return totalSteps;
    }
    
}
