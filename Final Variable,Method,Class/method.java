//Final method prevents method overriding.
class A{
    final void display(){
    System.out.println("This is base class.");
    }
}
class B extends A{
    void display1(){
    System.out.println("This is derived class.");
    }
    // void display(){
    //     System.out.println("This is derived class.");
    // } This will give error.
}
class method {
    public static void main(String args[]){
    B t = new B();
    t.display();
    t.display1();
    }
}