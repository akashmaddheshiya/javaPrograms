public class pattern1 {
    public static void main(String args[]) {
        // int n = 4; 
        // Scanner sc = new Scanner(System.in);
        //  int n = sc.nextInt();


        /* 

        for (int line = 1; line<= 10; line++) {
            for (int star = 1; star<= line; star++) {
                System.out.print("*");
            }
            System.out.println("");


        }
        */


     /*   // inverted star pattern 
        int n = 4 ;
        for(int i = 1 ; i<=4; i ++){
            for(int j = 1 ; j<=n-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println("");

        }
        */

        /* 
        // print half pyramid pattern 
        int n = 4 ;
        for(int i = 1 ; i <= n ; i++){
            // print numbers
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j);  
            }
            System.out.println("");

        }
        */

        // print character pattern
        int n = 4 ;
        char ch = 'A';
        for(int i = 1 ; i <=4 ;i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print( ch ); 
                ch++;
            }
            System.out.println("");
        } 
 
    }

}
