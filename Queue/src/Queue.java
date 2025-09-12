public class Queue {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;

    public void enque(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){

            current = current.next;
        }

        current.next = newNode;
    }

    public int pop(){
        int value = head.data;
        return value;

    }



}
