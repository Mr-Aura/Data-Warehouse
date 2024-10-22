/*
The HashSet class does not automatically retain the order of the elements as they're added.
 To order the elements, use a LinkedHashSet, which maintains a linked list of the set's 
 elements in the order in which they were inserted. 
*/
import java.util.LinkedHashSet;
class linked_hash_set {
    public static void main(String args[]){
        LinkedHashSet <String> set = new LinkedHashSet<String>();
        set.add("KDB");
        set.add("Rodri");
        set.add("Silva");
        System.out.println(set);
    }
}
