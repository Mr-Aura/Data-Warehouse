import java.util.ArrayList;
import java.util.Collections;
class more_functions {
    public static void main(String args[]){
    ArrayList<Integer> marks = new ArrayList<Integer>(5); 
    marks.add(84);
    marks.add(80);
    marks.add(87);
    marks.add(78);
    marks.add(89);
    System.out.println(marks);
    Collections.reverse(marks);//reverses the sequence in list.
    System.out.println(marks);
    Collections.sort(marks);//sorts the list in ascending order.
    System.out.println(marks);
    Collections.shuffle(marks);//randomizes the elements in list.
    System.out.println(marks);
    System.out.println(Collections.max(marks));//returns biggest element in the list.
    System.out.println(Collections.min(marks));//returns the smallest element in the list.
}
}
