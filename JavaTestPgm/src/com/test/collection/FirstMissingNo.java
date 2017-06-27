/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.collection;

import java.util.ArrayList;

/**
 *
 * @author Mahadev
 */
public class FirstMissingNo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(6);
        al.add(7);
        al.add(8);
        System.out.println(missingNo(al));
    }

    private static int missingNo(ArrayList<Integer> al) {
        int i=0;
        for (i = 0; i < al.size(); i++) {
            if (Math.abs(al.get(i)) <= al.size()) {

              //  al.set(Math.abs(al.get(i) - 1),- Math.abs(al.get(al.get(i)-1)));
                 al.set(Math.abs(al.get(i)-1),- Math.abs(al.get(al.get(i)-1)));

            }
        }
        for(i=0;i<al.size();i++)
        {
            if(al.get(i)>0)
                    return i+1;
            
        }

        return al.size()+1;
    }

}
