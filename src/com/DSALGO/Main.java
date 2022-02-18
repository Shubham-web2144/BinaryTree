package com.DSALGO;

import java.util.Scanner;

public class Main {
    static class Node {
        int data;
        Node left,right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node buildTree() {
        Node root = null;
        System.out.println("Enter root data : ");
        int data = sc.nextInt();
        if(data == -1) return null;

        root = new Node(data);
        System.out.println("Left child data of " + data);
        root.left = buildTree();
        System.out.println("Right child data of " + data);
        root.right = buildTree();
        return root;
    }
    static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    static void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    static Scanner sc = null;
    public static void main(String[] args) {
	// write your code here
        sc = new Scanner(System.in);
        Node root = buildTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);

    }
}
