//Don't run this program using VS code. Go to this folder,right click then 
//press open in terminal and run the program. For more info refer to the photo in this folder.
//Note : To compile use -> javac filename.java
//Note: To run use -> java filename 
class demo{
    public static void main(String args[]){
        int a,b,c;
         a = Integer.parseInt(args[0]);
         b = Integer.parseInt(args[1]);
        c = a+b;
        System.out.println("The sum of 2 numbers = "+c);
    }
}