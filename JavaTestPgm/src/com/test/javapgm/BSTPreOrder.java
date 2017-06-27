/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javapgm;

/**
 *
 * @author Mahadev
 */
public class BSTPreOrder {

    public static void main(String[] args) {
        BSTPreOrder bstpo = new BSTPreOrder();
        Node root = new Node();
        root.data = 1;
        root.left = new Node();
        root.right = new Node();
        root.left.data = 2;
        root.right.data = 3;
        root.left.left = new Node();
        root.left.left.data = 4;
        root.left.right = new Node();
        root.left.right.data = 5;
        root.right.left = new Node();
        root.right.left.data = 6;
        root.right.right = new Node();
        root.right.right.data = 7;
        bstpo.prePreOrder(root);

    }

    private void prePreOrder(Node node) {
        if (node != null) {
            System.out.println(node.data);
        } else {
            return;
        }
        prePreOrder(node.left);
        prePreOrder(node.right);
    }

    private void postPreOrder(Node node) {
        prePreOrder(node.left);
        prePreOrder(node.right);
        if (node != null) {
            System.out.println(node.data);
        } else {
            return;
        }
    }

}

class Node {

    int data;
    Node left;
    Node right;
}
