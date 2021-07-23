package com.company;

import java.util.Scanner;

public class LinkedList {
    Node head = null;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //method to add or append element at last
    public void add(int data) {
        Node node = new Node(data);
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    //insert at the front
    public void insertFront(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    //insert at the position
    public void insertAtPosition(int index, int data) {
        Node node = new Node(data);
        node.next = null;
        if (index == 0) {
            insertFront(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    // insert element at end
    public void insertAtEnd(int data) {
        Node n = new Node(data);
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            temp = temp.next;

        }
        prev.next = n;
        n.next = null;
    }

    public void deleteNode(int data) {
        Node temp, prev = null;
        temp = head;
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                //Compares node to be found with each node present in the list
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag)
            System.out.println("Element is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }

    // to print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
//            ll.add(sc.nextInt());
            ll.add(i);
        }
        System.out.println("List before");
        ll.printList();
        System.out.println("\n After Applying various operation");
        ll.insertFront(0);
        ll.insertAtPosition(1, 3);
        ll.insertAtEnd(6);
        ll.printList();
        System.out.println("\n List after deletion");
        ll.deleteNode(5);
        ll.deleteNode(1);
        ll.searchNode(4);
        ll.printList();
    }
}