//equals function is a *case sensitive* function which checks if the strings are equal or not.
class Equals_function {
    public static void main(String args[]) {
        String st1 = "abc";
        String st2 = "abc";
        String st3 = "ABC";
        String st4 = "xyz";
        if (st1.equals(st2))
            System.out.println("\nEqual strings.");//gets print
        else
            System.out.println("\nNot equal strings.");
        System.out.println("\nDifferent example now:");
        if (st1.equals(st3))
            System.out.println("\nEqual strings.");
        else
            System.out.println("\nNot equal strings.");//gets print
        System.out.println("\nDifferent example now:");
        if (st1.equals(st4))
            System.out.println("\nEqual strings.");
        else
            System.out.println("\nNot equal strings.");//gets print
    }
}