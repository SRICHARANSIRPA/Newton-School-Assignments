package Linked_List_Package;


import java.util.Scanner;

class Node {

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    int data;
    Node next;
}


public class TestLinkedList {

    Node Head = null;

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

    public void PrintLinkedList() {
        Node tmp = this.Head;

        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
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


}
