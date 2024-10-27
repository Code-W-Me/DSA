import java.util.*;
public class reverse {
    public static void Reverse(int Number[]){
        int first = 0;
        int last = Number.length-1;
        while(first<last){
            int temp = Number[last];
            Number[last] = Number[first];
            Number[first] = temp;
            first++;
            last--;
        }
    }
public static void main(String args[]){
    int Number[] = {2,4,6,8,10};
    Reverse(Number);
    for(int i = 0; i <Number.length; i++){
        System.out.print(Number[i]+" ");
    }
    System.out.println();
  }
}