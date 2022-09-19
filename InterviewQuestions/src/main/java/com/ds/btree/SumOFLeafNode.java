package com.ds.btree;

public class SumOFLeafNode {
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int ans = 0;
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null)
                ans += root.left.data;
            else
                ans += sumOfLeftLeaves(root.left);
        }
        ans += sumOfLeftLeaves(root.right);

        return ans;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);

        a.left = b;                                           //  1
        a.right = c;                                       // 2        3
        b.left = d;                                       //4   5     6
        b.right = e;
        c.left = f;

        System.out.println(sumOfLeftLeaves(a));
    }

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data=data;
            this.left=null;
            this.right=null;

        }

        public void assign(TreeNode left , TreeNode right)
        {
            this.left = left;
            this.right = right;
        }

    }
}
