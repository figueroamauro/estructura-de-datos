package ar.com.old.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    void shouldCreateNode() {
        TreeNode node = new TreeNode(5);
        assertEquals(5, node.data);
        assertNull(node.right);
        assertNull(node.left);
    }

}