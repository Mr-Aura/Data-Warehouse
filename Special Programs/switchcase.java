import java.util.*;

class switchcase {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Press 1 for Monday.\nPress 2 for Tuesday.\nPress 3 for Wednesday.\nPress 4 for Thursday.");
        System.out.println("Press 5 for Friday.\nPress 6 for Saturday.\nPress 7 for Sunday.\n");
        System.out.print("Please enter your choice: ");
        int n = t.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        t.close();
    }
}