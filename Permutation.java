import java.util.*;
 public class Permutation {

    public static void findPermuation( String str , String ans){
        //base case
        if(str.length() ==0){
            System.out.println(ans);
            return; 
        }
        //recurion
        for(int i = 0; i<str.length();i++){
            char curr = str.charAt(i);
            // to remove ith character from str
            // Example: "abcde" => "ab" + "de"  = "abde"
            String NewStr = str.substring(0,i) + str.substring(i+1);
            findPermuation(NewStr, ans + curr);
        }
    }
public static void main(String args[]){
    String str = "abc";
    findPermuation(str, "");
  }
}