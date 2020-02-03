package code401challenges.utilities;

import code401challenges.tree.BinaryTree;
import code401challenges.tree.IntNode;
import code401challenges.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {
    static BinaryTree<Object> tree;

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzTree_case1() {
        tree = new BinaryTree<>();
        tree.root = new TreeNode<>(1);
        tree.root.left = new TreeNode<>(2);
        tree.root.right = new TreeNode<>(3);
        tree.root.left.left = new TreeNode<>(4);
        tree.root.left.right = new TreeNode<>(5);

        FizzBuzzTree<Object> testTree = new FizzBuzzTree<Object>();
        BinaryTree<Object> actual = FizzBuzzTree.fizzBuzzTree(tree);

        System.out.println("actual = " + actual.root.value);
        assertEquals(1, actual.root.value);
        assertEquals(2, actual.root.left.value);
        assertEquals("Fizz", actual.root.right.value);
        assertEquals(4, actual.root.left.left.value);
        assertEquals("Buzz", actual.root.left.right.value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzTree_case2() {
        tree = new BinaryTree<>();
        tree.root = new TreeNode<>(15);
        tree.root.left = new TreeNode<>(8);
        tree.root.right = new TreeNode<>(3);
        tree.root.left.left = new TreeNode<>(18);
        tree.root.left.right = new TreeNode<>(5);

        FizzBuzzTree<Object> testTree = new FizzBuzzTree<Object>();
        BinaryTree<Object> actual = FizzBuzzTree.fizzBuzzTree(tree);


        assertEquals("FizzBuzz", actual.root.value);
        assertEquals(8, actual.root.left.value);
        assertEquals("Fizz", actual.root.right.value);
        assertEquals("Fizz", actual.root.left.left.value);
        assertEquals("Buzz", actual.root.left.right.value);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzTree_case3() {
        tree = new BinaryTree<>();
        FizzBuzzTree<Object> testTree = new FizzBuzzTree<Object>();
        FizzBuzzTree.fizzBuzzTree(tree);
    }
}
