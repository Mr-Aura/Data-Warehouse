/* 
The LinkedList is very similar in syntax to the ArrayList.
You can easily change an ArrayList to a LinkedList by changing the object type.
The only difference is that you cannot specify initial capacity for LinkedList.
We also have to import java.util package.
*/
import java.util.LinkedList;
class demo{
public static void main(String args[]){
//ArrayList<String> colors = new ArrayList<String>(10);
LinkedList<String> colors = new LinkedList<String>();//entering number will throw error.
colors.add("Red");
colors.add("Yellow");
System.out.println(colors);
//Note that we can also use for loop to traverse ArrayList also.
for(String s:colors)
System.out.println(s);
}
}