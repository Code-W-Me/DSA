public class SelectionSort {
    public static void selectionsort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
           int minPos = i;
            for(int j = i+1;j<arr.length;j++ ){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //Outer loop
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;

    
        }
    }
    public static void print(int arr[]){
        for(int k = 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        
    }
public static void main(String args[]){
    int arr[] = {5,4,1,3,2};
selectionsort(arr);
print(arr);
}
}