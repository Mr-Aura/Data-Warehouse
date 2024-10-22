//Abstract class are a type of class which can have normal methods as well as 
//abstract methods. This is quite opposite to interfaces, as interfaces only have 
//abstract methods and we cannot have normal methods inside interfaces.
//Abstract class's object can not be created and if we try to do so it will give error.
abstract class practice{
    public void show(){
        System.out.println("Show function.");
    }
    protected abstract void example();
}
class demo extends practice {
protected void example(){
    System.out.println("Example function.");
}
public static void main(String args[]){
//practice obj = new practice(); not allowed. Will give error. 
demo t = new demo();
t.show();
t.example();
}
}
