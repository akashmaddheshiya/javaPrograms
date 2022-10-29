import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 2 , 3 ,5 ,7 , 11

        if (n == 2) {
            System.out.print(" n is prime ");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime = true) {
                System.out.print(" n is prime ");
            }
             else {
                System.out.print(" n is not  prime ");
            }

        }

    }

}
