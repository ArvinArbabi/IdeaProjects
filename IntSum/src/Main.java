public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        sum1();
//        System.out.println(sum3(10000000));
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    private static void sum1() {
        int n = 1000000;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    private static int sum2(int n){
        if(n <= 0){
            return 0;
        }
        return n + sum2(n-1);
    }

    private static int sum3(int n){
        int sum = (n * (n + 1))/2;
        return sum;
    }
}