class demo{
int rollno;
String name;
static String cname="ABC";
demo(int x,String y){
rollno = x;
name = y;
}
void display(){
System.out.println("Roll Number = "+rollno+"\nStudent Name = "+name+"\nCollege Name = "+cname);
}
}
class static_data_member{
public static void main(String args[]){
demo t = new demo(1, "James");
demo t1 = new demo(2, "Gosling");
t.display();
t1.display();
}
}