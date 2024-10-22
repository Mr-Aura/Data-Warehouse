class A extends Thread {
    public void run() {
        System.out.println("Class A");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Class B");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("Class C");
    }
}

class set_priority {
    public static void main(String args[]) {
        A aa = new A();
        B bb = new B();
        C cc = new C();
        cc.setPriority(Thread.MAX_PRIORITY);
        bb.setPriority(5);
        aa.setPriority(Thread.MIN_PRIORITY);
        aa.start();
        bb.start();
        cc.start();
    }
}