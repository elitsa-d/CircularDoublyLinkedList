package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        list.add(0, 14);
        System.out.println(list.get(1));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        System.out.println("Removed: " + list.remove(4));
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Set on index 2 value of: " + list.set(2, 24));
    }
}
