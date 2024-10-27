import java.util.*;
public class    practice3  {
    public static boolean  ispalindrome(int n){
        int palindrome = n;
        int reverse = 0;
        while (palindrome !=0){
            int reaminder = palindrome %10;
            reverse = reverse *10 + reaminder;
            palindrome = palindrome /10;
        }
        if (n==reverse){
            return true;
        }
        return false;
    }
public static void main(String args[]){
    System.out.println(ispalindrome(121));

  }
}
