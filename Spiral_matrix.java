import java.util.*;
public class  Spiral_matrix {
public static void spiral(int matrix[][]){
 int n = matrix.length;
 int m = matrix[0].length;

  // top
  for(int i = 0;i<m; i++){
    System.out.print(matrix[0][i] + " ");
  }
  System.out.println();

  //right
   for(int i = 1;i<n;i++){
    System.out.print(matrix[i][matrix[0].length-1] + " ");
   }
   System.out.println();
   //bottom
   for(int i = 2;i>=0;i--){
    System.out.print(matrix[matrix.length-1][i] + " ");
   }
   System.out.println();
   //left
   for(int i =2;i>=1;i--){
    System.out.print(matrix[i][0] + " ");
   }
//    System.out.println();
   //inner matrix
   for(int i =1;i<=2;i++){
    System.out.print(matrix[1][i] + " ");
   }
   System.out.println();
   for(int i = 2; i >= 1; i--) {
            System.out.print(matrix[2][i] + " ");
        }
        
        System.out.println(); 
}
 //end of spiral

   
public static void main(String args[]){
  int matrix[][] = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12},
    {13, 14, 15, 16}
  };
  spiral(matrix);
}
}