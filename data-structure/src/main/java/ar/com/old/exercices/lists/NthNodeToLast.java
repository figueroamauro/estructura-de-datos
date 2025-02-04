package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import ar.com.old.nodes.Node;

public class NthNodeToLast {

    public int nthNodeToLast(SingleLinkedList list, int n) {
        Node current = list.head;
        Node runner = list.head;

        for (int i = 0; i < n; i++) {
            if (runner == null) {
                return -1;
            }
            runner = runner.next;
        }

        while (runner != null) {
            runner = runner.next;
            current = current.next;
        }
        return current.value;
    }
}
