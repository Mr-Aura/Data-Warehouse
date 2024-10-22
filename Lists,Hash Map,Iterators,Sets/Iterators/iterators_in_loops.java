import java.util.Iterator;
import java.util.LinkedList;
class iterators_in_loops {
    public static void main(String args[]){   
    LinkedList <String> colors = new LinkedList<String>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    Iterator<String> it = colors.iterator();
    while(it.hasNext()){
        String value = it.next();
        System.out.println(value);
    }
}
}