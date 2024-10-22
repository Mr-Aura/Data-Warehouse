import java.util.*;

public class sum_of_odd_even {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int sumeven = 0, sumodd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                sumeven = sumeven + i;
            else
                sumodd = sumodd + i;
        }
        System.out.println("Sum of odd numbers till 100 is " + sumodd);
        System.out.println("Sum of even numbers till 100 is " + sumeven);

        t.close();
    }
}
