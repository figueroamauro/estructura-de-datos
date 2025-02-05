package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {
    @Test
    void shouldSwapNodesInPairs(){
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        swapNodesInPairs.swapNodesInPairs(list);
        assertEquals(2, list.head.value);
        assertEquals(1, list.head.next.value);
        assertEquals(4, list.head.next.next.value);
        assertEquals(3, list.head.next.next.next.value);
    }

}