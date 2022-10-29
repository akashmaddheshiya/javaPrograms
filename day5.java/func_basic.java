import java.util.*;

public class func_basic {

    public static void helloworld() {
        System.out.println("hello world");
        return;

    }

    // function for adding 2 numbers
    public static int calculatesum(int num1, int num2) { //parameter or formal parameter
        int sum = num1 + num2 ;
        return sum;
    }

    // function for multiplying 2 numbers
    public static int multiply( int num1  , int num2){
        int multiplication = num1 * num2 ;
        return multiplication;
    }

    // function for swapping  2 numbers
    public static void  swap(int a , int b ){
        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println(" a is " +  a);
        System.out.println(" b is " +  b);

    
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // helloworld(); // function call

        // int sum = calculatesum(a , b); // arguments 
        // System.out.println(sum);

        // int multiplication = multiply( a , b );
        // System.out.println(multiplication);

        // System.out.println(multiply(a,b));

        // swap -- exchange the value 
        // int a = 5 ;
        // int b =  6 ;
         swap(a , b);
    
       
        


    }

}
/*
 * syntax of a method or function
 * returntype name_of_method{
 * method body
 * }
 */
