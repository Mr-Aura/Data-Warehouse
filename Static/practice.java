public class practice {
    static String cname;
    
    static void college() {
        cname = "ABC";
    }

    void print() {
        int rollno = 10;
        String name = "John";
        System.out.println("The Rollno = " + rollno + " The Name = " + name + "The College Name = " + cname);
    }

    public static void main(String args[]) {
        practice t = new practice();
        college();
        t.print();
    }
}
