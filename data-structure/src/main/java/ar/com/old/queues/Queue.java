package ar.com.old.queues;

import ar.com.old.exceptions.EmptyQueueException;
import ar.com.old.nodes.Node;

public class Queue {

    public Node first;
    public Node last;

    public void add(int i) {
        if (isEmpty()) {
            first = new Node(i);
            last = first;
        } else {
            last.next = new Node(i);
            last = last.next;
        }
    }

    public int remove() {
        int result = peek();
        first = first.next;
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

}
