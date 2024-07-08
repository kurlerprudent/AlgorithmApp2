import java.util.Scanner;

public class Knapsack {
    private int[] weights;
    private int[] values;
    private int capacity;
    private int[][] dp;

    public Knapsack() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        weights = new int[n];
        values = new int[n];

        System.out.println("Enter the weight and value of each item:");
        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " weight: ");
            weights[i] = scanner.nextInt();
            System.out.print("Item " + (i + 1) + " value: ");
            values[i] = scanner.nextInt();
        }

        System.out.print("Enter the knapsack capacity: ");
        capacity = scanner.nextInt();

        

        dp = new int[n + 1][capacity + 1];
    }

    public int solveKnapsack() {
        for (int i = 1; i <= weights.length; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[weights.length][capacity];
    }

    public void printSolution() {
        System.out.println("Maximum value: " + solveKnapsack());
    }
}
