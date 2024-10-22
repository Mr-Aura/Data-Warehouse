class break_continue {
    public static void main(String args[]) {
        int a = 1;
        System.out.println("Demonstration of Break Keyword: ");
        while (a < 11) {
            System.out.println(a);
            a++;
            if (a == 5)
                break;
        }
        System.out.println("Demonstration of Continue Keyword: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
