package com.algorithm.link;

class Node {
    public int iData;
    public Node next;
}
public class Link {
    private Node frist;
    public Link(){
        frist = new Node();
        frist.next = null;
    }

    public void addData(int data){
        Node tempNode = frist;
        while (tempNode.next!=null){
            tempNode = tempNode.next;
        }
        Node node = new Node();
        node.iData = data;
        node.next = null;
        tempNode.next = node;
    }

    public void delete(int data){
        Node node = frist;
        while (node.next!=null){
            if (node.next.iData == data){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
    }

    public void edit(int source,int target){
        Node tempNode = frist;
        while (tempNode.next != null){
            tempNode = tempNode.next;
            if (tempNode.iData == source){
                tempNode.iData = target;
            }
        }

    }

    public static void main(String[] args) {
        Link link = new Link();
        link.addData(1);
        link.addData(2);
        link.addData(3);
        link.addData(4);
        link.edit(3,10);
        link.delete(2);
        link.delete(1);
        link.delete(3);
        System.out.println("=");
    }
}
