package ar.com.old.stacks;

import ar.com.old.nodes.Node;

import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int size = 0;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = this.top;
        this.top = newNode;
        size++;
    }

    public int pop() {
       int result = peek();
        this.top = this.top.next;
        size--;
        return result;
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

    public int size() {
        return size;
    }

}
