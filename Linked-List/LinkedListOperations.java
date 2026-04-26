public class LinkedListOperations {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

    // Insert at Beginning
    static void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete from Beginning
    static void deleteAtBeginning(){
        if(head == null){
            System.out.println("List Empty");
            return;
        }
        head = head.next;
    }

    // Delete by Value
    static void deleteNode(int key){
        if(head == null){
            System.out.println("List Empty");
            return;
        }
        if(head.data == key){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Node not found");
            return;
        }
        prev.next = temp.next;
    }

    // Display Linked List
    static void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {

        // Insertion
        insertAtBeginning(20);
        insertAtBeginning(10);
        insertAtEnd(30);
        insertAtEnd(40);

        System.out.println("After Insertion:");
        display();

        // Delete first node
        deleteAtBeginning();
        System.out.println("After Deletion at Beginning:");
        display();

        // Delete specific node
        deleteNode(30);
        System.out.println("After Deleting 30:");
        display();
    }
}
