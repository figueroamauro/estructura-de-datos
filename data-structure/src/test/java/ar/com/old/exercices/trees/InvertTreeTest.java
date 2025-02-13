package ar.com.old.exercices.trees;

import ar.com.old.nodes.TreeNode;
import ar.com.old.trees.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertTreeTest {

    @Test
    void shouldInvertTree() {
        InvertTree invertTree = new InvertTree();
        BinaryTree tree = new BinaryTree();
        tree.add(4);
        tree.add(2);
        tree.add(7);
        tree.add(1);
        tree.add(3);
        tree.add(6);
        tree.add(9);
        TreeNode result = invertTree.invert(tree.getRoot());
        assertEquals(4, result.data);
        assertEquals(7, result.left.data);
        assertEquals(2, result.right.data);
        assertEquals(9, result.left.left.data);
        assertEquals(6, result.left.right.data);
        assertEquals(3, result.right.left.data);
        assertEquals(1, result.right.right.data);
    }
}