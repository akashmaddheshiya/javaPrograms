import java.util.Scanner;

public class conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age>18){
        // System.out.println("you are adult ");
        // }
        // if(age>14 && age<17){
        // System.out.println("you are teenager ");
        // }
        // else{
        // System.out.println("you are not adult ");

        // }

        // largest bw two
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(" a is greater than b  ");
        }
        if (a == b) {
            System.out.println(" a is equal to b  ");
        } else {
            System.out.println(" a is less than b  ");

        }

    }
}
