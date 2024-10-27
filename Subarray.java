import java.util.*;
public class Subarray {
    public static void SubArrays(int Number[]){
        int ts = 0;
        for(int i = 0;i<Number.length;i++){
            int start = i;
            for(int j = i;j<Number.length;j++){
                int end =j;
                for(int k = start; k<=end; k++){
                    System.out.print(Number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("Total subarrays:"+ts);
    }
public static void main(String args[]){
    int Num[] = {2,4,6,8,10}; 
    SubArrays(Num);

  }
}