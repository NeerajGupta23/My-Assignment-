public class prg1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void createNode(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void searchNode(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Yes");
                break;
            }
            temp = temp.next;
        }
        if (temp == null)
            System.out.println("No");
    }

    public void addNodeAfterNode(Node node, int data) {
        Node newNode = new Node(data);
        newNode.next = node.next;
        node.next = newNode;
    }

    // for sorted linked list
    public void deleteRepeatedNode() {
        Node p, q;
        p = head;
        while (p.next != null) {
            q = p.next;
            if (p.data == q.data) {
                while (p.data == q.data && q.next != null && p.data == q.next.data) {
                    q = q.next;
                }
                p.next = q.next;
                continue;
            }
            p = p.next;
        }

    }

    public Node reverseLinkedList(Node node) {
        Node p = null;
        Node q = node;
        Node r = node.next;
        while (r != null) {
            q.next = p;
            p = q;
            q = r;
            r = r.next;
        }
        q.next = p;
        return q;
    }

    public boolean checkPalindrome() {
        if(head == null) {
            return false;
        }
        else if(head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null && fast.next == null) {
            slow = slow.next;
        }
        slow = reverseLinkedList(slow);
        Node temp = head;
        while (slow != null) {
            if(slow.data != temp.data) {
                return false;
            }
            slow = slow.next;
            temp = temp.next;
        }
        return true;
    }

    public void additionOfTwoLinkedList(Node list1, Node list2) {
        list1 = reverseLinkedList(list1);
        list2 = reverseLinkedList(list2);
        int carry = 0;
        Node node = new Node(0);
        Node node1 = node;
        while (list1 != null && list2 != null) {
            int data = list1.data + list2.data + carry;
            Node newNode = new Node(data%10);
            carry = data/10;
            node1.next = newNode;
            node1 = node1.next;
            list1 = list1.next;
            list2 = list2.next;
        }
        while (list1 != null) {
            int data = list1.data + carry;
            Node newNode = new Node(data%10);
            carry = data/10;
            node1.next = newNode;
            node1 = node1.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            int data = list2.data + carry;
            Node newNode = new Node(data%10);
            carry = data/10;
            node1.next = newNode;
            node1 = node1.next;
            list2 = list2.next;
        }   
        while (carry != 0) {
            Node newNode = new Node(carry%10);
            carry = carry/10;
            node1.next = newNode;
            node1 = node1.next;
        }
        node = node.next;
        node = reverseLinkedList(node);
        head = node;
    }

    public static void main(String[] args) {
        // Ans 01:
        // prg1 linkedList1 = new prg1();
        // linkedList1.createNode(14);
        // linkedList1.createNode(21);
        // linkedList1.createNode(11);
        // linkedList1.createNode(30);
        // linkedList1.createNode(10);
        // int key = 14;
        // linkedList1.searchNode(key);
        // prg1 linkedList2 = new prg1();
        // linkedList2.createNode(6);
        // linkedList2.createNode(21);
        // linkedList2.createNode(17);
        // linkedList2.createNode(30);
        // linkedList2.createNode(10);
        // linkedList2.createNode(8);
        // linkedList2.searchNode(key = 13);



        // Ans 02:
        // prg1 linkedList3 = new prg1();
        // linkedList3.createNode(1);
        // linkedList3.createNode(2);
        // linkedList3.createNode(4);
        // linkedList3.createNode(5);
        // linkedList3.createNode(6);
        // linkedList3.displayNode();
        // linkedList3.addNodeAfterNode(linkedList3.head.next, 3);
        // linkedList3.displayNode();



        // Ans 03:
        // prg1 linkedList4 = new prg1();
        // linkedList4.createNode(1);
        // linkedList4.createNode(1);
        // linkedList4.createNode(2);
        // linkedList4.displayNode();
        // linkedList4.deleteRepeatedNode();
        // linkedList4.displayNode();
        // prg1 linkedList5 = new prg1();
        // linkedList5.createNode(1);
        // linkedList5.createNode(1);
        // linkedList5.createNode(2);
        // linkedList5.createNode(3);
        // linkedList5.createNode(3);
        // linkedList5.displayNode();
        // linkedList5.deleteRepeatedNode();
        // linkedList5.displayNode();


        // Ans 04: 
        // prg1 linkedList6 = new prg1();
        // linkedList6.createNode(1);
        // linkedList6.createNode(2);
        // linkedList6.createNode(2);
        // linkedList6.createNode(1);
        // System.out.println(linkedList6.checkPalindrome());
        // prg1 linkedList7 = new prg1();
        // linkedList7.createNode(1);
        // linkedList7.createNode(2);
        // System.out.println(linkedList7.checkPalindrome());





        // Ans 05: 
        // prg1 linkedList7 = new prg1();
        // linkedList7.createNode(5);
        // linkedList7.createNode(6);
        // linkedList7.createNode(3);
        // prg1 linkedList8 = new prg1();
        // linkedList8.createNode(8);
        // linkedList8.createNode(4);
        // linkedList8.createNode(2);
        // prg1 linkedList9 = new prg1();
        // linkedList9.additionOfTwoLinkedList(linkedList7.head, linkedList8.head);
        // linkedList9.displayNode();
        // prg1 linkedList10 = new prg1();
        // linkedList10.createNode(7);
        // linkedList10.createNode(5);
        // linkedList10.createNode(9);
        // linkedList10.createNode(4);
        // linkedList10.createNode(6);
        // prg1 linkedList11 = new prg1();
        // linkedList11.createNode(8);
        // linkedList11.createNode(4);
        // prg1 linkedList12 = new prg1();
        // linkedList12.additionOfTwoLinkedList(linkedList10.head, linkedList11.head);
        // linkedList12.displayNode();
    }
}