package code401challenges.linkedList;

public class LinkedList {
    public Node head;

    // Helper function to check if the LL is empty.
    public boolean isEmpty(){
        return length() == 0;
    }

    // Helper function to check length of LL.
    public int length() {
        int length = 0;
        Node current = head;
        while(current != null) {
            length++;
            current = current.next;
        }
        return length;
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

    public void append(int value) {
        Node new_node = new Node(value);
        new_node.next = null;

        if (this.head == null) {
            this.head = new_node;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }


    public void insertBefore(int value, int newVal) {
        Node new_node = new Node(newVal);
        new_node.next = null;

        if (this.head.data == value) {
            new_node.next = this.head;
            this.head = new_node;
        }
        else {
            Node current = this.head;
            while (current.next != null) {
                if (current.next.data == value) {
                    Node temp_node = current.next;
                    current.next = new_node;
                    new_node.next = temp_node;
                    return;
                }
                current = current.next;
            }
//            System.out.println("NOT found");
        }
    }

    public void insertAfter(int value, int newVal) {
        Node new_node = new Node(newVal);
        new_node.next = null;

        Node current = this.head;
        if (current.data == value) {
            new_node.next = current.next;
            current.next = new_node;
        }
        else {
            while (current != null) {
                if (current.data == value) {
                    new_node.next = current.next;
                    current.next = new_node;
                    return;
                }
                current = current.next;
//                System.out.println("current.data = " + current.data);
            }
            System.out.println("NOT found");
        }
    }

    public int getNthFromEnd(int k) {
        int length = 0;
        Node current = this.head;

        while (current != null) {
            current = current.next;
            length++;
        }

        if (length < k) {
            return -1;
        }

        int targetIndex = length - 1 - k;
        current = this.head;

        int counter = 0;
        while (current != null) {
            if (targetIndex == counter){
                return current.data;
            }
            current = current.next;
            counter++;
        }
        return -1;
    }

    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        if (one.head == null) return two;
        if (two.head == null) return one;

        boolean checkerListOne = false;
        boolean checkerListTwo = false;

        LinkedList result = new LinkedList();

        while (one.head != null && two.head != null) {

            result.append(one.head.data);
//            System.out.println("result = " + result.toString());

            result.append(two.head.data);
//            System.out.println("result = " + result.toString());

            one.head = one.head.next;
            if (one.head == null) {
                checkerListOne = true;
            }
            two.head = two.head.next;
            if (two.head == null) {
                checkerListTwo = true;
            }
        }
        if (checkerListOne == true) {
            while (two.head != null) {
                result.append(two.head.data);
                two.head = two.head.next;
            }
        }
        if (checkerListTwo == true) {
            while (one.head != null) {
                result.append(one.head.data);
                one.head = one.head.next;
            }
        }

//        System.out.println("Final result = " + result.toString());
        return result;
    }

}
