//An Enum is a special type used to define collections of constants.
//Basically, Enums define variables that represent members of a fixed set.
//Some sample Enum uses include month names, days of the week, deck of cards, etc.
/* 
You should always use Enums when a variable (especially a method parameter) can only 
take one out of a small set of possible values.
If you use Enums instead of integers (or String codes), you increase compile-time checking 
& avoid errors from passing in invalid constants, and you document which values are legal 
to use. */
class demo{
enum Rank{
    Solider,
    Sergeant,
    Captain
}
public static void main(String args[]){
Rank a = Rank.Captain;//accessed using dot operator.
System.out.println(a);
}
}