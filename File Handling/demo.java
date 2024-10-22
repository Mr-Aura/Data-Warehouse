//We have only created a file here and have not written anything.
import java.io.*;
class demo{
    public static void main(String args[]){
    try{
    File obj = new File("file.txt");
    if(obj.createNewFile())
    System.out.println("File created "+obj.getName());
    else
    System.out.println("File already exists.");
    }
    catch(IOException e){
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    }
}