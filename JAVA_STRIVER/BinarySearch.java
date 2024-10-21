// // Binary Search: Explained

// public class BinarySearch {

//     public static int Binaryrecursive(int arr [] , int low , int high , int target) {
//         if (low <= high) {
//             return -1;
//         }
//         int mid = (low + high) / 2;
//         if (mid == target) {
//             return mid;
//         }
//         else if (target > mid) {
//             return Binaryrecursive(arr, mid + 1, high, target);
//         }
//         else {
//             return Binaryrecursive(arr, low, mid-1, target);
//         }
//     }

//     // public static int Binarysearch(int arr [] , int low , int high , int target) {
//     //     while (low <= high) {
//     //         int mid = (low + high) / 2;
//     //         if (mid == target) {
//     //             return mid;
//     //         }
//     //         else if (target > mid) {
//     //             low = mid + 1;
//     //         }
//     //         else{
//     //             high = mid - 1;
//     //         }
//     //     }
//     //     return -1;
//     // }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         int target = 6;
//         int num = Binaryrecursive(arr , 0 , arr.length-1 , target);
//         // int num = Binarysearch(arr, 0, arr.length-1, target);
//         if (num == -1) {
//             System.out.println("Element not found using Recurive function");
//         }
//         else {
//             System.out.println("Element found using Recurive function");
//         }
//     }
// }

/// Lower Bound 

// public class BinarySearch {

//     public static int LowerBound(int arr [] ,int low , int high , int target) {
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 ans = mid;
//                 return mid;
//             }
//             else if (target >= arr[mid]) {
//                 ans = mid;
//                 low = mid + 1;
//             }
//             else{
//                 ans = mid;
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         System.out.println(LowerBound(arr, 0 , arr.length-1 , 5));
//     }
// }

// Upper bound 
// public class BinarySearch {

//     public static int upperBound(int arr[], int low, int high, int target) {
//         int ans = -1; // Initialize ans to -1 to handle cases where target is not found
//         while (low <= high) {
//             int mid = low + (high - low) / 2; // Calculate mid index
//             if (arr[mid] == target) {
//                 ans = mid; // Update ans to mid
//                 low = mid + 1; // Update low to search for the upper bound in the right half
//             } else if (target > arr[mid]) {
//                 low = mid + 1; // Update low for the next iteration
//             } else {
//                 high = mid - 1; // Update high for the next iteration
//             }
//         }
//         return ans; // Return ans
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         System.out.println(upperBound(arr, 0, arr.length - 1, 6)); // Call upperBound function
//     }
// }

// Search Insert Position 

// public class BinarySearch {

//     public static int SearchInsert(int arr [] , int target) {
//         int low = 0;
//         int high = arr.length;
//         int ans  = - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             }
//             else if (target > arr[mid]) {
//                 ans = mid;
//                 low = mid + 1;
//             }
//             else {
//                 ans = mid;
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         int target = 5;
//         int ans = SearchInsert(arr, target);
//         if (ans == -1) {
//             System.out.println("Not Position available");
//         }
//         else {
//             System.out.println("Postion availale for this " + ans);
//         }

//     }
// }

// Floor and Ceil in Sorted Array

// public class BinarySearch {

//     public static int findCeil(int arr [] , int target) {
//         int n = arr.length;
//         int low = 0;
//         int high = n - 1;
//         int ans = -1 ;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (target > arr[mid]) {
//                 ans = arr[mid];
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//     public static int findfloor(int arr [] , int target) {
//         int low = 0;
//         int high = arr.length-1;
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (target < arr[mid]) {
//                 ans = arr[mid];
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 4, 4, 7, 8, 10};
//         int target = 5;
//         System.out.println("The Ciel is : " + findCeil(arr , target));
//         System.out.println("The Floor is : " + findfloor(arr, target));
//     }
// }

// First and Last Occurrences in Array

// Using the Linear Search
// public class BinarySearch {

//     public static int FindfirstOccurnce(int arr[] , int target) {
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             if (arr[i] == target) {
//                 return  i;
//             }
//         }
//         return -1;
//     }

//     public static int LastOccurence(int arr[] , int target) {
//         int n = arr.length-1;
//         for(int i=n; i>=0; i--){
//             if (arr[i] == target) {
//              return i;   
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9 };
//         int target = 6;
//         int first = FindfirstOccurnce(arr, target);
//         int last = LastOccurence(arr, target);
// if (first == -1) {
//     System.out.println("There is no first and last occernece");
// }
// else {
//     System.out.println("There is first occernece is at : " + first + " and last occernce is at : " + last);
// }
//     }
// }

// Using Binary Search

// public class BinarySearch {

//     public static int FindfirstOccurnce(int arr [] , int target) {
//         int n = arr.length;
//         int low = 0;
//         int high = n-1;
//         int first = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 first = mid;
//                 high = mid - 1;
//             }
//             else if (target  > arr[mid]) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }
//         return first;
//     }

//     public static int  LastOccurence(int arr [] , int target) {
//         int n = arr.length;
//         int low = 0;
//         int high = n-1;
//         int last = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {   
//                 last = mid;
//                 low = mid + 1;
//             }
//             else if (target > arr[mid]) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }   
//         }
//         return last;
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,6,6,7,8,9};
//         int target = 6;
//         int first = FindfirstOccurnce(arr, target);
//         int last = LastOccurence(arr, target);
//         if (first == -1) {
//             System.out.println("There is no first and last occernece");
//         }
//         else {
//             System.out.println("There is first occernece is at : " + first + " and last occernce is at : " + last);
//         }
//     }
// }

// Count Occurrences in Sorted Array

// public class BinarySearch {

//     public static int FindfirstOccurnce(int arr [] , int target) {
//         int n = arr.length;
//         int low = 0;
//         int high = n-1;
//         int first = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 first = mid;
//                 high = mid - 1;
//             }
//             else if (target  > arr[mid]) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }
//         return first;
//     }

//     public static int  LastOccurence(int arr [] , int target) {
//         int n = arr.length;
//         int low = 0;
//         int high = n-1;
//         int last = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {   
//                 last = mid;
//                 low = mid + 1;
//             }
//             else if (target > arr[mid]) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }   
//         }
//         return last;
//     }

//     public static int countoccurences(int arr [] , int target) {
//         int first = FindfirstOccurnce(arr, target);
//         if (first == -1) {
//             return 0;
//         }
//         int last = LastOccurence(arr, target);
//         return last - first + 1;

//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,6,6,6,7,8,9};
//         int target = 6;
//         FindfirstOccurnce(arr, target);
//         LastOccurence(arr, target);
//         System.out.println(countoccurences(arr, target));
//     }
// }

// Search Element in a Rotated Sorted Array

// public class BinarySearch {

//     public static int searchelementRoatate(int arr [] , int target){
//         int n = arr.length;
//         int low = 0;
//         int high = n - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             }
//             // Left Sorted Array
//             else if (arr[low] <= arr[mid]) {
//                 if (arr[low] <= target && target <= arr[mid]) {
//                     high = mid - 1;
//                 }
//                 else {
//                     low = mid + 1;
//                 }
//             }
//             // Right Sorted Array
//             else {
//                 if (arr[mid] <= target && target <= arr[high]) {
//                     low = mid + 1;
//                 }
//                 else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr [] = {7,8,9,1,2,3,4,5,6};
//         int target = 1;
//         int ans = searchelementRoatate(arr, target);
//         if (ans == -1) {
//             System.out.println("Target Elemnt is not Found in Roatetd Array");
//         }
//         else{
//             System.out.println("Target Element is Found in Roated Array");
//         }
//     } 
// }

// Search Element in Rotated Sorted Array II
// now we have  the Duplicates 

// public class BinarySearch {

//     public static int searchelementRoatate(int arr [] , int target){
//         int n = arr.length;
//         int low = 0;
//         int high = n - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             }
//             // If Array Can Contains the Duplicates numbers in an array
//             else if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
//                 low++;
//                 high--;
//                 continue;
//             }
//             // Left Sorted Array
//             else if (arr[low] <= arr[mid]) {
//                 if (arr[low] <= target && target <= arr[mid]) {
//                     high = mid - 1;
//                 }
//                 else {
//                     low = mid + 1;
//                 }
//             }
//             // Right Sorted Array
//             else {
//                 if (arr[mid] <= target && target <= arr[high]) {
//                     low = mid + 1;
//                 }
//                 else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 1, 2, 3, 3, 3, 3};
//         int target = 3;
//         int ans = searchelementRoatate(arr, target);
//         if (ans == -1) {
//             System.out.println("Target Elemnt is not Found in Roatetd Array");
//         }
//         else{
//             System.out.println("Target Element is Found in Roated Array " + ans);
//         }
//     } 
// }

// Search Element in Rotated Sorted Array II
// public class BinarySearch {

//     public static void SearchRotate(int arr []) {
//         int n = arr.length;
//         int low = 0;
//         int high = n -1;
//         int ans = Integer.MAX_VALUE;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[low] <= arr[high]) {
//                 ans = Math.min(ans, arr[low]);
//                 break;
//             }
//             if (arr[low] <= arr[mid]) {
//                 ans = Math.min(ans, arr[low]);
//                 low = mid + 1;
//             }
//             else{
//                 ans = Math.min(ans, arr[mid]);
//                 high = mid - 1;
//             }
//         }
//         System.out.println(ans);
//     }

//     public static void main(String[] args) {
//         int arr [] = {4,5,6,7,8,9,1,2,3};
//         SearchRotate(arr);
//     }
// }

// Minimum in Rotated Sorted Array
// public class BinarySearch {

//     public static void SearchRotate(int arr []) {
//         int n = arr.length;
//         int low = 0;
//         int high = n -1;
//         int ans = Integer.MAX_VALUE;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[low] <= arr[high]) {
//                 ans = Math.min(ans, arr[low]);
//                 break;
//             }
//             if (arr[low] <= arr[mid]) {
//                 ans = Math.min(ans, arr[low]);
//                 low = mid + 1;
//             }
//             else{
//                 ans = Math.min(ans, arr[mid]);
//                 high = mid - 1;
//             }
//         }
//         System.out.println(ans);
//     }

//     public static void main(String[] args) {
//         int arr [] = {4,5,6,7,8,9,1,2,3};
//         SearchRotate(arr);
//     }
// }

// public class BinarySearch {

//     public static int findhowmanyarryrotate(int arr[]) {
//         int n = arr.length;
//         int low = 0;
//         int high = n - 1;
//         int ans = Integer.MAX_VALUE;
//         int index = Integer.MAX_VALUE;

//         while (low <= high) {
//             int mid = (low + high) / 2; 

//             if (arr[low] <= arr[high]) {
//                 if (arr[low] < ans) {
//                     index = low;
//                     ans = arr[low];
//                 }
//                 low = mid + 1; // Highlighted change: Update 'low'
//                 break;
//             }

//             if (arr[low] <= arr[mid]) {
//                 if (arr[low] < ans) {
//                     index = low;
//                     ans = arr[low];
//                 }
//                 low = mid + 1; // Highlighted change: Update 'low'
//             } else {
//                 if (arr[mid] < ans) {
//                     index = mid;
//                     ans = arr[mid];
//                 }
//                 high = mid - 1; // Highlighted change: Update 'high'
//             }
//         }
//         return index;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
//         System.out.println("The Array Has Been Rotated at the Index at : " + findhowmanyarryrotate(arr)); // Output: 6
//     }
// }

// Search Single Element in a sorted array

// public class BinarySearch {

//     public static int SearchSingleEle(int arr[]) {
//         int n = arr.length;
//         int low = 0;
//         int high = n - 1;
//         // If array in array there in only elememt return answer
//         if (n == 1) {
//             return arr[0];
//         }
//         // checking if array of index 0 == 1 return anser
//         if (arr[0] != arr[1]) {
//             return arr[0];
//         }
//         // CHecking if array of index lastindex == lastindex - 1 return answer
//         if (arr[n - 1] != arr[n - 2]) {
//             return arr[n - 1];
//         }
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             // Checking if that element should be mid if yes return mid
//             if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
//                 return arr[mid];
//             }
//             // We are on left side
//             // Checking if we are on the left side and need to move right
//             if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 != 0 && arr[mid] == arr[mid - 1])) {
//                 low = mid + 1; // Highlighted change: Update 'low'
//             } else { // We are on the right side and need to move left
//                 high = mid - 1; // Highlighted change: Update 'high'
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
//         System.out.println(SearchSingleEle(arr));
//     }
// }

//1 = Binary Search Medium Questions 

// Finding Sqrt of a number using Binary Search

// public class BinarySearch {

//     public static int sqrtofnum(int n) {
//         int low = 1;
//         int high = n;
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (mid * mid <= n) {
//                 ans = mid;
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 36;
//         System.out.println(sqrtofnum(n));
//     }
// }

//2 = Nth Root of a Number using Binary Search
// public class BinarySearch {

//     public static int Nthroot(int n , int m) {
//         int low = 1; 
//         int high = m;
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (Math.pow(mid, n) == m) {
//                 ans = mid;
//                 break;
//             }
//             else if (Math.pow(mid, n) < m) {
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         int m = 27;
//         System.out.println(Nthroot(n, m));
//     }
// }

// 3 Koko Eating Bananas

// public class BinarySearch {

//     public static int max(int arr []) {
//         int n = arr.length;
//         int maxi = 0;
//         for(int i=0; i<n; i++){
//             if (arr[i] > maxi) {
//                 maxi = arr[i];
//             }
//         }
//         return maxi;
//     }

//     public static int CalculateTotalhours(int arr [] , int mid) {
//         int totalH = 0;
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             totalH += Math.ceil((double) arr[i] / mid);
//         } 
//         return totalH;
//     }

//     public static int KOKO(int arr [] , int hour) {
//         int low = 1;
//         int high = max(arr);
//         int result = 0;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int totalH = CalculateTotalhours(arr,mid);
//             if (totalH <= hour) {
//                 result = mid; // Update the result with the current mid
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int arr [] = {3,6,7,11};
//         int hour = 8;
//         System.out.println(KOKO(arr,hour));
//     }
// }

// 4) Minimum days to make M bouquets

// public class BinarySearch {

//     public static int maxi(int arr[]) {
//         int n = arr.length;
//         int max = 0;
//         for (int i = 0; i < n; i++) {
//             max += arr[i];
//         }
//         return max;
//     }

//     public static int mini(int arr[]) {
//         int n = arr.length;
//         int min = 0;
//         for (int i = 0; i < n; i++) {
//             min += arr[i];
//         }
//         return min;
//     }

//     public static int ifPossibble(int arr[], int m, int k) {
//         int n = arr.length; // Size of the array
//         int cnt = 0;
//         int noOfB = 0;
//         // Count the number of bouquets:
//         for (int i = 0; i < n; i++) {
//             if (arr[i] <= day) {
//                 cnt++;
//             } else {
//                 noOfB += (cnt / k);
//                 cnt = 0;
//             }
//         }
//         noOfB += (cnt / k);
//         return noOfB >= m;
//     }

//     public static int MinimumDaysbouquets(int arr[] , int m , int k) {
//         long val = (long) m * k;
//         int n = arr.length; // Size of the array
//         if (val > n) return -1; 
//         int low = mini(arr);
//         int high = maxi(arr);
//         int ans = 0;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (ifPossibble(arr, mid, m, k)) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
//         int k = 3;
//         int m = 2;
//         System.out.println(MinimumDaysbouquets(arr));
//     }
// }

// import java.util.*;

// public class BinarySearch {
//     public static boolean possible(int[] arr, int day, int m, int k) {
//         int n = arr.length; // Size of the array
//         int cnt = 0;
//         int noOfB = 0;
//         // Count the number of bouquets:
//         for (int i = 0; i < n; i++) {
//             if (arr[i] <= day) {
//                 cnt++;
//             } else {
//                 noOfB += (cnt / k);
//                 cnt = 0;
//             }
//         }
//         noOfB += (cnt / k);
//         return noOfB >= m;
//     }

//     public static int roseGarden(int[] arr, int k, int m) {
//         long val = (long) m * k;
//         int n = arr.length; // Size of the array
//         if (val > n) return -1; // Impossible case.
//         // Find maximum and minimum:
//         int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             mini = Math.min(mini, arr[i]);
//             maxi = Math.max(maxi, arr[i]);
//         }

//         // Apply binary search:
//         int low = mini, high = maxi;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (possible(arr, mid, m, k)) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return low;
//     }

//     public static void main(String[] args) {
//         int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
//         int k = 3;
//         int m = 2;
//         int ans = roseGarden(arr, k, m);
//         if (ans == -1)
//             System.out.println("We cannot make m bouquets.");
//         else
//             System.out.println("We can make bouquets on day " + ans);
//     }
// }

// 5) Find the Smallest Divisor Given a Threshold

// public class BinarySearch {

//     public static int maxi(int arr []) {
//         int n = arr.length;
//         int max = 0;
//         for(int i=0; i<n; i++){
//             max = Math.max(max, arr[i]);
//         }
//         return max;
//     }

//     public static int sumbyD(int arr[] , int mid) {
//         int n = arr.length;
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             sum  += Math.ceil((double) arr[i] / mid);
//         }
//         return sum;
//     }

//     public static int findsmalletsdivision(int arr [] , int Threshold) {
//         int low = 1;
//         int high = maxi(arr);
//         int ans = -1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (sumbyD(arr, mid) <= Threshold) {
//                 ans = mid;
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }
//         return ans;   
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,5,9};
//         int Threshold = 7;
//         System.out.println(findsmalletsdivision(arr , Threshold));
//     }
// }

// Linear Search
// public class BinarySearch {

//     public static int maxi(int arr[]) {
//         int n = arr.length;
//         int max = 0;
//         for (int i = 0; i < n; i++) {
//             max = Math.max(max, arr[i]);
//         }
//         return max;
//     }

//     public static int findsmalletsdivisionlinear(int arr[], int Threshold) {
//         int n = maxi(arr);
//         int m = arr.length;
//         int sum = 0;
//         for (int i = 0; i < m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 sum += Math.ceil((double) arr[i] / j);
//                 if (sum > Threshold) {
//                     return sum;
//                 }
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 5, 9};
//         int Threshold = 7;
//         int result = findsmalletsdivisionlinear(arr, Threshold);
//         System.out.println("The Smallest Divisor is : " + result);
//     }
// }

// Capacity to Ship Packages within D Days

// Linear seacrh Method 
// public class BinarySearch {
//     public static int Capacityindays(int arr[], int days) {
//         int capacity = 10;
//         int day = 1;
//         int load = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (load + arr[i] > capacity) {
//                 load = arr[i];
//                 day = day + 1;
//             } else {
//                 load += arr[i];
//             }
//         }
//         return day;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int days = 5;
//         int result = Capacityindays(arr, days);
//         if (result <= days) {
//             System.out.println("The days required is : " + result);
//         }
//         else{
//             System.out.println("Increased the Capacity ");
//         }

//     }
// }

// By Using Binary search on answers 
// public class BinarySearch {

//     public static int maxi(int arr []) {
//         int n = arr.length;
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             max = Math.max(max, arr[i]);
//         }
//         return max;
//     }

//     public static int sumation(int arr []) {
//         int n = arr.length;
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             sum += arr[i];
//         }
//         return sum;
//     }

//     public static int findnodays(int arr [] , int mid) {
//         int n = arr.length;
//         int load = 0;
//         int day = 1;
//         for(int i=0; i<n; i++){
//             if (load + arr[i] > mid) {
//                 load = arr[i];
//                 day = day + 1;
//             }
//             else {
//                 load += arr[i];
//             }
//         }
//         return day;
//     }

//     public static int Capacityindays(int arr [] , int days) {
//         int low = maxi(arr);
//         int high = sumation(arr);
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (findnodays(arr, mid) <= days) {
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }
//         return low;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int days = 5;
//         System.out.println("The capacity is required is : " + Capacityindays(arr, days));
//     }
// }

// Kth Missing Positive Number
// public class BinarySearch {
//     public static int findKthMissing(int[] arr, int k) {
//         int count = 0;
//         int num = 1; // Start checking from the first positive integer

//         while (count < k) {
//             boolean found = false;
//             for (int i = 0; i < arr.length; i++) {
//                 if (arr[i] == num) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) {
//                 count++;
//             }
//             if (count == k) {
//                 return num;
//             }
//             num++; // Move to the next positive integer
//         }
//         // If the kth missing positive number is not found in the given array,
//         // then return num + (k - count) as the kth missing positive number
//         return num + (k - count);
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 3, 4, 7, 11};
//         int k = 5;
//         System.out.println("The " + k + "th missing positive number is: " + findKthMissing(arr, k));
//     }
// }

// Binary Search 
// public class BinarySearch {
//     public static int findKthMissing(int[] arr, int k) {
//         int low = 0;
//         int high = arr.length - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int missingnumberforemid = arr[mid] - (mid + 1);
//             if (missingnumberforemid < k) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return low + k;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 4, 7, 11 };
//         int k = 6;
//         System.out.println("The " + k + "th missing positive number is: " + findKthMissing(arr, k));
//     }
// }

// Aggressive Cows : Detailed Solution

// Linear Search
// import java.util.Arrays;

// public class BinarySearch {

//     public static boolean canWePlace(int arr[], int distance, int cows) {
//         int n = arr.length; // size of an array
//         int countcows = 1; // count cows
//         int last = arr[0]; // position of last placed cow
//         for (int i = 1; i < n; i++) {
//             if (arr[i] - last >= distance) {
//                 countcows++;
//                 last = arr[i];
//             }
//         }
//         if (countcows >= cows) {
//             return true;
//         }
//         return false;
//     }

//     public static int aggressiveCows(int arr[], int cows) {
//         int n = arr.length;
//         // Sort the Array
//         Arrays.sort(arr);
//         int limit = arr[n - 1] - arr[0];
//         for (int i = 0; i <= limit; i++) {
//             if (canWePlace(arr, i, cows) == false) {
//                 return (i - 1);
//             }
//         }
//         return limit;

//     }

//     public static void main(String[] args) {
//         int[] stalls = { 0, 3, 4, 7, 10, 9 };
//         int cows = 4;
//         int result = aggressiveCows(stalls, cows);
//         System.out.println("The Maximum Possible minimum distance is : " + result);
//     }
// }

// Binary Search 

// import java.util.Arrays;

// public class BinarySearch {

//     public static boolean canWePlace(int stalls [] , int distance , int cows) {
//         int countcows = 1;
//         int n = stalls.length;
//         int last = stalls[0];
//         for(int i=1; i<n; i++){
//             if (stalls[i] - last >= distance) {
//                 countcows++;
//                 last = stalls[i];
//             }
//         }
//         if (countcows >= cows) {
//             return true;
//         }
//         return false;
//     }

//     public static int aggressiveCows(int stalls [] , int cows) {
//         int n = stalls.length;
//         Arrays.sort(stalls);
//         int low = 1;
//         int high = stalls[n-1] - stalls[0];
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (canWePlace(stalls, mid, cows) == true) {
//                 low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//         }
//         return high;
//     }

//     public static void main(String[] args) {
//         int stalls[] = { 0, 3, 4, 7, 10, 9 };
//         int cows = 4;
//         int result = aggressiveCows(stalls, cows);
//         System.out.println("The Maximum Possible distance is : " + result);
//     }
// }

// Allocate Minimum Number of Pages
// public class BinarySearch {

//     public static int maxi(int books []) {
//         int max = 0;
//         for(int i =0; i<books.length; i++){
//             max = Math.max(max, books[i]);
//         }
//         return max;
//     }

//     public static int sumation(int books []) {
//         int sum = 0;
//         for(int i=0; i<books.length; i++){
//             sum += books[i];
//         }
//         return sum;
//     }

//     public static int calculatestudents(int pages , int books []) {
//         int student = 1;
//         int pagesstudent = 0;
//         for(int i=0; i<books.length; i++){
//             if (pagesstudent + books[i] <= pages) {
//                 pagesstudent += books[i];
//             }
//             else{
//                 student++;
//                 pagesstudent = books[i];
//             }
//         }
//         return student;
//     }

//     // // using linear search
//     // public static int disrtubooks(int books [], int students) {
//     //     int low = maxi(books);
//     //     int high = sumation(books);
//     //     for(int pages=low; pages<=high; pages++){
//     //         int countstundent = calculatestudents(pages , books);
//     //         if (countstundent == students) {
//     //             return pages;
//     //         }
//     //     }
//     //     return low;
//     // }

//     // using Binary Search 
//     public static int disrtubooks(int books [] , int students) {
//         int low = maxi(books);
//         int high = sumation(books);
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int countstundent = calculatestudents(mid, books);
//             if (countstundent > students) {
//                 low = mid + 1;
//             }   
//             else {
//                 high = mid - 1;
//             }
//         }
//         return low;
//     }

//     public static void main(String[] args) {
//         int books [] = {1,2,3,4,5};
//         int students = 3;
//         System.out.println(disrtubooks(books, students));
//     }
// }

//Split Array – Largest Sum / Painter Partitiom 

// public class BinarySearch {

//     public static int[] maxi(int arr []) {
//         int n = arr.length;
//         int max = Integer.MIN_VALUE;
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             max = Math.max(max, arr[i]);
//             sum += arr[i];
//         }
//         return new int [] {max , sum};
//     }

//     public static int ansewer(int arr [] , int pages) {
//         int student = 1;
//         int pageshould = 0;
//         for(int i=0; i<arr.length; i++){
//             if (pageshould + arr[i] <= pages) {
//                 pageshould += arr[i];
//             }
//             else{
//                 student++;
//                 pageshould =arr[i];
//             }
//         }
//         return student;
//     }

//     // public static int Painter(int arr [] , int k) {
//     //     int low = maxi(arr);
//     //     int high = sumation(arr);
//     //     for(int pages=low; pages<high; pages++){
//     //         int countstudent = ansewer(arr, pages);
//     //         if (countstudent == k) {
//     //             return pages;
//     //         }
//     //     }
//     //     return low;
//     // }
//     public static int Painter(int arr [] , int k) {
//         int result [] = maxi(arr);
//         int low = result[0];
//         int high = result[1];
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int answer = ansewer(arr, mid);
//             if (answer > k) {
//                     low = mid + 1;

//             }
//             else {
//                     high = mid  - 1;
//             }
//         }
//         return low;
//     }

//     public static void main(String[] args) {
//         int arr [] = {7,2,5,10,8};
//         int k = 2;
//         System.out.println(Painter(arr, k));
//     }
// }

// Minimise Maximum Distance between Gas Stations
// Hard question understand the question for understand the solution required more knoweldge 

// // Median of Two Sorted Arrays of different sizes

// public class BinarySearch {

//     public static double Median(int arr[] , int arr1 []) {
//         int n1 = arr.length;
//         int n2 = arr1.length;
//         int i = 0;
//         int j = 0;
//         int temp [] = new int [n1+n2];
//         int k =0;
//         while (i < n1 && j < n2) {
//             if (arr[i] < arr1[j]) {
//                 temp[k] = arr[i];
//                 i++;
//             }
//             else{
//                 temp[k] = arr1[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i < n1) {
//             temp[k++] = arr[i++];
//         }

//         while (j < n2) {
//             temp[k++] = arr1[j++];
//         }

//         int n = n1+n2;
//         if (n % 2 == 1) {
//             return (double)temp[n/2];
//         }else {
//             return (double)(temp[(n - 1) / 2] + temp[n / 2]) / 2;
//         }

//         // for(int d=0; d<temp.length; d++){
//         //     System.out.print(temp[d]+" ");
//         // }
//         // System.out.println();
//     }

//     public static void main(String[] args) {
//         // int arr [] = {1,3,4,7,10,12};
//         // int arr2 [] = {2,3,6,15};
//         // int arr [] = {2,3,4};
//         // int arr2 [] = {1,3};
//         int arr [] = {1,2};
//         int arr2 [] = {3,4};
//         System.out.println(Median(arr, arr2));
//     }
// }

// better 

// import java.util.*;

// public class BinarySearch {
//     public static double median(int[] a, int[] b) {
//         // Size of two given arrays
//         int n1 = a.length;
//         int n2 = b.length;

//         int n = n1 + n2; //total size
//         //required indices:
//         int ind2 = n / 2;
//         int ind1 = ind2 - 1;
//         int cnt = 0;
//         int ind1el = -1, ind2el = -1;

//         //apply the merge step:
//         int i = 0, j = 0;
//         while (i < n1 && j < n2) {
//             if (a[i] < b[j]) {
//                 if (cnt == ind1) ind1el = a[i];
//                 if (cnt == ind2) ind2el = a[i];
//                 i++;
//             } else {
//                 if (cnt == ind1) ind1el = b[j];
//                 if (cnt == ind2) ind2el = b[j];
//                 j++;
//             }
//             cnt++;
//         }

//         //copy the left-out elements:
//         while (i < n1) {
//             if (cnt == ind1) ind1el = a[i];
//             if (cnt == ind2) ind2el = a[i];
//             cnt++;
//             i++;
//         }
//         while (j < n2) {
//             if (cnt == ind1) ind1el = b[j];
//             if (cnt == ind2) ind2el = b[j];
//             cnt++;
//             j++;
//         }

//         //Find the median:
//         if (n % 2 == 1) {
//             return (double)ind2el;
//         }

//         return (double)((double)(ind1el + ind2el)) / 2.0;
//     }

//     public static void main(String[] args) {
//         // int[] a = {1, 4, 7, 10, 12};
//         // int[] b = {2, 3, 6, 15};
//             int a [] = {1,2};
//             int b [] = {3,4};
//         System.out.println("The median of two sorted arrays is " + median(a, b));
//     }
// }

// Optimal 

// import java.util.*;

// public class BinarySearch {
//     public static double median(int[] a, int[] b) {
//         int n1 = a.length, n2 = b.length;
//         //if n1 is bigger swap the arrays:
//         if (n1 > n2) return median(b, a);

//         int n = n1 + n2; //total length
//         int left = (n1 + n2 + 1) / 2; //length of left half
//         //apply binary search:
//         int low = 0, high = n1;
//         while (low <= high) {
//             int mid1 = (low + high) / 2;
//             int mid2 = left - mid1;
//             //calculate l1, l2, r1 and r2;
//             int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
//             int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
//             int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
//             int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

//             if (l1 <= r2 && l2 <= r1) {
//                 if (n % 2 == 1) return Math.max(l1, l2);
//                 else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
//             } else if (l1 > r2) high = mid1 - 1;
//             else low = mid1 + 1;
//         }
//         return 0; //dummy statement
//     }

//     public static void main(String[] args) {
//         int[] a = {1, 4, 7, 10, 12};
//         int[] b = {2, 3, 6, 15};
//         System.out.println("The median of two sorted arrays is " + median(a, b));
//     }
// }

// K-th Element of two sorted arrays

// Brute Force Solution 

// public class BinarySearch {

//     public static int kthelement(int array1 [] , int array2 [] , int m , int n , int k) {
//         int i = 0;
//         int j = 0;
//         int temp [] = new int [m + n];
//         int l = 0;
//         while (i < m && j < n) {
//             if (array1[i] < array2[j]) {
//                 temp[l] = array1[i];
//                 i++;
//             }
//             else{
//                 temp[l] = array2[j];
//                 j++;
//             }
//             l++;
//         }
//         while (i < m) {
//             temp[l++] = array1[i++];
//         }
//         while (j < n) {
//             temp[l++] = array2[j++];
//         }

//         int low = 0;
//         int high = temp.length;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (mid == k) {
//                 return temp[mid];
//             }
//             else if (mid < k) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }
//         return -1;
//         // for(int o=0; o<temp.length; o++){
//         //     System.out.print(temp[o]+" ");
//         // }
//         // System.out.println();
//     }

//     public static void main(String[] args) {
//         int array1[] = {2,3,6,7,9};
//         int array2[] = {1,4,8,10};
//         int m = array1.length;
//         int n = array2.length;
//         int k = 4;
//         System.out.println("The element at the kth position in the final sorted array is "+kthelement(array1,array2,m,n,k));
//         // kthelement(array1, array2, m, n, k);
//     }
// }

// Optimal Solution
// import java.util.*;
// public class BinarySearch {
//     static int kthelement(int arr1[], int arr2[], int m, int n, int k) {
//     if(m > n) {
//         return kthelement(arr2, arr1, n, m, k); 
//     }

//     int low = Math.max(0,k-m), high = Math.min(k,n);

//     while(low <= high) {
//         int cut1 = (low + high) >> 1; 
//         int cut2 = k - cut1; 
//         int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1]; 
//         int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
//         int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1]; 
//         int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2]; 

//         if(l1 <= r2 && l2 <= r1) {
//             return Math.max(l1, l2);
//         }
//         else if (l1 > r2) {
//             high = cut1 - 1;
//         }
//         else {
//             low = cut1 + 1; 
//         }
//     }
//     return -1;
//     }
//     public static void main(String args[]) {
// int array1[] = {2,3,6,7,9};
// int array2[] = {1,4,8,10};
// int m = array1.length;
// int n = array2.length;
// int k = 5;
// System.out.println("The element at the kth position in the final sorted array is "+kthelement(array1,array2,m,n,k));

//     }
// }

// Find the row with maximum number of 1’s

// brute force solution

// public class BinarySearch {

//     public static int findones(int matrix [][] , int one) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int cnt_max = -1;
//         int cnt_one = 0;
//         int index = 0;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 // System.err.print(matrix[i][j]+" ");
//                 if(matrix[i][j] == one){
//                     cnt_one++;
//                 }
//                 // cnt_max = Math.max(cnt_max, cnt_one);
//             }
//                 if (cnt_max < cnt_one) {
//                     cnt_max = cnt_one;
//                     index = i;
//                 }
//                 cnt_one = 0;
//             // System.out.println();
//         }
//         return index;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = { { 0, 0, 1, 1, 1 },
//                 { 0, 0, 0, 0, 0 },
//                 { 0, 1, 1, 1, 1 },
//                 { 0, 0, 0, 0, 0 },
//                 { 0, 1, 1, 1, 1 }
//         };
//         int one = 1;
//         System.out.println("The max Index is : " + findones(matrix , one));
//     }
// }

// optimal solution
// public class BinarySearch {

// public static int LowerBound(int matrix[], int n, int x) {
// int low = 0;
// int high = n - 1;
// int ans = n;
// while (low <= high) {
// int mid = (low + high) / 2;
// // May be answer
// if (matrix[mid] >= x) {
// ans = mid;
// // look for more small index on left
// high = mid - 1;
// } else {
// // look for right
// low = mid + 1;
// }
// }
// return ans;
// }

// public static void main(String[] args) {
// int cnt_max = -1;
// int index = -1;
// int matrix[][] = { { 0, 0, 1, 1, 1 },
// { 0, 0, 0, 0, 0 },
// { 0, 1, 1, 1, 1 },
// { 0, 0, 0, 0, 0 },
// { 0, 1, 1, 1, 1 }
// };
// int n = matrix.length;
// for (int i = 0; i < n; i++) {
// int cnt_ones = n - LowerBound(matrix[i], n, 1);
// if (cnt_ones > cnt_max) {
// cnt_max = cnt_ones;
// index = i;
// }
// }
// System.out.println("The Row with the maximum number is : " + index);
// }
// }

// Search in a sorted 2D matrix part = 1
// direct Optmial soluiton
// public class BinarySearch {

//     public static boolean searchmatrix(int matrix[][], int target) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int low = 0;
//         int high = n * m - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int row = mid / m;
//             int col = mid % m;
//             if (matrix[row][col] == target) {
//                 return true;
//             } else if (matrix[row][col] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//                 { 3, 4, 7, 9 },
//                 { 12, 13, 16, 18, },
//                 { 20, 21, 23, 29 }
//         };
//         int target = 3;
//         System.out.println(searchmatrix(matrix, target));
//     }
// }

// Search in a sorted 2D matrix part = 2

// optimal direct 
// public class BinarySearch {

//     public static int [] part2(int matrix[][] , int target) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int row = 0;
//         int col = m-1;
//         while (row < n && col >= 0) {
//             if (matrix[row][col] == target) {
//                 return new int[] {row , col};
//             }
//             else if (matrix[row][col] < target) {
//                 row++;
//             }
//             else{
//                 col--;
//             }
//         }
//         return  new int[] {-1,-1};
//     }

//     public static void main(String[] args) {
//         int matrix [][] = {{1,4,7,11,15},
//         {2,5,8,12,19,},
//         {3,6,9,16,22},
//         {10,13,14,17,24},
//         {18,21,23,26,30}
//     };
//     System.out.println(part2(matrix, 14));
//     }
// }

// Find Peak Element (2D Matrix)	

// public class BinarySearch {

//     public static int findmaxindex(int matrix[][],int n,int m,int mid) {
//         int maxvalue = -1;
//         int index = -1;
//         for(int i=0; i<n; i++){
//             if (matrix[i][mid] > maxvalue) {
//                 maxvalue = matrix[i][mid];
//                 index = i;
//             }
//         }
//         return index;
//     }

//     public static int[] findpeak(int matrix[][]) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int low = 0;
//         int high = m - 1;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int maxrowindex = findmaxindex(matrix ,n,m, mid);
//             int left = mid - 1 >= 0 ? matrix[maxrowindex][mid-1] : -1;
//             int right = mid + 1 < m ? matrix[maxrowindex][mid+1] : -1;
//             if (matrix[maxrowindex][mid] > left && matrix[maxrowindex][mid] > right) {
//                 return new int [] {maxrowindex , mid};
//             }
//             else if (matrix[maxrowindex][mid] < left) {
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }
//         return new int [] {-1,-1};
//     }

//     public static void main(String[] args) {
//         int matrix[][] = { { 4, 2, 5, 1, 4, 5 },
//                 { 2, 9, 3, 2, 3, 2 },
//                 { 1, 7, 6, 0, 1, 3 },
//                 { 3, 6, 2, 3, 7, 2 }
//         };
//         int result[] = findpeak(matrix);
//         System.out.println("The greatest peak Element is: [" + result[0] +","+ result[1]+"]");
//     }
// }


// Median of Row Wise Sorted Matrix

// import java.util.Arrays;

// public class BinarySearch {

//     public static void TwoDMedian(int matrix [][]) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int matrixlen = n * m;
//         int temp [] = new int [matrixlen];
//         int k = 0;
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < m; j++) {
//                 temp[k] = matrix[i][j];
//                 k++;
//             }
//         }
//         Arrays.sort(temp);
//         int low = 0;
//         int high = temp.length - 1;
//         int mid = (low + high) / 2;
//         if (matrixlen % 2 == 0) {
//             System.out.println("Median: " + (temp[mid] + temp[mid + 1]) / 2.0);
//         } else {
//             System.out.println("Median: " + temp[mid]);
//         }
//     }

//     public static void main(String[] args) {
//         int matrix[][] = { { 1, 5, 7, 9, 11},
//                            { 2, 3, 4, 5, 10},
//                            { 9, 10, 12, 14, 16}
//                          };
//         TwoDMedian(matrix);
//     }
// }
