package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import ar.com.old.nodes.Node;

/*
Escribe un algoritmo para intercambiar los nodos de una lista enlazada en pares.

Ejemplo:
Entrada: [1, 2, 3, 4, 5]
Salida: [2, 1, 4, 3, 5]

 */
public class SwapNodesInPairs {

    public Node swapNodesInPairs(SingleLinkedList list) {

        if (list.head.next == null) {
            return list.head;
        }

        Node aux = list.head.next.next;
        list.head.next.next = list.head;
        list.head = list.head.next;
        SingleLinkedList auxList = new SingleLinkedList();
        auxList.head = aux;
        list.head.next.next = swapNodesInPairs(auxList);
        return list.head;
    }
}
