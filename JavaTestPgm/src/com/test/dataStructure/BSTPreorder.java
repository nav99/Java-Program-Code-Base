/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dataStructure;

/**
 *
 * @author Mahadev
 */
class Node {

    int data;
    Node left;
    Node right;
}

public class BSTPreorder {

    public static void main(String[] args) {

        Node root = new Node();
        root.data = 3;
        root.left = new Node();
        root.right = new Node();
        root.left.data = 5;
        root.right.data = 2;

        root.left.left = new Node();
        root.left.right = new Node();

        root.left.left.data = 1;
        root.left.right.data = 4;

        root.right.left = new Node();
        root.right.left.data = 6;

        inOrder(root);
        System.out.println("Hieght is " + hieght(root));

        top_view(root);
    }
void postOrder(Node root) {
    
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
        }
        if (root != null) {
            System.out.print(root.data + " ");
        } else {
            return;
        }


}

    static void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);

        }
        if (root != null) {
            System.out.print(root.data + " ");
        } else {
            return;
        }
        if (root != null) {
            inOrder(root.right);
        }

    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
        } else {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
    }

    private static int hieght(Node root) {
        int leftHeight = 0, rightHeight = 0;
        if (root.left == null && root.right == null) {
            return 0;
        }
        if (root.left != null) {
            leftHeight = hieght(root.left);
        }
        if (root.right != null) {
            rightHeight = hieght(root.right);
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    static void top_view(Node root) {

        if (root != null) {

            if (root.left != null || root.right != null) {

                System.out.print(root.data);
            }
        }
        if (root != null) {
            top_view(root.left);
        }
        if (root != null) {
            top_view(root.right);
        }
    }

}
