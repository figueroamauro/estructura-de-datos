package ar.com.old.stacks;

import ar.com.old.nodes.Node;

import java.util.EmptyStackException;

public class Stack {
    private Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = this.top;
        this.top = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        this.top = this.top.next;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top.value;
    }

    public boolean isEmpty() {
        return this.top == null;
    }
}
