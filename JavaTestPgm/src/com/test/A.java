/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

/**
 *
 * @author Mahadev
 */
public class A {

    public static void main(String[] args) {
        int a = 10;
        int b=0;
        try {
            b=a/b;
            System.out.println("bb");
        } catch (Throwable e) {
            System.out.println(a);
        } finally {
            try {

            } catch (Exception e) {
            }
            finally
            {
            }
        }

    }

}
