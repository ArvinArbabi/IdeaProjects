//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(5);

        System.out.println(q);

        q.dequeue();

        System.out.println(q);

        Queue q2 = new Queue();
        System.out.println(q2);
        q.dequeue();



    }
}