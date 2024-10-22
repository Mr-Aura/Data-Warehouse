//Java doesn't have const keyword and in place of const keyword we use final keyword.
//Final keyword's value cannot be changed once it is declared. 
//It has to be declared and initialized at the same time.
class variable{
    public static void main(String args[]){
        int a = 10;
        final int b = 20;
        // int b = 30; this will give error.
        System.out.println("Value of a = "+a+", b = "+b);
    }
}