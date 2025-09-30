import java.util.*;
public class StringExample {

public static String getString(String str){
    for(int i =0;i<str.length();i++){
      System.out.print(str.charAt(i)+" ");
    }
    System.out.println();
    return str;
}
public static boolean isPalindrome(String str){
  for(int i =0; i<str.length()/2;i++){
    if(str.charAt(i) != str.charAt(str.length()-1-i)){
      return false;
    }
  }
  return true;
  
}
public static float getShortestPath(String str){
    int x=0;
    int y=0;
    for(int i =0;i<str.length();i++){
      char dir = str.charAt(i);
      if(dir == 'N'){
        y++;
      }
      else if(dir == 'S'){
        y--;
      }
      else if(dir == 'E'){
        x++;
      }
      else{
        x--;
      }
    }
    float ans = (float)Math.sqrt(x*x + y*y);
    return ans;
  }
public static void main(String args[]){
    // String str="asdf";
    // String str1= new String("xyz");
    // // strings are immutable
    // Scanner sc= new Scanner(System.in);
    // String name;
    // name=sc.nextLine();
    // System.out.println(name);
    // String fullName = "Yash Veer";
    // System.out.println(fullName.length());

    // String firstName = "Yash";
    // String lastName = "Veer";
    // String fullName = firstName + " " + lastName;
    // getString(fullName);
    // System.out.println(isPalindrome("madam"));
    // System.out.println(isPalindrome("hello"));
    System.out.println(getShortestPath("WNEENESENNN"));
  }
}