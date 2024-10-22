class switch_case_enum{
    enum Rank{
        Captain,
        Solider,
        Sergeant
    }
    public static void main(String args[]){
    Rank a = Rank.Captain;
    switch(a){
        case Captain:
        System.out.println("Captain says hello!");
        break;
        case Solider:
        System.out.println("Solider says hello!");
        break;
        case Sergeant:
        System.out.println("Sergeant says hello!");
    }    
    }
}
