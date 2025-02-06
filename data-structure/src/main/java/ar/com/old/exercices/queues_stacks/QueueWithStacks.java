package ar.com.old.exercices.queues_stacks;

/*
Implementa una cola con dos pilas
 */

import ar.com.old.stacks.Stack;

public class QueueWithStacks {
    public Stack firstStack;
    public Stack secondStack;

    public QueueWithStacks() {
        this.firstStack = new Stack();
        this.secondStack = new Stack();
    }

    public void add(int value) {
        firstStack.push(value);
    }


}
