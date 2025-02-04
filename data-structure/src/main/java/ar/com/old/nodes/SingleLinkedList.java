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
        if (this.head == null) {
            throw new EmptyLinkedListException("La lista esta vacia");
        }
        while (this.head != null) {
            if (this.head.value == value) {
                this.head = this.head.next;
                this.size--;
                return;
            }
            this.head = this.head.next;
        }
    }
}
