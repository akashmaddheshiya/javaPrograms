import java.util.Scanner;

public class while_loop {
    public static void main(String args[]) {

        /*
         * // int count = 0;
         * // while(count< 3){
         * // System.out.println("true");
         * // count++;
         * // }
         * // System.out.println("done");
         */

    // print 1 to n numbers 
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;

        }
        System.out.println();
        

    }

}
