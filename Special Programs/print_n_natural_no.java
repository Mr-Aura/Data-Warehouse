import java.util.*;

class print_n_natural_no {
    public static void main(String args[]) {
        int n;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number to print numbers till that point.");
        n = t.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        t.close();
    }
}
