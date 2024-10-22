class string_functions {
    public static void main(String args[]){
        String s = "Shyam";
        //Syntax of substring function =  substring(n,m) here we can also use without m
        System.out.println(s.substring(2));//without m here n = 2
        System.out.println(s.substring(1,3));//with m here also n = 2;
        String s1 = "ab" ,s2 = "cd",s3="abcdb";
        System.out.println(s1.concat(s2));
        System.out.println(s3.indexOf('b'));//jo b/char pehle mil jata uska index deta hai.
        System.out.println(s3.indexOf('b', 2));//vaha se start karke uske aage jis index pe milta hai vo usse print kartay
    }
}
