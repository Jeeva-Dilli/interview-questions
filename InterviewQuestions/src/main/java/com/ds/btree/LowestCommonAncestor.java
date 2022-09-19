package com.ds.btree;

public class LowestCommonAncestor {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null || root == p || root == q)
            // found p or q or touch the ground
            return root;

        // search p and q from left and right
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            // from root's left & right we found both p and q, so root is the LCA
            return root;
        else
            // left is not null means from left's left & right we found both q and q
            // so left is the LCA, otherwise, right is the answer
            return left != null ? left : right;
    }
}
