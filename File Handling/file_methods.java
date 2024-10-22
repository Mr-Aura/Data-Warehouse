import java.io.File;
public class file_methods {
    public static void main(String a[]){
        try{
            File f = new File("hello.txt");
            System.out.println("Length of file : "+f.length());
            System.out.println("Is file readable : "+f.canRead());
            System.out.println("Is file writeable : "+f.canWrite());
            System.out.println("Name of file : "+f.getName());
            System.out.println("PATH : "+f.getAbsolutePath());
            }
            catch(Exception e){System.out.println("Unexpected error.");}
    }
}
