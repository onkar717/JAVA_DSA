// Bublesort 
// public class sorting {
//     public static void bubblesort(int arr[]) {
//         for(int turn=0; turn<arr.length-1; turn++){
//             for(int j=0; j<arr.length-1-turn; j++){
//                 if (arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1]; 
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 1, 3, 2 };
//         bubblesort(arr);
//         printArr(arr);
//     }
// }


// Selection Sort 
// public class sorting {

//     public static void selectionsort(int arr[]){
//         for(int i = 0; i<arr.length - 1; i++){
//             int minpos = i;
//             for(int j = i+1; j<arr.length; j++){
//                 if (arr[minpos] < arr [j]) {
//                     minpos = j;
//                 }
//             }
//             // swap
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr [] = {5, 4, 1, 3, 2};
//         selectionsort(arr);
//         printArr(arr);
//     }
// }

// Insertion-Sort 

// import java.util.*;

// public class sorting {
//     public static void Insertion(int arr []) {
//         for(int i = 1; i<arr.length; i++){
//             int key = arr[i];
//             int j = i -1;
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//     }
    // public static void printArr(Integer arr []) {
    //     for(int i =0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
//     public static void main(String args[]) {
//         Integer arr [] = {5,3,4,1,2};
//         // Insertion(arr);
//         // Built-in Sort methods 
//         Arrays.sort(arr,0,5);
//         Arrays.sort(arr , Collections.reverseOrder());
//         printArr(arr);
//     }
// }


// Counting Sort 

// public class sorting {

//     public static void CountingSort(int arr []) {
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0; i<arr.length; i++){
//             largest = Math.max(largest,arr[i]);
//         }
//         System.out.println(largest);

//         int count [] = new int [largest+1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }
        
//         //sorting
//         int j =0;
//         for(int i = 0; i<count.length; i++){
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void printArr(int arr []) {
//         for(int i =0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr [] = {1,4,1,3,2,4,3,7};
//         CountingSort(arr);
//         printArr(arr);
//     }
// }



// buble Sort 

// public class sorting {
//     public static void Bublesort(int arr[]) {
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if (arr[j] > arr[j+1]) {
//                     // swaping 
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
        
//     }
//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr [] = {5,5,4,1,3,2};
//         Bublesort(arr);
//         printArr(arr);
//     }
// }


// Selection Sort 

// public class sorting {
    
//     public static void selectionsort(int arr []) {
//         for(int i=0; i<arr.length-1; i++){
//             int minpostion = i;
//             for(int j =  i+1; j<arr.length; j++){
//                 if (arr[minpostion] > arr[j]) {
//                     minpostion = j;
//                 }
//             }
//             // Swapping 
//             int temp = arr[minpostion];
//             arr[minpostion] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void printArr(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr [] = {4,5,1,3,2};
//         selectionsort(arr);
//         printArr(arr);
//     }
// }


// public class sorting {

//     public static void insertionsort(int arr []) {
//         for(int i=1; i<arr.length; i++){
//             int currrent = arr[i];
//             int previous = i - 1;
//             //Finding Out the correct position to insert 
//             while (previous >= 0 && arr[previous] < currrent) {
//                 arr[previous+1] = arr[previous];
//                 previous--;
//             }
//             // Insertion 
//             arr[previous+1] = currrent;
//         }
//     }
//     public static void printArr(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void main(String args[]) {
//         int arr [] = {5,4,1,3,2};
//         insertionsort(arr);
//         printArr(arr);
//     }
// }

// Inbuilt-Sort 

// import java.util.*;

// public class sorting {

//     public static void printArr(Integer arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         Integer arr [] = {5,4,1,3,2};
//         // Arrays.sort(arr);
//         // Arrays.sort(arr ,0,3);
//         Arrays.sort(arr,0,5,Collections.reverseOrder());
//         printArr(arr);
//     }
// }

// public class sorting {
    
//     public static void Bublesort(int arr []) {
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if (arr[j] > arr[j+1]) {
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr [] = {5,4,1,3,2};
//         Bublesort(arr);
//         printArr(arr);
//     }
// }


// public class sorting {

//     public static void selectionsort(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             int minpostion = i;
//             for(int j=i; j<arr.length; j++){
//                 if (arr[minpostion] > arr[j]) {
//                     minpostion = j;
//                 }
//             }
//             // sort 
//             int temp = arr[minpostion];
//             arr[minpostion] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr [] = {5,4,1,3,2};
//         selectionsort(arr);
//         printArr(arr);
//     }
// }


// Striver Bhai hai 
// public class sorting {

//     public static void insertion_sort(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             int j = i;
//             while ( j>0 && arr[j-1] > arr[j]) {
//                 // swaping if condition is true 
//                 int temp = arr[j];
//                 arr[j] = arr[j-1];
//                 arr[j-1] = temp;
//                 j--;
//             }
//         }
//     }

//     public static void printArr(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }


//     public static void main(String args[]) {
//         int arr [] = {5,45,63,21,55,87,0,15,65};
//         insertion_sort(arr);
//         printArr(arr);
//     }
// }

// public class sorting {

//     public static void CountingSort(int arr []) {       
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }

//         System.out.println(largest);

//         int count [] = new int [largest+1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         }
//         System.out.println(count);  

//         //Sorting
//         int j=0;
//         for(int i=0; i<count.length; i++){
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void printArr(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr [] = {4,4,1,3,2};
//         CountingSort(arr);
//         printArr(arr);
//     }
// }
// Counting Sort 



// selection sort 

// public class sorting {

    // public static void insertion_sort(int arr []) {
    //     for(int i=0; i<arr.length-1; i++){
    //         int j = i+1;
    //         while ( j>0 && arr[j-1] > arr[j]) {
    //             // swap 
    //             int temp = arr[j]; 
    //             arr[j] = arr[j-1];
    //             arr[j-1] = temp;
    //             j--;
    //         }
    //     }
    // }

    // public static void selectionsort(int arr[]) {
    //     for(int i=0; i<arr.length; i++){
    //         int minpos = i;
    //         for(int j=i+1; j<arr.length; j++){
    //             if (arr[minpos] > arr[j]) {
    //                 minpos = j;
    //             }
    //         }
    //         // swap 
    //         int temp = arr[i];
    //         arr[i] = arr[minpos];
    //         arr[minpos] = temp;
    //     }
    // }


    // public static void Bublesort(int arr[]) {
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=0; j<arr.length-1-i; j++){
    //             // swap 
    //             if (arr[j] > arr[j+1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }


//     public static void printArr( int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr [] = {5,3,4,1,2};
//         insertion_sort(arr);
//         // selectionsort(arr);
//         // Bublesort(arr);
//         printArr(arr);
//     }
// }




// public class sorting {

//     // public static void subarray(int arr []) {
//     //     for(int i=0; i<arr.length; i++){
//     //         for(int j=0; j<arr.length; j++){
//     //             System.out.print("("+arr[i] + "," + arr[j]+")"+" ");
//     //         }
//     //         System.out.println();
//     //     }
//     // }

//     public static void myarray(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length; j++){
//                 int sum = 0;
//                 for(int k=i; k<=j; k++){
//                     sum += arr[k];
//                     System.out.print(arr[k]+" ");
//                 }
//                 // System.out.print("="+sum);
//                 System.out.println();
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr [] = {1,2,3,4,5,6,7,8,9};
//         // subarray(arr);
//         myarray(arr);
//         // System.out.print(subarray(arr));
//     }
// }



