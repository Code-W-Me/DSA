import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
public class ArrayListBasics {



public static void swap(ArrayList<Integer> list, int idx1, int idx2){
    int temp = list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
}

//contasiner with most water brute force approach
public static int containerWithMostWater(ArrayList<Integer> height){
    int maxWater = 0;
    for(int i=0;i<height.size();i++){
        for(int j=i+1;j<height.size();j++){
            int ht = Math.min(height.get(i),height.get(j));
            int width = j-i;
            int currWater = ht * width;
            maxWater = Math.max(maxWater , currWater);
        }

    }
    return maxWater;
}

// pointer approach - O(n)
public static int storeWater(ArrayList<Integer> height){
    int maxWater = 0;
    int lp = 0;
    int rp = height.size()-1;
    while(lp<rp){
        // calculate water area
        int ht = Math.min(height.get(lp),height.get(rp));
        int width = rp-lp;
        int currWater = ht * width;
        maxWater = Math.max(maxWater , currWater);
        //update pointer
        if(height.get(lp)<height.get(rp)){
            lp++;
        }else{
            rp--;
        }
    }
    return maxWater;
}


// pairSum-1 brute force approach - O(n^2)
// public static boolean pairSum1(ArrayList<Integer> list, int target){
//     for(int i=0;i<list.size();i++){
//         for(int j=i+1;j<list.size();j++){
//             if(list.get(i)+list.get(j)==target){
//                 return true;
//             }
//         }
//     }
//     return false;
// }
// pairSum1 2 pointer approach-O(n)
public static boolean pairSum1(ArrayList<Integer> list, int target){
    int lp = 0;
    int rp = list.size()-1;
    while(lp!= rp){
        //case 1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        //case 2
        else if(list.get(lp)+list.get(rp)<target){
            lp++;   
        }
        else{
        rp--;
        }   
    }  
    return false;
}

public static boolean pairSum2(ArrayList<Integer> list, int target){
    int bp =-1;
    int n = list.size();
    for(int i =0;i<n;i++){
        if(list.get(i)>list.get(i+1)){ // breaking point
            bp = i;
            break;
        }
    }
    int lp = bp+1; // smallest element
    int rp = bp; // largest element
    while(lp!=rp){
        //case 1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        //case 2
        if(list.get(lp)+list.get(rp)<target){
            lp = (lp+1)%n;   
        }
        else{    
            rp = (n+rp-1)%n;
        }
    }
    return false;
}
public static void main(String args[]){



     ArrayList<Integer> list = new ArrayList<>();
    // 11,15,6,8,9,10 - Sorted and roated array
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
    System.out.println(pairSum2(list,target));
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // int target = 5;
    // System.out.println(pairSum2(list,target));
    // // System.out.println(pairSum1(list,target));
    // ArrayList<Integer> height = new ArrayList<>();
    // height.add(1);
    // height.add(8);
    // height.add(6);
    // height.add(2);
    // height.add(5);
    // height.add(4);
    // height.add(8);
    // height.add(3);
    // height.add(7);
    // System.out.println(storeWater(height));

    // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    // ArrayList<Integer> list1 = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // ArrayList<Integer> list3 = new ArrayList<>();

    // for(int i=1 ;i<=5;i++){
    //     list1.add(i*1);
    //     list2.add(i*2);
    //     list3.add(i*3);
    // }
    // mainList.add(list1);
    // mainList.add(list2);
    // mainList.add(list3);
    // System.out.println(mainList);

    // //nested loop
    // for(int i=0;i<mainList.size();i++){
    //     ArrayList<Integer> currList = mainList.get(i);
    //     for(int j=0;j<currList.size();j++){
    //         System.out.print(currList.get(j)+" ");
    //     }
    //     System.out.println();
    // }
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // mainList.add(list);

    // ArrayList<Integer> list2 = new ArrayList<>();
    // list2.add(3);
    // list2.add(4);
    // mainList.add(list2);

    // for(int i =0; i<mainList.size();i++){
    //     ArrayList<Integer> currList = mainList.get(i);
    //     for(int j=0; j<currList.size();j++){
    //         System.out.print(currList.get(j)+" ");
    //     }
    //     System.out.println();
    // }
    // System.out.println(mainList);

    // // example of of oops class concept which is similar to arraylist syntax
    // // ClassName objectName = new ClassName();
    // ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();
    // ArrayList<Boolean> list3 = new ArrayList<>();

    // // add ele Operation
    // list.add(2);
    // list.add(5);
    // list.add(9);
    // list.add(6);
    // list.add(8);
    // //sort in accending order
    // System.out.println(list);
    // Collections.sort(list);
    // System.out.println(list);

    // //sort in decending order
    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);
    // Comparator - it is an function which define the logic 

    // int idx1 = 1 , idx2 = 3;
    // System.out.println("before swap: "+list);
    // swap(list,idx1,idx2);
    // System.out.println("after swap: "+list);
    // System.out.println(list.size());

    // // print arraylist
    // for(int i=0; i<list.size();i++){
    //     System.out.print(list.get(i)+" ");
    // }
    // System.out.println();

    // //print reverse arraylist -O(n)
    // for(int i=list.size()-1;i>=0;i--){
    //     System.out.print(list.get(i)+" ");
    // }
    // System.out.println();

    // //find Max in AL- O(n)
    // int max = Integer.MIN_VALUE;
    // for(int i =0; i<list.size();i++){
    //     // if(max<list.get(i)){
    //     //     max = list.get(i);
    //     // }
    //     max = Math.max(max , list.get(i));
    // }
    // System.out.println("max element is: "+max);

    // // // // get ele Operation
    // // int element = list.get(2);
    // // System.out.println(element);

    // // remove ele Operation
    // list.remove(2);
    // System.out.println(list);
    // // set Operation
    // // list.set(index, value to be set)
    // list.set(2,10);
    // System.out.println(list);

    // // contains Operation
    // System.out.println(list.contains(10));
    // System.out.println(list.contains(8));



  }
}