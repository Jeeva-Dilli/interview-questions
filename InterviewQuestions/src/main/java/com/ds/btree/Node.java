package com.ds.btree;

public class Node {
    String data;
    Node left;
    Node right;

    public Node(String data) {
        this.data=data;
        this.left=null;
        this.right=null;

    }

    public void assign(Node left , Node right)
    {
        this.left = left;
        this.right = right;
    }

}
