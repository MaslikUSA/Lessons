import java.util.Scanner;

public class SevensClassDoWhile {
    public static void  main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        int value;
        do {
            System.out.println("vvedi 5");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("vi vveli 5");
    }
}
