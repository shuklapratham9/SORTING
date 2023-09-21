package SORTING;

import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int c = a[i];
            int p = i - 1;
            while (p >= 0 && a[p] > c) {
                a[p + 1] = a[p];
                p--;
            }
            a[p + 1] = c;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

}
