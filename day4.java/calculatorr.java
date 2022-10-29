import java.util.*;


public class calculatorr {
    public static void main(String args[]){
    Scanner ch = new Scanner(System.in);


    System.out.println("give your first number ");
    int a = ch.nextInt();
    System.out.println("give your second number ");
    int b = ch.nextInt();
    System.out.println("give your operator ");
    char operator = ch.next().charAt(0);

    switch (operator) {
        case '+':System.out.println(a+b);        
            break;
    
        case '-':System.out.println(a-b);        
            break;
    
        case '*':System.out.println(a*b);        
            break;
    
        case '/':System.out.println(a/b);        
            break;
    
        case '%':System.out.println(a%b);        
            break;
    
        default:
        System.out.println("invalid input ");
            break;


    }


    }
    
}
