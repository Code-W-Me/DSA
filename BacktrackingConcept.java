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

public static boolean isSafe(char board[][], int row, int col){
    //vertical up
    for(int i = row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    //diagonal left up
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    //diagonal right up
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}

public static boolean nQueens(char board[][],int row){
    //base case
    if(row == board.length){
        printBoard(board);
        return true;
    }
    //cloumn loop
    for(int j = 0;j<board.length;j++){
        if(isSafe(board,row,j)){
             board[row][j] = 'Q';
        if(nQueens(board, row+1)){
            return true;
        }
        board[row][j] = 'x'; // backtracking step
        }
       
    }
    return false;
}

public static void printBoard(char board[][]){
    System.out.println("-----Chess Board-----");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}

public static void main(String args[]){
//     int arr[] = new int[5];
//     changeArr(arr, 0, 1);
//     printArr(arr);
//     String str = "abc";
//     findSubsets(str, 0, "");
//   }
int n = 2;
char board[][] = new char[n][n];
//initialize
for(int i =0;i<n;i++){
    for(int j=0;j<n;j++){
        board[i][j] = 'x';
    }
}
if(nQueens(board, 0)){
    System.out.println("solution is possible");
    printBoard(board);
}else{
    System.out.println("solution is not possible");

}
    }
}
