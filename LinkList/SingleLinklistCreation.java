package LinkList;

import java.util.Scanner;

public class SingleLinklistCreation {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void creation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        int enterData = scanner.nextInt();
        Node newNode = new Node(enterData);
        if (head==null){
            head=newNode;
        }
        else {
            newNode.next=head;
        }
    }
}
