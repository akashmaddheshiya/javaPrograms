import java.util.Scanner;

public class testSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your day : ");
        String day = sc.nextLine();
        switch(day.toLowerCase()){
            case "sunday":case "monday":case "tuesday":case "wednesday":case "thrusday":case "friday":case "saturday":
                System.out.println("Today is "+day.toUpperCase());
                break;
            default:
                System.out.println("Invalid Input......!!!!");
                break;
        }
    }
}
