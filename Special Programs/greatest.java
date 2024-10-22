import java.util.*;

public class greatest {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the 3 Numbers: ");
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        if (a > b && a > c)
            System.out.println(a + " is greatest.");
        else if (b > a && b > c)
            System.out.println(b + " is greatest.");
        else
            System.out.println(c + " is greatest.");
        t.close();
    }
}
