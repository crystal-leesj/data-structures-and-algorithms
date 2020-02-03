package code401challenges.utilities;

import code401challenges.tree.IntNode;
import code401challenges.tree.BinaryTree;
import code401challenges.tree.TreeNode;

public class FizzBuzzTree<T> {

    public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> tree) {
        fizzBuzzTree(tree.root);
        return tree;
    }

    private static void fizzBuzzTree(TreeNode<Object> root) {
        if (root == null) {
            throw new IllegalArgumentException("The argument cannot be null");
        } else {
            fizzBuzzTree(root.left);
            fizzBuzzTree(root.right);
            if ((Integer)root.value % 15 == 0) {
                root.value = "FizzBuzz";
            } else if ((Integer)root.value % 3 == 0) {
                root.value = "Fizz";
            } else if ((int)root.value % 5 == 0) {
                root.value = "Buzz";
            }
        }

    }
}
