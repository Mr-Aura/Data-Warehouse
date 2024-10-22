class product_of_array {
    public static void main(String args[]){
        int x[]={1,2,3,4,5,6,7,8,9,10},pro=1;
        for(int i = 0;i<10;i++){
        pro = pro * x[i];
        }
        System.out.println("The product of array = "+pro);
    }
}
