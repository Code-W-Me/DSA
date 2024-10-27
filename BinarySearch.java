import java.util.*;
public class BinarySearch {
    public static int binarysearch(int Number[],int key){
        int start = 0;
        int end = Number.length-1;
        while (start <=end){
            int mid  = (start +end)/2;
            if(Number[mid] == key){
                return mid;
            }
            if(Number[mid] <key){
            start = mid+1;
        }else{
            end = mid-1;
        }
    }
    return -1;
} 
public static void main(String args[]){
    int Number[] = {2,4,6,8,10,12,14};
    int key = 4;
    System.out.println("index for key is:"+ binarysearch(Number,key));
  }
}