package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    static BinaryTree<Integer> tree;

    @Before
    public void setUpOurTree() {
//        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree = new BinaryTree<Integer>();
        tree.root = new TreeNode<>(1);
        tree.root.left = new TreeNode<>(2);
        tree.root.right = new TreeNode<>(3);
        tree.root.left.left = new TreeNode<>(4);
        tree.root.left.right = new TreeNode<>(5);
    }

    @Test
    public void testPreOrder() {
        ArrayList<Integer> treeList = tree.preOrder(tree.root);
//        System.out.println("PreOrder Tree = " + tree.printTree(treeList));
        assertEquals(" 1 2 4 5 3", tree.printTreeList(treeList));
    }

    @Test
    public void testInOrder() {
        ArrayList<Integer> treeList = tree.inOrder(tree.root);
//        System.out.println("InOrder Tree = " + tree.printTree(treeList));
        assertEquals(" 4 2 5 1 3", tree.printTreeList(treeList));
    }

    @Test
    public void testPostOrder() {
        ArrayList<Integer> treeList = tree.postOrder(tree.root);
//        System.out.println("PostOrder Tree = " + tree.printTree(treeList));
        assertEquals(" 4 5 2 3 1", tree.printTreeList(treeList));
    }

    @Test
    public void testBreadthFirstTraversal() {
        ArrayList<Integer> treeList = tree.breadthFirstTraversal(tree.root);
//        System.out.println("Breadth First Traversal = " + tree.printTree(treeList));
        assertEquals(" 1 2 3 4 5", tree.printTreeList(treeList));
    }
    
    @Test
    public void testBreadthFirstTraversal_empty() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        ArrayList<Integer> treeList = tree.breadthFirstTraversal(tree.root);
//        System.out.println("Breadth First Traversal = " + tree.printTreeList(treeList));
        assertEquals("", tree.printTreeList(treeList));
    }

    @Test
    public void testFindMaximumValue_case1() {
        int actual = tree.findMaximumValue(tree.root);
        assertEquals(5, actual);
    }

    @Test
    public void testFindMaximumValue_case2() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.root = new TreeNode<>(2);
        tree.root.left = new TreeNode<>(7);
        tree.root.right = new TreeNode<>(5);
        tree.root.left.right = new TreeNode<>(6);
        tree.root.left.right.left = new TreeNode<>(1);
        tree.root.left.right.right = new TreeNode<>(11);
        tree.root.right.right = new TreeNode<>(9);
        tree.root.right.right.left = new TreeNode<>(4);
        int actual = tree.findMaximumValue(tree.root);
        assertEquals(11, actual);
    }

    @Test
    public void testFindMaximumValue_empty() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        int actual = tree.findMaximumValue(tree.root);
        assertEquals(Integer.MIN_VALUE, actual);
    }
}
