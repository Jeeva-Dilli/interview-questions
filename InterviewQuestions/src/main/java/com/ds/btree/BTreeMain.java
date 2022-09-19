package com.ds.btree;

public class BTreeMain {
    public static void main(String[] args) {
        Node a = new Node("1");
        Node b = new Node("2");
        Node c = new Node("3");
        Node d = new Node("4");
        Node e = new Node("5");
        Node f = new Node("6");

        a.assign(b,c);
        b.assign(d,null);
        d.assign(null,e);
        e.assign(f,null);

      /*  a.left = b;
        a.right = c;
        b.left = d;
        d.right = e;
        e.left = f;*/

        TreeTraversal traversal = new TreeTraversal();
        System.out.println("PreOder Traversal");
        traversal.preOrderTraversal(a);
        System.out.println();
        System.out.println("Inorder Traversal");
        traversal.inOrderTraversal(a);
        System.out.println();
        System.out.println("Postorder Traversal");
        traversal.postOrderTraversal(a);
        System.out.println();
        LowestCommonAncestor lca = new LowestCommonAncestor();

        Node node = lca.lowestCommonAncestor(a,d,e);

        System.out.println(node.data);
    }
}
