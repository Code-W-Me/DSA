
public class Patterns {
    // pattern of hollow rectangle
    public static void hollow_rectangle(int totRows, int totCols) {
        for(int i = 1; i <= totRows; i++) {
            for(int j = 1; j <= totCols; j++) {
                // Print * for first/last row or first/last column
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for hollow portion
                }
            }
            System.out.println(); // New line after each row
        }
    }
    public static void inverted_rotated_half_pyramid(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void inverted_half_pyramid_number(int n) {
        //inverted alf pyramid with numbers
        for(int i = 1; i <=n;i++){
            for (int j = 1; j <=n-i +1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    public static void floyd_triangle(int n) {
        int count = 1;
        for(int i = 1; i<=n;i++){
            for(int j =1; j <=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();   
        }
        
    }
    public static void zero_one_triangle(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                // Print 1 if the sum of row and column indices is even, else print 0
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // New line after each row
        }
        
    }
    public static void butterfly(int n) {
        // first half of the butterfly
        for(int i =1; i<=n; i++){
            //stars
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); // New line after each row
        }
        // second half of the butterfly
        for(int i = n; i>=1;i--){
             //stars
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1; j <= 2 *(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); // New line after each row
        }
        
    }
    public static void solidrombus(int n) {
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(); // New line after each row
        }
    }
    public static void diamond(int n) {
        // first half of the diamond
        for(int i =1; i<=n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j  =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        // second half of the diamond
        for(int i = n; i>=1;i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j  =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println(); 
            
    }
}
    public static void main(String[] args) {
        // hollow_rectangle(5, 10);
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid_number(5);
        // floyd_triangle(10);
        // zero_one_triangle(5);
        // butterfly(10);
        // solidrombus(5);
        diamond(4);
    }
}
