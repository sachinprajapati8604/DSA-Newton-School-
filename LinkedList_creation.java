package com.company;

public class LinkedList_creation {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.print();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
    }
}

class MyLinkedList {
    private Node start;

    public Node getlistStart() {
        return start;
    }

    public void add(Integer data) {
        Node node = new Node(data);
        if (start == null) {
            this.start = node;
            return;
        }
        Node temp = start;
        while (temp.getNextNode() != null) {
            temp = temp.getNextNode();

        }
        temp.setNextNode(node);
    }

    public void print() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.getData() + "-->");
            temp = temp.getNextNode();
        }
        System.out.println();
    }

}

class Node {
    private Integer data;
    private Node nextNode;

    public Node(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

}
