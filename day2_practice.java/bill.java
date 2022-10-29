import java.util.Scanner;
// import java.utill.*;

public class bill{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the cost of pencil ");
    float pencil = sc.nextFloat();
    System.out.println("enter the cost of pen ");
    float pen = sc.nextFloat();
    System.out.println("enter the cost of eraser ");
    float eraser = sc.nextFloat();

    float sum = pencil + pen + eraser ;
    System.out.println("cost of these things are  -- > ");
    System.out.println(sum);

    System.out.println("cost of these things after payinng tax   -- > ");
    System.out.println(sum + (sum*18)/100);






 }



}