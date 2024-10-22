import java.util.*;
class vector_functions{
public static void main(String args[]){
Vector<String> a = new Vector<>();
a.addElement("Ronny");
a.addElement("Bale");
a.addElement("Bezni");
System.out.println("Vector = "+a);
a.insertElementAt("Modric",1);
System.out.println("Vector after inserting an element = "+a);
System.out.println("The size of vector = "+a.size());
a.removeElement("Modric");
System.out.println("Vector after removing an element = "+a);
a.removeElementAt(2);
System.out.println("Vector after removing an element using index = "+a);
a.removeAllElements();
System.out.println("Vector after removing all elements = "+a);
}
}