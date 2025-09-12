public class MyLinkedList<T> {
    class Node {
        T data;
        Node next;
        Node prev;

        Node(T data){
            this.data = data;
        }
    }

    Node head;

    public void add(T data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        Node prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    /*
    if empty returns []
    otherwise it returns data --> data --> data ...
     */
    public String toString(){
        if (head == null){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while(current != null){
            sb.append(current.data);
            if(current.next != null){
                sb.append("-->");
            }
            current = current.next;
        }
        return sb.toString();
    }
}
