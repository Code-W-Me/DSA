import java.util.*;
public class MinSubArray {
    public static  void minsubarray(int Number[]){
      for(int i = 0;i<Number.length;i++){
        int sum = 0;
        int Min = Number[i];
        for(int j = i;j<Number.length;j++){
          sum+=;
          Min = Math.min(Min,Number[j]);
          System.out.println("the values of sum ("    +i+","+j+ "): "+sum);
          System.out.println("Min of subarrays is ("  +i+","+j+"):"+Min);
          
        }

      }
    }
public static void main(String args[]){
    int Number[] = {1,-2,6,-1,3};
    minsubarray(Number);

  }
}