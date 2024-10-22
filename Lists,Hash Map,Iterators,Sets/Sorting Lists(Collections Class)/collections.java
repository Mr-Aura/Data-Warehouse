/*
For the manipulation of data in different collection types, the Java API provides a 
Collections class, which is included in the java.util package.
One of the most popular <b>Collections </b>class methods is <b>sort()</b>, which sorts 
the elements of your collection type. The methods in the Collections class are static, 
so you don't need a Collections object to call them. 
*/
import java.util.ArrayList;
import java.util.Collections;
class collections{
    public static void main(String args[]){
    ArrayList<String> colors = new ArrayList<String>(3);
    colors.add("Sky Blue");
    colors.add("Green");
    colors.add("Yellow");
    System.out.println(colors);
    Collections.sort(colors);//sort method is static. So we don't have to create object of collections class.
    System.out.println(colors);//elements are now sorted alphabetically.
}
}
