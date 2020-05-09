package com.algorithm.link;

public class ReverseLink {
    static class Node<T> {
        public T data;
        public Node<T> next;
    }
    private static Node<Integer> root;
    public static void sou(){
        if (root == null){
            return;
        }
        Node tempRoot = root; //tou
        Node node = root.next;
        while (node!=null){
//            root = node;
//            node.next = tempRoot;
//            node = node.next;
            Node n = node;
            node = node.next;
            n.next = root;
            root = n;
        }
        System.out.println("============");
    }

    public static void main(String[] args) {
        root = new Node<Integer>();
        root.next = null;
        root.data = -1;

        Node<Integer> t = root;
        for (int i = 0; i < 10; i++) {
            Node<Integer>node = new Node<>();
            node.data = i;
            node.next = null;
            t.next = node;
            t=t.next;
        }
//        sou();
        sout2();
    }

    public static void sout2(){
        Node tempHead1 = new Node();
        Node tempHead2 = new Node();
        Node te1 = tempHead1;
        Node te2 = tempHead2;
        Node temp = root;
        boolean fl =true;
        while (temp!=null){
            if (fl){
                tempHead1.next = temp;
                tempHead1 = tempHead1.next;
                fl = false;
            }else{
                tempHead2.next = temp;
                tempHead2 = tempHead2.next;
                fl = true;
            }
            temp = temp.next;
        }
        tempHead2.next=te1;
        System.out.println("================");
        System.out.println("================");
    }
}
