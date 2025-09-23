import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        //int[] a;
        /**
         * int[] a just declares a variable reference an array but not initialized.
         * a is null for now so if you try to point to a[i], you will get a NullPointerException.
         * 2 way to fix:
         * -Initialized from beginning: int[] a = new int[10];
         * -Initialized after declare: a = new int[10];
         */
        int[] a;
        a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
