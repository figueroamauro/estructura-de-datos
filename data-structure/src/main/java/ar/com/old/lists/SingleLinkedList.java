package ar.com.old.lists;

import ar.com.old.exceptions.EmptyLinkedListException;
import ar.com.old.nodes.Node;

public class SingleLinkedList {
    public Node head;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int value) {
        if (isEmpty()) {
            this.head = new Node(value);
            this.size++;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
        this.size++;
    }


    public void remove(int value) {
        if (isEmpty()) {
            throw new EmptyLinkedListException("La lista esta vacia");
        } else {
            if (this.head.value == value) {
                this.head = this.head.next;
                this.size--;
                return;
            }
        }

        Node current = this.head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                this.size--;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size(){
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int value() {
        return this.head.value;
    }

    public void printList() {
        Node current = this.head;
        for (int i = 0; i < size-1; i++) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println(current.value);
    }
}
