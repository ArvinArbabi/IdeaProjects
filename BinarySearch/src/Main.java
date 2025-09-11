//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void loop1() {
        int[] a = {2, 3, 4, 5, 7};

        for (int i=0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }

    public static void loop2() {
        int[] a = {2, 3, 4, 5, 7, 8, 12, 14, 23, 21, 1, 6};

        int i = 0;
        while (true) {
            if (i == a.length) break;

            System.out.println(a[i]);

            ++i;
        }
    }

    public static int binarySearch(int[] a, int num) {
        if (a == null || a.length == 0) return -1; //circuit breaker

        return binarySearch(a, num, 0, a.length-1);
    }

    public static int binarySearch(int[] a, int num, int l, int r) {
        if (l > r) return -1;

        int m = (l + r)/2;

        if (num > a[m])
            return binarySearch(a, num, m + 1, r);
        else if (num < a[m])
            return binarySearch(a, num, l, m - 1);
        else if (num == a[m])
            return m;

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 7, 8, 12, 14, 23, 31, 41, 46};

        //System.out.println(binarySearch(a, 70));

        // [0] [1] [1] [1] [1] [1] [1] [1] --> 127
        // + 1
        // [1] [1] [1] [1] [1] [1] [1] [1] --> -128

        byte max = Byte.MAX_VALUE;

        byte test = (byte)(max + 1);

        System.out.println(max);
        System.out.println(test);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}