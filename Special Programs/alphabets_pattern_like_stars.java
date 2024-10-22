public class alphabets_pattern_like_stars {
    public static void main(String args[]) {
        for (char i = 65; i <= 70; i++) {// run the loop from 97 to 102 for small alphabets
            for (char j = 65; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
