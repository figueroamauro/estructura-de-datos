package ar.com.old.queues;

import ar.com.old.exceptions.EmptyQueueException;
import ar.com.old.nodes.Node;

public class Queue {

    public Node first;
    public Node last;

    public void add(int i) {
        if (first == null) {
            first = new Node(i);
            last = first;
        } else {
            last.next = new Node(i);
            last = last.next;
        }
    }

    public void remove() {
        if (first == null) {
            throw new EmptyQueueException("La cola esta vacia");
        }
       first = first.next;
    }
}
