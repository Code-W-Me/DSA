import java.util.*;
public class bitManipulation {
public static void oddOrEven(int n){
    int bitMask = 1;
    if((n & bitMask) == 0){
        System.out.println("Even Number");

    }else{
        System.out.println("Odd Number");
    }

}

public static int getIthBit(int n , int i){
    int bitMask = 1<<i;
    if((n & bitMask)== 0){
        return 0;
    }else{
        return 1;
    }
}
public static int setIthBit(int n, int i){
    int bitMask = 1<<i;
    return n | bitMask;
}
public static int clearIthBit(int n , int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
}
public static void main(String args[]){
    // oddOrEven(7);
    // oddOrEven(4);
    // oddOrEven(0);
    // System.out.println(getIthBit(5,0));
    // System.out.println(setIthBit(10,2));
    System.out.println(clearIthBit(10,1));

  }
}