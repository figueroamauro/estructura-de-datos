package ar.com.old.exercices.queues_stacks;

import ar.com.old.stacks.Stack;

/*
Diseña un stack que además de las operaciones básicas tenga la operación de devolver el mínimo valor del stack.
 */
public class StackWithMIn {
    Stack currentStack;
    Stack auxStack;

    public StackWithMIn() {
        this.currentStack = new Stack();
        this.auxStack = new Stack();
    }

    public void push(int value) {
        if (this.auxStack.isEmpty() || value <= this.auxStack.peek()) {
            this.auxStack.push(value);
        }
        this.currentStack.push(value);
    }

    public int pop() {
        int value = currentStack.pop();
        if (value == this.auxStack.peek()) {
            this.auxStack.pop();
        }
        return value;
    }

    public int getMin() {
        return this.auxStack.peek();
    }
}
