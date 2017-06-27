
package com.java.excersice;

import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        System.out.println("Enter Words ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        removeWords(str);
    }

    private static void removeWords(String str) {
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    if(i!=j)
                    {
                        words[j]="";
                    }
                }
            }
            
        }
        
        for(int i=0;i<words.length;i++)
        {
            if(words[i]!="")
            System.out.print(words[i]+" ");
        
        }
    }
   
}
