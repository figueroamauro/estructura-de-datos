package ar.com.old.exercices.recursion;

/*
Implementa un algoritmo recursivo que simule bajar una escalera.
 */

public class GoDownStairs {

    public void goDownStairs(int n) {
        if (n == 0) {
            System.out.println("End");
            return;
        }

        System.out.println("Going down step " + n);
        goDownStairs(n - 1);
    }
}
