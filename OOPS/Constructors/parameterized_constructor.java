class parameterized_constructor {
    parameterized_constructor(int a,int b){
    if(a>b)
    System.out.println(a+" is greater.");
    else
    System.out.println(b+" is greater.");
    }
    public static void main(String args[]){
        parameterized_constructor t = new parameterized_constructor(30, 50);
    }
}
