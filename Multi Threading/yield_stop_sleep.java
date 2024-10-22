//stop method not working in VS Code as it says that it has been deprecated.
class A extends Thread{
        public void run(){
            for(int i = 1;i<=5;i++){
                if(i==1)
                Thread.yield();
                System.out.println("From Thread A i = "+i);
            }
            System.out.println("End of Class A");
        }
    }
    class C extends Thread{
        public void run(){
            for(int k = 1;k<=5;k++){
                if(k==1)
                try{
                    sleep(1000);
                }
                catch(Exception e){}
                System.out.println("From Thread C k = "+k);
            }
            System.out.println("End of Class C");
        }
    }
class yield_stop_sleep{
    public static void main(String args[]){
    A thread1 = new A();
    C thread3 = new C();
    thread1.start();
    thread3.start();
    }
}