import java.util.*;

public class Dp1 {

    public static void main(String[] args) {

        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int dp[][] = new int[val.length + 1][wt.length + 1];
        int W = 7;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(Knapsack(val, wt, W, val.length, dp));
    }

    public static int Knapsack(int val[], int wt[], int W, int n, int dp[][]) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            int ans2 = Knapsack(val, wt, W, n - 1, dp);
            return Math.max(ans1, ans2);
        } else {

            return Knapsack(val, wt, W, n - 1, dp);
        }

    }
}