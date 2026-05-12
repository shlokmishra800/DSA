// Question.> Place tiles of size 1 * m in a floor of size  n*m

public class PlaceTiles {
    public static int placetile(int n, int m) {
        if (n == m) {
            return 2;

        }
        if (n < m) {
            return 1;
        }
        // Horizontal place
        int horizontal = placetile(n - m, m);
        // vertical place
        int vertical = placetile(n - 1, m);

        return horizontal + vertical;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int total = placetile(n, m);
        System.out.println(total);
    }

}

// Output=> 5

// we can improve time complexity for this program using Dynamic Programming