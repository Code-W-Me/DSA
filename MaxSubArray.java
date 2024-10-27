import java.util.*;
public class MaxSubArray {
    public static  void maxsubarray(int Number[]){
      for(int i = 0;i<Number.length;i++){
        int sum = 0;
        int Max = Number[i];
        for(int j = i;j<Number.length;j++){
          sum++;
          Max = Math.min(Max,Number[j]);
          System.out.println("the values of sum ("    +i+","+j+ "): "+sum);
          System.out.println("Max of subarrays is ("  +i+","+j+"):"+Max);
          
        }

      }
    }
public static void main(String args[]){
    int Number[] = {2,4,6,8};
    maxsubarray(Number);

  }
}