package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {
    @Test
    void shouldSwapNodesInPairs(){
        SingleLinkedList list = new SingleLinkedList();
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        swapNodesInPairs.swapNodesInPairs(list);
        assertEquals(2, list.head.data);
        assertEquals(1, list.head.next.data);
        assertEquals(4, list.head.next.next.data);
        assertEquals(3, list.head.next.next.next.data);
    }

}