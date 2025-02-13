package ar.com.old.exercices.trees;

import ar.com.old.nodes.TreeNode;

/*
Dada la raiz de un árbol binario, devuelve el árbol binario invertido.

Ejemplo:

Entrada:
                4
          2          7
      1      3   6     9

Salida:
                4
          7          2
      9      6  3      1
 */

public class InvertTree {
    public TreeNode invert(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode aux = root.left;
        root.left = invert(root.right);
        root.right = invert(aux);
        return root;
    }

}
