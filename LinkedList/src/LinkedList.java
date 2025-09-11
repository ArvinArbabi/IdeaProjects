public class LinkedList<T> {
    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data){
            this.data = data;
        }
    }

    private Node head;

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
    make a method contains that removes any duplicates from the linkedlist
     */
    public void contains(){
        java.util.HashSet<T> seen = new java.util.HashSet<>();
        Node current = head;

        while (current != null) {
            if (seen.contains(current.data)){
                Node next = current.next;
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                current = next;
            }
            else {
                seen.add(current.data);
                current = current.next;
            }
        }
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
