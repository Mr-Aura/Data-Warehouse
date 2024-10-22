import java.util.*;

public class reverse {
    public static void main(String args[]) {
        int n, rev = 0, r, temp;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = t.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        System.out.println("The reverse of " + temp + " is " + rev);
        t.close();
    }
}
