class equality_operator{
String name;
equality_operator(String x){
name = x;
}
public static void main(String args[]){
equality_operator t = new equality_operator("Kane"); 
equality_operator tt = new equality_operator("Kane");
System.out.println(t==tt);//False
//when you compare objects using the equality testing operator (==), 
//it actually compares the references and not the object values.
//Despite having two objects with the same name, the equality testing returns false, 
//because we have two different objects (two different references or memory locations).
}
}