package com.company;

import java.util.*;

public class ArrayList_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>(); // creating a class object for arraylist
        // adding integer from 1 to 10
        for (int i = 0; i <= 10; i++) {
            al.add(i);
        }
        System.out.println("All the element before making operation " + al);

        // to update or set an item
        al.set(0, 20);
        //access a particular element from index
        System.out.println(al.get(0));
        //to remove an item pass index for that
        al.remove(1);
        //to clear all
//        al.clear();
        //to get a size of arrayllist
        System.out.println("size of the array list " + al.size());
        if (al.contains(20)) {
            int index = al.indexOf(20);
            System.out.println("given number is present at index  " + index);
        } else {
            System.out.println("Given number is not present ");
        }

//        to print all element from the arraylist
        System.out.println("Printing all element  by using for each loop");
        for (int i : al) {
            System.out.print(i + " ");
        }
        //we can iterator to print all element like for each
        System.out.println("\n Printing all element  by iterator class");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n Printing whole arraylist");
        System.out.println(al);

        ArrayList<Integer> al2 = new ArrayList<>(al); //copy all element from al to al2
        System.out.println("This is second arraylist : " + al2);
        // making sum of array list
        int sum = 0;
        for (int i : al) {
            sum += i;
        }
        System.out.println("Sum of all the numbers : " + sum);
        Collections.reverse(al);
        System.out.println("reverse of arraylist " + al);
        System.out.println("Max of the arraylist " + Collections.max(al));
        System.out.println("Min of the arraylist " + Collections.min(al));

    }
}
