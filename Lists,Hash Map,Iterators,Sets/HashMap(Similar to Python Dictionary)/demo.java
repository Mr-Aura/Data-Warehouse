import java.util.HashMap;
/*
Arrays and Lists store elements as ordered collections, with each element given an integer index.

HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value). 

The put, remove, and get methods are used to add, delete, and access values in the HashMap. 

A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.

The HashMap class provides <b>containsKey </b>and <b>containsValue </b>methods that determine the presence of a specified key or value.

If you try to get a value that is not present in your map, it returns the value of null.
*/
class demo{
public static void main(String args[]){
//Here we are using String as key(index) and Integer as value.
HashMap<String,Integer> ratings = new HashMap<String,Integer>();
ratings.put("KDB", 90);
ratings.put("Rodri", 91);
ratings.put("Haaland", 91);
ratings.put("John Cena",null);
System.out.println("Haaland rating: "+ ratings.get("Haaland"));//to get rating of Haaland we used get().
System.out.println("John Cena rating: " + ratings.get("John Cena"));//returns null. as no value is specified above.
System.out.println("Does KDB exist in list: " + ratings.containsKey("KDB"));
System.out.println("Does Rock exist in list: " + ratings.containsKey("Rock"));
System.out.println("Does 91 rating exist in list: " + ratings.containsValue(91));
System.out.println("Does 87 rating exist in list: " + ratings.containsValue(87));//returns false if no value present.
System.out.println(ratings);
}
}