package ar.com.old.exercices.queues_stacks;

import java.util.ArrayDeque;
import java.util.Deque;


/*
Escribe un algoritmo para comprobar si una cadena de paréntesis es válida.
Contiene los siguientes caracteres: (, ), {, }, [, ]

Ejemplo:
Entrada: " ( [ ] ) { } "
Salida: true

Ejemplo:
Entrada: " ( { ) } "
Salida: false
 */
public class ValidParenthesis {
    private final Deque<Character> stack = new ArrayDeque<>();

    public boolean isValidParenthesis(String input) {
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (isOpenedParenthesis(current)) {
                pushInvertParenthesis(input.charAt(i));
            } else if (stack.isEmpty() || stack.pop() != current) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenedParenthesis(char current) {
        return current == '(' || current == '{' || current == '[';
    }

    private void pushInvertParenthesis(char c) {
        switch (c) {
            case '(':
                stack.push(')');
                break;
            case '{':
                stack.push('}');
                break;
            case '[':
                stack.push(']');
                break;
        }
    }

}
