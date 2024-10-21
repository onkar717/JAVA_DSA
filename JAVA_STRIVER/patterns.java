// public class patterns {
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }

//             for(int j=1; j<=2 * (n - i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=i; j>=1; j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
            
//     }
// }q



// public class patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         int num = 1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(num+" ");
//                 num += 1;
//             }
//             System.out.println();
//         }
//     }
// }


// public class patterns {

//     public static void main(String[] args) {
//         int n = 3;
//         for(int i=0; i<n; i++){
//             for(char ch = 'A'; ch <= 'A' + i; ch++){
//                 System.out.print(ch+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n; i>=0; i--){
//             for(char ch = 'A'; ch <= 'A' + i; ch++){
//                 System.out.print(ch+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 0; i < n; i++){
//             char ch = (char)('A' + i); // Corrected line
//             for(int j = 0; j <= i; j++){
//                 System.out.print(ch + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i=0; i<=n; i++){
//             for(int j=0; j<=n-i-1; j++){
//                 System.out.print(" ");
//             }
//             char ch = 'A';
//             int breakepoint = (2*i+1) / 2;
//             for(int j=1; j<=2*i+1; j++){
//                 System.out.print(ch);
//                 if (j <= breakepoint) {
//                     ch++;
//                 }
//                 else{
//                     ch--;
//                 }            }
//             for(int j=0; j<=n-i-1; j++){
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns {

//     public static void main(String[] args) {
//         int n=4;
//         for(int i=0; i<=n; i++){
//             for(char ch =  'C'; ch <= ch; ch--){
//                 System.out.print(ch);
//             }
//             System.out.println();
//         }
//     }
// }


// public class patterns {

//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n; i>=1; i--){
//             for(int j=n; j>=i; j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// 18
// public class patterns {

//     public static void main(String[] args) {
//         char endChar = 'A';
//         for (char ch = 'C'; ch >= endChar; ch--) {
//             for (char innerChar = 'C'; innerChar >= ch; innerChar--) {
//                 System.out.print(innerChar + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 19
// public class patterns {

//     public static void main(String[] args) {
//         int n =3;
//         int spaces = 0;
//         for(int i=0; i<n; i++){
//             // satrs 
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("*");
//             }
//             // spaces 
//             for(int j=0; j<spaces; j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1; j<=n-i; j++){
//                 System.out.print("*");
//             }
//             spaces += 2;
//             System.out.println();
//         }   
//         spaces = 4;
//         for(int i=0; i<n; i++){
//             // stars 
//             for(int j=1; j<=i+1; j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j=0; j<spaces; j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1; j<=i+1; j++){
//                 System.out.print("*");
//             }
//             spaces -= 2;
//             System.out.println();
//         }
        
//     }
// }


// public class patterns {
    
//     public static void main(String[] args) {
//         int spaces = 5;
//         int n = 3;
//         for(int i=0; i<n; i++){
//             // star 
//             for(int j=1; j<=i+1; j++){
//                 System.out.print("*");
//             }
//             //spaces
//             for(int j=0; j<spaces; j++){
//                 System.out.print(" ");
//             }
//             // stars 
//             for(int j=1; j<=i+1; j++){
//                 System.out.print("*");
//             }
//             spaces -= 2;
//             System.out.println();
//         }
//         spaces = 2;
//         for(int i=0; i<n; i++){
//             //stars
//             for(int j=1; j<=n-(i+1); j++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<spaces; j++){
//                 System.out.print(" ");
//             }
//             //stars 
//             for(int j=1; j<=n-(i+1); j++){
//                 System.out.print("*");
//             }
//             spaces += 2;
//             System.out.println();
//         }
//     }
// }


// 21
// public class patterns {

//     public static void main(String[] args) {
//         int n=4;

//         for(int i=0; i<n; i++){
//           for(int j=0; j<n; j++){
//             if (i ==0 || i == n-1 || j == 0 || j == n-1) {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//           }
//             System.out.println();
//         }
//     }
// }

//22
// public class patterns {

//     public static void main(String[] args) {
//         int n =5;
//         for(int i=0; i<2*n-1; i++){
//             for(int j=0; j<2*n-1; j++){
//                 int top = i;
//                 int left = j;
//                 int right = (2*n - 2) - j;
//                 int down = (2*n - 2) - i;
//                 System.out.print((n - Math.min(top, down)) + "," + ( Math.min(left, right)));
//             }
//             System.out.println();
//         }
//     }
// }

