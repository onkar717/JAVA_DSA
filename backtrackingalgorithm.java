// public class backtrackingalgorithm {

//     public static void changearr( int arr [] , int i , int value) {
//         // Base Case 
//         if (i == arr.length) {
//             printArr(arr);
//             return;
//         }

//         // Kam (Recursion)
//         arr[i] = value;
//         changearr(arr, i+1, value+1);
//         arr[i] = arr[i] - 2;
//     }

//     public static void printArr( int arr []) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = new int [5];
//         changearr(arr , 0 , 1);
//         printArr(arr);
//     }
// }


// public class backtrackingalgorithm {

//     public static int gridWays(int row , int col , int n , int m) {
//         if (row == n-1 && col == m-1) { // Base case for last cell
//             return 1;
//         }
//         else if (row == n || m == col) { // Out of boundary condition
//             return 0;
//         }

//         int w1 = gridWays(row+1, col, n, m);
//         System.out.println(w1);
//         int w2 = gridWays(row, col+1, n, m);
//         System.out.println(w2);
//         return w1 + w2;
//     }

//     public static void main(String[] args) {
//         int n = 3; 
//         int m = 3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }

public class backtrackingalgorithm {

    public static boolean isSafe( int sudoku[][], int row , int col , int digit) {
        // column
        for(int i=0; i<=8; i++){
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // Row
        for(int j=0; j<=8; j++){
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // grid
        int startrow = (row/3) * 3;
        int startcolumn = (col/3) * 3;
        // Grid 3X3
        for(int i=startrow; i<startrow+3; i++){
            for(int j=startcolumn; j<startcolumn; j++){
                if (sudoku[row][col] == digit) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean sudokusolver( int sudoku[][] , int row , int col) {
        // Base -Case
        if (row == 9) {
            return true;
        }
        // Recursion
        int nextRow = row , nextCol = col+1;
        if (col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }
        
        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if (isSafe(sudoku , row , col ,digit)) {
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printsudoku(int sudoku[][]) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.println(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,3,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};
    if (sudokusolver(sudoku, 0, 0)) {
        System.out.println("Solution Exists");
    }
    else{
        System.out.println("Solution does not Exists");
    }
    }
}