class demo{
    int roll;
    String name;
    static String cname;
    demo(int x,String y){
        roll = x;
        name = y;
    }
    void display(){
        System.out.println("Student's Roll number = "+roll+"\nStudent's Name = "+name+"\nStudent's College Name = "+cname);
    }
    static void college(){
    cname = "ABC";
    }
}
class static_member_function {
    public static void main(String args[]){
    demo t = new demo(1,"James");
    demo t1 = new demo(2,"Gosling");
    demo.college();
    t.display();
    t1.display();
    }
}