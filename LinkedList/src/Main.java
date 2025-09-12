import java.util.HashSet;
import java.util.Timer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var l = new MyLinkedList<Integer>();

        for (int i = 0; i <= 10000; ++i)
            l.add(i);

        var hs = new HashSet<Integer>();

        var start = System.nanoTime();
        MyLinkedList.Node newNode = l.head;
        while(newNode != null){
            if (hs.contains((Integer)newNode.data)){
                System.out.println("duplicate find");
                break;
            }
            hs.add((Integer)newNode.data);
            newNode = newNode.next;
        }
        var end = System.nanoTime();

        System.out.println("End hashset:" + (end - start));

        var start2 = System.nanoTime();
        while(newNode != null) {
            var d = (int)newNode.data;
            var break_outer = false;

            var runnerNode = newNode;
            while (runnerNode != null) {
                if (runnerNode.data.equals(d)) {
                    System.out.println("nested loop: duplicate find");
                    break_outer = true;
                    break;
                }
                runnerNode = runnerNode.next;
            }
            if (break_outer) break;
            newNode = newNode.next;
        }
        var end2 = System.nanoTime();

        System.out.println("End nested loop:" + (end2 - start2));


        MyLinkedList l2 = new MyLinkedList();
        l2.add("reza");
        l2.add("arvin");
        l2.add("arvin");
        l2.add(3);
        System.out.println(l2.toString());

    }
}