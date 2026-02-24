import java.util.*;
public class nextGreaterele {
public static void main(String args[]){
    int arr[] = {6,8,0,1,3};
    Stack<Integer> s = new Stack<>();
    int nextGreater[] = new int[arr.length];
    for(int i = arr.length - 1; i >= 0; i--){
        //while 
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
        }
        // if else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
        // push in s
        s.push(i);

    }
    for(int i = 0; i < nextGreater.length; i++){
        System.out.print(nextGreater[i] + " ");
  }
  System.out.println();

  // ask in diffrent form 
    // next greater Right
    // next greater left
    //      in this we only have to cahnge from 
    //      for(int i = arr.length - 1; i >= 0; i--)
    //      to this
    //      for(int i = 0; i < arr.length; i++)
    //next smaller Right
    //      in this we only have to change from
    //      while(!s.isEmpty() && arr[s.peek()] <= arr[i])
    //      to this
    //      while(!s.isEmpty() && arr[s.peek()] >= arr[i])
    // next smaller left
    //      in this we only have to change  both from
    //      for(int i = arr.length - 1; i >= 0; i--)
    //      while(!s.isEmpty() && arr[s.peek()] <= arr[i])
    //      to this
    //      for(int i = 0; i < arr.length; i++)
    //      while(!s.isEmpty() && arr[s.peek()] >= arr[i])
}
}
