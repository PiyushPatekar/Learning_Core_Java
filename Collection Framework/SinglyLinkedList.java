public class SinglyLinkedList {
    
    // Step 1 - Node class
    static class Node {
        int data;   // data part
        Node next;  // Reference Part

        Node (int data) {
            this.data = data;
            this.next = null;
        }

    }


    // Head of the linked list 
        Node head;

    // Step 2 - Insert At End
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);

        // if list is empty
            if(head == null) {
                head = newNode;
                return;
            }

            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

        }

        // Step 3 - Insert at Beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;

        }

        // Step 4 - Delete
        public void deleteByValue(int key){

            if(head == null) {
                System.out.println("Linked List is Empty");
                return;
            }

            if (head.data == key) {
                head = head.next;
                return;
            }

            Node temp = head;
            while (temp.next != null && temp.next.data != key) {
                temp = temp.next;
            }

            if(temp.next == null){
                System.out.println("Value not found");
            } else {
                temp.next = temp.next.next;
            }

        }

        // Step 5 - Display

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }


    public static void main(String[] args) {
        

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtBeginning(4);
        list.deleteByValue(2);
        list.display();
    }
}
