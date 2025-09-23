public class Introduction {
    public static void main(String[] args) {
        System.out.println("Nguyen Trong Hung\t24020151\t2526I_INT2204_4" +
                "\tAimondS-Trong\t24020151@vnu.edu.vn");
        for (int i = 9; i >= 0; i--) {
            if (i != 0) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer." +
                        "\nTake one down, pass it around,");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
