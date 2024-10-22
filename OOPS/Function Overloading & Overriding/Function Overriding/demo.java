class Alpha{
void show(){
    System.out.println("This message will not be displayed.");
}
}
class Sigma extends Alpha{
void show(){
    System.out.println("This message will be displayed.");
}
}
class demo{
public static void main(String args[]){
    Sigma t = new Sigma();
    t.show();
}
}