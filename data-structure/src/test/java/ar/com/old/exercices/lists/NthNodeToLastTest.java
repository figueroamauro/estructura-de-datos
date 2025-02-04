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
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(7);
    }
}
