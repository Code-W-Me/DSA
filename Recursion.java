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

    public static boolean isSorted(int arr[], int i){
        // base case
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>=arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int key, int i){
        // base case
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key , i+1);
    }

    public static int lastOccurence(int arr[], int key , int i){
        // base case
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        else{
            return lastOccurence(arr, key, i-1);
        }
    }


    public static int  power(int x, int n){
        // base case
        if(n==0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedPower(int a , int n){
        //base case
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        //for odd n
        if(n%2 !=0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n){ // 2X n (floor size)
        // base case
        if(n==0 || n==1){
            return 1;
        }
        //work
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void removeDuplicates(String str, int idx , StringBuilder newStr, boolean map[]){
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){
            // duplicate
            removeDuplicates(str,idx +1, newStr, map);

        }else{
            // not duplicate
            map[currChar - 'a' ] = true;
            removeDuplicates(str, idx +1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args){
    int n = 10;
    // System.out.println("factorial would be:" + factorial(5));
    // System.out.println("Sum would be:" + Sum(5));
    // System.out.println("Fibonacci would be:" + fibonacci(5));  
    int arr[] = {8,3,6,9,5,10,2,5,3};
    // System.out.println(isSorted(arr, 0));
    // System.out.println(firstOccurence(arr, 5, 0));
    // System.out.println(lastOccurence(arr, 5, arr.length-1));
    //  System.out.println(power(2, 3));
    // System.out.println(optimizedPower(2, 5));
    // System.out.println(tilingProblem(4));
    String str = "appnnacollege";
    boolean map[] = new boolean[26];
    removeDuplicates(str, 0, new StringBuilder(""), map);
}
}


 