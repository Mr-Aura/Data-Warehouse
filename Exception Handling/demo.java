import java.util.*;
class demo{
    public static void main(String args[]){
    int x=20,y=5;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    // int c = a/b; gives exception and code gets terminated.
    try{
    //code which might contain exception is written here.
    int c = a / b;
    System.out.println("The value of "+a+" / "+b+" = "+c);
    }
    catch(ArithmeticException e){
    //only executed when an exception is caught.
    System.out.println("Divide by zero.");
    }
    finally{
    //finally block always gets executed even if the exception arises or not.
    int z = x + y;
    System.out.println("The addition of x and y = "+z);
    }    
}
}