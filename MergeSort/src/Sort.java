

public class Sort {
    public void MergeSort(int[] a, int left, int right){
        if (left >= right) return;

        int middle = (left + right)/2;
        MergeSort(a, left, middle);
        MergeSort(a, middle + 1, right);
        Merge2(a, left, right, middle);
    }


    private void Merge2(int[] a, int left, int right, int middle) {
        int i = left;
        int j = middle + 1;

        while (i <= middle && j <= right) {
            if (a[i] <= a[j]) {
                i++;
            }

            else {
                int value = a[j];
                int tmp = j;

                a[i] = value;
                i++;
                middle++;
                j++;
            }
        }
    }


    private void Merge(int[] a, int left, int right, int middle){
        int [] l = new int[middle - left + 1];
        int [] r = new int[right - middle];

        for(int i = 0; i < l.length; i++){
            l[i]=a[left + i];

        }
        for(int i = 0; i < r.length; i++) {
            r[i] = a[middle + i + 1];
        }

        int i = 0; //pointer to the left array
        int j = 0; //pointer to the right array
        int k = left;
        while(i < l.length && j < r.length){
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            }
            else {
                a[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < l.length) {
            a[k++] = l[i++];
        }

        while (j < r.length) {
            a[k++] = r[j++];
        }
    }
}
