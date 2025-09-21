//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 81, 1, 9, 10, 6, 23, 43, 3, 2};

        System.out.println("Before sorting:");
        printArray(arr);

        Sort s = new Sort();
        s.MergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
