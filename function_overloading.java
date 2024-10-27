import java.util.*;
public class function_overloading    {
// func to calculate 2 number
public static int sum (int a, int b){
    return a+b;
}
//function to calculate sum of 3 numbers
public static float sum (  float  a , float b, float  c){
    return a+b + c;
}
  public static void main(String args[]){
    System.out.println(sum(3,2));
    System.out.println(sum(3.2f,4.1f,5.1f));

  }
}