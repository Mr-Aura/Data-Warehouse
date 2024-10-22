/*
The java.io package includes a File class that allows you to work with files.

To start, create a <b>File </b>object and specify the path of the file in the constructor. 
*/
import java.io.File;
class check {
public static void main(String args[]){
File f = new File("demo.txt");
if(f.exists())
System.out.println(f.getName()+" File exists.");//returns name of the file.
else
System.out.println("File does not exist.");
}    
}