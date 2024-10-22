import java.util.*;
class Alpha{
int a,b;
Scanner sc = new Scanner(System.in);
void input(){
    System.out.println("Enter the 2 numbers:");
    a = sc.nextInt();
    b = sc.nextInt();
}
}
class Beta extends Alpha{
void great(){
    if(a>b)
    System.out.println(a+" is greater.");
    else
    System.out.println(b+" is greater.");
}
}
class Charlie extends Alpha{
void add(){
    System.out.println("The addition of "+a+" + "+b+" = "+(a+b));
}
}
class Hierarchical_Inheritance {
    public static void main(String args[]){
        Beta aa = new Beta();
        Charlie bb = new Charlie();
        aa.input();
        aa.great();
        bb.input();
        bb.add();
    }
}