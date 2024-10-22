class data_typecasting{
    public static void main(String args[]){
    //Implicit. Automatically done. No loss of data occurs.
    int a = 10;
    double b = a;
    System.out.println(b);
    //Explicit. Done by user. Loss of data happens here.
    double x = 3.1452;
    int y = (int) x;
    System.out.println(y);
    }
}
//Implicit also known as widening. Also known as Up casting.
//Explicit also known as narrowing. Also known as down casting.
/*
implicit casting is safe and automatic because no data loss occurs.
Explicit casting must be done manually, as it can result in data loss 
(e.g., fractional parts of a double are truncated when cast to int).
 */