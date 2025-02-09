package ar.com.old.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    void shouldCreateList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertNotNull(list);
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

}