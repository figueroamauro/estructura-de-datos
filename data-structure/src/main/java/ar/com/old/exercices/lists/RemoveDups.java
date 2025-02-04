package ar.com.old.exercices.lists;

/*
Escribe un algoritmo para eliminar los duplicados de una lista enlazada de números.

Ejemplo:
Entrada: [1, 2, 3, 2, 4, 2, 5]
Salida: [1, 2, 3, 4, 5]
 */

import ar.com.old.lists.SingleLinkedList;
import ar.com.old.nodes.Node;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    public void removeDups(SingleLinkedList list) {
        Set<Integer> foundValues = new HashSet<>();
        Node current = list.head;

        if (current == null) {
            return;
        }
        foundValues.add(current.value);

        while (current.next != null) {
            boolean isDuplicated = !foundValues.add(current.next.value);
            if (isDuplicated) {
                current.next = current.next.next;
                list.setSize(list.size() - 1);
            }
            current = current.next;
        }
    }
}
