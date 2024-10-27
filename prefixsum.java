import java.util.*;
public class prefixsum {
    public static void PrefixSum(int Number[]){
        int currsum = 0;
        int Maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[Number.length];
        prefix[0] = Number[0];
        for (int i = 1; i<prefix.length;i++){
            prefix[i] = prefix[i-1]+ Number[i];
        }
        for(int i = 0;i<Number.length;i++){
            int start = i;
            for(int j = i;j<Number.length;j++){
                int end = j;
                
                currsum = start ==0 ? prefix[end] :prefix[end] - prefix[start-1];
                if(Maxsum<currsum){
                    Maxsum = currsum;
                }
                
            }
        } 
        System.out.println("Maxsum will be :"+Maxsum);       
    }
public static void main(String args[]){
        int num[] ={1,-2,6,-1,3};
        PrefixSum(num); 

  }
}