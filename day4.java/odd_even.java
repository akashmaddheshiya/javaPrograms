import java.util.Scanner;

public class odd_even {
    public static void main(String args[]) {
        // given number is odd or even
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("given number is odd");
        }

    }
}
