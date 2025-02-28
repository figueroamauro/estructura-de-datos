package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    @Test
    void shouldAddTwoNumbersOfTwoLists() {
        SingleLinkedList list1 = new SingleLinkedList();
        list1.addTail(1);
        list1.addTail(2);
        list1.addTail(4);
        list1.addTail(6);
        SingleLinkedList list2 = new SingleLinkedList();
        list2.addTail(5);
        list2.addTail(2);
        list2.addTail(8);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        SingleLinkedList newList = addTwoNumbers.addTwoNumbers(list1, list2);

        assertEquals(6, newList.head.data);
        assertEquals(4, newList.head.next.data);
        assertEquals(2, newList.head.next.next.data);
        assertEquals(7, newList.head.next.next.next.data);

    }
}
