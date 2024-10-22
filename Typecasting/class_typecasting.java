class alpha{
    void show(){
        System.out.println("Alpha class.");
    }
    }
    class demo extends alpha{
        void show(){
            System.out.println("Demo class.");
        }
    }
class class_typecasting{
    public static void main(String args[]){
        alpha a = new demo();  // Up casting: demo object referred by alpha reference
        demo dd = (demo) a;    // Down casting: Converting alpha reference back to demo
        dd.show();             // Calls demo's show() method (because of overriding)
    }
}