// import java.util.Scanner;

// public class Strings {

//     public static void PrintString(String fullname) {
//         for(int i=0; i<fullname.length(); i++){
//             System.out.print(fullname.charAt(i) + " ");
//         }
//     }

    
//     public static void main(String[] args) {
//         // char arr[] = {'a','b','c','d'};
//         String str = "abcd";
//         String str2 = new String("xyz");

//         // Strings Are Immutable 
//         // Scanner sc = new Scanner(System.in);
//         // String name;
//         // name = sc.nextLine();
//         // System.out.println(name);
//         // System.out.println(name.length());

//         // Concatenation
//         String firstname = "Onkar";
//         String lastname = "Shelke";
//         String fullname = firstname + " " + lastname;
//         System.out.println(fullname);
        
//         PrintString(fullname);
//     }
// }


// public class Strings {

//     public static boolean Palindrom(String str) {
//         for(int i=0; i<str.length()/2; i++){
//             // System.out.println(".");
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n-1-i)) {
//                 System.out.println("This is not a palindrome");
//                 return false;
//             }
//         }
//         System.out.println("This is a Palindrome");
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "noon";
//         Palindrom(str);
//     }

// }


// array Palindrome

// public class Strings {

//     public static boolean Palindrome(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             int n = arr.length;
//             if (arr[i] != arr[n-1-i]) {
//                 System.out.println("Not a Palindrome");
//                 return false;
//             }
//         }
//         System.out.println("it is a Palindrome");
//         return true;
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,2,1};
//         Palindrome(arr);
//     }
// }



// question-2

// public class Strings {


//     public static float Dirctioncalculation(String str) {
//         int x = 0;
//         int y = 0;
//         for(int i=0; i<str.length(); i++){
//             char dir = str.charAt(i);
//             if (dir == 'S') {
//                 y--;
//             }
//             else if ( dir == 'N') {
//                 y++;
//             }
//             else if ( dir == 'E') {
//                 x++;
//             }
//             else {
//                 x--;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);
//     }


//     public static void main(String args[]) {
//         String str = "NS";
//         // Dirctioncalculation(str);
//         System.out.println(Dirctioncalculation(str));
//     }
// }

// Comparison 
//  public class Strings {
 
//     public static void main(String[] args) {
//         String S1 = "Tony";
//         String S2 = "Tony";
//         String S3 = new String("Tony");

//         // if (S1 == S2) {
//         //     System.out.println("Strings are equal");
//         // }
//         // else{
//         //     System.out.println("Strings are not Equal");
//         // }

//         // if (S1 == S3) {
//         //     System.out.println("Strings are equal");
//         // }
//         // else{
//         //     System.out.println("Strings are not Equal");
//         // }

//         if (S1.equals(S2)) {
//             System.out.println("Strings are equal");
//         }
//         else{
//             System.out.println("Strings are not Equal");
//         }

//         if (S1.equals(S3)) {
//             System.out.println("Strings are equal");
//         }
//         else{
//             System.out.println("Strings are not Equal");
//         }

        
//     }
//  }



// Find Sub array 


// public class Strings {

//     public static String substring(String str , int si , int ei) {
//         String substringcreate = " ";
//         for(int i=si; i<ei; i++){
//             substringcreate += str.charAt(i);
//         }
//         return substringcreate;
//     }

//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         int si = 0;
//         int ei = 5;
//         // substring(str, si, ei);
//         System.out.println(substring(str, si, ei));
//         System.out.println(str.substring(0,5));
//         System.out.println(str.substring(0,4));
//     }
// }


// question - 3


// public class Strings {

//     public static void main(String[] args) {
//         String fruits[] = {"apple" , "banana" , "mango"};

//         String largest = fruits[0];
//         for(int i=1; i<fruits.length; i++){
//            if (largest.compareTo(fruits[i]) < 0){
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }


// String_Builder 

// public class Strings {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a'; ch<='z'; ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb);
//         System.out.println(sb.length());
//     }
// }




// public class Strings {

//     public static String toUpperrcase(String str) {
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<str.length(); i++){
//             if (str.charAt(i) == ' ' && i<str.length()-1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             }
//             else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
        
//     }

//     public static void main(String[] args) {
//         String str = "hi i am shradha";
//         System.out.println(toUpperrcase(str));
//     }
// }


public class Strings {

    public static String compressedstring(String str) {
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbbccc";
        // compressedstring(str)
        System.out.println(compressedstring(str));
    }
}