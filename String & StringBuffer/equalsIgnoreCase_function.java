//equalsIgnoreCase function is a *non case sensitive* function which checks if the strings are equal or not.
class equalsIgnoreCase_function {
    public static void main(String args[]){
    String st1 = "HELLO";
    String st2 = "HELLO";
    String st3 = "hello";
    String st4 = "xyz";
    if(st1.equalsIgnoreCase(st3))
    System.out.println("\nEqual strings");//gets print
    else
    System.out.println("\nNot Equal strings");
    System.out.println("\nDifferent example now:");
    if(st2.equalsIgnoreCase(st4))
    System.out.println("\nEqual strings");
    else
    System.out.println("\nNot Equal strings");//gets print
    }
}
