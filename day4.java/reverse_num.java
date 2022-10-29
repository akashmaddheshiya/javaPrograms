import java.util.*;

public class reverse_num {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        /*
         * // int n = 10899;
         * while(n>0){
         * int lastdigit = n % 10 ;
         * System.out.print(lastdigit + "");
         * n = n / 10 ;
         * }
         * System.out.println();
         */

        /*
         * // revrese the given number
         * int n = 10899;
         * int rev = 0 ;
         * 
         * while(n>0){
         * int lastdigit = n % 10 ;
         * rev = (rev * 10 ) + lastdigit;
         * n = n / 10 ;
         * }
         * System.out.println(rev);
         * 
         */

         /* 
        // for (int i = 0; i <= 5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);

        // }
        */

        // display all numbers entered by user except multiple of 10 
        for(int i = 1 ; i <= 100; i++){
            if( i % 10 == 0 ){
                continue;
            }
            System.out.println(i);

            
        }




    }

}
