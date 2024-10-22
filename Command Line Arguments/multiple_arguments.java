//Don't run this program using VS code. Go to this folder,right click then 
//press open in terminal and run the program. For more info refer to the photo in this folder.
//This is where you can put more than 2 arguments.
class multiple_arguments {
    public static void main(String args[]){
        int sum=0;
        for(int i = 0;i<args.length;i++)
        sum = sum + Integer.parseInt(args[i]);
        System.out.println("The sum =  "+sum); 
    }
}
