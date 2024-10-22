//Using Thread to call currentThread function is optional here.
class A extends Thread{
public void run(){
System.out.println("The ID of current thread A = "+currentThread().getId());
System.out.println("The priority of current thread A = "+currentThread().getPriority());
}
}
class B extends Thread{
public void run(){
System.out.println("The ID of the thread B = " + currentThread().getId());
System.out.println("The priority of the thread B = " + currentThread().getPriority());
}
}
class C extends Thread{
public void run(){
System.out.println("The ID of thread C = "+Thread.currentThread().getId());
System.out.println("The priority of thread C = "+Thread.currentThread().getPriority());
}
}
class getId_priority_currentThread {
    public static void main(String args[]){
    A aa = new A();
    B bb = new B();
    C cc = new C();    
    aa.start();
    bb.start();
    cc.start();
    }
}