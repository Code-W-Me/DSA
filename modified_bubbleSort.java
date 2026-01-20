import java.util.*;
public class modified_bubbleSort {
public static void modifiedBubbleSort(int arr[]){
    for(int i = 0; i<arr.length-1;i++){
        boolean swapped = false;
        for(int j = 0; j<arr.length-1-i;j++){
            if(arr[j]> arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        if(swapped == false){
            break;
    }
}
}
    
public static void main(String args[]){
    int arr[] = {5,4,3,2,1};
    modifiedBubbleSort(arr);
    System.out.println(Arrays.toString(arr));

}
}