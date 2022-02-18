package com.DSALGO;

import java.util.Scanner;

public class Trees2 {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("Root of given tree is " + root);
        System.out.println();
        System.out.println("PreOrder");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder");
        postOrder(root);
    }
    static class Node {
        int data;
        Node leftChild,rightChild;
        Node(int data) {
            this.data = data;
            this.leftChild = this.rightChild = null;
        }
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter root data ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.println("Data for leftChild :" + data);
        root.leftChild = createTree();
        System.out.println("Data for rightChild :" + data);
        root.rightChild = createTree();

        return root;
    }
    static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + "->");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.leftChild);
        System.out.print(root.data + "->");
        inOrder(root.rightChild);
    }

    static void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.data + "->");
    }
}
