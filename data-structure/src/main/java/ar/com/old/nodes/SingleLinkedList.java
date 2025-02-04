package ar.com.old.nodes;

import ar.com.old.exceptions.EmptyLinkedListException;

public class SingleLinkedList {
    public Node head;
    public int size;

    public SingleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int value) {
        if (this.head == null) {
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
        Node current = this.head;
        if (current == null) {
            throw new EmptyLinkedListException("La lista esta vacia");
        }
        while (current != null) {
            if (current.value == value) {
                current = current.next;
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
}
