//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int binarySearchRecursive(int[] a, int n, int left, int right) {
        if (left > right) return -1;

        int mid = (right + left) / 2;

        if (a[mid] == n) {
            return mid;
        }
        if (n < a[mid])  {
            return binarySearchRecursive(a, n, left, mid - 1);
        }
        else {
            return binarySearchRecursive(a, n, mid + 1, right);
        }
    }


    public static int binarySearch(int[] a, int n){
        int left = 0;
        int right = a.length-1;
        int middle = (right+left)/2;

        while(left<=right){
            if (n == a[middle]){
                return middle;
            }
            else if (n < a[middle]){
                right = middle-1;
            }
            else {
                left = middle+1;
            }
            middle = (right + left)/2;

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 7, 8, 12, 14, 23, 31, 41, 46};
        System.out.println(binarySearch(a, 8));
        System.out.println(binarySearch(a, 31));
        System.out.println(binarySearchRecursive(a, 31, 0, 11));


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}