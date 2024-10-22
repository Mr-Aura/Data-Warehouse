/*
An Iterator is an object that enables to cycle through a collection, obtain or remove elements. 

Before you can access a collection through an iterator, you must obtain one. 
Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection. 
By using this iterator object, you can access each element in the collection, one element at a time.

The Iterator class provides the following methods:

<b>hasNext()</b>: Returns true if there is at least one more element; otherwise, it returns false.

<b>next()</b>: Returns the next object and advances the iterator.

<b>remove()</b>: Removes the last object that was returned by next from the collection.

The Iterator class must be imported from the java.util package. 
*/
import java.util.Iterator;
import java.util.LinkedList;
class demo{
public static void main(String args[]){
LinkedList<String> colors = new LinkedList<String>();
colors.add("Red");
colors.add("Blue");
colors.add("Green");
Iterator<String> store = colors.iterator();
String value = store.next();
System.out.println(value);
String second_value = store.next();
System.out.println(second_value);
System.out.println(store.hasNext());//returns true if there is at least one more element.
/*
store.next() returns the first element in the list and then moves the iterator on to the next element.

Each time you call store.next(), the iterator moves to the next element of the list. 
*/
}
}