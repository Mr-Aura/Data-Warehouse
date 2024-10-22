/*
The <b>Scanner </b>class inherits from the <b>Iterator</b>, so it behaves like one.

We can use the Scanner object's <b>next()</b> method to read the file's contents.

It is always good practice to close a file when finished working with it. One way to do this is to use the Scanner's <b>close()</b> method.
*/
import java.util.Scanner;
import java.io.*;
class readingTillEOF{
    public static void main(String args[])throws FileNotFoundException{
    File file = new File("hello.txt");
    Scanner sc = new Scanner(file);
    while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
    }
    sc.close();
    }
}