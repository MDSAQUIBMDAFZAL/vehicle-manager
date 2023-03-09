public class Q1 {
    public static void main(String[] args) {
        int[] a = { 5, 6, 4, 3, 8, 2 };
        secondMax(a);
    }

    public static void secondMax(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println(a[1]);
    }
}