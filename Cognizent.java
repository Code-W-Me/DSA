import java.util.*;

public class Cognizent {

    // Question 2
    // public static int countSegments(int[] arr){
    //     if(arr== null || arr.length==0){
    //         return 0;
    //     }
    //     if(arr.length==1){
    //         return 1;
    //     }
    //     int SegmentCount=1;
    //     for(int i = 1;i<arr.length;i++){
    //         boolean isCurrentNonNegative = arr[i]>=0;
    //         boolean isPrevNonNegative = arr[i-1]>=0;
    //         if(isCurrentNonNegative != isPrevNonNegative){
    //             SegmentCount++;
    //         }
    //     }
    //     return SegmentCount;    
    // }

    // Question 3 : Mountain Peak Sum
        // public static int  maxAltitude(int[] altitudes){
        //     int maxSum = 0;
        //     int n = altitudes.length;

        //     for(int i = 1; i < n-1; i++){
        //         if(altitudes[i] > altitudes[i-1] && altitudes[i] > altitudes[i+1]){
        //             int currentSum = altitudes[i];
        //             int left = i-1;
        //             int right = i+1;
        //             while(left >=0 && altitudes[left]< altitudes[left+1]){
        //                 currentSum += altitudes[left];
        //                 left--;
        //             }
        //             while(right < n && altitudes[right]< altitudes[right-1]){
        //                 currentSum += altitudes[right];
        //                 right++;
        //             }
        //             if(currentSum > maxSum){
        //                 maxSum = currentSum;
        //             }
        //         }
        //     }
        //     return maxSum;
        // }

        // Question 4 : Toy Position

    //     public static int findNewPositionOfToy(int[] toysArr){
    //         if (toysArr == null || toysArr.length == 0) {
    //         return 0;
    //     }

    //     // 1. Save the favorite toy's value before sorting
    //     int favoriteToy = toysArr[0];

    //     // 2. Sort the array directly
    //     Arrays.sort(toysArr);

    //     // 3. Find the index in the sorted array and convert to 1-based position
    //     // Arrays.binarySearch is very fast on sorted arrays
    //     int zeroBasedIndex = Arrays.binarySearch(toysArr, favoriteToy);
        
    //     return zeroBasedIndex + 1;
    // }


    // Question 5;

    public static int countPaceExeedences(int[] paceReadings, int thresold){
        return (int) Arrays.stream(paceReadings).filter(pace-> pace > thresold).count();
    }
    


    public static void main(String args[]){
        int[] input = {6, 8, 5, 10, 7};
        int threshold = 7;
        System.out.println("Exceedence count: " + countPaceExeedences(input, threshold));
        // int[] input1 = {2, 5,4 , 3, 1};
        // System.out.println("New position for toy : " + findNewPositionOfToy(input1));

        // int[] input = {1,2,3,4,3,2,1};
        // System.out.println(maxAltitude(input));
        // int[] arr = {1, 0, -3, -4, 5, 6, -7,};
        // System.out.println(countSegments(arr));
    }
}