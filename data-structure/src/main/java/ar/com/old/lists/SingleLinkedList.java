package ar.com.old.lists;

import ar.com.old.exceptions.EmptyLinkedListException;
import ar.com.old.nodes.Node;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addTail(int value) {
        if (isEmpty()) {
            this.head = new Node(value);
            this.tail = head;
            this.size++;
            return;
        }
        tail.next = new Node(value);
        tail = tail.next;
        this.size++;
    }

    public void addHead(int value) {
        if (isEmpty()) {
            this.head = new Node(value);
            this.tail = head;
            this.size++;
            return;
        }
        head.next = head;
        head= new Node(value);
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

    public void removeHead() {
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeTail() {
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
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

    public void printList() {
        Node current = this.head;
        while (current.next != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println(current.value);
    }
}
