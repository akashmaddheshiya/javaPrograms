import java.util.*;
// import java.util.Scanner;

public class tax_calsi {
    public static void main(String args[]) {
        /*
         * income< 5 l -- 0 % tax
         * income between 5l to 10 l -- 20 % tax
         * income > 10l -- 30 % tax
         */
        Scanner sc = new Scanner(System.in);
        float inc = sc.nextInt();
        float tax = sc.nextInt();


        

        if (inc < 500000) {
            System.out.println("your income is tax free");
           
        }
         else if (inc > 500000 && inc < 1000000) {
            tax = (inc * .2f);
            System.out.println("your total income tax will be " +  tax);
        }
         else {
            System.out.println("your total income tax will be " +  tax);
            tax = (inc * .3f);

        }
    }
}
