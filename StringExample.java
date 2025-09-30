import java.util.*;
public class StringExample {

public static String getString(String str){
    for(int i =0;i<str.length();i++){
      System.out.print(str.charAt(i)+" ");
    }
    System.out.println();
    return str;
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

    String firstName = "Yash";
    String lastName = "Veer";
    String fullName = firstName + " " + lastName;
    getString(fullName);

  }
}