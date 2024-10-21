// import java.util.*;

// public class arrays {
//     public static void main(String args[]) {
//         int marks[] = new int[50];
//         Scanner sc = new Scanner(System.in);
//          marks[0] = sc.nextInt();
//          marks[1] = sc.nextInt();
//          marks[2] = sc.nextInt();
//          System.out.println("Physics: "+ marks[0] + " Chemistry: " + marks[1] + " Maths: " + marks[2]);
//          int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//          System.out.println("Length of Array: " + marks.length);
//          System.out.println("Percentage: " + percentage);
//     }
// }

// import java.util.*;;

// public class arrays {
//     public static void update(int marks[]) {
//         for(int i =0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {97 , 98 , 99};
//         update(marks);
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//     }
// }

// LinerSearch 

// import java.util.*;
// public class arrays {

//     public static int linersearch(int number[] , int key) {
//         for(int i = 0; i<number.length; i++){
//             if (number[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int number[] = {2 , 4 , 6 , 8 , 10 , 12 , 14 , 16};
//         int key = 20;

//         int index = linersearch(number, key);
//         if (index == -1) {
//             System.out.println("Not found");
//         }
//         else{
//             System.out.println("Key is at Index: " + index);
//         }

//         // System.out.println("Key is at index");
//     }
// }

// Find largest Number 

// import java.util.*;;
// public class arrays {
//     public static int getlargest(int number[]) {
// int largest = Integer.MIN_VALUE;
// int smallest = Integer.MAX_VALUE;
//         for( int i=0; i<number.length; i++){
//             if (largest < number[i]) {
//                 largest = number[i];
//             }
//             if (smallest > number[i]) {
//                 smallest = number[i];
//             }
//         }
//         System.out.println("Smallest Value is: " + smallest);
//         return largest;
//     }
//     public static void main(String args[]) {
//         int number[] = { 2 , 3 , 6 , 4 , 5};
//         System.out.println("Largest Value is : " + getlargest(number));
//     }
// }

// Binary-Search 

// import java.util.*;
// public class arrays {
//     public static int binarySeacrh(int number[] , int key) {
//             int start = 0, end = number.length - 1;

//             while (start <= end) {
//                 int mid = (start + end) / 2;
//                 System.out.println(start);
//                 System.out.println(end);
//                 System.out.println(mid);

//                 if (number[mid] == key) {
//                     return mid;
//                 }
//                 if (number[mid] < key) {
//                     return mid + 1;
//                 }else {
//                     end = mid - 1;
//                 }
//             }

//             return -1;
//     }

//     public static void main(String args[]) {
//         int number[] = {2,4,6,8,10,12,14,16,18,20};
//         int key = 10;
//         System.out.println("Index for Key is :" + binarySeacrh(number, key));
//     }
// }









// Reverse Array

// public class arrays {

//     public static void reversearray(int number []) {
//         int first = 0;
//         int last = number.length - 1;

//         while (first < last) {
//             int temp = number[last];
//             number[last] = number[first];
//             number[first] = temp;

//             first++;//right shift +1
//             last--; // left sgift -1
//         }
//     }

//     public static void main(String args[]) {
//       int number[] = {1,2,3,4,5};
//       reversearray(number);

//       for(int i =0; i<number.length; i++){
//         System.out.print(number[i]);
//       }
//       System.out.println();
//     }
// }












// Pairs in an Array 

// public class arrays {

//     public static void printpairs(int number[]) {
//         int tp = 0;
//         for(int i =0; i<number.length; i++){
//             int curr = number[i];
//             for(int j=(i+1); j<number.length; j++){
//                 System.out.print("(" + curr + "," + number[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total number of pairs: " + tp);
//     }

//     public static void main(String args[]) {
//         int number[] = {2,4,6,8,10};
//         printpairs(number);
//     }
// }












// public class arrays {

//     public static void printsubarrays(int number[]) {
//         int ts = 0;
//         for(int i =0; i<number.length; i++){
//             int max = Integer.MIN_VALUE;
//             int min = Integer.MAX_VALUE;
//             // int start = i;
//             for(int j=i; j<number.length; j++){
//                 // int end = j;
//                 int sum = 0;
//                 for(int k = i; k<=j; k++){
//                     sum += number[k];
//                     System.out.print(number[k]+" ");
//                 }
//                 ts++;
//                 System.out.print("=  " + sum);
//                 System.out.println();
//                 if (sum > max) {
//                     max = sum;
//                 }
//                 if (sum < min) {
//                     min = sum;
//                 }
//             }
//             System.out.println("Minimum Subarray Sum for i=" + i + ": " + min);
//             System.out.println("Maximum Subarray Sum for i=" + i + ": " + max);
//             System.out.println();
//         }
//         System.out.println("Total Number of Sub arrays: " + ts);
//     }

//     public static void main(String args[]) {
//         int number[] = {1,2,3,4,5,6,7,8,9};
//         printsubarrays(number);
//     }
// }





// Max Subarrray Sum 
// public class arrays {
//         public static void maxsubarray(int numbers[]) {
//                 for (int i = 0; i < numbers.length; i++) {
//                         int maxnum = Integer.MIN_VALUE;
//                         for (int j = i; j < numbers.length; j++) {
//                                 int sum = 0;
//                                 for (int k = i; k <= j; k++) {
//                                         sum += numbers[k];
//                                         System.out.print(numbers[k] + " ");
//                                 }
//                                 if (sum > maxnum) {
//                                         maxnum = sum;
//                                 }
//                                 System.out.print(" = " + sum);
//                                 System.out.println();
//                         }
//                         System.out.println("The Max SubArray: " + maxnum);
//                         System.out.println();
//                 }
//         }

//         public static void main(String args[]) {
//                 int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
//                 maxsubarray(numbers);
//         }
// }






// again to reduce the timecomplexity 

// public class arrays {
//         public static void prefixsubarray(int numbers[]) {
//                 int curr = 0;
//                 int maxsum = Integer.MIN_VALUE;
//                 int prefix[] = new int[numbers.length];

//                 prefix[0] = numbers[0];

//                 // calculate prefix
//                 for (int i = 1; i < numbers.length; i++) {
//                         prefix[i] = prefix[i - 1] + numbers[i];
//                 }
//                 for (int i = 0; i < numbers.length; i++) {
//                         int start = i;
//                         for (int j = i; j < numbers.length; j++) {
//                                 int end = j;
//                                 curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                                 if (maxsum < curr) {
//                                         maxsum = curr;
//                                 }
//                         }
//                 }
//                 System.out.println("Max sum = " + maxsum);
//         }

//         public static void main(String args[]) {
                // int numbers[] = { 1, -2, 6, -1, 3 };
//                 prefixsubarray(numbers);
//         }
// }





// Kadans Algorithm 

// public class arrays {

//         public static void kadans(int numbers[]) {
//                 int masxsum = Integer.MIN_VALUE;
//                 int currsum = 0;

//                 for(int i= 0; i<numbers.length; i++){
//                         currsum += numbers[i];
//                         if (currsum < 0) {
//                              currsum = 0;   
//                         }
//                         masxsum = Math.max(currsum, masxsum);
//                 }
//                 System.out.println("Our max subarray sum is : " + masxsum);
//         }

//         public static void main(String args[]) {
//                 int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//                 kadans(numbers);
//         }
// }







// Trapped Water 

// public class arrays {

//         public static int Trappedrainwater(int height[]) {
//                 int n = height.length;
//                 // Calculate left max boundary 
//                 int[] leftmax = new int[n];
//                 leftmax[0] = height[0];
//                 for(int i=1; i<n; i++){
//                         leftmax[i] = Math.max(height[i], leftmax[i-1]);
//                 }

//                 // calculate Right max boundary 
//                 int [] rightmax = new int [n];
//                 rightmax[n - 1] = height[n - 1];
//                 for(int i=n-2; i>=0; i--){
//                         rightmax[i] = Math.max(height[i] , rightmax[i + 1]);
//                 }

//                 int Trappedwater = 0;
//                 //loops
//                 for(int i =0; i<n; i++){
//                         // Waterlevel = min(leftmax bound , right bound)
//                         int waterlevel = Math.min(leftmax[i] , rightmax[i]);

//                         // trapped water = waterlevel - height[i]
//                         Trappedwater += waterlevel - height[i];
//                 }
//                 return Trappedwater;
//         }

//         public static void main(String args[]) {
//                 int height[] = {4, 2, 0, 6, 3, 2, 5};
//                 int trappedWater = Trappedrainwater(height);
//                  System.out.println("Trapped rainwater: " + trappedWater + " units");
// }

// }




// public class arrays {
//         public static int buystock(int prices []) {
//                 int buprice = Integer.MAX_VALUE;
//                 int maxprofit = 0;

//                 for(int i=0; i<prices.length; i++){
//                         if (buprice < prices[i]) {
//                                 int profit = prices[i] - buprice; // todays Profit 
//                                 maxprofit = Math.max(maxprofit, profit);
//                         }
//                         else {
//                                 buprice = prices[i];
//                         }
//                 }
//                 return maxprofit;
//         }
//         public static void main(String[] args) {
//                 int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
//                 System.out.println(buystock(prices));
//         }
// }



// public class arrays {
//         public static int binarySeacrh(int numbers[] , int key) {
//                 int start = 0;
//                 int end = numbers.length - 1;
//                 while (start <= end) {
//                         int mid = (start + end) / 2;
//                         if (numbers[mid] == key) {
//                                 return mid;
//                         }
//                         if (numbers[mid] < key) {
//                                 start = start + 1;
//                         }
//                         else{
//                                 end = mid - 1;
//                         }
//                 }
//                 return -1;
//         }
//         public static void main(String args[]) {
//                 int numbers [] = {1,2,3,4,5,6,7,8};
//                 int key = 4;
//                 System.out.println("The key is at index: " + binarySeacrh(numbers, key));

//         }
// }


// public class arrays {

//         public static int linersearch (int numbers[] , int key) {
//                 for(int i =0; i<numbers.length; i++){
//                         if (numbers[i] == key) {
//                                 // System.out.print("Key is found");
//                                 return i;
//                         }
//                 }
//                 return -1;
//         }

//         public static void main(String args[]) {
//                 int numbers [] = {1,2,3,4,5,6,7,8};
//                 int key = 4;
//                 System.out.println("The Number is at index: "+linersearch(numbers, key));

//         }

// }


// public class arrays {

//         public static void pairs(int numbers[]) {
//                 for(int i=1; i<numbers.length; i++){
//                         for(int j =(i+1); j<numbers.length; j++){
//                                 System.out.print("(" + i + j + ")");
//                         }
//                         System.out.println();
//                 }
//         }

//         public static void main(String args[]) {
//                 int numbers[] = {1,2,3,4,5,6,7,8};
//                 pairs(numbers);
//         }
// }


// public class arrays {
//         public static void Subarray(int numbers []) {
//                 for(int i=0; i<numbers.length; i++){
//                         for(int j=i; j<numbers.length; j++){
//                                 int sum = 0;
//                                 for(int k =i; k<=j; k++){
//                                         sum += numbers[k];
//                                         System.out.print(numbers[k]+" ");
//                                 }
//                                 System.out.print(" = " + sum);
//                                 System.out.println();
//                         }
//                         System.out.println();
//                 }
//         }
//         public static void main(String args[]) {
//                 int numbers[] = {1,2,3,4,5,6,7,8};
//                 Subarray(numbers);
//         }
// }



// public class arrays {

//         public static void kadans(int numbers []) {
//                 int cs = 0;
//                 int ms = Integer.MIN_VALUE;

//                 for(int i=0; i<numbers.length; i++){
//                         cs = cs + numbers[i];
//                         if (cs < 0) {
//                                 cs = 0;
//                         }
//                         ms = Math.max(ms , cs);
//                 }
//                 System.out.println("our max subarray sum is : " + ms);
//         }

//         public static void main(String args[]) {
//                 int numbers [] = {-2,-3,4,-1,-2,1,5,-3};
//                 kadans(numbers);
//         }
// }

// import java.util.Scanner;

// public class arrays {

//     public static void main(String args[]) {
//         int marks []   = new int [100];
//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt(); 
//         marks[2] = sc.nextInt(); 

//         System.out.println("Marks phy = " + marks[0]);
//         System.out.println("Marks chem = " + marks[1]);
//         System.out.println("Marks maths = " + marks[2]);

//         marks[2] = 100;
//         System.out.println("Marks maths = " + marks[2]);
//     }
// }

// Linear-Search 

// public class arrays {

//     public static int linersearch(int arr[] ,int key) {
//         for(int i=0; i<arr.length; i++){
//             if (arr[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         int key = 6;
//         int index = linersearch(arr , key);
//         if (index == -1) {
//             System.out.println("Key is not found ");
//         }
//         else {
//             System.out.println("Key is at the index " + index);
//         }
//     }
// }



// Find the Largest and Smallest Number 

// public class arrays {

//     public static void largestele( int arr []) {   
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if (largest < arr[i]) {
//                 largest = arr[i];
//             }
//             if (smallest > arr[i]) {
//                 smallest = arr[i];
//             }
//         }
//         System.out.println("the Largest Element is " + largest);
//         System.out.println("the Largest Element is " + smallest);
//     }
    
//     public static void main(String args[]) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         largestele(arr);
//     }
// }


// Binary-Search

// public class arrays {

//     public static int Binarysearch(int arr [] , int key) {
//         int start =0; 
//         int end = arr.length-1;

//         while ( start <= end) {
//             int mid = (start + end) / 2;

//             // comparisona 
//             if (arr[mid] == key) {
//                 // System.out.print("Key is found");
//                 return mid;
//             }
//             else if(arr[mid] < key) { //Right 
//                 start = mid + 1;
//             }
//             else {
//                 end = mid - 1; // Left
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         int key = 6;
//         System.out.println(Binarysearch(arr, key));
//     }
// }


// public class arrays {

//     public static int Binarysearch(int arr [] , int key) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             int mid = (start + end) / 2;
//             if (arr[mid] == key) {
//                 return mid;
//             }
//             else if(arr[mid] < key){
//                 start = mid + 1;
//             }
//             else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         int key = 5;
//         System.out.println(Binarysearch(arr, key));
//     }
// }



// reversed an array






// reversed array 

// public class arrays {

//     public static void reversearray( int arr []) {
//         int first = 0;
//         int last = arr.length-1;
//         while(first < last){
//             int temp = arr[first];
//             arr[first] = arr[last];
//             arr[last] = temp;
//             first++;
//             last--;
//         }
//     }
//       public static void printArr( int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr [] = {1,2,3,4,5,6};
//         reversearray(arr);
//         printArr(arr);
//     }

// }


// public class arrays {

//     public static int Binarysearch( int arr [] , int key) {
//         int start = 0;
//         int end = arr.length-1;

//         while (start <= end) {
//             int mid = (start + end) / 2;
//             if (arr[mid] == key) {
//                 return mid;
//             }
//             else if(arr[mid] < key){
//                 start = mid + 1;
//             }
//             else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         int key = 9;
//         System.out.println(Binarysearch(arr, key));
//     }
// }


