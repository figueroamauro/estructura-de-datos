package ar.com.old.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void shouldCreateTree() {
        BinaryTree tree = new BinaryTree();
        assertNotNull(tree);
    }

    @Test
    void shouldReturnRoot() {
        BinaryTree tree = new BinaryTree();
        assertNull(tree.getRoot());
    }

    @Test
    void shouldAddRootNode_whenIsEmpty() {
        BinaryTree tree = new BinaryTree();
        tree.add(5);
        tree.add(7);
        assertEquals(5, tree.getRoot().data);
    }

    @Test
    void shouldAddInCorrectPosition() {
        BinaryTree tree = new BinaryTree();
        tree.add(4);
        tree.add(2);
        tree.add(5);
        tree.add(7);
        tree.add(2);
        assertEquals(4, tree.getRoot().data);
        assertEquals(2, tree.getRoot().left.data);
        assertEquals(5, tree.getRoot().right.data);
        assertEquals(7, tree.getRoot().right.right.data);
        assertEquals(2,tree.getRoot().left.right.data);

        tree.inOrder(tree.getRoot());
        System.out.println();
        tree.preOrder(tree.getRoot());
        System.out.println();
        tree.postOrder(tree.getRoot());
    }

}