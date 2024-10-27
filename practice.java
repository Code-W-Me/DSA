import java.util.*;
public class  practice{
    public static void BitoDec(int bin){
        int pow = 0;
        int dec = 0;
        int mybin = bin;
        while (bin>0){
            int lastdigit = bin%10;
            dec= dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            bin = bin/10;
        }
        System.out.println("decimal of"+mybin+"="+dec);
    }
public static void main(String args[]){
    BitoDec(110);
  }
}