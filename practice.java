// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();            
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// public class practice {

    // public static void bublesort( int arr []) {
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=0; j<arr.length-1-i; j++){
    //             if (arr[j] > arr[j+1]) {
    //                 int temp = arr[j];
    //                 arr[j]  = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    // public static void selectionsort(int arr []) {
    //     for(int i=0; i<arr.length; i++){
    //         int omi = i;
    //         for(int j=i; j<arr.length; j++){
    //             if (arr[omi] > arr[j]) {
    //                 omi = j;
    //             }
    //         }
    //         int temp = arr[i];
    //         arr[i] = arr[omi];
    //         arr[omi] = temp;
    //     }
    // }

//     public static void insertionsort(int arr []) {
//         for(int i=1; i<arr.length; i++){
//             int j = i;
//             while ( j>0 && arr[j-1] > arr[j]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j-1];
//                 arr[j-1] = temp;
//                 j--;
//             }
//         }
//     }

//     public static void printArr( int arr []) {
//         for(int i=0; i<arr.length; i++){
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//         }

//     public static void main(String args[]) {
//         int arr [] = {5,4,3,8,7,2,1};
//         // bublesort(arr);
//         // selectionsort(arr);
//         insertionsort(arr);
//         printArr(arr);
//     }
// }


// public class practice {

//     public static boolean searchsorted(int matrix[][] , int key) {
//         int row = 0;
//         int col = matrix[0].length-1;
//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.print("The Key is found");
//                 return true;
//             }
//             else if(key < matrix[row][col]){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//         }
//         System.out.print("Key is Not Found");
//         return false;
//     }

        

//     public static void main(String args[]) {
        // int matrix [][] = {{1,2,3,4},
        //                     {5,6,7,8},
        //                     {9,10,11,12},
        //                     {13,14,15,16}
        //                     };
//         int key = 15;
//         searchsorted(matrix , key);

//     }
// }



// public class practice {

//     public static void diagonal(int matrix[][]) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int sum = 0;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if (i==j) {
//                     sum += matrix[i][j];
//                 }
//                 if (i+j == matrix.length -1) {
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         System.out.print("The Sum of Diagonal is = " + sum);
//     }


//     public static void main(String args[]) {
//         int matrix [][] = {{1,2,3,4},
//         {5,6,7,8},
//         {9,10,11,12},
//         {13,14,15,16}
//         };
//         diagonal(matrix);
//     }
// }