import java.util.Scanner;
class palindrome {
    public static void main(String args[]) {
        int n, r, temp, pal = 0;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = t.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            pal = (pal * 10) + r;
            n = n / 10;
        }
        if (temp == pal)
            System.out.println(temp + " is " + "palindrome.");
        else
            System.out.println(temp + " is not " + "palindrome.");
        t.close();
    }
}
