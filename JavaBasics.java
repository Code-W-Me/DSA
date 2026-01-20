
public class JavaBasics {
    public static int multipy(int a, int b) {
        int product =a * b;
        return product;
         
    }
    public static int multiply(int a , int b){
        int product = a *b;
        return product;
    }
    public static int Factorial(int n) {
        int f= 1;
        for(int i =1; i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int binCoeff(int n , int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr  = Factorial(n-r);
        int binCoeff =fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    // public static boolean isPrime(int n) {
    //     boolean isPrime = true;
    //     for(int i =2 ; i<=n-1;i++){
    //         if(n % i==0){
    //             isPrime = false;
    //         break;
    //         }
    //     }
    //     return isPrime;
    // }

    // Optimized way to determine weather the number is prime or not
    
    public static boolean  isPrime(int n) {
        if(n==2){
            return true;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n) {
        for(int i=2; i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
   
// Conversion of binary to decimal 
        public static void binToDec(int binNum){
            int myNum = binNum;
            int pow = 0;
            int decNum = 0;
            while (binNum > 0) {
                int lastDigit = binNum % 10;
                decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
                pow++;
                binNum = binNum / 10;
            }
            System.out.println("decimal of " + myNum + " = " + decNum);
        }
// conversion of decimal to binary
        public static void decToBin(int decNum) {
            int myNum = decNum;
            int pow = 0;
            int binNum = 0;
            while (decNum > 0) {
                int rem = decNum %2;
                binNum = binNum + (rem * (int)Math.pow(10,pow));
                pow++;
                decNum = decNum / 2;
            }
            System.out.println("binary of " + myNum + " = " + binNum);
        }

    // public static void printHelloWorld(){
    //     System.out.println("Helloworld");
    // }
    // public static void CalclateSum(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a + b;
    //     System.out.println("sum is :"+ sum);
    // }
    // public static void swap(int a , int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a = "+a);
    //     System.out.println("b="+ b);
    // }
    public static void main(String args[]) {
        // multiply(2,3);
        System.out.println(multiply(2,3));
        // decToBin(11);
        // binToDec(101);
        // primeInRange(100);
        // System.out.println(isPrime(5));
        // System.out.println(binCoeff(5,2));
        // System.err.println(Factorial(4));
        // int prod =multipy(5,6 );
        // System.out.println("a * b = "+prod);
        // // CalclateSum();
        // int a = 5;
        // int b = 6;
        // swap(a,b);
        // int a = 10;
        // int b = --a;
        // System.out.println(a);
        // System.out.println(b);
        
    }
    
}
