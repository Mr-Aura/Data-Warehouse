//Anonymous classes are a way to extend the existing class without using inheritance.
//The changes made for g1 object is not implemented on any other object.
//for g2 object the implementation remains the one which is in class.
class Ghost{
    void show(){
        System.out.println("Ghost class's show function.");
    }
}
class demo{
public static void main(String args[]){
Ghost g1 = new Ghost(){
    @Override void show(){
    System.out.println("Show method override without using inheritance.");    
    }
};
g1.show();
Ghost g2 =  new Ghost();
g2.show();
}
}