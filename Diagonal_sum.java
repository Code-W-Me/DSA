import java.util.*;
public class  Diagonal_sum{

    public static int diagonal(int matrix[][]){
        int sum = 0;
        int n = 4;
        for(int i = 0; i<n;i++){
            sum = sum + matrix[i][i];
        }
        return sum;
        
    }

public static void main(String args[]){
    int matrix[][] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };
    System.out.println("Diagonal Sum: " + diagonal(matrix));
  }
}