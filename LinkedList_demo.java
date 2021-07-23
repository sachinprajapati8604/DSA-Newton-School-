package com.company;

import java.util.LinkedList;

public class LinkedList_demo {
    public static void main(String[] args) {
        //almost method  are same as similar to the array list
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            ll.add(i); // adding element
        }
        ll.addFirst(20); //adding an element to head of the linked list
        ll.addLast(30);  //adding element to last of the linked list
        ll.remove(3); //remove element of index 3
        ll.set(2, 40);
        System.out.println("Peek : " + ll.peek());  //print from first
//        ll.toArray();  //to convert linked list into array
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(ll); //printing linked list

    }
}
