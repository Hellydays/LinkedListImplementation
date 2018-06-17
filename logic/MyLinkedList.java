package com.example.ewgen.linkedlistimplementation.logic;

import java.util.Arrays;

public class MyLinkedList {

    private Node first;
    private Node last;
    private int size;

    public void add(String value) {
        if (first == null) {
            this.first = new Node(value);

        } else {
            Node temp = first;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            this.last = new Node(value);

            temp.setNext(last);
            last.setPrev(temp);
        }

        size++;

    }

    @Override
    public String toString() {
        String[] result = new String[size];
        int idx = 0;
        Node temp = first;

        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }
}
