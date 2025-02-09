package ar.com.old.exercices.lists;

/*
Escribe un algoritmo para la suma de dos números representados como listas enlazadas.
Las listas estan en posicion invertida.

Ejemplo:
Entrada: [1, 2, 4, 6] y [5, 2, 8]
Salida: [6, 4, 2, 7]
 */

import ar.com.old.lists.SingleLinkedList;
import ar.com.old.nodes.Node;

public class AddTwoNumbers {

    public SingleLinkedList addTwoNumbers(SingleLinkedList list1, SingleLinkedList list2) {
        Node current = list1.head;
        Node current2 = list2.head;
        int rest = 0;

        SingleLinkedList resultList = new SingleLinkedList();
        resultList.head = new Node(-1);
        Node result = resultList.head;

        while (current != null || current2 != null) {
            int sum = rest;
            if (current != null) {
                sum += current.data;
                current = current.next;
            }
            if (current2 != null) {
                sum += current2.data;
                current2 = current2.next;
            }

            rest = sum / 10;
            sum = sum % 10;
            result.data = sum;

            result.next = new Node(-1);
            result = result.next;

            if (rest > 0) {
                result.next = new Node(rest);
            }

        }
        return resultList;

    }
}
