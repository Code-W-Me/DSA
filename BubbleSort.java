public class BubbleSort {
    public static void bubblesort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int k = 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        
    }

public static void main(String args[]){

    int arr[] = {5,4,1,2,3};
    bubblesort(arr);
    print(arr);
}
}