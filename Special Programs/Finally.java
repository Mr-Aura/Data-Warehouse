class Finally{
public static void main(String args[]){
    int i = 100,j=0;
    try{
        int a = i/j;
    }
    catch(ArithmeticException e){
    // System.out.println(e); You can get the exception details by doing this.
    System.out.println("Fixing the arithmetic error by adding 2: "+(i/(j+2)));
    }
    finally{
        System.out.println("Rest of the code that will always be executed regardless of exception being handled or not.");
    }
}
}