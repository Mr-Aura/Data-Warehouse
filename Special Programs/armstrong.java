import java.util.Scanner;
class armstrong {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int n, arm = 0, temp, r;
        System.out.println("Enter the number:");
        n = t.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            arm = (r * r * r) + arm;
            n = n / 10;
        }
        if (temp == arm)
            System.out.println(temp + " is armstrong.");
        else
            System.out.println(temp + " is not armstrong.");
        t.close();
    }
}
