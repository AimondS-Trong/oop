public class HugeArray {
    public static void main(String[] args) {
        int n = 1000;
        int[] a = new int[n * n * n * n];
        /**
         * int range is -2,147,483,648 to 2,147,483,647 so 1000^4 doesn't fit in int,
         the result overflows and wraps around 2^32
         * We have: 1000^4 / 2^32 ≈ 232.83 | 1000^4 - 2^23 * 232 = 3567587328
         * 3567587328 > Integer.MAX_VALUE so it become negative which is -727379968
         */
        System.out.println(a.length);
    }
}
