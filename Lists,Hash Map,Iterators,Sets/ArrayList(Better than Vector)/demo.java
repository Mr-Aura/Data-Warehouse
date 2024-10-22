/*
The Java API provides special classes to store and manipulate groups of objects.
One such class is the ArrayList. Standard Java arrays are of a fixed length, which means 
that after they are created, they cannot expand or shrink.
On the other hand, ArrayLists are created with an initial size, but when this size is 
exceeded, the collection is automatically enlarged.
When objects are removed, the ArrayList may shrink in size. Note that the ArrayList class is in the java.util package, 
so it's necessary to import it before using it.
ArrayLists store objects. Thus, the type specified must be a class type. 
You cannot pass, for example, int as the objects' type. Instead, use the special 
class types that correspond to the desired value type, such as Integer for int, Double 
for double, and so on. 
*/
import java.util.ArrayList;
class demo{
public static void main(String args[]){
//<String> is optional.It is only there to specify the the type of objects ArrayList will hold.
ArrayList<String> colors = new ArrayList<String>(10);
colors.add("Red");
colors.add("Green");
colors.add("Blue");
System.out.println(colors);
colors.remove("Green");
System.out.println(colors);
}
}
