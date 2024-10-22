import java.util.Scanner;

class demo {
    public static void main(String args[]) {
        // Without taking any user input
        int x[] = { 1, 2, 3, 4 };
        for (int i = 0; i < 4; i++)
            System.out.println(x[i]);
        // Taking user input for total array elements and individual array elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many array elements you want.");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements one by one:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("The array elements are:");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
        // Taking user input only for individual array elements and total array elements
        // are already declared
        int array[] = new int[10];//here we can see total array elements declared.
        System.out.println("Enter the array elements one by one:");
        for (int i = 0; i < 10; i++)
            array[i] = sc.nextInt();
        System.out.println("The array elements are:");
        for (int i = 0; i < 10; i++)
            System.out.println(array[i]);
        sc.close();
    }
}