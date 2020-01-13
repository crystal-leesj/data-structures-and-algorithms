package code401challenges.linkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insert(7);

    }

    Node head;

    public boolean isEmpty(){ return length() == 0; }


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

}
