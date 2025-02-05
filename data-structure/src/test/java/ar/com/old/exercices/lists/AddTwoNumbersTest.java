package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    @Test
    void shouldAddTwoNumbersOfTwoLists() {
        SingleLinkedList list1 = new SingleLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(6);
        SingleLinkedList list2 = new SingleLinkedList();
        list2.add(5);
        list2.add(2);
        list2.add(8);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        SingleLinkedList newList = addTwoNumbers.addTwoNumbers(list1, list2);

        assertEquals(6, newList.head.value);
        assertEquals(4, newList.head.next.value);
        assertEquals(2, newList.head.next.next.value);
        assertEquals(7, newList.head.next.next.next.value);

    }
}
