package ar.com.old.nodes;

import static org.junit.jupiter.api.Assertions.*;

import ar.com.old.exceptions.EmptyLinkedListException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SingleLinkedListTest {
    SingleLinkedList list = new SingleLinkedList();
    @BeforeEach
    void init() {
         list = new SingleLinkedList();
    }

    @Test
    void shouldCreateSingleLinkedList() {
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    void shouldReturnListSize() {
        completeList();
        assertEquals(3,list.size());
    }

    @Test
    void shouldReturnHeadValue() {
        list.add(4);
        list.add(2);
        assertEquals(2,list.value());
    }

    @Test
    void shouldAddNode() {
        list.add(1);
        assertEquals(1, list.size());
        assertEquals(1, list.value());
    }

    @Test
    void shouldRemoveNode() {
        completeList();
        list.remove(2);
        assertEquals(2, list.size());
    }

    @Test
    void shouldThrowExceptionRemovingNode_withEmptyList(){
    Exception exception =assertThrows(EmptyLinkedListException.class, () -> list.remove(1));
    assertEquals("La lista esta vacia", exception.getMessage());
    }

    @Test
    void shouldVerifyIfNodeExists() {
        completeList();
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
        assertFalse(list.contains(4));
    }

    @Test
    void shouldVerifyEmptyList() {
        assertTrue(list.isEmpty());
    }

    @Test
    void shouldPrintList() {
        completeList();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        list.printList();
        System.setOut(originalOut);

        assertEquals("3 -> 2 -> 1\n",outputStream.toString());
    }

    private void completeList() {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
