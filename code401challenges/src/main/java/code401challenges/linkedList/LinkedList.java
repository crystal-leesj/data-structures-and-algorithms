package code401challenges.linkedList;

public class LinkedList {
    Node head;

    public boolean isEmpty(){
        return length() == 0;
    }


    public int length() {
        int length = 0;
        Node current = head;
        while(current != null) {
            length++;
            current = current.next;
        }
        return length;
    }


    class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null;}
    }

    public Node insert(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            return new_node;
        }
        new_node.next = head;
        head = new_node;
        return new_node;
    }

    public boolean include(int new_data) {
        Node new_node = head;
        while (new_node != null) {
            if (new_node.data == new_data) {
                return true;
            }
            new_node = new_node.next;
        }
        return false;
    }

    public String toString() {
        String result = "";
        Node new_node = head;
        while (new_node != null) {
            result += "{ " + new_node.data + " } -> ";
            new_node = new_node.next;
        }
        result += "NULL";
        return result;
    }

}
