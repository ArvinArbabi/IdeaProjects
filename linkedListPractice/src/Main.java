//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        LinkListItem item = populateLinkedList("reza arvin roham mangoid".toCharArray());
        printLinkList(item);
    }

    private static LinkListItem populateLinkedList(char[] a) {
        LinkListItem item = new LinkListItem(a[a.length-1], null);

        for(int i = a.length-2; i >= 0; --i){
            LinkListItem tmp = item;
            item = new LinkListItem(a[i], tmp);
        }
        return item;
    }

    private static void printLinkList(LinkListItem item){
        while (item != null) {
            System.out.print(item.getValue());
            item = item.get_next();
        }
        System.out.println();
    }
}