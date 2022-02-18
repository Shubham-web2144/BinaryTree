package com.DSALGO;


import java.util.Scanner;

public class Trees {
    static class Node {
        int data;
        Node left,right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    static Scanner sc = null;
    static Node createNode() {
        Node rootNode = null;
        System.out.println("Enter root node :");
        int data = sc.nextInt();
        if(data == -1) return null;
        rootNode = new Node(data);
        System.out.println("Enter left child of " + data);
        rootNode.left = createNode();
        System.out.println("Enter right child of " + data);
        rootNode.right = createNode();
        return rootNode;
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
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createNode();
        System.out.println("Root of tree is " + root.data);
        System.out.println("PreOrder");
        preOrder(root);
        System.out.println("InOrder");
        inOrder(root);
        System.out.println("PostOrder");
        postOrder(root);

    }
}
