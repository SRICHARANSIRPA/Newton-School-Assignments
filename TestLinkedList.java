package Linked_List_Package;


import java.util.HashMap;
import java.util.Scanner;

class Node {

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.pre = null;
    }

    int data;
    Node next;
    Node pre;
}


public class TestLinkedList {

    Node Head = null;
    Node Tail = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Nodes you want to create a LinkedList");
        int n = sc.nextInt();

        TestLinkedList tt = new TestLinkedList();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            tt.InsertNode(data);
        }
        tt.PrintLinkedList();
    }

    public void InsertIntoDoubleLinkedList(int data) {
        if (Head == null) {
            Tail = Head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Tail.next = newNode;
        newNode.pre = Tail;
        Tail = newNode;
    }

    public void DeleteNodeIndoubleLinkedList(int n) {
        if (n == 1) {
            Head = Head.next;
            Head.pre = null;
        } else {
            Node ptr = Head;
            for (int i = 1; i < n - 1; i++) {
                ptr = ptr.next;
            }
            ptr.pre.next = ptr.next;
            if (ptr.next != null) {
                ptr.next.pre = ptr.pre;
            } else {
                Tail = ptr.pre;
            }

        }
    }


    public void InsertAtNthPositionInDoubleLinkedList(int data, int n) {

        Node ptr = Head;
        for (int i = 1; i < n - 1; i++) {
            ptr = ptr.next;
        }

        Node newNode = new Node(data);
        newNode.pre = ptr;
        newNode.next = ptr.next;
        ptr.next.pre = newNode;
        ptr.next = newNode;

    }

    public void PrintDoubleLinkedList() {
        //forward
        Node ptr = Head;
        while (ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.next;
        }
        System.out.println("");
        //Reverse
        ptr = Tail;
        while (ptr != null) {
            System.out.print(ptr.data + "\t");
            ptr = ptr.pre;
        }
    }


    public void ReverseLinkedList() {
        Node pre = null;
        Node curr = Head;

        while (curr != null) {
            Node tmp = curr.next;
            curr.next = pre;
            // Move the pointers
            pre = curr;
            curr = tmp;
        }
        Head = pre;
    }

    public void PrintMiddleNode() {
        Node slow = Head;
        Node fast = Head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    private Node getMiddleNode() {
        Node slow = Head;
        Node fast = Head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node reverseSubLinkedList(Node node) {
        Node pre = null;
        Node curr = node;

        while (curr != null) {
            Node tmp = curr.next;
            curr.next = pre;
            // Move the pointers
            pre = curr;
            curr = tmp;
        }
        return pre;
    }


    public boolean IsPalindrome() {
        Node middle = getMiddleNode();
        Node Head2 = reverseSubLinkedList(middle);

        Node ptr1 = Head;
        Node ptr2 = Head2;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.data != ptr2.data)
                return false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;
    }


    public void PrintLinkedList() {
        Node tmp = this.Head;

        while (tmp != null) {
            System.out.print(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println("");
    }


    public void InsertNode(int data) {

        Node node = new Node(data);
        if (this.Head == null) {
            this.Head = node;
        } else {
            Node tmp = this.Head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }


    }

    public void PrintDistinctNodesInSortedLinkedList(Node Head) {
        Node tmp1 = Head;
        while (tmp1 != null) {
            System.out.println(tmp1.data);
            Node tmp2 = tmp1.next;
            while (tmp2 != null && tmp2.data == tmp1.data) {
                tmp2 = tmp2.next;
            }
            tmp1 = tmp2;
        }
    }

    public void PrintInReverseOrder(Node Head) {
        if (Head == null) return;
        PrintInReverseOrder(Head.next);
        System.out.println(Head.data);
    }

    public void PrintUniqueNodes(Node Head) {
        Node tmp = Head;
        HashMap<Integer, Boolean> map = new HashMap<>();
        while (tmp != null) {
            if (map.get(tmp.data) == null) {
                System.out.println(tmp.data);
                map.put(tmp.data, Boolean.TRUE);
            }
            tmp = tmp.next;
        }
    }

    public void InsertAtNthposistion(Node Head, int n, int value) {
        Node newnode = new Node(value);
        Node tmp = Head;
        for (int i = 1; i < n - 1; i++) {
            tmp = tmp.next;
        }
        Node NextNode = tmp.next;
        tmp.next = newnode;
        newnode.next = NextNode;
    }


}
