package code401challenges.utilities;

import code401challenges.tree.IntNode;
import code401challenges.tree.BinaryTree;
import code401challenges.tree.TreeNode;

public class FizzBuzzTree {
    public IntNode root;

    public void fizzBuzzTree(BinaryTree<Object> tree) {
        this.root = fizzBuzzTree(tree.node);
        
    }


    private void fizzBuzzTree(IntNode root) {

    }



    //    public void insert(int key) {
//        this.root = insert(root, key);
//    }
//
//    private IntNode insert(IntNode root, int new_value) {
//        if (root == null) {
//            root = new IntNode(new_value);
//            return root;
//        }
//        if (new_value < root.key) {
//            root.left = insert(root.left, new_value);
//        } else if (new_value > root.key) {
//            root.right = insert(root.right, new_value);
//        }
//        return root;
//    }

}
