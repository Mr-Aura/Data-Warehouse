class this_keyword{
    int a = 10;
    void function(){
    int a = 20;
    System.out.println("Local variable = "+a);
    System.out.println("Instance variable = "+this.a);
    System.out.println(this);
    }
    public static void main(String args[]){
    this_keyword t = new this_keyword();
    t.function();
    }
}