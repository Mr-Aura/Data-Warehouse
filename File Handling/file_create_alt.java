import java.io.File;
import java.io.IOException;
public class file_create_alt {
public static void main(String args[])throws IOException{
File obj = new File("demo.txt");
if(obj.createNewFile())
System.out.println("File created: "+obj.getName());
else if(obj.exists())
System.out.println("File already exists.");
else
System.out.println("File not created.");
}
}