import java.util.Scanner;

public class Knapsack {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int knapsack(int capacity, int[] weight, int[] value, int n) {
        int[][] dp = new int[n + 1][capacity + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (weight[i - 1] <= w)
                    dp[i][w] = max(value[i - 1] + dp[i - 1][w - weight[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        int[] weight = new int[n];
        int[] value = new int[n];

        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }

        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            value[i] = scanner.nextInt();
        }

        System.out.print("Enter the knapsack capacity: ");
        int capacity = scanner.nextInt();

        long startTime = System.nanoTime();
        int maxVal = knapsack(capacity, weight, value, n);
        long endTime = System.nanoTime();
        double timeTaken = (endTime - startTime) / 1_000_000_000.0;

        System.out.println("Maximum value that can be obtained: " + maxVal);
        System.out.println("Time taken for computation in seconds: " + timeTaken);

        scanner.close();
    }
}

