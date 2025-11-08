public class Recursion {
    public static void printDec(int n){
        // base case 
        if(n==1){
            System.out.println(n);
            return;
        }
        // calling function itself using stack
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        // base case
        if(n==1){
            System.out.print(n);
            return;
        }
        // calling function itself using stack
       printInc(n-1);
      System.out.print(n+" ");
    }
    public static int factorial(int n){
        // base case
        if(n ==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int sumnm1 = Sum(n-1);
        int sum = n+sumnm1;
        return sum;
    }

    public static int fibonacci(int n ){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }





    public static void main(String[] args){
    int n = 10;
    // System.out.println("factorial would be:" + factorial(5));
    // System.out.println("Sum would be:" + Sum(5));
    System.out.println("Fibonacci would be:" + fibonacci(5));   
}
}

