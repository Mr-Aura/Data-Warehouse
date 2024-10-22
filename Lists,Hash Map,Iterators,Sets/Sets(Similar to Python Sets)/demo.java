/*
A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
Same as set in python.
One of the implementations of the Set is the HashSet class. exists in java.util package.
set.add("KDB");//2 KDB will not be displayed. This is useless.
System.out.println(set.get(0)); get method does not exist.
As this does not keep a record of the sequence in which the elements are stored.
The HashSet class does not automatically retain the order of the elements as they're added.
To order the elements, use a LinkedHashSet, which maintains a linked list of the set's 
elements in the order in which they were inserted. 
*/
import java.util.HashSet;
class demo{
public static void main(String args[]){
HashSet<String> set = new HashSet<String>();
set.add("KDB");
set.add("Doku");
set.add("Rodri");
set.remove("Doku");
System.out.println(set);
System.out.println(set.size());
System.out.println(set.hashCode());
}
}
/*
What is hashing?
A hash table stores information through a mechanism called hashing, in which a key's 
informational content is used to determine a unique value called a hash code.
So, basically, each element in the HashSet is associated with its unique hash code. 
*/