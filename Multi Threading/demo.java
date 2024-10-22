class alpha extends Thread {
    public void run() {
        System.out.println("this is multi threading.");
    }
}

class beta extends Thread {
    public void run() {
        System.out.println("Hi");
    }
}

class demo {
    public static void main(String args[]) {
        alpha aa = new alpha();
        beta bb = new beta();
        aa.start();
        bb.start();
    }
}