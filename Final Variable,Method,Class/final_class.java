//Final class is used to prevent inheritance.
final class Alpha{
   void show(){
    System.out.println("This is base class.");
   }
}
// class B extends A{
//     void display(){
//         System.out.println("This will give error.");
//     }
// }
class final_class {
    public static void main(String args[]){
        Alpha t = new Alpha();
        t.show();
        // B t = new B();
        // t.show(); will give error
    }
}
