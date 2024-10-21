// BASIC QUESTION

// 1
// public class One {

//     public static void main(String[] args) {
//         System.out.println("Hello world");
//     }
// }

// 2
// import java.util.Scanner;

// /**
//  * One
//  */
// public class One {

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Number of Elements : ");
//         int user = sc.nextInt();

//         int numbers[] = new int[user];

//         for(int i=0; i<user; i++){
//             System.out.println("Enter the number : " + (i + 1) + ":");
//             numbers[i] = sc.nextInt();
//         }

//         System.out.println("Numbers Entered By Users");
//         for(int i=0; i<user; i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//      }
// }

// 3

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first Number");
//         int a = sc.nextInt();
//         System.out.println("Enter Second Number");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("Sum of " + a + " and " + b + " is " + sum );
//     }
// }

//4

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Dividend");
//         int Dividend = sc.nextInt();
//         System.out.println("Eneter the Divisor");
//         int divisor = sc.nextInt();

//         if (divisor == 0) {
//             System.out.println("Please Enter Correct Divisor");
//         }

//         int quetionet  = Dividend / divisor;
//         int remainder  = Dividend % divisor;

//         System.out.println("Quetioent :" + quetionet);
//         System.out.println("Remainder :" + remainder);

//     }
// }

// 5

// public class One {

//     public static void main(String[] args) {
//         System.out.println(Integer.BYTES);
//         System.out.println(Float.BYTES);
//         System.out.println(Character.BYTES);
//         System.out.println(Double.BYTES);
//     }
// }

// 6
// public class One {

//     public static void main(String[] args) {

//         int a = 5;
//         int b = 10;

//         System.out.println(a + ":" + b);

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println(a + ":" + b);

// }
// }

// 7

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Character: ");
//         char ch = sc.next().charAt(0);

//         int ascci = (int) ch;

//         System.out.println("The ASCII value of " + ch + " is " + ascci);
//         sc.close();
//     }

// }

// 8

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a * b;
//         System.out.println("The Multiplication of " + a + " and " + b  + " is " + sum);

//     }
// }

// If-else 

// 1
// public class One {

//     public static void main(String[] args) {
//         int a = 4;
//         if ( a % 2 == 0) {
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Not Even");
//         }
//     }
// }

// 2

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String ch = sc.nextLine();

//         char ca = ch.charAt(0);

//         if (ca == 'a' || ca == 'e' || ca == 'i' || ca == 'o' || ca == 'u') {
//             System.out.print("Character is a Vowel : " + ca);
//         }
//         else{
//             System.out.print("Character is a Cansonat : " + ca);
//         }
// System.out.println();
//     }
// }

//3

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter First Number : ");
//         int a = sc.nextInt();
//         System.out.println("Enter Second Number : ");
//         int b = sc.nextInt();
//         System.out.println("Enter Third Number : ");
//         int c = sc.nextInt();

//         if (a == b  && a == c) {
//             System.out.println("All Values are Equals");
//         }
//         else if (a > b && a > c) {
//             System.out.println("a is Greater than b and c " + a);
//         }

//         else if (b > a && b > c) {
//             System.out.println("b is Greater than a and c " + b);
//         }
//         else {
//             System.out.println("c is Greater than a and b " + c);
//         }

//     }
// }

// 4
// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter coefficients
//         System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c):");
//         System.out.print("Enter coefficient a: ");
//         double a = scanner.nextDouble();
//         System.out.print("Enter coefficient b: ");
//         double b = scanner.nextDouble();
//         System.out.print("Enter coefficient c: ");
//         double c = scanner.nextDouble();

//         // Calculate the discriminant
//         double discriminant = b * b - 4 * a * c;

//         // Check the value of the discriminant
//         if (discriminant > 0) {
//             // Two real and distinct roots
//             double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//             double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//             System.out.println("The roots are real and distinct:");
//             System.out.println("Root 1: " + root1);
//             System.out.println("Root 2: " + root2);
//         } else if (discriminant == 0) {
//             // Two real and identical roots
//             double root = -b / (2 * a);
//             System.out.println("The roots are real and identical:");
//             System.out.println("Root: " + root);
//         } else {
//             // Two complex roots
//             double realPart = -b / (2 * a);
//             double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
//             System.out.println("The roots are complex:");
//             System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
//             System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
//         }

//         scanner.close();
//     }
// }

// 5

// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter a year
//         System.out.print("Enter a year: ");
//         int year = scanner.nextInt();

//         // Check if the entered year is a leap year
//         boolean isLeapYear = false;
//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//             isLeapYear = true;
//         }

//         // Print the result
//         if (isLeapYear) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }

//         scanner.close();
//     }
// }

// Loops

// 1) Write a Program to Calculate Sum of first N Natural
// Numbers (here value of N is Entered by user)

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1; i<n; i++){
//             sum = sum + i;
//         }
//         System.out.print(sum);
//         System.out.println();
//     }
// }

// 2) Write a Program to Find Factorial of a given number N
// (N is entered by user)

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if ( n == 0 || n == 1) {
//             System.out.print("The Factorial of a " + n  + " is " + n);
//         }

//         int fact = 1;
//         for(int i=1; i<=n; i++){
//             fact = fact * i;
//         }

//         System.out.print("The Factorial of the " + n + " is " + fact);
//         System.out.println();
//     }
// }

// 3) Write a Program to Generate Multiplication Table of a
// number (entered by the user) using a for loop.

// public class One {

//     public static void main(String[] args) {
//         int number = 5;
//         for(int i=1; i<=10; i++){
//             System.out.println(number + " x " + i + " = " + number*i);
//         }
//     }
// }

// 4) Write a Program to Display Fibonacci Series upto nth
// term (n is entered by user)

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Number: ");
//         int n = sc.nextInt();

//         int f1 = 0;
//         int f2 = 1;

//         int fibonacii = 0;
//         for(int i = 2; i<=n; i++){
//             fibonacii = f1 + f2;
//             f1 = f2;
//             f2 = fibonacii;
//         }
//         System.out.println("The Fibo of " + n + " is " + fibonacii);
//     }
// }

// 5) Write a Program to Display Fibonacci Series upto
// certain number n (n is entered by user)
// Example: n=100
// Output:
// Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         int f1 = 0;
//         int f2 = 1;
//         int fibonacii = 0;
//         for(int i=2; i<=n; i++){
//             fibonacii = f1 + f2;
//             f1 = f2;
//             f2 = fibonacii;
//             System.out.print(fibonacii+" ");
//         }
//     System.out.println();
//     }
// }

// 6}Write a Program to Find GCD or HCF of two numbers
// entered by user

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int gcd = 1;

//         int min = Math.min(num1, num2);

//         for(int i=1; i<=min; i++){
//             if ( num1 % i ==  0 && num2 % i == 0) {
//                 gcd = i;
//             }
//         }
//         System.out.print(gcd);
//         System.out.println();

//     }
// }

// 7) Write a Program to Find LCM of two numbers entered
// by user

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();

//         int min = Math.min(num1, num2);

//         int LCM = 1;

//         for(int i=1; i<min; i++){

//         }

//     }
// }

// 8) Write a Program to Reverse a given Number N by user

// public class One {

//     public static void main(String[] args) {
//         int number = 12345;
//         int reversed = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             reversed = reversed * 10 + digit;
//             number = number / 10;
//         }
//         System.out.println(reversed);
//     }
// }

//9) Write a Program to display sum of all digits of a given
// Number N by user

// public class One {

//     public static void main(String[] args) {
//         int number = 123;
//         int sum = 0;

//        while (number != 0) {
//         int digit = number % 10;
//         sum = sum + digit;
//         number = number / 10;
//        }

//         System.out.print(sum);
//         System.out.println();
//     }
// }

// 10) Write a Program to Calculate Power of a Number
// using inbuilt pow() function by taking two inputs from
// users as Base and exponent respectively

// public class One {
//     public static void main(String[] args) {
//         int base = 2;
//         int exponent = 3;

//         // Calculate the power using Math.pow() with integer arguments
//         double result = Math.pow(base, exponent);

//         // Display the result
//         System.out.println(base + " raised to the power of " + exponent + " is: " + result);
//     }
// }

// 11) Write a Program to Calculate Power of a Number
// without using inbuilt pow() function by taking two
// inputs from users as Base and exponent respectivel

// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the base and exponent from the user
//         System.out.print("Enter the base: ");
//         int base = scanner.nextInt();
//         System.out.print("Enter the exponent: ");
//         int exponent = scanner.nextInt();

//         // Calculate the power using a loop
//         long result = 1;
//         for (int i = 1; i <= exponent; i++) {
//             result *= base; // Multiply the base by itself 'exponent' times
//         }

//         // Display the result
//         System.out.println("Result: " + result);
//     }
// }

// // 12) Write a Program to Check Whether a Number N
// // entered by user is Palindrome or Not
// public class One {

//     public static void main(String[] args) {
//         int number = 121;

//         int tempnum = number;

//         int reversed = 0;

//         while (tempnum != 0) {
//             int digit = tempnum % 10;
//             reversed = reversed * 10 + digit;
//             tempnum = tempnum / 10;
//         }

//         System.out.println(reversed);
//         if (reversed == number) {
//             System.out.print("The Number Is Palindrome Number");
//         }
//         else{
//             System.out.println("Number is not Palindrome Number");
//         }
//     }
// }

// 13Write a Program to Check Whether a Number is Prime
// or Not

// public class One {

//     public static void main(String[] args) {
//         int number = 4;
//         boolean isPrime = true;
//         for(int i=2; i<number-1; i++){
//             if ( number % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//             if (isPrime) {
//                 System.out.println("Prime Number ");
//             }
//             else{
//                 System.out.println("Not a Prime Number ");
//             }
//         }
// }

// 14) Write a Program to Display Prime Numbers Between
// Two Intervals (entered by user)
// Example:
// Enter two numbers: 0 20
// Prime numbers between 0 and 20 are:
// 2 3 5 7 11 13 17 19

// import java.util.Scanner;

// public class One {

//     public static void isprimenum(int a , int b) {

//         if (a < 2) {
//             a = 2;
//         }

//         for(int i=a; i<=b; i++){
//             boolean isprime  = true;
//             for(int j=2; j<=i-1; j++){
//                 if (i % j == 0) {
//                     isprime false;
//                     break;
//                 }
//             }
//             if (isprime) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the First-Interval: ");
//         int a = sc.nextInt();

//         System.out.print("Enter the Second-Interval: ");
//         int b = sc.nextInt();

//         isprimenum(a , b);

//     }
// }

// import java.util.Scanner;

// public class One {

//     public static void isPrimeNum(int a, int b) {
//         if (a < 2) {
//             a = 2;
//         }

//         for (int i = a; i < b; i++) {
//             boolean isPrime = true;
//             for (int j = 2; j <= i - 1; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break; // Break the loop if i is not a prime number.
//                 }
//             }
//             if (isPrime) {
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the First-Interval: ");
//         int a = sc.nextInt();

//         System.out.print("Enter the Second-Interval: ");
//         int b = sc.nextInt();

//         isPrimeNum(a, b);
//     }
// }

// 15) Write a Program to check whether a number entered
// by the user is an Armstrong number or not.

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int Arm_Strong = sc.nextInt();
//         int newArm  =  Arm_Strong;
//         int num = 0;
//         int countdigit = 0;

//         while (newArm > 0) {            
//             newArm = newArm / 10;
//             countdigit++;
//         }
//         newArm = Arm_Strong;
//         int Calculate = 0;
//         while (Arm_Strong > 0) {

//             num = Arm_Strong % 10;
//             Calculate += Math.pow(num, countdigit);
//             Arm_Strong = Arm_Strong / 10;
//         }

//         if ( newArm == Calculate) {
//             System.out.println("The " + newArm  + " is " + "Armtrong Number " + Calculate);
//         }
//         else{
//             System.out.println("The " + newArm  + " is " + "not Armtrong Number " + Calculate);
//         }

//     }
// }

// 16) Write a Program to Display all Factors of a Number
// entered by User

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int Number = sc.nextInt();
//         for(int i=1; i<=Number; i++){
//             if (Number % i == 0) {
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//     }
// }

// Swtich case 

// 1) Write a Program to Make a Simple Calculator to Add, Subtract,
// Multiply or Divide Using Switch case
// The program should takes an arithmetic operator (+, -, *, /) and
// two operands from a user and performs the operation on those
// two operands depending upon the operator entered by the user.

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Number 1: ");
//         int number1 = sc.nextInt();
//         System.out.println("Enter Number 2: ");
//         int number2 = sc.nextInt();
//         System.out.println("Enter Operation 1 = + , 2 = * , 3 = - , 4 = / : ");
//         int operator = sc.nextInt();
//         int result;

//         switch (operator) {
//             case 1:
//                 result = number1 + number2;
//                 break;
//             case 2:
//                 result = number1 * number2;
//                 break;
//             case 3:
//                 result = number1 - number2;
//                 break;
//             case 4:
//                 result = number1 / number2;
//                 break;
//             default:
//                 result = 0; // Handle invalid operator
//                 break;
//         }

//         System.out.println("Result: " + result);
//     }
// }

// Patterns 

//  1) Solid Rectangular star

// public class One {

//     public static void main(String[] args) {
//         for(int i=0; i<3; i++){
//             for(int j=0; j<5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 2) Hollow Rectangular star
// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5; j++) {
//                 // Print '*' if current position is on the boundary
//                 if (i == 1 || i == 5 || j == 1 || j == 5) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             // Move to the next line after printing each row
//             System.out.println();
//         }
//     }
// }

// 3) Half Pyramid Star Pattern

// public class One {

//     public static void main(String[] args) {
//         for(int i=0; i<6; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 4) Inverted Half pyramid

// public class One {

//     public static void main(String[] args) {
//         for(int i=6; i>0; i--){
//             for(int j=0; j<i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 5) Full Pyramid Star Pattern
// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Outer loop for rows
//         for (int i = 1; i <= 10; i++) {
//             // Inner loop to print spaces
//             for (int j = 1; j <= 10 - i; j++) {
//                 System.out.print("  "); // Print two spaces for better pyramid shape
//             }

//             // Inner loop to print stars
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("* "); // Print a star followed by a space
//             }

//             // Move to the next line after printing each row
//             System.out.println();
//         }
//     }
// }

// 6) Inverted Full pyramid

// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Outer loop for rows
//         for (int i = 10; i >= 1; i--) {
//             // Inner loop to print spaces
//             for (int j = 1; j <= 10 - i; j++) {
//                 System.out.print("  "); // Print two spaces for better pyramid shape
//             }

//             // Inner loop to print stars
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("* "); // Print a star followed by a space
//             }

//             // Move to the next line after printing each row
//             System.out.println();
//         }
//     }
// }

// 7)Hollow Full Pyramid Star

// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the number of rows for the pyramid
//         System.out.print("Enter the number of rows for the pyramid: ");
//         int rows = scanner.nextInt();

//         // Outer loop for rows
//         for (int i = 1; i <= rows; i++) {
//             // Inner loop to print spaces
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print("  "); // Print two spaces for better pyramid shape
//             }

//             // Inner loop to print stars
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 if (k == 1 || k == 2 * i - 1 || i == rows) {
//                     System.out.print("* "); // Print a star followed by a space for first, last rows and edges
//                 } else {
//                     System.out.print("  "); // Print two spaces for internal spaces
//                 }
//             }

//             // Move to the next line after printing each row
//             System.out.println();
//         }
//     }
// }

// 8) Half pyramid using Numbers 

// public class One {

//     public static void main(String[] args) {
//         for(int i=1; i<10; i++){
//             for(int j=1; j<i; j++){
//                 System.out.print(j);
//             }
//             System.err.println();
//         }
//     }
// }

// 9) Pascal Triangle

// // Functions 
// 1) Write a Program to Display Prime Numbers Between Two
// Intervals (entered by the user) Using Functions

// import java.util.Scanner;

// public class One {

//     public static void PrimeNumber(int firstInterval, int secondInterval) {
//         if (firstInterval < 2) {
//             firstInterval = 2;
//         }
//         for (int i = firstInterval; i < secondInterval; i++) {
//             boolean isPrime = true;
//             for (int j = 2; j <= i - 1; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the First Interval: ");
//         int firstInterval = sc.nextInt();
//         System.out.print("Enter the Second Interval: ");
//         int secondInterval = sc.nextInt();

//         // isPrimeNum(firstInterval, secondInterval);
//         PrimeNumber(firstInterval, secondInterval);

//     }
// }

// 2) Write a Program to check if an integer (entered by the user)
// can be expressed as the sum of two prime numbers,if yes then
// print all possible combinations with the use of functions.
// Example
// Enter a positive integer: 34
// OUTPUT:
// 34 = 3 + 31
// 34 = 5 + 29
// 34 = 11 + 23
// 34 = 17 + 17

// import java.util.Scanner;

// public class One {

//     // Function to check if a number is prime
//     public static boolean isPrime(int n) {
//         if (n < 2) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     // Function to find and print all possible combinations of prime numbers that sum up to n
//     public static void findPrimeCombinations(int num) {
//         System.out.println("OUTPUT:");
//         for (int i = 2; i <= num; i++) {
//             if (isPrime(i) && isPrime(num - i)) {
//                 System.out.println(num + " = " + i + " + " + (num - i));
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int num = sc.nextInt();

//         // Calling the function to find and print all possible combinations of prime numbers
//         findPrimeCombinations(num);
//     }
// }

// 3) Write a Program to Convert Binary Number to Decimal
// manually by creating user-defined functions.

// import java.util.Scanner;

// public class One {

//     // Function to convert binary to decimal
//     public static int binaryToDecimal(int binary) {
//         int decimal = 0;
//         int power = 0;

//         while (binary != 0) {
//             int digit = binary % 2;
//             decimal += digit * Math.pow(2, power);
//             binary = binary / 10;
//             power++;
//         }
//         return decimal;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the binary number: ");
//         int binary = sc.nextInt();
//         int decimal = binaryToDecimal(binary);
//         System.out.println("Decimal: " + decimal);
//     }
// }

// 4) Write a Program to Convert Decimal to Binary number
// manually by creating user-defined function

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter The Decimal Number : ");
//         int decimal = sc.nextInt();
//         int binary = 0;
//         int multiplier = 1;

//         while (decimal != 0) {
//             int remainder = decimal % 2;
//             binary = binary + remainder * multiplier;
//             decimal = decimal / 2;
//             multiplier = multiplier * 10;
//         }

//         System.out.println("Binary: " + binary);
//     }
// }

// ARRAYS

// 1) Write a Program that takes N elements (max. value of N is 100
// and N is the float number specified by user) from user, stores data
// in an array and Calculates the average of those numbers.

// public class One {

//     public static void sumarray(int arr []) {
//         int n = arr.length;
//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum = sum + arr[i];
//         }
//         int Average = sum / n;
//         System.out.println("The Sum is " + sum + " and " + " the length is " + n + " the Avearge is: " + Average);
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,7};
//         sumarray(arr);
//     }
// }

// 2) Write a Program that takes n element from user and displays
// the largest element of an array

// public class One {

//     public static void printarr(int arr []) {
//         int Largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if (arr[i] > Largest) {
//                 Largest = Math.max(Largest, arr[i]);
//             }
//         }
//         System.out.print("The Largest Elemnet is : "+ Largest);
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,7,9};
//         printarr(arr);
//     }
// }

// 3) Write a Program that calculates the standard deviation of 10
// data using arrays

// public class One {

//   public static void standard_deviation(int arr []) {
//     float mean = 0;
//     float n = arr.length;
//     int sum = 0;
//     // Calculate the sum of all elements
//     for(int i=0; i<arr.length; i++){
//       sum += arr[i];
//     }
//     // Calculate the mean
//     mean = sum / n;

//     double variance = 0;
//     // Calculate the squared differences and sum them up
//     for(int i=0; i<arr.length; i++){
//       variance = variance + Math.pow(arr[i] - mean, 2);
//     }
//     // Divide the sum of squared differences by the number of elements to get the variance
//     variance = variance / n;

//     // Take the square root of the variance to get the standard deviation
//     double standardDeviation = Math.sqrt(variance);

//     System.out.println("The Mean : " + mean);
//     System.out.println("The Sum : " + sum);
//     System.out.println("The Variance : " + variance);
//     System.out.println("The Standard Deviation : " + standardDeviation);
//   }

//   public static void main(String[] args) {
//     int arr [] = {1,2,3,4,5,6,7,8,9,10};
//     standard_deviation(arr);
//   }
// }

// 4) Write a Program that takes the array of five element and the
// elements of that array are accessed using pointer.

// import java.util.Scanner;

// public class One {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Declare an array of size 5
//         int[] arr = new int[5];

//         // Input elements into the array
//         System.out.println("Enter 5 elements:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             arr[i] = scanner.nextInt();
//         }

//         // Access elements using indexes
//         System.out.println("\nAccessing elements using indexes:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println("Element " + (i + 1) + ": " + arr[i]);
//         }
//     }
// }

// Multi-dimensional array  

// 5) Write a Program that adds two matrices using Multi-
// dimensional Arrays where the number of rows r and columns c is
// entered by user (Value of r and c < 100)

// import java.util.Scanner;

// public class One {

//   public static void main(String[] args) {
//     int rows = 3;
//     int cols = 3;

//     int [][] matrixA = new int [rows][cols];
//     int [][] matrixB = new int [rows][cols];
//     int [][] matrixresult = new int [rows][cols];

//     Scanner sc = new Scanner(System.in);
// System.out.println("Enter matrix A values: ");
//     for(int i=0; i<rows; i++){
//       for(int j=0; j<cols; j++){
//         matrixA[i][j] = sc.nextInt();
//       }
//     }

// System.out.println("Enter matrix B values: ");
//     for(int i=0; i<rows; i++){
//       for(int j=0; j<cols; j++){
//         matrixB[i][j] = sc.nextInt();
//       }
//     }

//     for(int i=0; i<rows; i++){
//       for(int j=0; j<cols; j++){
//         matrixresult[i][j] = matrixA[i][j] + matrixB[i][j];
//       }
//     }

//     System.out.println("Addtion of Two Matrix: ");
//     for(int i=0; i<rows; i++){
//       for(int j=0; j<cols; j++){
//         System.out.print(matrixresult[i][j]+" ");
//       }
//       System.out.println();
//     }

//   }
// }

// 7) Write a Program that takes a matrix of order r*c from the user
// and computes the transpose of the matrix.
// import java.util.Scanner;

// public class One {

//     public static void transposeMatrix() {
//         // Assuming a square matrix for simplicity
//         int[][] matrix = new int[3][3];
//         int n = matrix.length; // Since it's a square matrix, n is both the number of rows and columns

//         System.out.println("Enter the matrix: ");
//         Scanner sc = new Scanner(System.in);

//         // Input matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Original Matrix:");
//         // Print original matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("Transpose Matrix:");
//         // Print transpose of the matrix
//         // Note: To keep it simple and avoid creating a new matrix, just swap the indices in the print statement
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 // Swap the indices to print the transpose
//                 System.out.print(matrix[j][i] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         transposeMatrix();
//     }
// }
//6 import java.util.Scanner;

// import java.util.Scanner;

// public class One {

//   public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);

//       // Get dimensions of matrices
//       System.out.println("Enter the number of rows for Matrix A:");
//       int rowA = scanner.nextInt();
//       System.out.println("Enter the number of columns for Matrix A:");
//       int colA = scanner.nextInt();
//       System.out.println("Enter the number of rows for Matrix B:");
//       int rowB = scanner.nextInt();
//       System.out.println("Enter the number of columns for Matrix B:");
//       int colB = scanner.nextInt();

//       // Check if matrices can be multiplied
//       if (colA != rowB) {
//           System.out.println("Matrices cannot be multiplied as the number of columns in Matrix A " +
//                   "is not equal to the number of rows in Matrix B.");
//           return;
//       }

//       // Initialize matrices
//       int[][] matrixA = new int[rowA][colA];
//       int[][] matrixB = new int[rowB][colB];
//       int[][] resultMatrix = new int[rowA][colB];

//       // Input elements for Matrix A
//       System.out.println("Enter elements for Matrix A:");
//       inputMatrixElements(matrixA, scanner);

//       // Input elements for Matrix B
//       System.out.println("Enter elements for Matrix B:");
//       inputMatrixElements(matrixB, scanner);

//       // Perform matrix multiplication
//       multiplyMatrices(matrixA, matrixB, resultMatrix);

//       // Display the result
//       System.out.println("Result of matrix multiplication:");
//       displayMatrix(resultMatrix);
//   }

//   // Method to input elements for a matrix
//   private static void inputMatrixElements(int[][] matrix, Scanner scanner) {
//       for (int i = 0; i < matrix.length; i++) {
//           for (int j = 0; j < matrix[0].length; j++) {
//               System.out.println("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]:");
//               matrix[i][j] = scanner.nextInt();
//           }
//       }
//   }

//   // Method to multiply two matrices
//   private static void multiplyMatrices(int[][] matrixA, int[][] matrixB, int[][] resultMatrix) {
//       for (int i = 0; i < matrixA.length; i++) {
//           for (int j = 0; j < matrixB[0].length; j++) {
//               for (int k = 0; k < matrixA[0].length; k++) {
//                   resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
//               }
//           }
//       }
//   }

//   // Method to display a matrix
//   private static void displayMatrix(int[][] matrix) {
//       for (int[] row : matrix) {
//           for (int element : row) {
//               System.out.print(element + " ");
//           }
//           System.out.println();
//       }
//   }
// }

// import java.util.Scanner;

// public class One {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input three integers
//         System.out.println("Enter value of a, b and c respectively:");
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         int c = scanner.nextInt();

//         // Perform cyclic swap using pointers
//         cyclicSwap(a, b, c);

//         // Display the swapped values
//         System.out.println("Value before swapping numbers in cycle:");
//         System.out.println("a=" + a);
//         System.out.println("c=" + c);
//         System.out.println("b=" + b);
//       }

//       // Method to swap three integers in cyclic order using pointers
//       private static void cyclicSwap(int a, int b, int c) {
//         int temp = a;
//         a = c;
//         c = b;
//         b = temp;

//         System.out.println("Value after swapping numbers in cycle:");
//         System.out.println("a=" + a);
//         System.out.println("b=" + b);
//         System.out.println("c=" + c);
//     }
// }

/// Strings 

// 1) Write a Program to Find the Frequency of given Character by
// user in a String

// import java.util.Scanner;

// public class One {

//   public static void frequency(String inpuString , String word) {
//     char wh = word.charAt(0);
//     int counter = 0;
//     for(int i=0; i<inpuString.length(); i++){
//       char ch = inpuString.charAt(i);
//       if (ch == wh) {
//         counter++;
//       }
//     }
//     System.out.println("Frequency of '" + wh + "' in the input string: " + counter);

//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the String : ");
//     String inputString = sc.nextLine();

//     System.out.println("Enter the word u want to search : ");
//     String word = sc.nextLine();
//     frequency(inputString , word);

//   }
// }

// import java.util.Scanner;

// public class One {

//   public static void vowelconsonat(String name) {
//     int whitespaces = 0;
//     int vowels = 0;
//     int Cansonant = 0;
//     int digit = 0;
//     for(int i=0; i<name.length(); i++){
//       char ch = name.charAt(i);
//       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//         vowels++;
//       }
//       else{
//         Cansonant++;
//       }
//       if (Character.isWhitespace(ch)) {
//         whitespaces++;
//       }
//       if (Character.isDigit(ch)) {
//         digit++;
//       }
//     }
//     System.out.println("Vowel : " + vowels);
//     System.out.println("Cansonant : " + Cansonant);
//     System.out.println("WhiteSpaces : " + whitespaces);
//     System.out.println("Digits : " + digit);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the String : ");
//     String name = sc.nextLine();
//     vowelconsonat(name);
//   }
// }

// 3) Write a Program to Remove all Characters in a String Except
// Alphabets.
// Example:
// Enter a string: p2'r"o@gram84iz./
// Output String: programiz

// import java.util.Scanner;

// public class One {

//   public static String Alphabeat(String words) {

//     StringBuilder result = new StringBuilder();

//     for(int i=0; i<words.length(); i++){
//       char ch = words.charAt(i);
//       if (Character.isLetter(ch)) {
//         result.append(ch);
//       }
//     }
//     return result.toString();
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter thr String : ");
//     String words = sc.nextLine(); 
//     String result = Alphabeat(words);
//     System.out.println(result);

//   }
// }

// 4) Write a Program to Find the Length of a String entered by
// user

// import java.util.Scanner;

// public class One {

//   public static void length(String string) {
//     int lenght = string.length();
//     System.out.println("The Length of the dtring is : " + lenght);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     String string = sc.nextLine();
//     length(string);
//   }
// }

// 5) Write a Program to Concatenate (join) Two Strings entered
// by user

// import java.util.Scanner;

// public class One {

//   public static void concat(String first , String second) {
//     String letter = first.concat(second);
//     System.out.println("The concat of " + first + " and " + second + " is " + letter);
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter first word : ");
//     String first = sc.nextLine();
//     System.out.println("Enter second word : ");
//     String second = sc.nextLine();

//     concat(first , second);

//   }
// }

// 6) Write a C++ program to change every letter in a given string
// with the letter following it in the alphabet (ie. a becomes b, p
// becomes q, z becomes a).
// Example:
// Sample Input: Abcdef3
// Sample Output:Bcdefg3

// import java.util.Scanner;

// public class One {

//   public static String Alphabeat(String inputString) {
//     StringBuilder result = new StringBuilder();

//     for (char ch : inputString.toCharArray()) {
//         // Check if the character is an uppercase letter
//         if (ch >= 'A' && ch <= 'Z') {
//             // Change uppercase letters, handling wrap-around from 'Z' to 'A'
//             result.append((char) (((ch - 'A' + 1) % 26) + 'A'));
//         }
//         // Check if the character is a lowercase letter
//         else if (ch >= 'a' && ch <= 'z') {
//             // Change lowercase letters, handling wrap-around from 'z' to 'a'
//             result.append((char) (((ch - 'a' + 1) % 26) + 'a'));
//         }
//         // Keep non-alphabetic characters unchanged
//         else {
//             result.append(ch);
//         }
//     }

//     return result.toString();
// }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the String : ");
//     String inpuString = sc.nextLine();
//     String result = Alphabeat(inpuString);
//     System.out.println(result);
//   }
// }

// 7) Write a C++ program to check if a given string is a
// Palindrome or not.\

// import java.util.Scanner;

// public class One {

// public static boolean palindrome(String name) {
//     int first = 0;
//     int end = name.length()-1;

//     while (first < end) {
//       if (name.charAt(first) != name.charAt(end)) {
//         return false;
//       }
//       first++;
//       end--;
//     }
//     return true;

// }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Name : ");
//     String name = sc.nextLine();

//     if(palindrome(name)){
//       System.out.println("The String is Palindrome");
//     }
//     else{
//       System.out.println("The String is not Palindrome");
//     }

//   }
// }

// 8) Write a C++ program to count all the words in a given
// string.Words must be separated by only one space
// Example:
// Sample Input: Siddharth Singh
// Sample Output: number of words -> 2

// import java.util.Scanner;

// public class One {
//   public static void countWords(String inputString) {
//     int length = inputString.length();
//     int words = 1;

//     if (length == 0) {
//       System.out.println("Please Enter the word ");
//     } else {

//       for (int i = 0; i < inputString.length(); i++) {
//         char ch = inputString.charAt(i);
//         if (Character.isWhitespace(ch)) {
//           words++;
//         }
//       }

//       System.out.println("Number of words: " + words);
//     }
//   }

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     System.out.println("Enter the string:");
//     String inputString = scanner.nextLine();
//     countWords(inputString);
//     scanner.close();
//   }
// }


// 9) Write a C++ program to capitalize the first letter of each
// word of a given string. Words must be separated by only one
// space
// Example:
// Sample Input: cpp string exercises
// Sample Output: Cpp String Exercises

// import java.util.Scanner;

// public class One {

//     public static String capitalizeFirstLetterAfterSpace(String input) {
//         StringBuilder result = new StringBuilder();

//         // Convert the first character of the string to uppercase
//         if (!input.isEmpty()) {
//             result.append(Character.toUpperCase(input.charAt(0)));
//         }

//         // Iterate through each character in the input string
//         for (int i = 1; i < input.length(); i++) {
//             char ch = input.charAt(i);
//             char prevChar = input.charAt(i - 1);

//             // If the previous character is a space, convert the current character to uppercase
//             if (prevChar == ' ') {
//                 result.append(Character.toUpperCase(ch));
//             } else {
//                 result.append(ch);
//             }
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the String:");
//         String inputString = scanner.nextLine();

//         String result = capitalizeFirstLetterAfterSpace(inputString);
//         System.out.println("Result: " + result);

//         scanner.close();
//     }
// }


// 10) Write a C++ program to find the largest word in a given
// String.
// Example:
// Sample Input: C++ is a general-purpose programming language.
// Sample Output: programming

// import java.util.Scanner;

// public class One {

//   public static String largest(String word) {
//     String largestword = "";
//     String currentword = "";

//     for(int i=0; i<word.length(); i++){
//       char ch = word.charAt(i);
//       if (Character.isLetterOrDigit(ch)) {
//         currentword += ch;
//       }
//       else {
//         if (currentword.length() > largestword.length()) {
//           largestword = currentword;
//         }
//         currentword = "";
//       }
//     }
//     // if (currentword.length() > largestword.length()) {
//     //   largestword = currentword;
//     // }
//     return largestword;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the String : ");
//     String word = sc.nextLine();
//     System.out.println("The Largest word is " + largest(word));
//   }
// }



// Recursion 

// 1) Write a Program to Find Sum of N Natural Numbers
// (entered by users) using Recursion

// import java.util.Scanner;

// public class One {

//   public static int sum_of_natural(int number) {
//     // Base case 
//     if (number == 1) {
//       return 1;
//     }
//     int result = number + sum_of_natural( number - 1);
//     return result;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();
//     System.out.println("The Sum of Natural number if " + sum_of_natural(number));
//   }
// }


// 2) Write a Program to Calculate Factorial of a Number Using
// Recursion

// import java.util.Scanner;

// public class One {

//   public static int Factorial(int number) {
//     if (number == 1) {
//       return 1;
//     }

//     int result = number * Factorial(number - 1);
//     return result;
//   }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     int number = sc.nextInt();

//     System.out.println("The factorial is : " + Factorial(number));
//   }
// }


// 3) Write a Program to Find G.C.D of two numbers entered by
// user Using Recursion

public class One {
  public static int gcd(int a, int b) {

      // Base case: if b is 0, return a
      
      if (b == 0) {
          return a;
      }

      // Recursive case: return gcd(b, a % b)

      return gcd(b, a % b);
  }

  public static void main(String[] args) {
      int num1 = 24;
      int num2 = 36;

      // Calculate GCD
      int result = gcd(num1, num2);

      System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
  }
}



// 4) Write a Program that calculates the power of a number
// using recursion where base and exponent is entered by the
// user.

// import java.util.Scanner;

// public class One {

//     // Recursive method to calculate power
//     public static long power(int base, int exponent) {
//         // Base case: any number to the power of 0 is 1
//         if (exponent == 0) {
//             return 1;
//         }
//         // Recursive step: multiply the base with the result of base raised to the power of (exponent - 1)
//         return base * power(base, exponent - 1);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter the base
//         System.out.print("Enter the base: ");
//         int base = scanner.nextInt();

//         // Prompt the user to enter the exponent
//         System.out.print("Enter the exponent: ");
//         int exponent = scanner.nextInt();

//         // Calculate the power
//         long result = power(base, exponent);

//         // Display the result
//         System.out.println(base + " raised to the power of " + exponent + " is: " + result);
//     }
// }

