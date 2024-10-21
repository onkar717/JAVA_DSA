// public class Bitmanupulation {

    // Finf Even and Odd
    // public static void OddEven(int n) {
    //     int bitmask = 1;
    //     if ( (n & bitmask) == 0) {
    //         System.out.println("Even");
    //     }
    //     else {
    //         System.out.println("Odd");
    //     }
    // }

    // find the get ith bit 
    // public static int get_ith_bit( int n , int i) {
    //     int bitmask = 1<<i;
    //     if ((n & bitmask) == 0) {
    //         // System.out.println("It is not ith bit");
    //         return 0;
    //     }
    //     else{
    //         // System.out.println("It ith bit");
    //         return 1;
    //     }
    // }

    // SetITHbit 

    // public static int setIthbit(int n , int i) {
    //     int bitmask = 1<<i;
    //     return n | bitmask;
    // }

    // Clear ith bit 

    // public static int clearithbit(int n , int i) {
    //     int bitmask = ~(1<<i);
    //     return n & bitmask;
    // }

    // public static int updateithbit( int n , int i , int newbit) {
    //     // if ( newbit == 0) {
    //     //     return clearithbit(n ,i);
    //     // }
    //     // else {
    //     //     return setIthbit(n ,i);
    //     // }

    //     n = clearithbit(n , i);
    //     int Bitmask = newbit<<i;
    //     return n | Bitmask;
    // }

    //
    // Clear Range of bits 
    // public static int clearRange(int n , int i , int j) {
    //     int a = (~0)<<j+1;
    //     // int a = (~0)<<j;
    //     int b = (1<<i) - 1;
    //     int bitmask = a | b;
    //     return n & bitmask;
    // }

    // QUESTION-3
    // public static boolean isPoweroftwo(int n) {
    //     return (n&(n-1)) ==0;
    // }

    //QUESTION-4
    // public static int counsetbits( int n) {
    //     int count = 0;
    //      while ( n > 0) {
    //         if ((n & 1) != 0) {
    //             count++;
    //         }
    //         n = n>>1;
    //      }
    //      return count;
    // }

    //Fast - Exponentation

    // public static int fastExpo(int a , int n) {
    //     int ans = 1;
    //     while (n > 0) { // check LSB
    //         if ((n & 1) != 0) {
    //             ans = ans * a;
    //         }
    //         a = a * a;
    //         n = n>>1;
    //     }
    //     return ans;
    // }

    // public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~5);
        // System.out.println(~10);
        // System.out.println(5<<2);
        // System.out.println(5>>2);
        // System.out.println(3 & 1);
        // System.out.println(22 & 1);
        // System.out.println(5 & 1);

        // OddEven(1);
        // OddEven(2);
        // OddEven(3);
        // OddEven(4);

        // System.out.println(get_ith_bit(10,1));
        // System.out.println(get_ith_bit(10,2));
        // System.out.println(get_ith_bit(10,3));
        // System.out.println(get_ith_bit(10,4));

        // System.out.println(setIthbit(10,1));
        // System.out.println(setIthbit(10,2));
        // System.out.println(setIthbit(10,3));
        // System.out.println(setIthbit(10,4));

        // System.out.println(clearithbit(10,1));
        // System.out.println(clearithbit(10,2));
        // System.out.println(clearithbit(10,3));
        // System.out.println(clearithbit(10,4));

        // System.out.println(updateithbit(10,2,1));

        // System.out.println(clearRange(10,2,4));

        // System.out.println(isPoweroftwo(15));

        // System.out.println(counsetbits(10));

//         System.out.println(fastExpo(3, 5));
//     }
// }