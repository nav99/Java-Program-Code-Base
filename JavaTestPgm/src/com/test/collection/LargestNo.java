package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestNo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(5);
        al.add(99);
        al.add(7);
        al.add(8);
        al.add(69);
        System.out.println(largestNo(al));
    }

    private static String largestNo(ArrayList al) {
        StringBuilder output=new StringBuilder();
        Collections.sort(al, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return (String.valueOf(o2)+String.valueOf(o1)).compareTo(String.valueOf(o1)+String.valueOf(o2));
            }
        });
        for(int i=0;i<al.size();i++)
        {
            output.append(al.get(i));
        }
        return output.toString();
    }
    
    
}
