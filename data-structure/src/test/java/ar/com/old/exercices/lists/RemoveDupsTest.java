package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveDupsTest {

    @Test
    void shouldRemoveDuplicates(){
        RemoveDups removeDups = new RemoveDups();
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        list.printList();
        removeDups.removeDups(list);
        list.printList();
        assertEquals(5, list.size());
        assertEquals(1, list.head.value);
        assertEquals(2, list.head.next.value);
        assertEquals(3, list.head.next.next.value);
        assertEquals(4, list.head.next.next.next.value);
        assertEquals(5, list.head.next.next.next.next.value);
    }
}
