import java.util.*;

class greater {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int a = t.nextInt();
        int b = t.nextInt();
        if (a > b)
            System.out.println(a + " is greater.");
        else
            System.out.println(b + " is greater.");
        t.close();
    }
}
