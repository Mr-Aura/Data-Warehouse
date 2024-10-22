import java.util.*;

class calculator {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println(
                "Press 1 for addition.\nPress 2 for Subtraction.\nPress 3 for Multiplication.\nPress 4 for Division.\nPress 5 for Modulation.\n");
        System.out.print("Please Enter your choice: ");
        int n = t.nextInt();
        if (n == 1) {
            System.out.println("Enter the 2 numbers for addition: ");
            int a = t.nextInt();
            int b = t.nextInt();
            int c = a + b;
            System.out.println("The addition of 2 numbers = " + c);
        }
        if (n == 2) {
            System.out.println("Enter the 2 numbers for subtraction: ");
            int a = t.nextInt();
            int b = t.nextInt();
            int c = a - b;
            System.out.println("The subtraction of 2 numbers = " + c);
        }
        if (n == 3) {
            System.out.println("Enter the 2 numbers for multiplication: ");
            int a = t.nextInt();
            int b = t.nextInt();
            int c = a * b;
            System.out.println("The multiplication of 2 numbers = " + c);
        }
        if (n == 4) {
            System.out.println("Enter the 2 numbers for division: ");
            int a = t.nextInt();
            int b = t.nextInt();
            int c = a / b;
            System.out.println("The division of 2 numbers = " + c);
        }
        if (n == 5) {
            System.out.println("Enter the 2 numbers for Modulation: ");
            int a = t.nextInt();
            int b = t.nextInt();
            int c = a % b;
            System.out.println("The Modulation of 2 numbers = " + c);
        }
        t.close();
    }
}