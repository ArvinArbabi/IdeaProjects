//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(3);
        l.add(3);
        l.add(2);
        System.out.println(l.toString());
        l.contains();
        System.out.println(l.toString());

        LinkedList l2 = new LinkedList();
        l2.add("reza");
        l2.add("arvin");
        l2.add("arvin");
        l2.add(3);
        System.out.println(l2.toString());
        l2.contains();
        System.out.println(l2.toString());

    }
}