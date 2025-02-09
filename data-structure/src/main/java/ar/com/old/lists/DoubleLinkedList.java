package ar.com.old.lists;

import ar.com.old.nodes.DoubleNode;

public class DoubleLinkedList<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addHead(T data) {
        DoubleNode<T> newNode = new DoubleNode<>(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addTail(T data) {
        if (tail == null) {
            this.tail = new DoubleNode<>(data);
            this.head = tail;
        }else {
            tail = new DoubleNode<>(data);
        }
        size++;
    }


    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public DoubleNode<T> getHead() {
        return head;
    }

    public DoubleNode<T> getTail() {
        return tail;
    }

}
