import java.util.*;
public class LinearSearch {
    public static int linersearch(int Number[],int key){
        for(int i = 0;i<Number.length;i++){
            if(Number[i] == key){
                return i;
            }
        }
        return -1;
    }
public static void main(String args[]){
        int Number[] = {2,4,6,8,10,12,14,16};
        int key = 7;

        int index  = linersearch(Number,key);
        if(index ==-1){
            System.out.println("Index is not  found:(");

        }else{
            System.out.println("Index is found:"+index);
        }
  }
}