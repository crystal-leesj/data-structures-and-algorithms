package code401challenges.tree;

import java.util.ArrayList;

//RESOURCE: https://www.geeksforgeeks.org/binary-search-tree-data-structure/

public class BinarySearchTree {
    public IntNode root;

    public void insert(int key) {
        root = insert(root, key);
    }

    private IntNode insert(IntNode root, int new_value) {
        if (root == null) {
            root = new IntNode(new_value);
            return root;
        }
        if (new_value < root.key) {
            root.left = insert(root.left, new_value);
        } else if (new_value > root.key) {
            root.right = insert(root.right, new_value);
        }
        return root;
    }

    public boolean contain(IntNode root, Integer key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        if (root.key > key) {
            return contain(root.left, key);
        }
        return contain(root.right, key);
    }

    public ArrayList<Integer> inOrder(IntNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        if (node != null) {
            ArrayList<Integer> left = inOrder(node.left);
            list.addAll(left);

            list.add(node.key);

            ArrayList<Integer> right = inOrder(node.right);
            list.addAll(right);
        }
        return list;
    }

    public String printTree(ArrayList<Integer> list) {
        String result = "";
        for (Integer integer : list) {
            result += " " + integer;
        }
        return result;
    }
}
