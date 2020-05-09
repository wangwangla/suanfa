package com.algorithm.link;

class DoubleNode{
    public int iData;
    public DoubleNode next;
    public DoubleNode pre;
}
public class DoubleLink {
    private DoubleNode root;
    public DoubleLink(){
        root = new DoubleNode();
        root.next = null;
        root.pre = null;
    }

    public void addData(int data){
        DoubleNode node = root;
        while (node.next!=null){
            node = node.next;
        }
        DoubleNode temp = new DoubleNode();
        temp.iData = data;
        temp.next = null;
        temp.pre = node;
        node.next = temp;
    }

    public void delete(int target){
        DoubleNode node = root;
        while (node.next!=null){
            node = node.next;
            if (node.iData == target){
                node.pre.next = node.next;
                if (node.next!=null){
                    node.next.pre = node.pre;
                }
            }
        }
    }

    public static void main(String[] args) {
        DoubleLink link = new DoubleLink();
        link.addData(0);
        link.addData(1);
        link.addData(2);
        link.addData(3);
        link.delete(1);
        System.out.println("==============");
    }
}
