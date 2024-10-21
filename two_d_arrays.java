// import java.util.Scanner;
// public class two_d_arrays {

//     public static void main(String args []) {
//         int matrix [][] = new int [3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         //output 
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class two_d_arrays {
//     public static boolean search(int matrix[][] , int key) {
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                if (matrix[i][j] == key) {
//                 System.out.println("Found the key at the: "+"("+ i + j +")");
//                 return true;
//                }
//             }
//         }
//         System.out.println("Not found the key ");
//         return false;
//     }

//     public static void main(String args[]) {
//         int key = 2;
//         int Largest = Integer.MIN_VALUE;
//         int Smallest = Integer.MAX_VALUE;
//         int matrix[][] = new int[3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println();   
//         // output 
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//         // Find the largest and smallest numbers
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if (matrix[i][j] > largest) {
//                     largest = matrix[i][j];
//                 }
//                 if (matrix[i][j] < smallest) {
//                     smallest = matrix[i][j];
//                 }
//             }
//         }
//         // Display the largest and smallest numbers
//         System.out.println("Largest number: " + largest);
//         System.out.println("Smallest number: " + smallest);
//         search(matrix , key);
//     }
// }

// Sprial Matrix 

// public class two_d_arrays {

//     public static void printspiralmatrix(int matrix[][]) {
//         int startrow = 0;
//         int startcol = 0;
//         int endrow = matrix.length - 1;
//         int endcol = matrix[0].length - 1;

//         while (startrow <= endrow && startcol <= endcol) {
//             // top
//             for (int j = startcol; j <= endcol; j++) {
//                 System.out.print(matrix[startrow][j] + " ");
//             }
//             // Right
//             for (int j = startrow + 1; j <= endrow; j++) {
//                 System.out.print(matrix[endcol][j] + " ");
//             }
//             // Bottom
//             for (int j = endcol - 1; j >= startcol; j--) {
//                 if (startrow == endrow) {
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j] + " ");
//             }
//             //// Left
//             for (int i = endrow - 1; i >= startrow + 1; i--) {
//                 if (startcol == endcol) {
//                     break;
//                 }
//                 System.out.print(matrix[startcol][i]+" ");
//             }

//             startcol++;
//             startrow++;
//             endcol--;
//             endrow--;
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 }
//         };
//         printspiralmatrix(matrix);
//     }
// }

// Diagonal Sum

// public class two_d_arrays {

//     public static int Diagonalprint(int matrix[][]) {
//         int sum = 0;
//     //     for(int i = 0; i<matrix.length; i++){
//     //         for(int j=0; j<matrix[0].length; j++){
//     //             if (i == j) {
//     //                 sum += matrix[i][j];
//     //             }
//     //             else if( i+j == matrix.length-1){
//     //                 sum += matrix[i][j];
//     //             }
//     //         }
//     //     }
//     for(int i=0; i<matrix.length; i++){
//         sum += matrix[i][i];
//         if (i != matrix.length-1-i) {
//             sum += matrix[i][matrix.length-i-1];
//         }
//     }
//         return sum;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {9,10,11,12},
//                           {13,14,15,16}};
//        System.out.println( Diagonalprint(matrix));
//     }
// }

// Search in sorted Matrix 

// public class two_d_arrays {

//     public static boolean StaircaseSearch(int matrix[][] , int key) {
//         int row =0 , col = matrix[0].length - 1;
//         while (row < matrix.length && col >=0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Found key at (" + row + "," + col + ")");
//                 return true;
//             }
//             else if (key < matrix[row][col]) {
//                 col--;
//             }
//             else {
//                 row++;
//             }
//         }
//         System.out.println("Not found key");
//         return false;
//     }

//     public static void main(String args[]) {
//         int key = 2;
//         int matrix[][] = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//         StaircaseSearch(matrix, key);
//     }
// }

// public class two_d_arrays {

//     public static boolean StaircaseSearch(int matrix[][] , int key) {
//         int row = 0 , col = matrix[0].length-1;
//         System.out.println(matrix.length);
//         System.out.println(matrix[0].length-1);
//         while (row < matrix.length && col >=0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Key is Found at (" + row + "," + col + ")");
//                 return true;
//             }
//             // Left
//             else if (key < matrix[row][col]) {
//                 col--;
//             }
//             // Bottom
//             else {
//                 row++;
//             }
//         }
//         System.out.println("Key is not found");
//         return false;
//     }

//     // public static void forllopp(int matrix[][] , int key) {
//     //     for(int i=0; i<matrix.length; i++){
//     //         for(int j=0; j<matrix[0].length-1; j++){
//     //             if (matrix[i][j] == key) {
//     //                 System.out.println("Key is foound in brutforce");
//     //             }
//     //         }
//     //     }
//     // }

//     public static void main(String args[]) {
// int matrix[][] = {{1,2,3,4},
//                     {5,6,7,8},
//                     {9,10,11,12},
//                     {13,14,15,16}};
//         int key = 3;
//         StaircaseSearch(matrix, key);
//         // forllopp(matrix, key);
//     }
// }

// Diagonal Sum 

// public class two_d_arrays {

//     public static int Diagonalsum(int matrix[][]) {
//         int sum = 0;
//         //Brtuforce method , time-complexity = 0(n^2)
//         // for(int i=0; i<matrix.length; i++){
//         //     for(int j=0; j<matrix[0].length; j++){
//         //         // primary
//         //         if ( i == j) {
//         //             sum += matrix[i][j];
//         //         }
//         //         // Secondary 
//         //         else if ( i+j == matrix.length-1) {
//         //             sum += matrix[i][j];
//         //         }
//         //     }
//         // }
//         // return sum;

//         // Optimized Solution 

//         for(int i=0; i<matrix.length; i++){
//             // primary daigonal codintion
//             sum += matrix[i][i];
//             // Secondary diagonal condtion 
//             if (i != matrix.length-1-i) {
//                 sum += matrix[i][matrix.length-i-1];
//             }
//         }
//         return sum;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{1,2,3,4},
//                             {5,6,7,8},
//                             {9,10,11,12},
//                             {13,14,15,16}};
//         System.out.println(Diagonalsum(matrix));
//     }
// }

// import java.util.Scanner;

// public class two_d_arrays {

//         public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 int c = sc.nextInt();
//                 if (c % 2 == 0) {
//                         if (c % 100 == 0) {
//                                 if (c % 400 == 0) {
//                                         System.out.print("This year is leap Year");
//                                 } else {
//                                         System.out.print("This year is not leap Year");
//                                 }
//                         } else {
//                                 System.out.print("This year is not leap Year");
//                         }
//                 } else {
//                         System.out.print("This year is not leap Year");
//                 }
//         }
// }

// import java.util.Scanner;

// public class two_d_arrays {



//         public static void main(String args[]) {
//             Scanner sc = new Scanner(System.in);
//             char c = sc.next().charAt(0);
//             if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                 System.out.println("This is an Vowel");
//             }  
//             else if ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//                 System.out.println("This is an Vowel");
//             } 
//             else {
//                 System.out.println("This is a Consonant");
//             }
//         }
// }

// import java.util.Scanner;

// public class two_d_arrays {

//         public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 int c = sc.nextInt();
//                 // int c = 10;

//                 if ( c < 0) {
//                         System.out.println("Please Enter the non-negative Number");
//                 }
//                 else {
//                         int sum = 1;
//                         for(int i =1; i<=c; i++){
//                                 sum *= i;
//                         }
//                         System.out.print("The factorail of Number " + c + " is " + sum);
//                 }
//                 sc.close();

//         }
// }

// import java.util.Scanner;

// public class two_d_arrays {

//         public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 int c = sc.nextInt();

//                 for(int i =1; i<=10; i++){
//                         System.out.println(c * i);
//                 }
//         }
// }


// import java.util.Scanner;

// public class two_d_arrays {

//     public static void main(String args[]) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the position (n) to find Fibonacci number: ");
//         int n = scanner.nextInt();

//         int result = fibonacci(n);

//         System.out.println("Fibonacci number at position " + n + " is: " + result);

//         scanner.close();
//     }

//     // Function to calculate the nth Fibonacci number using iteration
//     public static int fibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }

//         int fib = 1;
//         int prevFib = 0;

//         for (int i = 2; i <= n; i++) {
//             int temp = fib;
//             fib += prevFib;
//             prevFib = temp;
//         }

//         return fib;
//     }
// }

// import java.util.Scanner;

// public class two_d_arrays {

//         public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 int fib = 1;
//                 int prevois = 0;

//                 if ( n <= 1) {
//                         System.out.println("The Fibonacii of " + n + " is " + n);
//                 }
//                 else {
//                         for(int i=2; i<=n; i++){
//                                 int temp = fib;
//                                 fib = fib + prevois;
//                                 prevois = temp;
//                                 System.out.println("The Fibonaciie of is " + i + " is " + fib);
//                         }
//                 }
//                 // return fib;
//         }
// }

// import java.util.Scanner;

// public class two_d_arrays {

//         public static void main(String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the num1");
//                 int num1 =  sc.nextInt();
//                 System.out.println("Enter the num2");
//                 int num2 =  sc.nextInt();

//                 int mul = num1 * num2;
//                 int sub = num1 - num2;

//                 int LCM = mul / sub;
//                 System.out.print("The LCM of the " + num1 + " and " + num2 + " is " + LCM);
 
//         }
// }


// import java.util.Scanner;

// public class two_d_arrays {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input a number from the user
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         // Check if the number is an Armstrong number
//         if (isArmstrongNumber(number)) {
//             System.out.println(number + " is an Armstrong number.");
//         } else {
//             System.out.println(number + " is not an Armstrong number.");
//         }

//         scanner.close();
//     }

//     // Function to check if a number is an Armstrong number
//     private static boolean isArmstrongNumber(int num) {
//         int originalNumber = num;
//         int n = countDigits(num);
//         int sum = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             sum += Math.pow(digit, n);
//             num /= 10;
//         }

//         return sum == originalNumber;
//     }

//     // Function to count the number of digits in a number
//     private static int countDigits(int num) {
//         int count = 0;
//         while (num != 0) {
//             num /= 10;
//             count++;
//         }
//         return count;
//     }
// }

// import java.util.Scanner;

// public class two_d_arrays {


//     public static void matrex( int matrix [] [] , int n, int m) {
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 // System.out.print(matrix[i][j]+" ");
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//     }
//     public static void printarr (int matrix [] [] , int n, int m){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j]);
//             }
//             System.out.println();
//         }
//     }
    
    
//     public static void main(String args[]) {
//         int matrix[][] = new int [3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;
//         matrex(matrix,n,m);
//         printarr(matrix,n,m);
//     }
// }


public class two_d_arrays {
    public static void primenum(int key) {
        for(int i=2; i<=key-1; i++){
            if (key % i == 0) {
                System.out.print("Not a Prime Number");
                // return false;
                break;
            }
            else{
                System.out.println("it is Prime Number");
            }
        }
        // return true;
    }
        
    public static void main(String args[]) {
        int key = 8;
        primenum(key);
    }
}