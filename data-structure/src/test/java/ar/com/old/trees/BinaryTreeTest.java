package ar.com.old.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    BinaryTree tree;

    @BeforeEach
    void init() {
        tree = new BinaryTree();
    }

    @Test
    void shouldCreateTree() {
        assertNotNull(tree);
    }

    @Test
    void shouldReturnRoot() {
        assertNull(tree.getRoot());
    }

    @Test
    void shouldAddRootNode_whenIsEmpty() {
        tree.add(5);
        tree.add(7);
        assertEquals(5, tree.getRoot().data);
    }

    @Test
    void shouldAddInCorrectPosition() {
        addNodesToTree();
        assertEquals(4, tree.getRoot().data);
        assertEquals(2, tree.getRoot().left.data);
        assertEquals(5, tree.getRoot().right.data);
        assertEquals(7, tree.getRoot().right.right.data);
        assertEquals(2, tree.getRoot().left.right.data);
    }

    @Test
    void shouldPrintTree_inOrder() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(outputStream));
        addNodesToTree();
        tree.inOrder(tree.getRoot());
        System.setOut(out);
        String expectedOut = "2 2 4 5 7 ";
        assertEquals(expectedOut,outputStream.toString());
    }

    private void addNodesToTree() {
        tree.add(4);
        tree.add(2);
        tree.add(5);
        tree.add(7);
        tree.add(2);
    }

}