import java.util.*;
public class GetLargest {
    public static int getlargest(int Number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<Number.length;i++){
            if(Number[i]>largest){
                largest = Number[i];
            }
            if(Number[i]<smallest){
                smallest = Number[i];
            }
        }
        System.out.println("the smallest numbers is :"+smallest);
        return largest;
    }
public static void main(String args[]){
    int Number[] = {1 , 2 , 6 , 3 , 5 };
    System.out.println("Largest value is :"+ getlargest(Number));
    
  }
} 