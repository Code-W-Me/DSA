public class divideNConquer {

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si , int ei){
       //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid = (si +ei)/2;
        mergeSort(arr,si,mid); // left part
        mergeSort(arr,mid+1,ei); // right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // iterater for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){  //si<mid+1
                temp[k]=arr[i];
                i++;
        }else{
            temp[k] = arr[j];
            j++;
        }
        k++;
    }
    //left part
    while(i<=mid){
        temp[k++]= arr[i++];
    }
    //right part
    while(j<=ei){
        temp[k++]= arr[j++];
    }
    // copy temp to original array
    for(k=0,i=si; k<temp.length;k++,i++){
        arr[i] = temp[k];
    }

}


public static void quickSort(int arr[],int si, int ei){
    //base case
    if(si>=ei){
        return;
    }
    //kaam
    int pIdx = partition(arr,si,ei);
    quickSort(arr,si,pIdx-1); // left part
    quickSort(arr, pIdx+1, ei); // right part
}
public static int partition(int arr[], int si, int ei){
    int pivot = arr[ei];
    int i = si-1; //to make place for smaller element than pivot
    for(int j=si; j<ei; j++){
        if(arr[j]<=pivot){
            i++;
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

}
public static int search(int arr[],int tar, int si, int ei){
    //work
    int mid = (si+ei)/2;
    //case FOUND
    if(arr[mid]==tar){
        return mid;
    }
    // mid on L1
    if(arr[si]<=arr[mid]){
        //case a: left
        if(arr[si]<=tar && tar<arr[mid]){
            return search(arr, tar, si, mid-1);
        }else{ //case b: right
            return search(arr,tar,mid+1,ei);
        }
    }
    // mid on L2
    else{
        //case a:right
        if(arr[mid]<tar && tar<=arr[ei]){
            return search(arr, tar, mid+1, ei);
        }else{ //case b: left
            return search(arr, tar, si, mid-1); 
        }
    }
}

public static String[] mergeSort(String[] arr, int lo , int hi){
    //base case
    if(lo==hi){
        String[] A = {arr[lo]};
        return A;
    }

    //kaam
    int mid = (lo+hi)/2;
    String[] str1 = mergeSort(arr,lo,mid);
    String[] str2 = mergeSort(arr,mid+1,hi);
    String[] str3 = merge(str1,str2);
    return str3;
}
 static String[] merge(String[] str1, String[] str2){
    int m = str1.length;
    int n = str2.length;
    String[] str3 = new String[m+n];
    int idx = 0;
    int i = 0;
    int j=0;

    while(i<m && j<n){
        if(isAlphabeticallySmaller(str1[i],str2[j])){
            str3[idx]=str1[i];
            i++;
            idx++;
        }else{
            str3[idx]=str2[j];
            j++;
            idx++;
        }
    }
    while(i<m){
        str3[idx]=str1[i];
        i++;
        idx++;
    }
    while(j<n){
        str3[idx]=str2[j];
        j++;
        idx++;
    }
    return str3;
    }
public static boolean isAlphabeticallySmaller(String str1, String str2){
    if(str1.compareTo(str2)<0){
        return true;
    }
    return false;
}

// revising the previous question code baesd

    



    public static void main(String args[]){
        // int arr[] = {6,3,9,5,2,8,-2};
        // mergeSort(arr,0,arr.length-1);
        // printArr(arr);
        // int arr[] = {4,5,6,7,0,1,2};
        // quickSort(arr,0,arr.length-1);
        // printArr(arr);
        // int arr[] = {4,5,6,7,0,1,2};
        // int target = 0;
        // int tarIdx = search(arr, target, 0, arr.length-1);
        // System.out.println(tarIdx);

        // String str = mergeSort(new String[]{"sun","earth","mars","mercury"}, 0, 3);
        // System.out.println(str);
        String[] str = {"sun","earth","mars","mercury"};
        String[] a = mergeSort(str,0,str.length-1);
        for(int i =0; i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();


    } 
}   
