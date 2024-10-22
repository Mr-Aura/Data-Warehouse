import java.util.*;

class table {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = t.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        t.close();
    }
}