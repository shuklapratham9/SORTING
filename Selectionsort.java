package SORTING_PRACTICE;

public class Selectionsort {
    public static void main(String[] args) {
        int[] a = { 90, 0, -199, 9, 7, 11 };
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int g = i;
            for (int j = i + 1; j < n; j++) {
                if (a[g] > a[j]) {
                    g = j;
                }
            }
            int t = a[i];
            a[i] = a[g];
            a[g] = t;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
