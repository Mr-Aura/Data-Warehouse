import java.util.Scanner;

public class sum_of_n_natural_no {
    public static void main(String args[]) {
        int n, sum = 0;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number to print numbers till that point.");
        n = t.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " natural numbers is " + sum);
        t.close();
    }
}
