// Find the largest element from the array
// public class Arrays {
//     public static int largestnum( int arr []) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }
//         return largest;

//     }
//     public static void main(String[] args) {
//         int arr[] = {1,6,4,8,2,7,3,9};
//         System.out.println(largestnum(arr));
//     }
// }

// // 2-  find the second largest and second smallest num from array

// public class Arrays {

//     public static void secondlargest(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         int secondlarge = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 secondlarge = largest;
//                 largest = arr[i];
//             }
//             }

//             System.out.println(largest);
//             System.out.println(secondlarge);
//         // return secondlarge;
//     }

//     public static void secondsmallest(int arr[]) {
//         int small = Integer.MAX_VALUE;
//         int secondsmall = Integer.MAX_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] < small) {
//                 secondsmall = small;
//                 small = arr[i];
//             }
//         }
//         System.out.println();
//         System.out.println(small);
//         System.out.println(secondsmall);
//         // return secondsmall;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 8, 4, 1, 7, 3, 6, 9 };
//         secondlargest(arr);
//         secondsmallest(arr);
//     }
// }

// Question mo 4
// public class Arrays {

//     public static int checksorted(int arr []) {
//         for(int i=1; i<arr.length; i++){
//             if (arr[i] >= arr[i-1]) {

//             }
//             else{
//                 return 0;
//             }
//         }
//         return 1;
//     }

//     public static void main(String[] args) {
//         int arr [] = {0,0,0,1};
//         System.out.println(checksorted(arr));
//     }
// }

// Question 4

// public class Arrays {

//     public static int duplicates(int arr []) {
//         int i = 0;
//         for(int j=0; j<arr.length; j++){
//             if (arr[i] != arr[j]) {
//                 arr[i+1] = arr[j];
//                 i++;
//             }
//         }
//         return i+1;
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,1,2,2,3,3,4,4};
//         duplicates(arr);
//     }
// }

// Question - 05

// public class Arrays {

//     public static void leftrotate(int arr[]) {
//         int n = arr.length;
//         int temp = arr[0];
//         for (int i = 1; i < n; i++) {
//             arr[i - 1] = arr[i];
//         }
//         arr[n - 1] = temp;
//     }

//     public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6};
//         leftrotate(arr);
//         printarr(arr);
//     }
// }

// Question - 6  = Left roatated by D places 

// import java.util.Scanner;

// public class Arrays {

// public static void leftrotate_d(int arr [] , int n , int d) {
//     d = d % n;
//     int temp [] = new int [d];
//     for(int i=0; i<d; i++){
//         temp[i] = arr[i];
//     }
//     for(int i=d; i<n; i++){
//         arr[i-d] = arr[i];
//     }
//     for(int i = n -d; i<n; i++){
//         arr[i] = temp[i-(n-d)];
//     }
// }
//     public static void reverse(int arr [] , int start , int end) {
//         // int start = 0;
//         // int end = arr.length-1;
//         while (start <= end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void leftrotate_recursion(int arr [] , int n , int d) {
//         if ( n == 0) {
//             return;
//         }
//         d = d % n;
//         // step 11
//              reverse(arr , 0 , d - 1); 
//         // step 2
//         reverse(arr, d, n - 1);
//         // step 3 ;
//         reverse(arr, 0, n - 1);
//     }

//     public static void printagain(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9};
//         Scanner sc = new Scanner(System.in);
//         int n = arr.length;
//         int d = sc.nextInt();
//         // leftrotate_d(arr, n, d);
//         leftrotate_recursion(arr, n, d);
//         printagain(arr);
//     }
// }

// Moves Zeros to end 

// public class Arrays {

//     public static void moveszero(int arr[]) {
//         int l = arr.length;
//         int temp [] = new int [l];
//         int nonzero = 0;
//         for(int i=0; i<l; i++){
//             if (arr[i] != 0) {
//                 temp[nonzero++] = arr[i];
//             }
//         }
//         for(int i=0; i<temp.length; i++){
//             System.out.print(temp[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,0,2,3,0,4,0,5,6};
//         moveszero(arr);
//     }
// }

// // Linear Search 
// public class Arrays {

//     public static void linersearch(int arr [] , int key) {
//         for(int i=0; i<arr.length-1; i++){
//             if (arr[i] == key) {
//                 System.out.println("The Key Exists");
//                 return;
//                 // break;
//             }
//         }
//         System.out.println("The Key is not Exists");
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         linersearch(arr, 10);
//     }
// }

// Union of two sorted arrays 

// Two pointers Approch for optmized solution
// public class Arrays {

//     public static void Union(int arr1 [] , int arr2 []) {
//         int a1 = arr1.length;
//         int a2 = arr2.length;
//         int i = 0 , j = 0;
//         while (i <a1 && j < a2) {
//             if (arr1[i] < arr2[j]) {
//                 System.out.print(arr1[i]+" ");
//                 i++;
//             }
//             else if (arr2[j] < arr1[i]) {
//                 System.out.print(arr2[j]+" ");
//                 j++;
//             }
//             else {
//                 System.out.print(arr1[i]+" ");
//                 i++;
//                 j++;
//             }

//         }
//         while ( i < a1) {
//             System.out.print(arr1[i]+" ");
//             i++;
//         }
//         while ( j < a2) {
//             System.out.print(arr2[j]+" ");
//             j++;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
// int arr1 [] = {1,3,4,5,7};
// int arr2 [] = {2,3,5,6};
//         System.out.println("Union of two sorted arrays:");
//         Union(arr1, arr2);
//     }
// }

// Intersection

// public class Arrays {

//     public static void Intersection(int arr1 [] , int arr2 []) {
//         int a1 = arr1.length;
//         int a2 = arr2.length;
//         int i = 0 , j = 0;

//         while (i < a1 && j < a2) {
//             if (arr1[i] < arr2[j]) {
//                 i++;
//             }
//             else if (arr2[j] < arr1[i]) {
//                 j++;
//             }
//             else{
//                 System.out.print(arr1[i]+" ");
//                 i++;
//                 j++;
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
// int arr1[] = {1,2,3,4,5,6,7};
// int arr2[] = {2,4,6,7};
//         Intersection(arr1, arr2);
//     }
// }

// public class Arrays {

//     public static void Intersection(int arr1 [] , int arr2 []) {
//         int a1 = arr1.length;
//         int a2 = arr2.length;
//         int i = 0;
//         int j = 0;
//         while ( i < a1 && j < a2) {
//             if (arr1[i] < arr2[j]) {
//                 i++;
//             }
//             else if (arr2[j] < arr1[i]) {
//                 j++;
//             }
//             else{
//                 System.out.print(arr1[i]+" ");
//                 i++;
//                 j++;
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr1[] = {1,2,3,4,5,6,7};
//         int arr2[] = {2,4,6,7};
//         Intersection(arr1, arr2);
//         }
// }

/////////////////////////-----Striver-----Arrray--------------3-----------------///////////////////////////////////

// / Find The Missing Number 

// public class Arrays {
//     public static int findMissingNumber(int[] nums) {
//         int xor1 = 0;
//         int xor2 = 0;

//         // XOR all numbers from 0 to n
//         for (int i = 0; i <= nums.length; i++) {
//             xor1 = xor1 ^ i;
//         }

//         // XOR all numbers in the array
//         for (int i =0; i<nums.length; i++) {
//             xor2 = xor2 ^ nums[i];
//         }

//         // The result will be the missing number
//         return xor1 ^ xor2;
//     }

//     public static void main(String[] args) {
//         int[] nums = {3, 0, 1, 4, 6, 2};
//         int missingNumber = findMissingNumber(nums);
//         System.out.println("The missing number is: " + missingNumber);
//     }
// }

// Maximum COnsecutive ones 

// public class Arrays {

//     public static void MaxConsecutive(int arr []) {
//         int max = 0;
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if (arr[i] == 1) {
//                 count++;
//                 max = Math.max(max, count);
//             }
//             else{
//                 count = 0;
//             }
//         }
//         System.out.println(max);
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,1,0,1,1,1,0,1,1,1,1,1};
//         MaxConsecutive(arr);
//     }
// }

// Find the number that appears once, and the other numbers twice
// public class Arrays {
//     public static int findSingleNumber(int[] nums) {
//         int result = 0;

//         // XOR all numbers in the array
//         for (int i=0; i<nums.length; i++) {
//             result = result ^ nums[i] ;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1,1,2,2,3,3,4};
//         int singleNumber = findSingleNumber(nums);
//         System.out.println("The number that appears once is: " + singleNumber);
//     }
// }

// Largest
// public class Arrays {
//         public static int largest(int arr []) {
//                 int large = Integer.MIN_VALUE;
//                 for(int i=0; i<arr.length; i++){
//                         if (arr[i] > large) {
//                                 large = arr[i];
//                         }
//                 }
//                 return large;
//         }

//         public static void main(String[] args) {
// int arr [] = {1,2,3,10,5,6,7,8,9};
//                 System.out.println("The largest Number " + largest(arr));
//         }
// }

//Second_Largest

// public class Arrays {

//         public static void seclarge(int arr[]) {
//                 int large = Integer.MIN_VALUE;
//                 int secondlarge = Integer.MIN_VALUE;
//                 for(int i=0; i<arr.length; i++){
//                         if (arr[i] > large) {
//                                 secondlarge = large;
//                                 large = arr[i];
//                         }
//                 }
//                 System.out.println(large);
//                 System.out.println(secondlarge);
//         }

//         public static void main(String[] args) {
// int arr [] = {1,2,3,4,5,6,7,8,9};
//                 seclarge(arr);
//         }
// }

// public class Arrays {

//         public static void secondsmallest(int arr []) {
//                 int small = Integer.MAX_VALUE;
//                 int secondsmall = Integer.MAX_VALUE;
//                 for(int i=0; i<arr.length; i++){
//                         if (arr[i] < small) {
//                                 secondsmall = small;
//                                 small = arr[i];
//                         }
//                 }
//                 System.out.println(small);
//                 System.out.println(secondsmall);

//         }

//         public static void main(String[] args) {
// int arr[] = {2,3,1,4,5,6,7,8,9};
//                 secondsmallest(arr);
//         }
// }

//  reversed array

// public class Arrays {

//         public static void reversearray(int arr[] , int start , int last) {
//                 while (start < last) {
//                         int temp = arr[start];
//                         arr[start] = arr[last];
//                         arr[last] = temp;
//                         start++;
//                         last--;
//                 }
//         }
//         public static void printarr(int arr []){
//                 for(int i=0; i<arr.length; i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String[] args) {
//                 int arr[] = {2,3,1,4,5,6,7,8,9};
//                 reversearray(arr, 0, arr.length-1);
//                 printarr(arr);
//         }
// }

// check the array is sorted 

// public class Arrays {

//         public static boolean checksorted(int arr []) {
//                 for(int i=0; i<arr.length-1; i++){
//                         if (arr[i] < arr[i+1]) {

//                         }
//                         else{
//                                 return false;
//                         }
//                 }
//                 return true;
//         }

//         public static void main(String[] args) {
//                 int arr [] = {1,2,3,4,5,6,7,8,9};
//                 System.out.println(checksorted(arr));
//         }
// }

// Maximum consucutive once

// public class Arrays {

//         public static void max_consucutive(int arr []) {
//                 int count = 0;
//                 for(int i=0; i<arr.length; i++){
//                         if (arr[i] == 1) {
//                                 count++;
//                         }
//                         else{
//                                 count = 0;
//                         }
//                 }
//                 System.out.println(count);
//         }

//         public static void main(String[] args) {
//                 int arr [] = {0,0,1,1,1,0,0,0,1,1,1,1,0,0,1,1,1,1,1};
//                 max_consucutive(arr);
//         }
// }

//  moves all  zeros to end 

// public class Arrays {

//         public static void moves_end(int arr[]) {
//                 int l = arr.length;
//                 int temp [] = new int[l];
//                 int nonzero = 0;
//                 for(int i=0; i<arr.length; i++){
//                         if (arr[i] != 0) {
//                                 temp[nonzero++] = arr[i];
//                         }
//                 }
//                 for(int i=0; i<temp.length; i++){
//                         System.out.print(temp[i]+" ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String[] args) {
// int arr [] = {1,0,2,3,4,0,5,0,6,7,8};
//                 moves_end(arr);
//         }
// }

// Linenar Search

// public class Arrays {

//         public static void Linenar(int arr [] , int key) {
//                 for(int i=0; i<arr.length; i++){
//                         if (arr[i] == key) {
//                                 System.out.println("Key is found at " + i + " index");
//                                 break;
//                         }
//                 }
//         }

//         public static void main(String[] args) {
//                 int arr [] = {1,0,2,3,4,0,5,0,6,7,8};
//                 Linenar(arr , 4);
//         }
// }

// Left Rotate array by one place

// public class Arrays {

//         public static void leftrotate(int arr []) {
//                 int l = arr.length;
//                 int temp = arr[0];
//                 for(int i=1; i<arr.length; i++){
//                         arr[i-1] = arr[i];
//                 }
//                 arr[l - 1] = temp;
//         }

//         public static void printagain(int arr []) {
//                 for(int i=0; i<arr.length; i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String[] args) {
//                 int arr [] = {1,2,3,4,5,6,7,8,9};
//                 leftrotate(arr);
//                 printagain(arr);
//         }
// } 

// public class Arrays {

//         public static void leftrotate_d(int arr [] , int d) {
//                 int n = arr.length;
//                 d = d % n;
//                 int temp [] = new int [d];

//                 // Adding the numbers in the temp array which have to rotate
//                 for(int i=0; i<d; i++){
//                         temp[i] = arr[i];
//                 }
// // Adding elements from d to n;
//                 for(int i = d; i<n; i++){
//                         arr[i-d] = arr[i];
//                 }
// // Adding temproray elements from n-d to n 
//                 for(int i = n - d; i<n; i++){
//                         arr[i] = temp[i-(n-d)];
//                 }
//         }

//         public static void printarr(int arr []) {
//                 for(int i=0; i<arr.length; i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String[] args) {
//                 int arr [] = {1,2,3,4,5,6,7,8,9};
//                 leftrotate_d(arr , 3);
//                 printarr(arr);
//         }
// }

// public class Arrays {

//         public static void Intersection(int arr [] , int arr1 []) {
//                 int a = arr.length;
//                 int a1 = arr1.length;
//                 int i = 0;
//                 int j = 0;
//                 while (i < a && j < a1) {
//                         if (arr[i] < arr1[j]) {
//                                 // System.out.print(arr[i]+" ");
//                                 i++;
//                         }
//                         else if (arr1[j] < arr[i]) {
//                                 // System.out.print(arr1[j]+" ");
//                                 j++;
//                         }
//                         else{
//                                 System.out.print(arr[i]+" ");
//                                 i++;
//                                 j++;
//                         }
//                 }
//                 System.out.println();
//         }

//         public static void main(String[] args){
// int arr[] = {1,2,3,4,5,6,7};
// int arr1[] = {2,4,6,7};
//                 Intersection(arr , arr1);
//         }
// }

// public class Arrays {

//         public static void Union(int arr [] , int arr1 []) {
//                 int a1 = arr.length;
//                 int a2 = arr1.length;
//                 int i = 0;
//                 int j = 0;
//                 while ( i < a1 && j < a2) {
//                         if (arr[i] < arr1[j]) {
//                                 System.out.print(arr[i]+" ");
//                                 i++;
//                         }
//                         else if (arr1[j] < arr[i]) {
//                                 System.out.print(arr1[j]+" ");
//                                 j++;
//                         }
//                         else{
//                                 System.out.print(arr[i]+" ");
//                                 i++;
//                                 j++;

//                         }
//                 }
//                 while (i < a1) {
//                         System.out.print(arr[i]+" ");
//                 }
//                 while (j < a2) {
//                         System.out.print(arr1[j]+" ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String[] args) {
//                 int arr[] = {1,2,3,4,5,6,7};
//                 int arr1[] = {2,4,6,7}; 
//                 Union(arr , arr1);
//         }
// }

// public class Arrays {

//         public static int missingNumber(int arr []) {
//                 int n = arr.length+1;
//                 int sum = n * (n + 1) / 2;
//                 int arrsum = 0;
//                 for(int i=0; i<arr.length; i++){
//                         arrsum += arr[i];
//                 }
//                 return sum - arrsum;
//                 // int missingnum = sum 
//         }

//         public static void main(String[] args) {
//                 int arr [] = {1,2,4,5,6};
//                 System.out.println(missingNumber(arr));

//         }
// }

// public class Arrays {

//         public static int longestsubarray(int arr[] , int k) {
//                 int maxlength = 0;
//                 for(int i=0; i<arr.length; i++){
//                         int sum = 0;
//                         for(int j=i; j<arr.length; j++){
//                                 sum += arr[j];
//                                 if (sum == k) {
//                                         maxlength = Math.max(maxlength, j-i+1);
//                                 }
//                         }
//                 }
//                 return maxlength;
//         }

//         public static void main(String[] args) {
//                 int arr [] = {1,1,2,3,4,1,1,1,1,2,1};
//                 int k = 5;
//                 System.out.println(longestsubarray(arr, k));
//         }
// }

// for better and optimal you should know the hashmap

///// Array Mediums Questions

// Question = 1 (sum of two elements either return yes or no or return i,j index)

// Brute
// public class Arrays {

//         public static boolean sum_2(int arr[] , int key) {
//                 for(int i=0; i<arr.length; i++){
//                         for(int j=0; j<arr.length; j++){
//                                 if (arr[i] + arr[j] == key) {
//                                         return true;
//                                 }
//                         }
//                 }
//                 return false;
//         }

//         public static void main(String[] args) {
//                 int arr [] = {2,5,6,8,11};
//                 int key = 14;
//                 if (sum_2(arr, key)) {
//                         System.out.println("YES");
//                 }
//                 else{
//                         System.out.println("NO");
//                 }
//         }
// }

//Better
// Required Hashmap 

// Optimal solution

// public class Arrays {

//         public static boolean sum_2_optimal(int arr[] , int key) {
//                 int left = 0;
//                 int right = arr.length-1;
//                 while (left <= right) {
//                         int sum = arr[left] + arr[right];
//                         if (sum == key) {
//                                 return true;
//                         }
//                         else if (sum < key) {
//                                 left++;
//                         }
//                         else{
//                                 right--;

//                         }
//                 }
//                 return false;
//         }

//         public static void main(String[] args) {
//                 int arr [] = {2,5,6,8,11};
//                 int key = 14;    
//                 if (sum_2_optimal(arr, key)) {
//                     System.out.println("Yes");    
//                 }
//                 else{
//                         System.out.println("No");
//                 }
//         }
// }

// Sort an Array 0'S and 1'S and 2'S

// public class Arrays {

//         public static void swap(int[] arr, int i, int j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }

//         public static void sortArray(int[] arr) {
//             int low = 0;
//             int mid = 0;
//             int high = arr.length - 1;
//             while (mid <= high) {
//                 if (arr[mid] == 0) {
//                     swap(arr, low, mid);
//                     low++;
//                     mid++;
//                 } else if (arr[mid] == 1) {
//                     mid++;
//                 } else {
//                     swap(arr, mid, high);
//                     high--;
//                 }
//             }
//         }

//         public static void printArray(int[] arr) {
//             for (int i = 0; i < arr.length; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//         }

//         public static void main(String[] args) {
//             int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
//             sortArray(arr);
//             printArray(arr);
//         }
//     }

// public class Arrays {

//         public static int majorityelement(int arr []) {
//                 int n = arr.length;
//                 int count = 0;
//                 int element = 0;
//                 for(int i=0; i<n; i++){
//                         if (count == 0) {
//                                 count = 1;
//                                 element = arr[i];
//                         }
//                         else if (arr[i] == element) {
//                                 count++;
//                         }
//                         else {
//                                 count--;
//                         }
//                 }

//                 int count1 = 0;
//                 for(int i=0; i<n; i++){
//                         if (arr[i] == element) {
//                                count1++; 
//                         }
//                 }
//                 if (count1 > (n/2)) {
//                         return element;
//                 }
//                 return -1;
//         }

//         public static void main(String[] args) {
//                 int arr [] = {7,7,5,1,7,5,1,5,5,5,5};
//                 System.out.println(majorityelement(arr));
//         }
// }

// Kadanes Algorithms 

// Brute

// public class Arrays {

//         public static void Kadanesalgo(int arr []) {
//                 int n = arr.length;
//                 int maxsum = Integer.MIN_VALUE;
//                 for(int i=0; i<n; i++){
//                         for(int j=i; j<n; j++){
//                                 int sum = 0;
//                                 for(int k=i; k<=j; k++){
//                                         sum += arr[k];
//                                         maxsum = Math.max(maxsum, sum);
//                                 }
//                         }
//                 }
//                 System.out.println(maxsum);
//         }

//         public static void main(String[] args) {
// int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//                 Kadanesalgo(arr);

//         }
// }

// Better solution 

// public class Arrays {

//         public static void Kadanesalgo(int arr []) {
//                 int n = arr.length;
//                 int maxsum = Integer.MIN_VALUE;
//                 for(int i=0; i<n; i++){
//                         int sum =0;
//                         for(int j=i; j<n; j++){
//                                 sum += arr[j];
//                                 maxsum = Math.max(maxsum, sum);
//                         }
//                 }
//                 System.out.println(maxsum);
//         }

//         public static void main(String[] args) {
//                 int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//                 Kadanesalgo(arr);

//         }
// }

// Optimal Approch
// public class Arrays {

//         public static void Kadanesalgo(int arr[]) {
//                 int n = arr.length;
//                 int maxsum = Integer.MIN_VALUE;
//                 int sum = 0;
//                 for (int i = 0; i < n; i++) {
//                         sum += arr[i];
//                         if (sum < 0) {
//                                 sum = 0;
//                         }
//                         if (sum > maxsum) {
//                                 maxsum = Math.max(maxsum, sum);
//                         }

//                 }
//                 System.out.println(maxsum);
//         }

//         public static void main(String[] args) {
//                 int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//                 Kadanesalgo(arr);
//         }
// }

// Kadane’s Algorithm : Maximum Subarray Sum in an Array
// public class Arrays {

//         public static void printmaxsubarray(int arr[]) {
//                 int n = arr.length;
//                 int sum = 0;
//                 int maxsum = Integer.MIN_VALUE;
//                 int start = 0;
//                 int end = 0;
//                 int tempStart = 0;

//                 for(int i=0; i<n; i++){
//                         sum += arr[i];
//                         if (sum < 0) {
//                                 sum =  0;
//                                 tempStart = i + 1;
//                         }
//                         if (sum > maxsum) {
//                                 maxsum = sum;
//                                 start = tempStart;
//                                 end = i;
//                         }
//                 }
//                 System.out.println("Maximum Sum: " + maxsum);
//                 for(int i=start; i<=end; i++){
//                         System.out.print(arr[i]+" ");
//                 }
//                 System.out.println();
//         }

//         public static void main(String[] args) {
//                 int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//                 printmaxsubarray(arr);
//         }
// }

// Rearrange Array Elements by Sign

// public class Arrays {

//     public static void Rearrange(int arr []) {
//         int n = arr.length;
//         int postitiveindex = 0;
//         int negativeindex = 1;
//         int ans[] = new int[n];
//         for(int i=0; i<n; i++){
//             if (arr[i] < 0) {
//                 ans[negativeindex] = arr[i];
//                 negativeindex += 2;
//             }
//             else{
//                 ans[postitiveindex] = arr[i];    
//                 postitiveindex += 2;
//             }
//         }
//         for(int i=0; i<ans.length; i++){
//             System.out.print(ans[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr [] = {3,1,-2,-5,2,-4};
//         Rearrange(arr);
//     }
// }

// Leader n Array 
// public class Arrays {

//     public static void Leaders(int arr []) {
//         int n = arr.length;
//         int maxsum = arr[n-1];
//         System.out.println(maxsum+" ");
//         for(int i=n-2; i>=0; i--){
//             if (arr[i] > maxsum) {
//                 maxsum = arr[i];
//                 System.out.println(maxsum+" ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr [] = {10,22,12,3,0,6};
//         Leaders(arr);
//     }
// }

// Longest Consecutive Sequence 
// Brute force approch

// import java.util.*;

// public class Arrays {
//     public static boolean linearSearch(int []a, int num) {
//         int n = a.length; //size of array
//         for (int i = 0; i < n; i++) {
//             if (a[i] == num)
//                 return true;
//         }
//         return false;
//     }
//     public static int longestSuccessiveElements(int []a) {
//         int n = a.length; //size of array
//         int longest = 1;
//         //pick a element and search for its
//         //consecutive numbers:
//         for (int i = 0; i < n; i++) {
//             int x = a[i];
//             int cnt = 1;
//             //search for consecutive numbers
//             //using linear search:
//             while (linearSearch(a, x+1) == true) {
//                 x++;
//                 cnt++;
//             }

//             longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
// int[] a = {100, 200, 1, 2, 3, 4};
//         int ans = longestSuccessiveElements(a);
//         System.out.println("The longest consecutive sequence is " + ans);
//     }
// }

// public class Arrays {

//     public static boolean linearSearch(int arr [] ,int num) {
//         for(int i=0; i<arr.length; i++){
//             if (arr[i] == num) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static int longconsecutive(int arr []) {
//         int n = arr.length;
//         int x;
//         int longest = 1;
//         for(int i=0; i<n; i++){
//             int count = 1;
//             x = arr[i];
//             while (linearSearch(arr , x+1) == true) {
//                 x++;
//                 count++;
//             }
//             longest = Math.max(longest, count);
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 100, 101, 101, 102};
//         System.out.println(longconsecutive(arr));
//     }
// }

// Longest Consecutive Sequence 
// Better Approch

// public class Arrays {

//     public static int longconsecutive(int arr[]) {
//         int n = arr.length;
//         int lastsmaller = Integer.MIN_VALUE;
//         int count = 0;
//         int longest = 1;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] - 1 == lastsmaller) {
//                 count++;
//             } else if (lastsmaller != arr[i]) {
//                 count = 1;
//             }
//             longest = Math.max(longest, count);
//             lastsmaller = arr[i];
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
// int arr[] = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 100, 101, 101, 102};
//         System.out.println(longconsecutive(arr));
//     }
// }

// optimal approch

// import java.util.*;

// public class Arrays {
//     public static int longestSuccessiveElements(int[] a) {
//         int n = a.length;
//         if (n == 0)
//             return 0;

//         int longest = 1;
//         Set<Integer> set = new HashSet<>();

//         // put all the array elements into set
//         for (int i = 0; i < n; i++) {
//             set.add(a[i]);
//         }

//         // Find the longest sequence
//         for (int it : set) {
//             // if 'it' is a starting number
//             if (!set.contains(it - 1)) {
//                 // find consecutive numbers
//                 int cnt = 1;
//                 int x = it;
//                 while (set.contains(x + 1)) {
//                     x = x + 1;
//                     cnt = cnt + 1;
//                 }
//                 longest = Math.max(longest, cnt);
//             }
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int[] a = {100, 200, 1, 2, 3, 4};
//         int ans = longestSuccessiveElements(a);
//         System.out.println("The longest consecutive sequence is " + ans);
//     }
// }

// Set Matrix Zero

//Rotate Image by 90 degree

// public class Arrays {

//         public static void roatatedmatrix(int matrix[][]) {
//                 int rows = matrix.length;
//                 int cols = matrix[0].length;
//                 int roatatematrix[][] = new int[rows][cols];

//                 for (int i = 0; i < rows; i++) {
//                         for (int j = 0; j < cols; j++) {
//                                 roatatematrix[j][rows - i - 1] = matrix[i][j];
//                         }
//                 }

//                 System.out.println("Rotated Matrix :");

//                 for (int i = 0; i < roatatematrix.length; i++) {
//                         for (int j = 0; j < roatatematrix[0].length; j++) {
//                                 System.out.print(roatatematrix[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//         }

//         public static void main(String[] args) {
//                 int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//                 System.out.println("Original Matrix :");
//                 for (int i = 0; i < matrix.length; i++) {
//                         for (int j = 0; j < matrix[0].length; j++) {
//                                 System.out.print(matrix[i][j] + " ");
//                         }
//                         System.out.println();
//                 }

//                 roatatedmatrix(matrix);

//         }

// }

// optimal Approch

// public class Arrays {
//         public static void rotateMatrixOptimal(int[][] matrix) {
//             int n = matrix.length;
//             // Transpose the matrix
//             for (int i = 0; i < n; i++) {
//                 for (int j = i; j < n; j++) {
//                     int temp = matrix[i][j];
//                     matrix[i][j] = matrix[j][i];
//                     matrix[j][i] = temp;
//                 }
//             }
//             // Reverse each row
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n / 2; j++) {
//                     int temp = matrix[i][j];
//                     matrix[i][j] = matrix[i][n - j - 1];
//                     matrix[i][n - j - 1] = temp;
//                 }
//             }
//         }

//         public static void printMatrix(int[][] matrix) {
//             for(int i=0; i<matrix.length; i++){
//                 for(int j=0; j<matrix[0].length; j++){
//                         System.out.print(matrix[i][j]+" ");
//             }   
//                 System.out.println();
//             }
//         }

//         public static void main(String[] args) {
//             int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//             System.out.println("Original Matrix:");
//             printMatrix(matrix);

//             rotateMatrixOptimal(matrix);

//             System.out.println("\nMatrix after rotating by 90 degrees:");
//             printMatrix(matrix);
//         }
//     }

// public class Arrays {

//         public static void reversedmatrix(int matrix[][]) {
//                 int row = matrix.length;
//                 int col = matrix[0].length;
//                 int [][] rotate = new int [row][col];
// for(int i=0; i<row; i++){
//         for(int j=0; j<col; j++){
//                 rotate[row - i - 1][j] = matrix[i][j];
//         }
// }
//                 for(int i=0; i<rotate.length; i++){
//                         for(int j=0; j<rotate[0].length; j++){
//                                 System.out.print(rotate[i][j]+" ");
//                         }
//                         System.out.println();
//                 }
//         }

//         public static void main(String[] args) {
// int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//                 reversedmatrix(matrix);
//         }
// }

// Spiral Matrix
// public class Arrays {

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
//                 System.out.print(matrix[startcol][i] + " ");
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

// Count Subarray sum Equals K
// Brute-Force Approch
// public class Arrays {

//     public static void countSubarrayK(int arr [] , int key) {
//         int count = 0;
//             for(int i=0; i<arr.length; i++){
//                 for(int j=i; j<arr.length; j++){
//                     int sum = 0;
//                     for(int k=i; k<j; k++){
//                         sum += arr[k];
//                     }
//                     if (sum == key) {
//                         count++;
//                     }
//                 }
//             }
//             System.out.println(count);
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         int key = 3;
//         countSubarrayK(arr , key);
//     }
// }

// public class Arrays {

//     // public static boolean checksorted(int nums[]) {
//     //     int n = nums.length-1;
//     //     for(int i=0; i<n; i++){
//     //         if (nums[i] > nums[i+1]) {
//     //             return false;
//     //         }
//     //     }
//     //     return true;
//     // }

//     public static void roatated(int nums []) {
//         int n = nums.length;
//         for(int i=0; i<n-1; i++){
//             if (nums[i] > nums[i+1]) {
//                 System.out.println(nums[i]);
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int nums [] = {3,4,5,1,2};
//         roatated(nums);
//         // System.out.println(checksorted(nums));

//     }
// }

// public class Arrays {

//     public static boolean checksorted(int nums[]) {
//         int n = nums.length-1;
//         boolean sorted = true;
//         for(int i=0; i<n; i++){
//             if (nums[i] > nums[i+1]) {
//                 sorted = false;
//                 break;
//             }
//         }
//         if (sorted) {
//             return true;
//         }
//         int rotatepoint = -1;
//         for(int i=0; i<n; i++){
//             if (nums[i] > nums[i+1]) {
//                 rotatepoint = i + 1;
//                 break;
//             }
//         }

//         int rotatedarray[] = new int [n];
//         for(int i=0; i<n; i++){
//             rotatedarray[i] = nums[(i + rotatepoint) % n];
//         }

//         sorted = true;
//         for(int j=0; j<n-1; j++){
//             if (rotatedarray[j] > rotatedarray[j+1]) {
//                 sorted = false;
//                 break;
//             }
//         }

//         return sorted;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 1, 3, 4};
//         System.out.println(checksorted(nums));
//     }
// }

// public class Arrays {

//     public static void ByDplaces(int nums[], int k) {
//         int n = nums.length;
//         int d = k % n;
//         int temp[] = new int[d];
//         int m = 0;

//         // Copy the last d elements to temp
//         for (int i = n - d; i < n; i++) {
//             temp[m++] = nums[i];
//         }

//         // // Shift the first n-d elements to the right
//         // for (int i = n - 1; i >= d; i--) {
//         //     nums[i] = nums[i - d];
//         // }

//         // // Copy elements from temp to the beginning of nums
//         // for (int i = 0; i < d; i++) {
//         //     nums[i] = temp[i];
//         // }

//         for(int i=n-1; i >= d; i--){
//             nums[i] = nums[i - d];
//         }

//         for(int i=0; i<d; i++){
//             nums[i] = temp[i];
//         }

//         // Print the rotated array
//         for (int i = 0; i < n; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
//         int k = 3;
//         ByDplaces(nums, k);
//         // Output: [5,6,7,1,2,3,4]
//     }
// }



// public class Arrays {

//     public static void moveszero_end(int nums []) {
//         int n = nums.length;
//         // int temp [] = new int[n];
//         int non_zero = 0;
//         for(int i=0; i<n; i++){
//             if (nums[i] != 0) {
//                 nums[non_zero++] = nums[i];
//             }
//         }

//         while (non_zero < n) {
//             nums[non_zero++] = 0;
//         }

//         for(int i=0; i<nums.length; i++){
//             System.out.print(nums[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int nums [] = {0,1,0,3,12};
//         moveszero_end(nums);
//     }
// }


// 

