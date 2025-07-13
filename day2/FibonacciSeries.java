package week1.day2;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8; // Number of terms to generate
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            // Print number with formatting
            if (i == n) {
                System.out.print("and " + a);  // last term with "and"
            } else {
                System.out.print(a + ", ");
            }

            int next = a + b;
            a = b;
            b= next;
        }
    }
}