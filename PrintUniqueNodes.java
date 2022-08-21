package Linked_List_Package;

import java.awt.*;
import java.util.Scanner;

public class PrintUniqueNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TestLinkedList tt = new TestLinkedList();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
//            tt.InsertNode(data);
            tt.InsertIntoDoubleLinkedList(data);
        }

        tt.PrintDoubleLinkedList();

        tt.InsertAtNthPositionInDoubleLinkedList(10,3);
        System.out.println("");
        tt.PrintDoubleLinkedList();

//        tt.PrintLinkedList();
//        System.out.println(tt.IsPalindrome());
//        tt.ReverseLinkedList();
    }

}
