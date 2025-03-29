package Tech_22;

public class Fibanocci_Tabulation {
    public static long fib(int n) {
        if (n <= 1) return n;

        long[] dp = new long[n + 1]; // Array to store Fibonacci values
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Compute Fibonacci using previously stored values
        }
        return dp[n]; // Return the nth Fibonacci number
    }

    public static void main(String[] args) {
        int n = 10; // Compute Fibonacci of 10
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }

}
