class prime_number_till_50 {
    public static void main(String args[]) {
        int n = 50;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.print(i + " ");
            }
        }
    }
}
