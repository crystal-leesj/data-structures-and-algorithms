package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testPreOrder() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.node = new TreeNode<>(1);
        tree.node.left = new TreeNode<>(2);
        tree.node.right = new TreeNode<>(3);
        tree.node.left.left = new TreeNode<>(4);
        tree.node.left.right = new TreeNode<>(5);

        ArrayList<Integer> treeList = tree.preOrder(tree.node);

//        System.out.println("PreOrder Tree = " + tree.printTree(treeList));
        assertEquals(" 1 2 4 5 3", tree.printTree(treeList));
    }

    @Test
    public void testInOrder() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.node = new TreeNode<>(1);
        tree.node.left = new TreeNode<>(2);
        tree.node.right = new TreeNode<>(3);
        tree.node.left.left = new TreeNode<>(4);
        tree.node.left.right = new TreeNode<>(5);

        ArrayList<Integer> treeList = tree.inOrder(tree.node);

//        System.out.println("InOrder Tree = " + tree.printTree(treeList));
        assertEquals(" 4 2 5 1 3", tree.printTree(treeList));
    }

    @Test
    public void testPostOrder() {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.node = new TreeNode<>(1);
        tree.node.left = new TreeNode<>(2);
        tree.node.right = new TreeNode<>(3);
        tree.node.left.left = new TreeNode<>(4);
        tree.node.left.right = new TreeNode<>(5);

        ArrayList<Integer> treeList = tree.postOrder(tree.node);

//        System.out.println("PostOrder Tree = " + tree.printTree(treeList));
        assertEquals(" 4 5 2 3 1", tree.printTree(treeList));
    }
}
