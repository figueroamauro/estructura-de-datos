package ar.com.old.exercices.recursion;

/*
Crea una funcion recursiva que reciba un entero y devuelva su correspondiente
valor de la secuencia fibonacci.

Ejemplo:
Entradas: 4 - 6 - 10
Salidas: 3 - 8 - 55
 */

public class Fibonacci {
    public int fibonacci(int value) {
        if (value == 0 || value == 1) {
            return value;
        }

        return fibonacci(value - 1) + fibonacci(value - 2);
    }

}
