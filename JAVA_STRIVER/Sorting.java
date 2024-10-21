// public class Sorting {

//     // Selection_Sort
//     // public static void selectionsort(int arr []) {
//     //     int n = arr.length;
//     //     for(int i=0; i<=n-2; i++){
//     //         int minpos = i;
//     //         for(int j=i; j<=n-1; j++){
//     //             if (arr[j] < arr[minpos]) {
//     //                 minpos = j;
//     //             }
//     //         }
//     //         int temp = arr[minpos];
//     //         arr[minpos] = arr[i];
//     //         arr[i] = temp;
//     //     }
//     // }

//     // Bublesort
//     public static void bublesort(int arr []) {
//         int n = arr.length;
//         for(int i=0; i<=n-1; i++){
//             for(int j=0; j<n-1; j++){
//                 if (arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
    
//     // Insertion Sort
//     // public static void insertionsort(int arr[]) {
//     //     int n = arr.length;
//     //     for(int i=0; i<=n-1; i++){
//     //         int j =i;
//     //         while ( j>0 && arr[j-1] > arr[j]) {
//     //             // swap 
//     //             int temp = arr[j-1];
//     //             arr[j-1] = arr[j];
//     //             arr[j] = temp;
//     //             j--;
//     //         }
//     //     }
//     // }
//     public static void printaarr(int arr []){
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr [] = {8, 6, 2, 5, 1};
//         // selectionsort(arr);
//         bublesort(arr);
//         // insertionsort(arr);
//         printaarr(arr);
//     }
// }


// import java.util.*;

// class Solution {
//     private static void merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> temp = new ArrayList<>(); // temporary array
//         int left = low;      // starting index of left half of arr
//         int right = mid + 1;   // starting index of right half of arr

//         //storing elements in the temporary array in a sorted manner//

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }

//         // if elements on the left half are still left //

//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }

//         //  if elements on the right half are still left //
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }

//         // transfering all elements from temporary to arr //
//         for (int i = low; i <= high; i++) {
//             arr[i] = temp.get(i - low);
//         }
//     }

//     public static void mergeSort(int[] arr, int low, int high) {
//         if (low >= high) return;
//         int mid = (low + high) / 2 ;
//         mergeSort(arr, low, mid);  // left half
//         mergeSort(arr, mid + 1, high); // right half
//         merge(arr, low, mid, high);  // merging sorted halves
//     }
// }
// public class Sorting {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = 7;
//         int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
//         System.out.println("Before sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         Solution.mergeSort(arr, 0, n - 1);
//         System.out.println("After sorting array: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

// }


// Merge Sorting




    // public class Sorting {
    //     public static void printarr(int arr[]) {
    //         for(int i=0; i<arr.length; i++){
    //             System.out.print(arr[i]+" ");
    //         }
    //         System.out.println();
    //     }
    //     public static void divideconquer(int arr [] , int si , int ei) {
    //         // Base case
    //         if ( si >= ei) {
    //             return;
    //         }
    //         int mid = (si + ei) /2;
    //         divideconquer(arr, si, mid);
    //         divideconquer(arr, mid+1, ei);
    //         merge(arr, si, ei, mid);
    //     }
    //     public static void merge(int arr[] , int si , int ei , int mid) {
    //         int temp [] = new int [ei-si+1];
    //         int left = si;
    //         int right = mid + 1;
    //         int k = 0;

    //         while (left <= mid && right <= ei) {
    //             if (arr[left] < arr[right]) {
    //                 temp[k] = arr[left];
    //                 left++;
    //             }
    //             else{
    //                 temp[k] = arr[right];
    //                 right++;
    //             }
    //             k++;
    //         }

    //         while ( left <= mid) {
    //             temp[k++] = arr[left++];
    //         }

    //         while (right <= ei) {
    //             temp[k++] = arr[right++];
    //         }

    //         for(k=0,left=si; k<temp.length; k++,left++){
    //             arr[left] = temp[k];
    //         }
    //     }

    //     public static void main(String[] args) {
    //         int arr [] = {9,7,8,6,4,2,3,4,7,9};
    //         int n = arr.length-1;
    //         divideconquer(arr,0,n);
    //         printarr(arr);
    //     }
    // }



// public class Sorting {
//     public static void printarr(int arr []) {
//         for(int i=0; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void Quicksort(int arr[] , int si , int ei) {
//         // base case 
//         if (si >= ei) {
//             return;
//         }
//         int pidx = partition(arr, si, ei);
//         Quicksort(arr, si, pidx-1);
//         Quicksort(arr, pidx+1, ei);
//     }

//     public static int partition(int arr[] , int si , int ei) {
//         int pivot = arr[ei];
//         int i = si - 1;
//         for(int j=si; j<ei; j++){
//             if (arr[j] < pivot) {
//                 i++;
//                 // swap;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
        // // last to add the pivot the array at its correct position
        // i++;
        // int temp = pivot;
        // arr[ei] = arr[i];
        // arr[i] = temp;
        // return i;
//     }

//     public static void main(String[] args) {
//         int arr [] = {4,3,9,8,6,1,2,4,7};
//         Quicksort(arr, 0, arr.length-1);
//         printarr(arr);
//     }
// }



// Practice 

// Buble Sort - Optimized buble_sort

// public class Sorting {

//     public static void Bublesort(int arr[]) {
//         int n = arr.length-1;
//         for(int i=0; i<n; i++){
//             int swap = 0;
//             for(int j=0; j<n-i; j++){
//             System.out.println("hello");
//                 if (arr[j] > arr[j+1]) {
//                     // swap 
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap = 1;
//                 }
//             }
//             if (swap == 0) {
//                 break;
//             }
//         }
//     }

//     public static void printarr(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//                 System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
        // int arr [] = {0 ,1, 2 , 4 ,5, 7, 8, 9 };
//         Bublesort(arr);
//         printarr(arr);
//     }
// }


// Selection_Sort

// public class Sorting {

//     public static void Selection_Sort(int arr []) {
//         int n = arr.length;
//         for(int i=0; i<=n-2; i++){
//             int min = i;
//             for(int j=i; j<n; j++){
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }
//             // Swap
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printaarr(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
        // int arr [] = { 9 , 1 , 4 , 6 , 2 , 7 , 3 , 8};
//         Selection_Sort(arr);
//         printaarr(arr);
//     }
// }



// public class Sorting {

//     public static void Insertion_Sort(int arr []) {
//         int n = arr.length-1;
//         for(int i=0; i<=n; i++){
//             int j = i;
//             while ( j > 0 && arr[j-1] > arr[j]) {
//                 // swap
//                 int temp = arr[j-1];
//                 arr[j-1] = arr[j];
//                 arr[j] = temp;
//                 j--;
//             }
//         }

//     }

//     public static void printaarr( int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
        // int arr [] = { 9 , 1 , 4 , 6 , 2 , 7 , 3 , 8};
//         Insertion_Sort(arr);
//         printaarr(arr);
//     }
// }


// public class Sorting {

//     public static void printaarr(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(int arr[] , int si , int ei) {
//         // Base case 
//         if (si >= ei) {
//             return;
//         }
//         int mid = (si + ei) / 2;
//         mergeSort(arr, si, mid); // left array 
//         mergeSort(arr, mid+1, ei); // right array
//         mergethesort(arr, si, ei, mid);
//     }
//     public static void mergethesort(int arr [] , int si , int ei , int mid) {
//         int temp [] = new int [ei-si+1];
//         int k = 0; // for kepp tracking iteration
//         int left = si;
//         int right = mid+1;

//         while (left <= mid && right <= ei) {
//             if (arr[left] < arr[right]) {
//                 temp[k] = arr[left];
//                 left++;
//             }
//             else{
//                 temp[k] = arr[right];
//                 right++;
//             }
//             k++;
//         }

//         while (left <= mid) {
//             temp[k++] = arr[left++];
//         }

//         while (right <= ei) {
//             temp[k++] = arr[right++];
//         }

//         // copying elements to original array 
//         for(k=0, left=si; k<temp.length; k++,left++){
//             arr[left] = temp[k];
//         }
//     }
//     public static void main(String[] args) {
        // int arr [] = { 9 , 1 , 4 , 6 , 2 , 7 , 3 , 8};
//         mergeSort(arr , 0 , arr.length-1);
//         printaarr(arr);
//     }
// }

// Quick Sort

// public class Sorting {

//     public static void Quicksort (int arr [] , int si , int ei){
//         if (si >= ei) {
//             return;
//         }
//         int pidx = partition(arr , si , ei);
//         Quicksort(arr, si, pidx-1);
//         Quicksort(arr, pidx+1, ei);

//     }
//     public static int partition(int arr[] , int si , int ei) {
//         int pivot = arr[ei];
//         int i = si-1;
//         for(int j=si; j<ei; j++){
//             if (arr[j] >= pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         // pivot swap
//         // last to add the pivot the array at its correct position
        // i++;
        // int temp = pivot;
        // arr[ei] = arr[i];
        // arr[i] = temp;
        // return i;
//     }
//     public static void printarr( int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
        // int arr [] = { 9 , 1 , 4 , 6 , 2 , 7 , 3 , 8};
//         Quicksort(arr, 0, arr.length-1);
//         printarr(arr);
//     }
// }


public class Sorting {

// Buble Sort
    // public static void Bubblesort(int arr[]) {
    //     int n = arr.length-1;
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if (arr[j] > arr[j+1]) {
    //                 // Swap
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

// Selection Sort
    // public static void selectionsort(int arr[]) {
    //     int n = arr.length-1;
    //     for(int i=0; i<=n; i++){
    //         int min = i;
    //         for(int j=i; j<=n; j++){
    //             if (arr[j] < arr[min]) {
    //                 min = j;
    //             }
    //         }
    //         // Swap
    //         int temp = arr[i];
    //         arr[i] = arr[min];
    //         arr[min] = temp;
    //     }
    // }

// Insertion_Sort

        // public static void Insertion_Sort(int arr[]) {
        //     int n = arr.length-1;
        //     for(int i=0; i<=n; i++){
        //         int j = i;
        //         while (j > 0 && arr[j-1] > arr[j]) {
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = temp;
        //             j--;
        //         }
        //     }
        // }

// Merge_Sort 

    // public static void mergesort(int arr [] , int si , int ei) {
    //     if (si >= ei) {
    //         return;
    //     }
    //     int mid = (si + ei) / 2;
    //     mergesort(arr, si, mid);// Sort by itself hypothetically = Left-side
    //     mergesort(arr, mid+1, ei);// Sort by itslef hypothetically = right-side
    //     merge(arr, si, ei, mid);
    // }

    // public static void merge(int arr[] , int si , int ei , int mid) {
    //     int temp [] = new int [ei-si+1];
    //     int k =0;
    //     int left = si;
    //     int right = mid+1;

    //     while (left <= mid && right <= ei) {
    //         if(arr[left] < arr[right]){
    //             temp[k] = arr[left];
    //             left++;
    //         }
    //         else{
    //             temp[k] = arr[right];
    //             right++;
    //         }
    //         k++;
    //     }

    //     while (left <= mid) {
    //         temp[k] = arr[left];
    //         k++;
    //         left++;
    //     }

    //     while (right <= ei) {
    //         temp[k] = arr[right];
    //         k++;
    //         right++;
    //     }

    //     for(k=0 ,left=si; k<temp.length; k++,left++){
    //         arr[left] = temp[k];
    //     }

    // }

    public static void Quicksort(int arr[] , int si ,int ei) {
        if (si >= ei) {
            return;
        }
        
        int pidix = partition(arr, si, ei);
        Quicksort(arr, si, pidix-1);
        Quicksort(arr, pidix+1, ei);
    }

    public static int partition(int arr[] , int si , int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for(int j=si; j<ei; j++){
            // swap 
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot its position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printaarr(int arr []) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = { 9 , 1 , 4 , 6 , 2 , 7 , 3 , 8};
        // Bubblesort(arr);
        // selectionsort(arr);
        // Insertion_Sort(arr);
        // mergesort(arr , 0 , arr.length-1);
        Quicksort(arr,0,arr.length-1);
        printaarr(arr);
    }
}