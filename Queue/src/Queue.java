public class Queue {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;


    public void enqueue(int data){
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

    public void dequeue(){
        if (head == null){
            return;
        }
        head = head.next;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while(current != null){
            sb.append(current.data);
            if(current.next != null){
                sb.append(", ");
            }
            current = current.next;
        }
        return sb.toString();
    }



    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

}
