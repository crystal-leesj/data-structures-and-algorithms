package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testAdd() {
        BinarySearchTree tree = new BinarySearchTree();
        ArrayList<Integer> treeList = tree.inOrder(tree.root);
        String actual = tree.printTree(treeList);
        assertEquals("", actual);

        tree.insert(50);
        treeList = tree.inOrder(tree.root);
        actual = tree.printTree(treeList);
        assertEquals(" 50", actual);

        tree.insert(30);
        treeList = tree.inOrder(tree.root);
        actual = tree.printTree(treeList);
        assertEquals(" 30 50", actual);

        tree.insert(20);
        treeList = tree.inOrder(tree.root);
        actual = tree.printTree(treeList);
        assertEquals(" 20 30 50", actual);

        tree.insert(40);
        treeList = tree.inOrder(tree.root);
        actual = tree.printTree(treeList);
        assertEquals(" 20 30 40 50", actual);

        tree.insert(70);
        treeList = tree.inOrder(tree.root);
        actual = tree.printTree(treeList);
        assertEquals(" 20 30 40 50 70", actual);

        tree.insert(60);
        treeList = tree.inOrder(tree.root);
        actual = tree.printTree(treeList);
        assertEquals(" 20 30 40 50 60 70", actual);

        tree.insert(80);
        treeList = tree.inOrder(tree.root);
        actual = tree.printTree(treeList);
        assertEquals(" 20 30 40 50 60 70 80", actual);
    }

    @Test
    public void testContain() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        assertTrue(tree.contain(tree.root, 40));
        assertFalse(tree.contain(tree.root, 100));
    }
}
