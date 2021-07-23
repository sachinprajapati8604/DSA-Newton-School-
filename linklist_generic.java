//package com.company;
//
//public class linklist_generic {
//    public static void main(String[] args) {
//        {
//            // your code goes here
//            LinkedList<Integer> linkedList = new LinkedList<>();
//            linkedList.insertAtHead(1);
//            linkedList.insertAtHead(2);
//            linkedList.insertAtHead(3);
//            linkedList.insertAtHead(4);
//            linkedList.insertAtHead(5);
//
//            linkedList.print();
//            System.out.println();
//            LinkedList<String> linkedListStr = new LinkedList<>();
//            linkedListStr.insertAtHead("A");
//            linkedListStr.insertAtHead("B");
//            linkedListStr.insertAtHead("C");
//            linkedListStr.insertAtHead("D");
//            linkedListStr.insertAtHead("E");
//
//            linkedListStr.print();
//        }
//    }
//}
//class MyNode<T> {
//    private T value;
//
//    private MyNode<T> next;
//
//    public MyNode(T value ) {
//        this.value = value;
//        this.next = null;
//    }
//
//    public T getValue() {
//        return this.value;
//    }
//
//    public Node<T> getNext() {
//        return this.next;
//    }
//
//    public void setNextNode(Node<T> next) {
//        this.next = next;
//    }
//}
//
//class LinkedList<T> {
//    private Node<T> head;
//    private int size;
//
//    public LinkedList() {
//        this.head = null;
//        this.size = 0;
//    }
//
//    public int getSize() {
//        return this.size;
//    }
//
//    public void insertAtHead(T value) {
//        Node<T> tempHead = head;
//        this.head = new Node<T>(value);
//        this.head.setNextNode(tempHead);
//    }
//
//    public void print() {
//
//        Node<T> tempHead = this.head;
//        while (tempHead != null) {
//            System.out.print(tempHead.getValue()+" ");
//            tempHead = tempHead.getNext();
//        }
//    }
//}
