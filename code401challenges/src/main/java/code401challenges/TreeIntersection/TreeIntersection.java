package code401challenges.TreeIntersection;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class TreeIntersection {

    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int item) {
            key = item;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }
    }

    public static void traversalInToHashTable(Node node, Hashtable<Integer, Integer> table) {

        if (node == null) {
            return;
        }
        table.put(node.key, 1);

        traversalInToHashTable(node.left, table);

        traversalInToHashTable(node.right, table);
    }

    public static void preOrder(Node node, Hashtable<Integer, Integer> table) {

        if (node == null) {
            return;
        }
        if (table.containsKey(node.key)) {
            table.put(node.key, table.get(node.key) + 1);
        }

        preOrder(node.left, table);

        preOrder(node.right, table);


    }


    public static ArrayList<Integer> tree_intersection(Node root1, Node root2) {

        Hashtable<Integer, Integer> table = new Hashtable<>();

        ArrayList<Integer> resultList = new ArrayList<>();

        traversalInToHashTable(root1, table);

//        String hashtable = table.toString();
//        System.out.println("result = " + hashtable);

        preOrder(root2, table);

//        table.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            if (entry.getValue() > 1) {
//                System.out.println("entry.getKey() = " + entry.getKey());
                resultList.add(entry.getKey());
            }
        }

        return resultList;
    }
}
