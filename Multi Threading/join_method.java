class A extends Thread{
    public void run(){
            for(int i = 0;i<5;i++){
             System.out.println("Hello");
            }
    }
    }
    class join_method extends Thread{
        public void run(){
                for(int i = 0;i<5;i++){
                 System.out.println("Hi");
                }
        }
        
    public static void main(String args[]){
    A aa = new A();
    join_method t = new join_method();
    aa.start();
    try{
        aa.join();
    }
    catch(InterruptedException e){}
    t.start();
    }
    }