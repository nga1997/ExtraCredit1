public class PascalTriangle {
    public static int countNonDivisibleBySeven(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (pascalValue(i, j) % 7 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int pascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            long prev = 1;
            for (int i = 1; i <= col; i++) {
                prev = prev * (row - i + 1) / i;
                if (prev % 7 == 0) return 0; // If divisible by 7, return 0
            }
            return (int) prev;
        }
    }
    public static void main(String[] args) {
        int n = 109;
        System.out.println("Number of entries not divisible by 7 in the first " + n + " rows of Pascal's triangle: " + countNonDivisibleBySeven(n));
    }
}
//Time Complexity: O(n^2)
//Space Complexity: O(n^2)