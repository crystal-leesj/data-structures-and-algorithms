package code401challenges.TreeIntersection;

import org.junit.Test;

import java.util.ArrayList;

import static code401challenges.TreeIntersection.TreeIntersection.tree_intersection;
import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {
    @Test
    public void tree_intersectionTest1() {
        TreeIntersection.BinaryTree tree1;
        tree1 = new TreeIntersection.BinaryTree();
        tree1.root = new TreeIntersection.Node(150);
        tree1.root.left = new TreeIntersection.Node(100);
        tree1.root.right = new TreeIntersection.Node(250);
        tree1.root.left.left = new TreeIntersection.Node(75);
        tree1.root.left.right = new TreeIntersection.Node(160);
        tree1.root.left.right.left = new TreeIntersection.Node(125);
        tree1.root.left.right.right = new TreeIntersection.Node(175);
        tree1.root.right.left = new TreeIntersection.Node(200);
        tree1.root.right.right = new TreeIntersection.Node(350);
        tree1.root.right.left.left = new TreeIntersection.Node(300);
        tree1.root.right.left.right = new TreeIntersection.Node(500);

        TreeIntersection.BinaryTree tree2;
        tree2 = new TreeIntersection.BinaryTree();
        tree2.root = new TreeIntersection.Node(42);
        tree2.root.left = new TreeIntersection.Node(100);
        tree2.root.right = new TreeIntersection.Node(600);
        tree2.root.left.left = new TreeIntersection.Node(15);
        tree2.root.left.right = new TreeIntersection.Node(160);
        tree2.root.left.right.left = new TreeIntersection.Node(125);
        tree2.root.left.right.right = new TreeIntersection.Node(175);
        tree2.root.right.left = new TreeIntersection.Node(200);
        tree2.root.right.right = new TreeIntersection.Node(350);
        tree2.root.right.left.left = new TreeIntersection.Node(4);
        tree2.root.right.left.right = new TreeIntersection.Node(500);

        ArrayList<Integer> result = tree_intersection(tree1.root, tree2.root);
        String actual = "";
        for (int i=0; i<result.size(); i++)
            actual += result.get(i)+ " ";

        assertEquals("160 500 200 175 125 100 350 ", actual);
    }

    @Test
    public void tree_intersectionTest2() {
        TreeIntersection.BinaryTree tree1;
        tree1 = new TreeIntersection.BinaryTree();
        tree1.root = new TreeIntersection.Node(150);
        tree1.root.left = new TreeIntersection.Node(100);
        tree1.root.right = new TreeIntersection.Node(250);
        tree1.root.left.left = new TreeIntersection.Node(75);
        tree1.root.left.right = new TreeIntersection.Node(160);
        tree1.root.left.right.left = new TreeIntersection.Node(125);
        tree1.root.left.right.right = new TreeIntersection.Node(175);
        tree1.root.right.left = new TreeIntersection.Node(200);
        tree1.root.right.right = new TreeIntersection.Node(350);
        tree1.root.right.left.left = new TreeIntersection.Node(300);
        tree1.root.right.left.right = new TreeIntersection.Node(500);

        TreeIntersection.BinaryTree tree2;
        tree2 = new TreeIntersection.BinaryTree();
        tree2.root = new TreeIntersection.Node(150);
        tree2.root.left = new TreeIntersection.Node(100);
        tree2.root.right = new TreeIntersection.Node(250);
        tree2.root.left.left = new TreeIntersection.Node(75);
        tree2.root.left.right = new TreeIntersection.Node(160);
        tree2.root.left.right.left = new TreeIntersection.Node(125);
        tree2.root.left.right.right = new TreeIntersection.Node(175);
        tree2.root.right.left = new TreeIntersection.Node(200);
        tree2.root.right.right = new TreeIntersection.Node(350);
        tree2.root.right.left.left = new TreeIntersection.Node(300);
        tree2.root.right.left.right = new TreeIntersection.Node(500);

        ArrayList<Integer> result = tree_intersection(tree1.root, tree2.root);
        String actual = "";
        for (int i=0; i<result.size(); i++)
            actual += result.get(i)+ " ";

        assertEquals("160 250 500 200 175 150 125 100 75 350 300 ", actual);
    }

    @Test
    public void tree_intersectionTest3() {
        TreeIntersection.BinaryTree tree1;
        tree1 = new TreeIntersection.BinaryTree();
        tree1.root = new TreeIntersection.Node(5);
        tree1.root.left = new TreeIntersection.Node(1);
        tree1.root.right = new TreeIntersection.Node(10);
        tree1.root.left.left = new TreeIntersection.Node(0);
        tree1.root.left.right = new TreeIntersection.Node(4);
        tree1.root.right.left = new TreeIntersection.Node(7);
        tree1.root.right.left.right = new TreeIntersection.Node(9);

        TreeIntersection.BinaryTree tree2;
        tree2 = new TreeIntersection.BinaryTree();
        tree2.root = new TreeIntersection.Node(10);
        tree2.root.left = new TreeIntersection.Node(7);
        tree2.root.right = new TreeIntersection.Node(20);
        tree2.root.left.left = new TreeIntersection.Node(4);
        tree2.root.left.right = new TreeIntersection.Node(9);

        ArrayList<Integer> result = tree_intersection(tree1.root, tree2.root);
        String actual = "";
        for (int i=0; i<result.size(); i++)
            actual += result.get(i)+ " ";

        assertEquals("10 9 7 4 ", actual);
    }

}
