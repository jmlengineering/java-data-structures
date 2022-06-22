package com.jmlengineering;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        // One implementation of the queue interface, below
        // Offers more functionality than a queue
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Mari", 33));
        linkedList.add(new Person("Lexa", 31));
        linkedList.addFirst(new Person("Zina", 31));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println("------------------------");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 23));
        supermarket.add(new Person("Ali", 28));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }

    static record Person(String name, int age) {}
}
