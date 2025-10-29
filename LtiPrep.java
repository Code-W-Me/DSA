import java.util.*;
public class LtiPrep {

    // code to check if a number is even or odd
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
   public static boolean isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return true;
        }else{
            return false;
        }
    }

public static void main(String args[]){
    // int num1 = 4;
    // int num2 = 7;
    // System.out.println(isEven(num1));
    // System.out.println(isEven(num2));
     int year = 2020;
        int year1 = 1900;
        int year2 =2000;
        System.out.println(isLeapYear(year));
        System.out.println(isLeapYear(year1));
        System.out.println(isLeapYear(year2));

  }
}


