// // Remove outermost Paranthesis	

// public class Strings {

//     public static String removeOuterParentheses(String s) {
//         StringBuilder result = new StringBuilder();
//         StringBuilder currentouter = new StringBuilder();
//         int openCount = 0;
//         for(int i=0; i<s.length(); i++){
//             char c = s.charAt(i);
//             if (c == '(') {
//                 if (openCount > 0) {
//                     currentouter.append(c);
//                 }
//                 openCount++;
//             }
//             else if (c == ')') {
//                 openCount--;
//                 if (openCount > 0) {
//                     currentouter.append(c);
//                 }
//                 else{
//                     result.append(currentouter);
//                     currentouter.setLength(0);
//                 }
//             }
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String s = "()()";
//         System.out.println(removeOuterParentheses(s));
//     }
// }

//

// // reverse the string words 
// public class Strings {

//     public static String reverseWords(String s) {
//         StringBuilder result = new StringBuilder();
//         StringBuilder word = new StringBuilder();

//         for(int i=s.length()-1; i >= 0; i--){
//             char c = s.charAt(i);
//             if (c != ' ') {
//                 word.insert(0, c);
//             }
//             else if (word.length() > 0) {
//                 if (result.length() > 0) {
//                     result.append(' ');
//                 }
//                 result.append(word);
//                 word.setLength(0);
//             }
//         }
//         // add the last word (if any) to the result 
//         if (word.length() > 0) {
//             if (result.length() > 0) {
//                 result.append(' ');
//             }
//             result.append(word);
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String s = "The Sky is Blue";
//         System.out.print(reverseWords(s));
//         System.out.println();
//     }
// }

// public class Strings {

//     public static String largestnum(String s []) {
//         String largest = s[0];
//         for(int i=0; i<s.length; i++){
//             if (s[i].compareTo(largest) > 0) {
//                 largest = s[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         String s [] = {"123", "154" , "45" , "12"};
//         System.out.println(largestnum(s));
//         System.out.println();
//     }
// }

// finding the largest number from the Sting 
// public class Strings {

//     public static String largestnum(String s []) {
//         String largest = s[0];
//         for(int i=1; i<s.length; i++){
//             if (Integer.parseInt(s[i]) > Integer.parseInt(largest)) {
//                 largest = s[i];
//             }
//         }
//         return largest;
//     }

//     public static void main(String[] args) {
//         String s [] = {"123","154","10","223","1"};
//         System.out.println("The largest Number in String is : " + largestnum(s));
//         System.out.println();
//     }
// }

// Fnd the Largest Odd Number from the string 

// public class Strings {
//     public static String largestOddNumber(String num) {
//         for (int i = num.length() - 1; i >= 0; i--) {
//             char digit = num.charAt(i);
//             if (digit % 2 != 0) {
//                 return num.substring(0, i + 1);
//             }
//         }
//         return "";
//     }

//     public static void main(String[] args) {
//         System.out.println(largestOddNumber("52"));    // Output: "5"
//         System.out.println(largestOddNumber("4206"));  // Output: ""
//         System.out.println(largestOddNumber("35427")); // Output: "35427"
//     }
// }

//  longest common prefix
// public class String {

//     public static String logestcommon(String strs []) {
//         if (strs.length == 0) {
//             return "";
//         }
//         StringBuffer prefix = new StringBuffer(strs[0]);
//         for(int i=1; i<strs.length; i++){
//             String current = strs[i];
//             int j =0;
//             while(j < prefix.length() && j < current.length()) {
//                 if (prefix.charAt(j) != current.charAt(j)) {
//                     prefix.delete(j, prefix.length());
//                     break;
//                 }
//                 j++;
//             }
//             // if (j < prefix.length()) {
//             //     prefix.delete(j , prefix.length()) ;
//             // }
//             if (j == 0) {
//                 return "-1";    
//             }
//         }
//         return prefix.toString();   
//     }

//     public static void main(String[] args) {
//         String strs []  = {"abcd","Abcd","abc"};
//         String result = logestcommon(strs);
//         System.out.println("The Longest Common Prefix " + result);
//     }
// }

// Isomorphic String	

// public class Strings {

//     public static boolean IsomorphicString(String Isomorphic1 , String Isomorphic2) {
//         if (Isomorphic1.length() != Isomorphic2.length()) {
//             return false;
//         }

//         int FstArray [] = new int [256];
//         int SecArray [] = new int [256];

//         for(int i=0; i<Isomorphic1.length(); i++){
//             char fst = Isomorphic1.charAt(i);
//             char sec = Isomorphic2.charAt(i);
//             if (FstArray[fst] == 0 && SecArray[sec] == 0) {
//                 FstArray[fst] = sec;
//                 SecArray[sec] = fst;
//             }
//             else if (FstArray[fst] != sec  && SecArray[sec] != fst) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String Isomorphic1 =  "foo";
//         String Isomorphic2 = "bar";
//         boolean ans = IsomorphicString(Isomorphic1, Isomorphic2);
//         System.out.println(ans);
//     }
// }

// Check if two Strings are anagrams of each other

// import java.util.Arrays;

// public class Strings {

//     static boolean Anagram(String Input1, String Input2) {
//         if (Input1.length() != Input2.length()) {
//             return false;
//         }

//         char[] charArray1 = Input1.toCharArray();
//         char[] charArray2 = Input2.toCharArray();

//         Arrays.sort(charArray1);
//         Arrays.sort(charArray2);

//         for (int i = 0; i < Input1.length(); i++) {
//             if (charArray1[i] != charArray2[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String Input2 = "silent";
//         String Input1 = "listen";
//         System.out.println(Anagram(Input1, Input2));
//     }
// }

// public class Strings {

//     public static boolean canBecomeGoal(String s, String goal) {
//         // Check if the lengths of s and goal are equal
//         if (s.length() != goal.length()) {
//             return false;
//         }

//         // Concatenate s with itself
//         String concatenated = s + s;

//         // Check if goal is a substring of concatenated s
//         return concatenated.contains(goal);
//     }

//     public static void main(String[] args) {
//         String s = "abcde";
//         String goal = "cdeab";
//         System.out.println(canBecomeGoal(s, goal)); // Output: true
//     }
// }


// Reverse Words

// public class Strings {

//     public static String Reverse(String name) {
//         StringBuilder Result = new StringBuilder();
//         StringBuilder word = new StringBuilder();
//         for(int i=name.length()-1; i >= 0; i--){
//             char ch = name.charAt(i);
//             if (ch != ' ') {
//                 word.insert(0, ch);
//             }
//             else if (word.length() > 0) {
//                 if (Result.length() > 0) {
//                     Result.append(" ");
//                 }
//                 Result.append(word);
//                 word.setLength(0);
//             }
//         }
//         if (word.length() > 0) {
//             if (Result.length() > 0) {
//                 Result.append(" ");
//             }
//             Result.append(word);
//             word.setLength(0);
//         }
//         return Result.toString();
//     }
    
//     public static void main(String[] args) {
//         String name = "Welcome to Coding Ninjas";
//         System.out.println(Reverse(name));
//     }
// }


// public class Strings {

//     public static int countSubstrings(String str, int k) {
//         StringBuilder result = new StringBuilder();
//         StringBuilder word = new StringBuilder();
//         char[] charArray1 = str.toCharArray();
//         int count = 0;

//         for (int i = 0; i < charArray1.length; i++) {
//             word.append(charArray1[i]);
//             if (word.length() == k) {
//                 result.append(word).append(" ");
//                 count++;
//                 word.deleteCharAt(0); // Remove the first character to maintain the size <= k
//             } else if (word.length() > k) {
//                 word.setLength(0); // Remove the first character to maintain the size <= k
//             }
//         }
//         System.out.println("Substrings with exactly " + k + " distinct characters: " + result);
//         return count;
//     }

//     public static void main(String[] args) {
//         String str = "qffds";
//         int k = 4;
//         System.out.println(countSubstrings(str, k));
//     }
// }



// public class Strings {

//     public static String longestPalindrome(String s) {
//         if (s == null || s.length() < 1) return "";

//         int start = 0, end = 0;
//         for (int i = 0; i < s.length(); i++) {
//             //When expandAroundCenter is called with the same index for both left and right (e.g., expandAroundCenter(s, i, i)), it's used to find palindromes with odd lengths.
//             int len1 = expandAroundCenter(s, i, i);
//             //When expandAroundCenter is called with adjacent indices for left and right (e.g., expandAroundCenter(s, i, i + 1)), it's used to find palindromes with even lengths
//             int len2 = expandAroundCenter(s, i, i + 1);
//             int len = Math.max(len1, len2);
//             if (len > end - start) {
//                 start = i - (len - 1) / 2;
//                 end = i + len / 2;
//             }
//         }
//         return s.substring(start, end + 1);
//     }

//     public static int expandAroundCenter(String s, int left, int right) {
//         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//             left--;
//             right++;
//         }
//         return right - left - 1;
//     }

//     public static void main(String[] args) {
//         String s = "cbbd";
//         System.out.println("Longest palindromic substring of '" + s + "' is: " + longestPalindrome(s));
//     }
// }
    


// import java.util.*;

// public class Strings {
//     public static String frequencySort(String s) {
//         // Count the frequency of each character
//         int[] charCount = new int[128]; // Assuming ASCII characters
        
//         for (char c : s.toCharArray()) {
//             charCount[c]++;
//         }

//         // Sort the characters based on frequency (descending order)
//         for (int i = 0; i < charCount.length; i++) {
//             for (int j = i + 1; j < charCount.length; j++) {
//                 if (charCount[i] < charCount[j]) {
//                     // Swap characters and frequencies
//                     char tempChar = (char) i;
//                     int tempCount = charCount[i];
//                     charCount[i] = charCount[j];
//                     charCount[j] = tempCount;
//                     charCount[j] = tempCount;
//                     charCount[j] = tempCount;
//                     charCount[j] = tempCount;
//                 }
//             }
//         }

//         // Build the sorted string
//         StringBuilder sortedString = new StringBuilder();
//         for (int i = 0; i < charCount.length; i++) {
//             char c = (char) i;
//             int frequency = charCount[i];
//             for (int j = 0; j < frequency; j++) {
//                 sortedString.append(c);
//             }
//         }

//         return sortedString.toString();
//     }

//     public static void main(String[] args) {
//         String s = "tree";
//         System.out.println(frequencySort(s)); // Output: "eert"
//     }
// }


