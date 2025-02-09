package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    @Test
    void shouldMergeTwoSortedLists() {

        SingleLinkedList list1 = new SingleLinkedList();
        list1.addTail(1);
        list1.addTail(2);
        list1.addTail(4);
        list1.addTail(6);

        SingleLinkedList list2 = new SingleLinkedList();
        list2.addTail(2);
        list2.addTail(3);
        list2.addTail(5);


        MergeTwoSortedLists mergeList = new MergeTwoSortedLists();
        SingleLinkedList newList = mergeList.mergeTwoList(list1, list2);
        assertEquals(1, newList.head.value);
        assertEquals(2, newList.head.next.value);
        assertEquals(2, newList.head.next.next.value);
        assertEquals(3, newList.head.next.next.next.value);
        assertEquals(4, newList.head.next.next.next.next.value);
        assertEquals(5, newList.head.next.next.next.next.next.value);
        assertEquals(6, newList.head.next.next.next.next.next.next.value);
    }
}
