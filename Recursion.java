// public class Recursion {
// // Problem - 1
//     // public static void Printdec( int n) {
//     //     if (n == 1) {
//     //         System.out.println(n);
//     //         return;
//     //     }
//     //     System.out.print(n+" ");
//     //     Printdec(n-1);
//     // }

// // Problem - 2

//     // public static void printInc(int n) {
//     //     if ( n == 1) {
//     //         System.out.print(n+" ");
//     //         return;
//     //     }
//     //     printInc(n-1);
//     //     System.out.print(n+" ");
//     // }

// // Factorial 

// public static int fact( int n) {
//     if ( n == 0) {
//         return 1;
//     }
//     // int fucnm1 = fact(n-1);
//     int fn = n * fact(n-1);
//     return fn;
// }

// //     public static void main(String args[]) {
// //         int n = 5;
// //         // Printdec(n);
// //         // printInc(n);
//         System.out.println(fact(n));
// //     }
// // }



// public class Recursion {

// Problem - 4 ( Sum of n natural numbers)

    // public static int sum( int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     int func = sum(n -1 );
    //     int realsum = n + func;
    //     return realsum;
    // }


// Problem - 5 ( print Nth fibonaci Number )

// public static int fibonaccinumber(int n) {
//     if ( n == 0 || n == 1) {
//         return n;
//     }
//     int f1 = fibonaccinumber(n -1);
//     int f2 = fibonaccinumber(n -2);
//     return f1 + f2;
// }

//     public static void main(String[] args) {
//         int n = 5;
//         // System.out.println(sum(n));
//         System.out.println(fibonaccinumber(n));

//     }
// }


// public class  Recursion {

//     public static boolean isSorted( int arr[] , int i) {
//         if (i == arr.length-1) {
//             return true;
//         }
//         if (arr[i] > arr[i+1])  {
//             return false;
//         }
//         return isSorted(arr, i+1);
//     }

//     public static void main (String[] args){
//         int arr [] = {1,2,3,4,5,6};
//         int i = 1;
//         System.out.println(isSorted(arr, i));
//     }
// }


public class Recursion {

    //WAF TO FIND THE FIRST OCCURENCE OF AN ELEMENT IN AN ARRAY

    // public static int firstOccurence(int arr [] , int key , int i) {
    //     if (i == arr.length) {
    //         return -1;
    //     }
    //     if (arr[i] == key) {
    //         return key;
    //     }
    //     return firstOccurence(arr, key ,i+1);
    // }

    // public static int lastoccuernce (int arr[] , int i , int key) {
    //     if ( i == arr.length) {
    //         return -1;
    //     }
    //     int isFound = lastoccuernce(arr, i+1, key);
    //     System.out.println(isFound);
    //     if (isFound == -1 && arr[i] == key) {
    //         return i;
    //     }
    //     return isFound;
    // }

    // public static int powersum(int x  , int i) {
    //     if (i == 0) {
    //         return 1;
    //     }
    //     // int fnm1 = powersum(x, i-1);
    //     // int fn = x * powersum(x, i-1);
    //     return x * powersum(x, i-1);
    // }

    // 10 - Print x^n in O(logn)

    // public static int OptimizedPower( int a , int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     int halfpower = OptimizedPower(a, n/2);
    //     int halfpowersq = halfpower * halfpower;

    //     if ( n % 2 != 0) {
    //         return a * halfpowersq;
    //     }
    //     return halfpowersq;
    // }

    // 11 - Tilling Problem 

    // public static int Tilling( int n) {
    //     // base Casse 
    //     if ( n == 0 || n == 1) {
    //         return 1;
    //     }
        
    //     // Vertical Apporach 
    //     int fmn1 = Tilling(n - 1);
    //     // System.out.println(fmn1);
    //     // Horizonatal Approach 
    //     int fmn2 = Tilling(n - 2);
    //     // System.out.println(fmn2);
        
    //     // total ways in Tilling 
    //     return fmn1 + fmn2;
    // }

    // Problem - 12 Remove Duplicates from a String 

        public static void RemoveDuplicates(int idx , String Str ,StringBuilder newStr, boolean map[]) {
            if (idx == Str.length()) {
                System.out.println(newStr);
                return;
            }
            char cuurchar = Str.charAt(idx);
            if (map[cuurchar-'a'] == true) {
                RemoveDuplicates(idx+1, Str, newStr, map);
            }
            else {
                map[cuurchar-'a'] = true;
                RemoveDuplicates(idx+1, Str, newStr.append(cuurchar), map);
            }
        }

    public static void main (String args[]){
        // int arr[] = {8,3,6,9,10,2,3};
        // System.out.println(firstOccurence(arr , 5 , 0));

        // System.out.println(lastoccuernce(arr , i, key));

        // System.out.println(powersum(2, 5));

        // System.out.println(OptimizedPower(2, 10));

        // System.out.println(Tilling(4));
        String Str = "appnnacollege";
        RemoveDuplicates(0, Str,new StringBuilder(""), new boolean[26]);
    }
}