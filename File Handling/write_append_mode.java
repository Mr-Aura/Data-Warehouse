//Note : This writes on file in append mode and thus not deleting what was stored before.
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class write_append_mode {
    public static void main(String args[]){
    try{
    File obj = new File("hello.txt");
    FileWriter file = new FileWriter("hello.txt",true);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    sc.close();
    if(obj.length()==0)//checks if the file is empty.
    file.write("Your name is "+name);//writes this one line.
    else//if not then
    file.write("\nYour name is "+name);//it leaves one line and then writes on the next line.
    file.close();
    System.out.println("File created successfully.");
    }
    catch(IOException e){
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    }
}