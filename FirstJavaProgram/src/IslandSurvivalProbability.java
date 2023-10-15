public class IslandSurvivalProbability {
    public static double probabilityOfSurvival(int N, int n, int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= N) {
            // If the person is out of bounds, they are not alive.
            return 0.0;
        }

        // Initialize a 2D table to store probabilities.
        double[][] dp = new double[N][N];
        dp[x][y] = 1.0; // Starting position.

        // Define possible directions (North, South, East, West).
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int step = 1; step <= n; step++) {
            double[][] newDP = new double[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int[] dir : directions) {
                        int dx = dir[0];
                        int dy = dir[1];
                        int newX = i + dx;
                        int newY = j + dy;
                        if (newX >= 0 && newX < N && newY >= 0 && newY < N) {
                            newDP[i][j] += dp[newX][newY] / 4.0;
                        }
                    }
                }
            }
            dp = newDP;
        }

        double probability = 0.0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                probability += dp[i][j];
            }
        }

        return probability;
    }

    public static void main(String[] args) {
        int N = 5;  // N*N matrix
        int n = 4;  // Number of steps
        int x = 2;  // Starting position x-coordinate
        int y = 2;  // Starting position y-coordinate
        double probability = probabilityOfSurvival(N, n, x, y);
        System.out.printf("Probability of survival: %.6f%n", probability);
    }
}
