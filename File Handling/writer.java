//Note : This writes on file in write mode and thus deleting what was stored before.
import java.util.*;
import java.io.*;
class writer {
    public static void main(String args[]){
    try{
    FileWriter file = new FileWriter("hello.txt");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    sc.close();
    file.write("Your name is "+name);
    file.close();
    System.out.println("File created successfully.");
    }
    catch(IOException e){
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    }
}
