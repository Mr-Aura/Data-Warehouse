/*
 Files are useful for storing and retrieving data, and there are a number of ways to read from a file.

 One of the simplest ways is to use the <b>Scanner </b>class from the java.util package.

The constructor of the <b>Scanner </b>class can take a File object as input.

To read the contents of a text file at the path "C:\\sololearn\\test.txt", we would need to create a File object with the corresponding path and pass it to the Scanner object.
 */
import java.io.*;
import java.util.*;
class reading {
        public static void main(String args[])throws FileNotFoundException{
        File file = new File("hello.txt");
        Scanner sc = new Scanner(file);
        System.out.println(sc.nextLine());
        sc.close();
}
}