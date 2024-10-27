import java.util.*;
public class MaxSubArraySum {
    public static void maxsubarraysum(int Number[]){
        int currsum = 0;
        int Maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<Number.length;i++){
            int start = i;
            for(int j = i;j<Number.length;j++){
                currsum = 0;
                int end = j;
                for(int k = i; k<=j;k++){
                    currsum+=Number[k];
                }
                System.out.println("the sum is [" +i+ "," +j+"]:"+currsum);
                if(Maxsum < currsum){
                    Maxsum =currsum;
                }
            }
        }
            System.out.println("Max sum = "+Maxsum);
    }
public static void main(String args[]){
    int num[] = {1,-2,6,-1,3};
        maxsubarraysum(num);
  }
} 