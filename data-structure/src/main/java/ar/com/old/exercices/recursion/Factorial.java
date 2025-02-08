package ar.com.old.exercices.recursion;

/*
Implementa un algoritmo para calcular el factorial de un número de forma recursiva.

Ejemplo:
Entrada: 5
Salida: 120
 */
public class Factorial {

    public int calculateFactorial(int value) {
        if (value == 1 || value == 0) {
            return 1;
        }

        return value * calculateFactorial(value - 1);
    }
}
