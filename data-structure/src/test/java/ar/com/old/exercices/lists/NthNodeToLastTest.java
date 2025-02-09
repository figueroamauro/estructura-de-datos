package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NthNodeToLastTest {
    SingleLinkedList list = new SingleLinkedList();

    @Test
    void shouldReturnNthNodeToLast() {
        NthNodeToLast nthNode = new NthNodeToLast();
        completeList();
        assertEquals(6, nthNode.nthNodeToLast(list, 3));
        assertEquals(7, nthNode.nthNodeToLast(list, 1));
        assertEquals(-1, nthNode.nthNodeToLast(list, 10));
    }


    private void completeList() {
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(6);
        list.addTail(8);
        list.addTail(7);
    }
}
