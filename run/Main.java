package com.example.ewgen.linkedlistimplementation.run;

import com.example.ewgen.linkedlistimplementation.logic.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        myLinkedList.add("d");
        myLinkedList.add("e");

        System.out.println(myLinkedList.toString());



    }
}
