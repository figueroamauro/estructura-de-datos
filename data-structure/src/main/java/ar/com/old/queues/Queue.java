package ar.com.old.queues;

import ar.com.old.exceptions.EmptyQueueException;
import ar.com.old.nodes.Node;

public class Queue {

    public Node first;
    public Node last;
    private int size;


    public void add(int i) {
        if (isEmpty()) {
            first = new Node(i);
            last = first;
            size++;
        } else {
            last.next = new Node(i);
            last = last.next;
            size++;
        }
    }

    public int remove() {
        int result = peek();
        first = first.next;
        size--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyQueueException("La cola esta vacia");
        }
        return first.value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

}
