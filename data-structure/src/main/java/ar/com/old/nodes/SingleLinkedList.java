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
        }
        while (!isEmpty()) {
            if (head.value == value) {
                head = head.next;
                this.size--;
                return;
            }
            head = head.next;
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
}
