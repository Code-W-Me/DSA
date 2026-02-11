import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;
public class ArrayListBasics {



public static void swap(ArrayList<Integer> list, int idx1, int idx2){
    int temp = list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
}
public static void main(String args[]){

    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

    for(int i=1 ;i<=5;i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    System.out.println(mainList);

    //nested loop
    for(int i=0;i<mainList.size();i++){
        ArrayList<Integer> currList = mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
    }
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