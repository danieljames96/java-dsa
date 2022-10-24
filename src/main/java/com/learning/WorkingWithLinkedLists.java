package com.learning;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithLinkedLists {
    public static void main(String[] args) {

        LinkedList<Person> linkedlist = new LinkedList<>();
        linkedlist.add(new Person("John",19));
        linkedlist.add(new Person("Alexa",22));
        ListIterator<Person> personListIterator = linkedlist.listIterator();

        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<WorkingWithQueues.Person> supermarket = new LinkedList<>();
        supermarket.add(new WorkingWithQueues.Person("Alex",20));
        supermarket.add(new WorkingWithQueues.Person("Joe",30));
        supermarket.add(new WorkingWithQueues.Person("Bob",23));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){}
}
