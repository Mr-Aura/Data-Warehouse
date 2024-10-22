class demo implements Runnable{
public void run(){
for(int i = 1;i<11;i++){
System.out.println(i);
}
}
}
class runnable_interface{
    public static void main(String args[]){
    demo t = new demo();
    Thread th = new Thread(t);
    th.start();
    }
}
