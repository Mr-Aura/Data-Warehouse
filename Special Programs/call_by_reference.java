class call_by_reference{
int a = 10;
void set(call_by_reference t){
t.a = 40;
}
public static void main(String args[]){
call_by_reference t = new call_by_reference();
System.out.println("Before calling the function = "+t.a);
t.set(t);
System.out.print("After calling the function = "+t.a);
}
}