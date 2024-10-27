import java.util.*;
public class  BuyAndSellStoks {
    public static int  buyandsellstocks(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprice = 0;
        for(int i =0; i<price.length;i++){
            if(buyprice<price[i]){
                int profit = price[i] - buyprice;
                maxprice = Math.max(maxprice,profit);
            }else{
                buyprice = price[i];
            }
        }
        return maxprice;
       
    }
public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));
  }
}