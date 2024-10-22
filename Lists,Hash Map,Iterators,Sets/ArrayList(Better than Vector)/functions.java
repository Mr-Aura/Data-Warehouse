import java.util.ArrayList;
class functions{
public static void main(String args[]){
    ArrayList<String> colors = new ArrayList<String>(10);
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    // System.out.println(colors[1]); gives error as this is not array.
    System.out.println(colors.contains("Red"));//returns true if that color exists.
    System.out.println(colors.get(1));//to get the color on specified index.
    System.out.println(colors.size());//returns the total number of elements in list.
    colors.clear();//removes all elements from the ArrayList.
    //Indexing starts with 0.
    System.out.println(colors);
}
}