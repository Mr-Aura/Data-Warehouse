class catching_invalid_arguments {
    public static void main(String args[]){
        int valid,invalid;
        valid = invalid = 0;
        for(int i = 0;i<args.length;i++){
            try{
                int number = Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e){
            invalid = invalid + 1;
            System.out.println("Argument error : "+args[i]);
            continue;
            }
            valid = valid + 1;
        }
        System.out.println("Valid arguments = "+valid);
        System.out.println("Invalid arguments = "+invalid);
    }
}
