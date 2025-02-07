package ar.com.old.exercices.queues_stacks;

import ar.com.old.stacks.Stack;

import java.util.EmptyStackException;

/*
Escribe un algoritmo para ordenar una pila de números de menor a mayor.
Puedes usar un Stack adicional, pero no está permitido copiar los elementos a otra estructura de datos.

Ejemplo:
Entrada: [5, 1, 4, 2]
Salida: [1, 2, 4, 5]

 */
public class SortStack {

    public Stack sort(Stack stack) {

        Stack sortedStack = new Stack();

        while (!stack.isEmpty()) {
            int aux = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() < aux) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(aux);

        }
        return sortedStack;
    }
}
