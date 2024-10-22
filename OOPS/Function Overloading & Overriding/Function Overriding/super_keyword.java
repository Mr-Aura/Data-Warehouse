//Base class / super class ka variable ka value display karta hai super keyword.
class A{
int a = 10;
}
class super_keyword extends A{
int a = 20;
void rider(){
    System.out.println("Practice class ka a variable = "+a);
    System.out.println("Practice class ka a variable = "+super.a);
}
public static void main(String args[]){
super_keyword t = new super_keyword();
t.rider();
}
}