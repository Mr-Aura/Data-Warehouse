class Alpha{
void show(){
    System.out.println("This is Alpha Class.");
}
}
class Beta extends Alpha{
void display(){
    System.out.println("This is Beta Class.");
}
}
class Sigma extends Beta{
void output(){
    System.out.println("This is Sigma Class.");
}
}
class Multi_Level_Inheritance {
    public static void main(String args[]){
    Sigma t = new Sigma();
    t.show();
    t.display();
    t.output();
    }
}