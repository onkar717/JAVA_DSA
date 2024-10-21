// Day - 5  10/1/23

// import java.util.Scanner;

public class functions {
    // public static void printhelloworld() { // access specifier // return type // function name 
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    // }

    // public static void calculatesum(int a , int b) {
    //     int sum = a + b;
    //     System.out.println("Sum of A + B : " + sum);
    // }
    //  public static int calculatesub(int a , int b) { // Parameters 
    //     int sum = a - b;
    //     // System.out.println("Sum of A + B : " + sum);
    //     return sum;
    // }

    // Product of a , b
    // public static int product(int a , int b) {
    //     int prod = a * b ;
    //     return prod;
    // }

    // Factorial of n 
    // public static int  factorialsum(int n){
    //     int f = 1;
    //     for(int i = 1; i <= n; i++){
    //         f = f * i;
    //     }
    //     return f;
    // }

    // Binomial coefficent 
    // public static int binCoeff(int n , int r) {
    //     int fact_n = factorialsum(n);
    //     int fact_r = factorialsum(r);
    //     int fact_nmr = factorialsum(n - r);
    //     int binCoeff = fact_n / (fact_r * fact_nmr);
    //     return binCoeff;
    // }


    // public static int sum(int a , int b){
    //     return a + b;
    // }

    // public static int sum(int a  , int b , int c ){
    //     return a + b + c ;
    // }


    // Prime number 

    // public static boolean isprime(int n) {
    //     // boolean isprime = true;
    //     for(int i = 2; i <= (n-1); i++){
    //         if ( n % i == 0) {
    //             // isprime = false;
    //             // break;
    //             return false;
    //         }
    //     }
    //     // return isprime;
    //     return true;

    // }

    // public static void primerange(int n){
    //     for(int i =2; i <= n; i++){
    //         if (isprime(i)) {
    //             System.out.print(i+" ");
    //         }
    //     }
    //     System.out.println();
    // }

    //decimal to binary

    public static void decimal_binary(int n){
        int mynum = n;
        int pow = 0;
        int dec = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println("Decimal of " + mynum +" = " + dec);
    }

     public static void main(String args[]) {
        // printhelloworld(); // function call


        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // calculatesum( a , b);

        // calculatesum(10, 10);

        // int sum = calculatesub(10 , 10); // Arguments // actual parameters 
        // System.out.println("The Sub of A - B : " + sum);

        // int prod = product(5, 10);
        // System.out.println("The Product of the A + B: "+prod);

        // factorial call
        // System.out.println(factorialsum(6));

        // System.out.println(binCoeff(5, 2));
        // System.out.println(sum(1, 2));
        // System.out.println(sum(1, 2 , 2));

        // System.out.println(isprime(12));
        // primerange(100);

        decimal_binary(111);
    }
}
