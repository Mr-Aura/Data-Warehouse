import java.util.*;
class practice{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    StringBuffer s1 = new StringBuffer();
    System.out.println("Enter the StringBuffer:");
    s1.append(sc.nextLine());
    sc.close();
    s1.setCharAt(0, 'C');
    System.out.println(s1);
    s1.insert(3,"hey");
    System.out.println(s1);
    }
}