import java.util.*;

public class practice {
    public static void main(String[] args) {
       Vector <String> a = new Vector<>();
       a.addElement("CR7");
       a.addElement("KDB17");
       a.addElement("EH9");
       a.insertElementAt("kirmada",1);
       System.out.println(a);
       a.removeElement("EH9");
       System.out.println(a);
       a.removeElementAt(1);
       System.out.println(a);
       a.removeAllElements();
       System.out.println(a);
        }
    }