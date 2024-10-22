class compare_to_function {
public static void main(String args[]) {
    String str1 = "apple";
    String str2 = "banana";
    String str3 = "apple";
    
    int result1 = str1.compareTo(str2); // result1 will be negative
    int result2 = str1.compareTo(str3); // result2 will be 0
    int result3 = str2.compareTo(str1); // result3 will be positive
    
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    }
}