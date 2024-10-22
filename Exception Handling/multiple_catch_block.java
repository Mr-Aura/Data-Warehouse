class multiple_catch_block{
public static void main(String args[]){
try{
String st = null;
System.out.println(st.length());
}
catch(ArithmeticException e1){
System.out.println("Divide by zero.");
}
catch(NullPointerException e2){
System.out.println("NULL pointer exception.");
}
catch(Exception e3){
//We can not write Exception e1 first and then ArithmeticException. This will give error.
//This 'Exception' is written in the end to catch any other exception which is not
//defined above.
System.out.println("Unknown error occurred. Please try again.");
}
finally{
System.out.println("Always executed.");
}
}
}