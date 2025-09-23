public class Problem_2 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        /**
         * The == operator compares whether the (memory addresses of the)
         two arrays are identical, not whether their corresponding values are equal.
         */
        System.out.println(a == b);
    }
}
