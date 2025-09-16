public class MergeSort {
    public static void mergeSort(int[] a) {
        if (a.length <= 1) return;
        mergeSort(a, 0, a.length - 1);
    }

    private static void mergeSort(int[] a, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) temp[k++] = a[i++];
            else              temp[k++] = a[j++];
        }

        while (i <= mid)  temp[k++] = a[i++];
        while (j <= right) temp[k++] = a[j++];

        // copy back into original array
        for (int x = 0; x < temp.length; x++) {
            a[left + x] = temp[x];
        }
    }
}
