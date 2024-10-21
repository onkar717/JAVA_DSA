// // Check Odd and Even 
// public class Bitmanipulation {

//     public static String OddEven(int n) {
//         if ((n & 1) == 0) {
//             return "Even";
//         }
//         else {
//             return "Odd";
//         }
//     }

//     public static void main(String[] args) {
//         int n = 2;
//         System.out.println(OddEven(n));
//     }
// }

// 1. Get the bit value at the "i"th position of "num".

// 2. Set the bit at the "i"th position of "num".

// 3. Clear the bit at the "i"th position of "num".

// public class Bitmanipulation {

//     public static int GetIthBit(int n , int i) {
//         int bitset = 1<<i;
//         if ((n & bitset) == 0) {
//             return 0;
//         }
//         return 1;
//     }
// public static int SetIthBit(int n , int i) {
//     int bitset = 1<<i;
//     return n | bitset;
// }

// public static int clearithbit(int n , int i) {
//     int bitset = (~0<<i);
//     return n & bitset;

// }

//     public static void main(String[] args) {
//         System.out.println(GetIthBit(25, 3));
//         System.out.println(SetIthBit(25, 3));
//         System.out.println(clearithbit(25, 3));
//     }
// }

// Output : 0 29 25

// Count Setbits 
// public class Bitmanipulation {

//     public static int setcounts(int n) {
//         int count = 0;
//         for (int i=1; i<=n; i++){
//             int num = i;
//             while (num > 0) {
//                 if ( (num & 1) != 0) {
//                     count++;
//                 }
//                 num = num>>1;
//             }
//         }   
//         return count;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(setcounts(n));
//     }
// }

// power  of Two    
// public class Bitmanipulation {

//     public static boolean power(int n) {
//         if ((n & (n-1)) == 0) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 0;
//         System.out.println(power(n));
//     }
// }

// Swap two numbers using bitwise operator 

// public class Bitmanipulation {

//     public static void SwapnyBitmani(int a , int b) {
//         System.out.println("Before Swapping the a " + a + " and " + b);

//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         System.out.println("After Swapping the a " + a + " and " + b);

//     }

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 2;
//         SwapnyBitmani(a, b);
//     }
// }

// Also u can done by using arrays use then for loop 

// public class Bitmanipulation {

//     public static void Swap(int a [] , int b []) {
//         if (a.length != b.length) {
//             System.out.println("The Arrays have not same length so please provide the link");
//         }

//         for(int i=0; i<a.length; i++){
//             a[i] = a[i] ^ b[i];
//             b[i] = a[i] ^ b[i];
//             a[i] = a[i] ^ b[i];
//         } 

//     }

//     public static void main(String[] args) {
//         int a [] = {3};
//         int b [] = {2};
//         Swap(a, b);
//         System.out.println("After swapping:");
//         System.out.println("a: " + a[0]);
//         System.out.println("b: " + b[0]);
//     }
// }

// Update the value 0 or 1

// public class Bitmanipulation {

//     public static int SetIthBit(int n , int i) {
//         int bitset = 1<<i;
//         return n | bitset;
//     }

//     public static int clearithbit(int n , int i) {
//         int bitset = (~0<<i);
//         return n & bitset;

//     }

//     public static void updatenewbith(int n , int i , int newbit) {
//         if (newbit == 0) {
//             System.out.println(clearithbit(n, i));
//         }
//         else{
//             System.out.println(SetIthBit(n, i));
//         }
//     }

//     public static void main(String[] args) {
//         updatenewbith(10, 2, 1);
//     }
// }

// Clear Last i bits 

// public class Bitmanipulation {

//     public static int lastibits(int n , int i) {
//         int bitmask = (~0<<i);
//         return n & bitmask;
//     }

//     public static void main(String[] args) {
//         System.out.println(lastibits(15, 2));
//     }
// }

// clear the ithbits in range 

// public class Bitmanipulation {

//     public static int clearinrange(int n , int j , int i) {
//         int a = (~0<<(j+1));
//         int b = (1<<i)-1;
//         int bitmask = a | b;
//         return n & bitmask;

//     }

//     public static void main(String[] args) {
//         System.out.println(clearinrange(10, 4, 2));
//     }
// }

// public class Bitmanipulation {

//     public static int FastExpo(int a , int n) {
//         int ans = 1;
//         while (n > 0) {
//             if ((n & 1) != 0) {
//                 ans = ans * a;
//             }
//             a = a * a ;
//             n = n>>1;
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         System.out.println(FastExpo(5,3));
//     }
// }

// public class Bitmanipulation {

//     // public static boolean Kthbit(int N, int K) {
//     //     int bitmask = 1 << (K-1);
//     //     if ((N & bitmask) != 0) {
//     //         return true;
//     //     } else {
//     //         return false;
//     //     }
//     // }

//     // public static String isKthBitSet(int N, int K) {
//     //     // Shifting 1 to the left by K bits to create a mask
//     //     int mask = 1 << (K - 1);
//     //     // Bitwise AND operation with the mask and the number N
//     //     // If the Kth bit is set, the result will be non-zero
//     //     return ((N & mask) != 0) ? "YES" : "NO";
//     // }

//     public static int setrightmostbit(int N ) {
//         int bitmask = 1<<0;
//         return N | bitmask;
//     }

//     public static void main(String[] args) {
//         int N = 5;
//         // System.out.println(isKthBitSet(N, K)); // Output: YES, because the 1st bit of 5 (binary 101) is set
//         System.out.println(setRightmostUnsetBit(N));
//     }

// }


// public class Bitmanipulation {
//     public static void main(String[] args) {
//         int N = 15; // Example number
//         // System.out.println(setRightmostUnsetBit(N));
//         setRightmostUnsetBit(N);
//         // int position = findRightmostZeroBit(N);
//         // if (position == -1) {
//         //     System.out.println("No zero bit found.");
//         // } else {
//         //     System.out.println("Position of rightmost zero bit: " + position);
//         // }
//     }

//     public static void setRightmostUnsetBit(int N) {
//         int position = findRightmostZeroBit(N);
//         // int bitmask = 1<<position;
//         // return N | bitmask;
//         System.out.println(position);
//     }

//     public static int findRightmostZeroBit(int   N) {
//         int position = 0;
//         while (((N >> position) & 1) == 1) {
//             position++;
//         }
//         if (position == Integer.SIZE) {
//             return -1; // No zero bit found
//         }
//         return position;
//     }

// }


// public class Bitmanipulation {
//     public static int divide(int dividend, int divisor) {
//         // Handle edge case of overflow
//         // if (dividend == Integer.MIN_VALUE && divisor == -1) {
//         //     return Integer.MAX_VALUE;
//         // }
        
//         // Determine sign of the quotient
//             int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
//         // Convert dividend and divisor to positive long integers
//         long dvd = Math.abs((long)dividend);
//         long dvs = Math.abs((long)divisor);
        
        
//         // Initialize the quotient
//         int quotient = 0;
        
//         // Iterate until dividend is greater than or equal to divisor
//         while (dvd >= dvs) {
//             dvd -= dvs;
//             quotient++;
//         }
        
//         // Adjust the sign of the quotient
//         return sign * quotient;
//     }

//     public static void main(String[] args) {
//         int dividend = 7;
//         int divisor = -3;
//         System.out.println(divide(dividend, divisor)); // Output: 3
//     }
// }


// public class Bitmanipulation {
//     public static int divide(int dividend, int divisor) {
//         // Handle edge case of overflow
//         // if (dividend == Integer.MIN_VALUE && divisor == -1) {
//         //     return Integer.MAX_VALUE;
//         // }
        
//         // Determine sign of the quotient
//         int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
//         // Convert dividend and divisor to positive long integers
//         long dvd = Math.abs((long)dividend);
//         long dvs = Math.abs((long)divisor);
        
//         // Initialize the quotient
//         int quotient = 0;
        
//         // Iterate until dividend is greater than or equal to divisor
//         while (dvd >= dvs) {
//             dvd -= dvs;
//             quotient++;
//         }
        
//         // Adjust the sign of the quotient
//         return sign * quotient ;
        
//         // Handle overflow case
//         // if (quotient > Integer.MAX_VALUE) {
//         //     return Integer.MAX_VALUE;
//         // }
        
//         // return (int)quotient;
//     }

//     public static void main(String[] args) {
//         int dividend = 7;
//         int divisor = 3;
//         System.out.println(divide(dividend, divisor)); // Output: 2147483647
//     }
// }




// public class Bitmanipulation {

//     public static int  Flipbits(int A , int B) {
//         int xor = A ^ B;
//         int count = 0;
//         while ( xor != 0) {
//             count += xor & 1;
//             xor >>=1;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int A = 3;
//         int B = 4;
//         int result = Flipbits(A, B);
//         System.out.println(result);
//     }
// }



// Given an array ‘ARR’ of ‘N’ integers, where all the elements occur an even number of times and only one number occurs an odd number of times.
// Find and return the number which occurs an odd number of times.
// For example:
// 'N' = 5, 'ARR' = [1, 2, 3, 2, 3]
// Output: 1
// Except for number 1, all numbers occur an even number of times.


// public class Bitmanipulation {

//     public static int oaccursoddnums(int arr []) {
//         int xor = 0;
//         for(int i=0; i<arr.length; i++){
//             xor = xor ^ arr[i];
//         }
//         return xor;
//     }

//     public static void main(String[] args) {
        // int arr [] = {1,2,3,2,3};
//         int result = oaccursoddnums(arr);
//         System.out.println(result);
//     }
// }


// You are given two numbers 'L' and 'R'.
// Find the XOR of the elements in the range [L, R].
// For Example:
// For 'L' = 1 and ‘R’ = 5.
// The answer is 1.

// public class Bitmanipulation {

//     public static int FindXor(int L , int R) {
//         int xor = 0;
//         for(int i=L; i<=R; i++){
//             xor = xor ^ i;
//         }
//         return xor;
//     }

//     public static void main(String[] args) {
//         int L = 1;
//         int R = 3;
//         int result = FindXor(L,R);
//         System.out.println(result);
//     }
// }


// You are given an array 'arr' of size 'n'.
// It contains an even number of occurrences for all numbers except two numbers.
// Find those two numbers which have odd occurrences and return in decreasing order.
// Example:
// For 'arr' = {2, 4, 1, 3, 2, 4} , 'n' = 6.
// Answer is {3, 1}.
// // Here, numbers 1, 3 have occurrence 1 i.e. odd and numbers 2, 4 have occurrence 2 i.e. even.

// import java.util.Arrays;

// public class Bitmanipulation {

//     public static int[] oddoccurence(int arr[]) {
//         int xorResult = 0;
//         for(int i=0; i<arr.length; i++){
//             xorResult = xorResult ^ arr[i];
//         }

//         int rightmostsetbit = xorResult & -xorResult;

//         int num1 = 0;
//         int num2 = 0;

//         for(int i=0; i<arr.length; i++){
//             if ((rightmostsetbit & arr[i]) != 0) {
//                 num1 = num1 ^ arr[i];
//             }
//             else{
//                 num2 = num2 ^ arr[i];
//             }
//         }
//         return new int [] {Math.max(num1 , num2) , Math.min(num1 , num2)};
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 4, 1, 3, 2, 4};
//         System.out.println(Arrays.toString(oddoccurence(arr)));
//     }
// }