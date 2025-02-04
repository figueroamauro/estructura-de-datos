package ar.com.old.nodes;

import ar.com.old.exceptions.EmptyLinkedListException;

public class SingleLinkedList {
    private Node head;
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
        this.head = new Node(value);
        this.head.next = current;
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

    public int value() {
        return this.head.value;
    }
}
