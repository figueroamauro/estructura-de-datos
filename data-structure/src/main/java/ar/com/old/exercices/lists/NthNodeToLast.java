package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import ar.com.old.nodes.Node;
/*
Escribe un algoritmo para encontrar el N-ésimo nodo de una lista enlazada.

Ejemplo:
Entrada: [1, 2, 3, 4, 6, 8, 7] y N = 3
Salida: 6

 */

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
        return current.data;
    }
}
