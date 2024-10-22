interface first{
    void greater();
}
interface second{
    void greatest();
}
class A implements first,second{
    public void greater(){
    int a = 10,b=20;
    if(a>b)
    System.out.println(a+" is greater than "+b);
    else
    System.out.println(b+" is greater than "+a);
    }
    public void greatest(){
    int a = 10,b=20,c=30;
    if(a>b&&a>c)
    System.out.println(a+" is the greatest number. ");
    else if(b>a&&b>c)
    System.out.println(b+" is the greatest number. ");
    else
    System.out.println(c+" is the greatest number. ");
    }
}
public class multiple_inheritance {
    public static void main(String args[]){
    A aa = new A();
    aa.greater();
    aa.greatest();
    }
}