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
        } else {
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
        } else {
            tail = new DoubleNode<>(data);
        }
        size++;
    }

    public void removeTail() {
        if (tail != null) {
            if (tail == head) {
                tail = null;
                head = null;
            }else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

    public void removeHead() {
        if (!isEmpty()) {
            if (head == tail) {
                head = null;
                tail = null;
            }else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    public void print() {
            DoubleNode<T> current = head;
            while (current.next != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
        }
        System.out.println(current.data);
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
