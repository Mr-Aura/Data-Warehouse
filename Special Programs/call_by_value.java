class call_by_value{
void set(int a){
a = 40;
}
public static void main(String args[]){
call_by_value t = new call_by_value();
int a = 20;
System.out.println("Before calling the function = "+a);
t.set(a);
System.out.print("After calling the function = "+a);
}
}