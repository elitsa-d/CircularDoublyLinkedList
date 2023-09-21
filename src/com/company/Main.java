package com.company;

public class Main {

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0, 14);

        System.out.println(list.get(1));

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        System.out.println("Removed: " + list.remove(4));
        list.print();

        System.out.println("Set on index 2 value of: " + list.set(2, 24));
        list.print(3);
        list.printBackwards();
        list.printBackwards(2);
    }
}
