package com.ds.btree;

public class TreeTraversal {


    public void preOrderTraversal(Node node)
    {
        if(node == null)
            return;
        System.out.print(node.data+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }
    public void inOrderTraversal(Node node)
    {
        if(node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);

    }
    public void postOrderTraversal(Node node)
    {
        if(node == null)
            return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" ");

    }
}
