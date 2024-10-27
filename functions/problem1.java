import java.util.*;
public class problem1 {
public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int number = scn.nextInt();
        System.out.println("Enter the second number:");
        int number1 = scn.nextInt();
        System.out.println("Enter the third Number:");
        int number2 = scn.nextInt();

        int avrage = (number+number1+number2)/3;
        System.out.println("Avrage of these Number will be:"+avrage);
  }
}