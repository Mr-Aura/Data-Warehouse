import java.util.*;
class linear_search {
    public static void main(String args[]){
        int search=0,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many array elements do you want?");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Please enter "+n+" elements:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Please enter the number you want to search in the array:");
        a = sc.nextInt();
        sc.close();
        for(int i = 0;i<n;i++){
        if(arr[i]==a)
        search++;
        }
        if(search==1)
        System.out.println("The number was found in the array.");
        else
        System.out.println("The number was not found in the array.");
    }
}