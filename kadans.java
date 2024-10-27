import java.util.*;
public class kadans {
    public static void Kadans(int Number[]){
        int cs = 0;;
        int ms = Integer.MIN_VALUE;
        for(int i = 0;i<Number.length;i++){
            cs = cs+Number[i];
            if (cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max subarray sum is :"+ms);

    }
public static void main(String args[]){
    int num[] = {-2,-3,4,-1,-2,1,5,-3};
    Kadans(num);
  }
}