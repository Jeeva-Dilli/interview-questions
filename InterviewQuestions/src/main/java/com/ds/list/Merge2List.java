package com.ds.list;

public class Merge2List {
    public static Node mergeTwoLists(Node l1, Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.data < l2.data){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    public static void show(Node node)
    {
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        Node n1 = new Node(1,null);
        Node n2 = new Node(3,n1);
        Node n3 = new Node(5,n2);

        Node node1 = new Node(2,null);
        Node node2 = new Node(4,node1);
        Node node3 = new Node(5,node2);
        Node n = mergeTwoLists(n2,node2);
        show(n);

    }
}
