//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = a[hi];
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (a[j] < pivot) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
            }
        }
        int t = a[i];
        a[i] = a[hi];
        a[hi] = t;
        quickSort(a, lo, i - 1);
        quickSort(a, i + 1, hi);
    }

    public static void main(String[] args) {
        int[] a = {8, 3, 7, 4, 9, 2};
       quickSort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }

    }

}