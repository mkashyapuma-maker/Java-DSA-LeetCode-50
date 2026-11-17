import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0 && original % digit == 0) {
                count++;
            }

            n = n / 10;
        }

        System.out.println("Count: " + count);

        sc.close();
    }
}