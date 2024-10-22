import java.io.*;

class buffered_reader_class {
    public static void main(String args[]) throws IOException {
        int a;
        System.out.println("Enter the number: ");
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(t.readLine());
        System.out.println("Value of a = " + a);
    }
}