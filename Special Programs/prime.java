import java.util.Scanner;

class prime {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int n, count = 0;
        System.out.println("Enter the number:");
        n = t.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count == 1)
            System.out.println(n + " is Prime Number.");
        else
            System.out.println(n + " is not Prime Number.");
        t.close();
    }
}
