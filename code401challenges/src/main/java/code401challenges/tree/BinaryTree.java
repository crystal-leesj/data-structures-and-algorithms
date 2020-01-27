package code401challenges.tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    public TreeNode<T> node;

    public ArrayList<T> preOrder(TreeNode<T> node) {
        ArrayList<T> list = new ArrayList<>();
        if (node != null) {
            list.add(node.value);
            ArrayList<T> left = preOrder(node.left);
            list.addAll(left);
            ArrayList<T> right = preOrder(node.right);
            list.addAll(right);
        }
        return list;
    }

    public ArrayList<T> inOrder(TreeNode<T> node) {
        ArrayList<T> list = new ArrayList<>();
        if (node != null) {
            ArrayList<T> left = inOrder(node.left);
            list.addAll(left);

            list.add(node.value);

            ArrayList<T> right = inOrder(node.right);
            list.addAll(right);
        }
        return list;
    }

    public ArrayList<T> postOrder(TreeNode<T> node) {
        ArrayList<T> list = new ArrayList<>();
        if (node != null) {
            ArrayList<T> left = postOrder(node.left);
            list.addAll(left);

            ArrayList<T> right = postOrder(node.right);
            list.addAll(right);

            list.add(node.value);
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
