package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
    public TreeNode<T> root;

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

//    printLevelOrder
    public ArrayList<T> breadthFirstTraversal(TreeNode<T> root) {
        ArrayList<T> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<T> tempNode = queue.poll();
            list.add(tempNode.value);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        return list;
    }

    public int findMaximumValue(TreeNode<T> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = (int) root.value;
        int left_max = findMaximumValue(root.left);
        int right_max = findMaximumValue(root.right);

        if (left_max < right_max) {
            max = right_max;
        }
        if (right_max < left_max) {
            max = left_max;
        }
        return max;
    }

    public String printTreeList(ArrayList<Integer> list) {
        String result = "";
        for (Integer integer : list) {
            result += " " + integer;
        }
        return result;
    }

}
