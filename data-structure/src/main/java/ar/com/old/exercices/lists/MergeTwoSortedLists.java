package ar.com.old.exercices.lists;

import ar.com.old.lists.SingleLinkedList;
import ar.com.old.nodes.Node;

/*
Escribe un algoritmo para unir dos listas enlazadas que esten ordenadas de menor a mayor.

Ejemplo:
Entrada: [1, 2, 4, 6] y [2, 3, 5]
Salida: [1, 2, 2, 3, 4, 5, 6]

 */
public class MergeTwoSortedLists {

    public SingleLinkedList mergeTwoList(SingleLinkedList list1, SingleLinkedList list2) {
        SingleLinkedList mergeList = new SingleLinkedList();
        Node aux = new Node(-1);
        Node current = aux;

        while (list1.head != null && list2.head != null) {
            if (list1.head.data <= list2.head.data) {
                current.next = list1.head;
                list1.head = list1.head.next;
            } else {
                current.next = list2.head;
                list2.head = list2.head.next;
            }
            current = current.next;
        }

        if (list1.head != null) {
            current.next = list1.head;
        }
        if (list2.head != null) {
            current.next = list2.head;
        }

        mergeList.head = aux.next;
        return mergeList;
    }
}
