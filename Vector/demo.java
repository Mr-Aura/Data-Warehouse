// Vector is like the dynamic array which can grow or shrink its size. Unlike array, 
//we can store n-number of elements in it as there is no size limit. 
//It is a part of Java Collection framework since Java 1.2. 
//It is found in the java.util package and implements the List interface, 
//so we can use all the methods of List interface here.

// It is recommended to use the Vector class in the thread-safe implementation only. 
//If you don't need to use the thread-safe implementation, you should use the ArrayList, 
//the ArrayList will perform better in such case.

// The Iterators returned by the Vector class are fail-fast. In case of concurrent modification, 
//it fails and throws the ConcurrentModificationException.

// It is similar to the ArrayList, but with two differences-

// Vector is synchronized.
// Java Vector contains many legacy methods that are not the part of a collections framework.

import java.util.*;

class demo {
    public static void main(String args[]) {
        Vector<String> a = new Vector<>();
        a.addElement("Ronny");
        a.addElement("Benzi");
        a.addElement("Bale");
        a.addElement("Sergio");
        System.out.println("The list is " + a);
        a.insertElementAt("Modric", 1);
        System.out.println("The list is " + a);
        Vector<Integer> in = new Vector<>();
        in.add(100);
        in.add(200);
        System.out.println("Vector elements are = " + in);
        System.out.print(in.size());
    }
}