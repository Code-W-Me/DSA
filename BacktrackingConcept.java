import java.util.*;
public class BacktrackingConcept {

public static void changeArr(int arr[],int i, int val){
//base case
if(i==arr.length){
    printArr(arr);
    return;
}
//recuriosn
arr[i]=val;
changeArr(arr,i+1,val+1); // fn calling step
arr[i] = arr[i]-2; // backtracking step
}
public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

// find the subsets of a string
public static void findSubsets(String str, int i, String ans){
    // base case
    if(i==str.length()){
        if(ans.length()==0){
            System.out.print("null");
        }else{
            System.out.print(ans);
        }
        System.out.println();
        return;
    }
    //choices
    // yes choice
    findSubsets(str, i+1,ans+str.charAt(i));
    // no choice
    findSubsets(str, i+1, ans);
}
public static void main(String args[]){
    int arr[] = new int[5];
    changeArr(arr, 0, 1);
    printArr(arr);
    String str = "abc";
    findSubsets(str, 0, "");
  }

}