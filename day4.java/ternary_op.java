import java.util.Scanner;

public class ternary_op {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // ternary operator 
    // String type =   ((num % 2) == 0 )? " even " :"odd";
    // System.out.println(type);


    // check if a student if fail pr pass 
    String result = (num >= 33)? "pass" : "fail";
    System.out.println(result);


    }
    
}
