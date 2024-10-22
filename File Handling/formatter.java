/*
 Formatter, another useful class in the java.util package, 
 is used to create content and write it to files.
 This creates an empty file at the specified path. 
 If the file already exists, this will overwrite it.
 Once the file is created, you can write content to it using the same 
 Formatter object's <b>format()</b> method.
 The <b>format()</b> method formats its parameters according to its first parameter.

%s mean a string and get's replaced by the first parameter after the format. 
The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes 
three strings that are separated with spaces.

Note: \n is the newline symbol in Windows.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
class formatter {
    public static void main(String args[])throws FileNotFoundException{
    //Writing part.
    Formatter f = new Formatter("format.txt");
    f.format("%s %s %s", "1","John","Wick\n");
    f.format("%s %s %s", "2","John","Cena\n");
    f.format("%s %s %s", "3","John","Doe");
    f.close();
    //Reading part.
    File file = new File("format.txt");
    Scanner sc = new Scanner(file);
    while(sc.hasNextLine()){
        String value = sc.nextLine();
        System.out.println(value);
    }
    sc.close();
    }
}
