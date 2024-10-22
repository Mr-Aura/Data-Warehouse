//Inner class can access all the data member and member function of the outer class.
//No other outer class except demo can access the inner class.
class demo{//outer class.
int id;
demo(int i){
id = i;
robot rb = new robot();
rb.thinking();
}
private class robot{//inner class.
    void thinking(){
        System.out.println("Robot is thinking : "+id);
    }
}
public static void main(String args[]){
demo t = new demo(1);
}
}