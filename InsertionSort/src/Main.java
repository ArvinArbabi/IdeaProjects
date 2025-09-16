import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void insertionSort2(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) { // ascending
                int tmp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = tmp;
                j--;
            }
        }
    }


    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > tmp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tmp;
        }
    }



    public static void main(String[] args) {
        int [] a = {9, 2, 3, 4, 6, 7};
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();

        insertionSort2(a);
        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
