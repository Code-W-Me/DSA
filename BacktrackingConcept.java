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

// public static boolean isSafe(char board[][], int row, int col){
//     //vertical up
//     for(int i = row-1;i>=0;i--){
//         if(board[i][col]=='Q'){
//             return false;
//         }
//     }
//     //diagonal left up
//     for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//         if(board[i][j]=='Q'){
//             return false;
//         }
//     }
//     //diagonal right up
//     for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//         if(board[i][j]=='Q'){
//             return false;
//         }
//     }
//     return true;
// }

// public static boolean nQueens(char board[][],int row){
//     //base case
//     if(row == board.length){
//         printBoard(board);
//         return true;
//     }
//     //cloumn loop
//     for(int j = 0;j<board.length;j++){
//         if(isSafe(board,row,j)){
//              board[row][j] = 'Q';
//         if(nQueens(board, row+1)){
//             return true;
//         }
//         board[row][j] = 'x'; // backtracking step
//         }
       
//     }
//     return false;
// }

// public static void printBoard(char board[][]){
//     System.out.println("-----Chess Board-----");
//     for(int i=0;i<board.length;i++){
//         for(int j=0;j<board.length;j++){
//             System.out.print(board[i][j]+" ");
//         }
//         System.out.println();
//     }
// }
// public static int gridWays(int i,int j, int n, int m){
//     //base case
//     //recursion
//     if(i==n-1 && j==m-1){ // condition for last cell
//         return 1;
// }else if(i==n || j==m){  // boundry cross condition
//     return 0;
// }
//     int w1 = gridWays(i+1,j,n,m); // down
//     int w2 = gridWays(i,j+1,n,m); // right
//     return w1 + w2;
// }
public static boolean isSafe(int suduku[][], int row , int col, int digit){
    // coloum
    for(int i =0;i<suduku.length;i++){
        if(suduku[i][col] == digit){
            return false;
        }
    }
    // row
    for(int j=0;j<suduku.length;j++){
        if(suduku[row][j] == digit){
            return false; 
            }  
    }
    //grid
    int sr = (row/3)*3;
    int sc = (col/3)*3;
    for(int i=sr;i<sr+3;i++){
        for(int j =sc;j<sc+3;j++){
            if(suduku[i][j] == digit){
                return false;
            }
        }
    }
    return true;
}
public static boolean sudukuSolver(int suduku[][],int row, int col){
    // base case
    if(row == 9 && col == 0){
        return true;
    }
    
    // recursion
    int newRow = row , newCol = col+1;
    if(col+1 == suduku.length){
        newRow = row+1;
        newCol = 0;
    }
    if(suduku[row][col] != 0){
        return sudukuSolver(suduku, newRow, newCol);
    }
    for(int digit =1; digit<=9;digit++){
        if(isSafe(suduku,row,col,digit)){
            suduku[row][col] = digit;
            if(sudukuSolver(suduku,newRow,newCol)){
                return true;
            }
            suduku[row][col] = 0; // backtracking step
        }
    }
    return false;
}
public static void printSudoku(int suduko[][]){
    for(int i = 0; i<9;i++){
        for(int j = 0;j<9;j++){
            System.out.print(suduko[i][j]+" ");
        }
        System.out.println();
    }
}


public static void main(String args[]){


    int suduku[][] = {
        {5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}

        
    };
    if(sudukuSolver(suduku,0,0)){
            System.out.println("solution is possible");
            printSudoku(suduku);
        }else{
            System.out.println("solution is not possible");
        }
    // int n = 3 , m = 3;
    // System.out.println("number of ways are :"+ gridWays(0,0,n,m));
//     int arr[] = new int[5];
//     changeArr(arr, 0, 1);
//     printArr(arr);
//     String str = "abc";
//     findSubsets(str, 0, "");
//   }
// int n = 2;
// char board[][] = new char[n][n];
// //initialize
// for(int i =0;i<n;i++){
//     for(int j=0;j<n;j++){
//         board[i][j] = 'x';
//     }
// }
// if(nQueens(board, 0)){
//     System.out.println("solution is possible");
//     printBoard(board);
// }else{
//     System.out.println("solution is not possible");

// }
//     }
}
}
