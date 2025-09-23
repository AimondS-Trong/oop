import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();
        int x = 0, y = 0;
        int steps = 0;
        int[][] dirs = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };
        int dir = 0;
        int stepLength = 1;
        int repeat = 0;
        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            for (int i = 0; i < stepLength; i++) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(x, y, 0.45);
                x += dirs[dir][0];
                y += dirs[dir][1];
                steps++;
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(5);
                if (Math.abs(x) > n || Math.abs(y) > n) {
                    StdOut.println("Total steps = " + steps);
                    return;
                }
            }
            dir = (dir + 1) % 4;
            repeat++;
            if (repeat % 2 == 0) {
                stepLength++;
            }
        }
        StdOut.println("Total steps = " + steps);
    }

}
