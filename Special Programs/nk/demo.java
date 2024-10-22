package nk;
import java.util.Scanner;
public class demo{
public void function(){
int a = 10,b=20;
System.out.println("The value of 10 + 20 = "+(a+b));
}
public void prime(){
    int count=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    for(int i = 2;i<=n;i++){
        if(n%i==0)
        count++;
    }
    if(count==1)
    System.out.println("The number is prime.");
    else
    System.out.println("The number is not prime.");
}
}