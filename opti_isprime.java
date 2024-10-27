import java.util.*;
public class opti_isprime {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
public static void main(String args[]){
    System.out.println(isPrime(16));
  }
}                                                                                                                                           