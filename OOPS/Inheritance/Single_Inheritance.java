class Alpha{
void show(){
    System.out.println("This is base class.");
}
}
class Sigma extends Alpha{
    void display(){
        System.out.println("This is derived class.");
    }
}
class Single_Inheritance{
    public static void main(String args[]){
    Sigma t = new Sigma();
    t.show();
    t.display();
    }
}