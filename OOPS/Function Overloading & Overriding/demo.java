class demo{
    void great(int a,int b){
    if(a>b)
    System.out.println(a+" is greater.");
    else
    System.out.println(b+" is greater.");
    }
    void great(int a,int b,int c){
    if(a>b&&a>c)
    System.out.println(a+" is greatest.");
    else if(b>a&&b>c)
    System.out.println(b+" is greatest.");
    else
    System.out.println(c+" is greatest.");
    }
    public static void main(String args[]){
    demo t = new demo();
    t.great(10,20);
    t.great(90, 75, 190);
    }
}