// public class divideconquer {
//     // Print array
//     public static void printarr(int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void mergesort(int arr[] , int si , int ei)  {
//         // si = 0;
//         // ei = arr.length = eg:6
//         // (0+6)/2 = 3
//         //base Case 
//         if (si >= ei) { // 0 >= 6
//             return;
//         }
//         // Recursion fucntion to divide and conquer the array 
//         int mid = (si + ei)/2;
//         mergesort(arr,  si , mid);
//         mergesort(arr, mid+1 , ei);
//         merge(arr , si ,mid, ei);
//     }

//     //Merging sorted array in the temporary array
//     public static void merge(int arr[]  , int si , int mid , int ei) {
//         // to store elements temprory array
//         int temp[] = new int[ei-si+1];
//         int left = si; // iterator for left part
//         int right = mid + 1; //iterator for right part
//         int k = 0; // ierator for temp array 


//         // store two divided array elements in temproray stored 
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


//         // to store remaing elements 

//         // Left part 
//         while (left<=mid) {
//             temp[k++] = arr[left++];
//         }

//         // right part 
//         while (right<=ei) {
//             temp[k++] = arr[right++];
//         }

//         // Copying the temp array to the original array 
//         for(k=0, left=si; k<temp.length; k++,left++){
//             arr[left] = temp[k];
//         }

//     }

//     public static void main(String args[]) {
//         int arr[] = {6,3,8,4,9,1,7,2 };
//         mergesort(arr , 0 , arr.length-1);
//         printarr(arr);
//     }
// }
public class divideconquer {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); // left
        quickSort(arr, pidx+1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; //to make place for else smaller than pivot 
        for(int j=si; j<ei; j++){
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 , -5 };
        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}


// public class divideconquer {

//     public static int search( int arr[] ,int target , int si ,int  ei) {

//         if (si > ei) {
//             return -1;
//         }

//         //kam 
//         int mid = si + (ei - si) / 2;
//         if (arr[mid] == target) {
//             return mid;
//         }

//         // mid on L1
//         if (arr[si] <= arr[mid]) {
//             // case a : left
//             if (arr[si] <= target && target <= arr[mid]) {
//                 return search(arr , target , si , mid);
//             }
//             else {
//                 //case: b:right
//                 return search(arr , target , mid+1 , ei);
//             }
//         }
//         // mid on Line = 2
//         else {
//             //case : c :right 
//             if (arr[mid] <= target && target <= arr[ei]) {
//                 return search(arr , target , mid+1 , ei);
//             }
//             else{
//                 //case:d : left
//                 return search(arr , target , si , mid);
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int arr [] = {4,5,6,7,0,1,2};
//         int target = 6;
//         int targetindex = search(arr , target , 0 , arr.length-1);
//         System.out.println(targetindex);
//     }
// }