public class ReverseArray {
    public static void main(String[] args) {
        String[] a = {"A", "B", "C", "D", "E"};

        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        for (String s : a) {
            System.out.print(s + " ");
        }
    }
}
