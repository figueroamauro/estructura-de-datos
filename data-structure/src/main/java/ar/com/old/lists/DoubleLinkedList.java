package ar.com.old.lists;

import ar.com.old.nodes.DoubleNode;

public class DoubleLinkedList<T> {
    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addHead(T data) {
        DoubleNode<T> newNode = new DoubleNode<>(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    public DoubleNode<T> getHead() {
        return head;
    }

    public DoubleNode<T> getTail() {
        return tail;
    }

}
