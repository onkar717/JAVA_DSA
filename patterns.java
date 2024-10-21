// Day - 4 9/1/23 
// holllow_Rectangle 
// public class patterns {
//     public static void hallow_rectangle(int totRows , int totCols){
//         for(int i =1; i <= totRows; i++){
//             // Outer Loop
//             for(int j =1; j <= totCols; j++){
//                 // Inner loop
//                 if (i ==1 || i == totRows || j ==1 || j == totCols) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         hallow_rectangle(10, 10);
//     }
// }

// Half Pyramid 

// public class patterns {
//     public static void half_pyramid(int n){
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= n-i +1; j++){
//                 System.out.print(j);
//             }
//             for(int j = 1; j < i; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         half_pyramid(6);
//     }
// }

// Floyd Triangle 

// public class patterns {
//     public static void Floydtriangle(int n) {
//         int counter = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j=1; j <= i ; j++){
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             // for(int j = 1; j <= n-i+1  ; j++){
//             //     System.out.print(" ");
//             // }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         Floydtriangle(4);
//     }
// }


// 0-1 Trangles 

// public class patterns {

//     public static void zero_one(int n) {
//         for(int i=0; i <= n; i++){
//             for(int j = 0; j <= i; j++){
//                 if ((i+j) % 2 ==0) {
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//       zero_one(5);  
//     }
// }


// Butter Fly Pattern


// Solid Rhombus 

// public class patterns {
//     public static void Solid_rhombus(int n){
//         for(int i = 1; i < n; i++){
//             for(int j = 1; j < n - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j < n; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         Solid_rhombus(8);
//     }
// }


//  hollow_Rhombus 
// Dry run karna padega 

// public class patterns {
//     public static void hollow_rhombus(int n){
//         for(int i =1; i <= n; i++){
//             //spaces
//             for(int j = 1; j <= (n - i); j++){
//                 System.out.print(" ");
//             } 
//             // hollow_rectangle 
//             for(int j = 1; j <=n ; j++){
//                 if (i ==  1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
                
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         hollow_rhombus(5);
//     }
// }


// Diamond pattern 

public class patterns {

    public static void daimond_pattern(int n) {
        for(int i = 1; i<=n; i++){
            //spaces 
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.err.println();
        }
//second half 
         for(int i = n; i>=1; i--){
            //spaces 
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }

     public static void main(String args[]) {
        daimond_pattern(4);
     }
}