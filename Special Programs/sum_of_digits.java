import java.util.*;

public class sum_of_digits {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int n, sum = 0, r, temp;
        System.out.println("Enter your number:");
        n = t.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("The sum of " + temp + " is " + sum);
        t.close();
    }
}
