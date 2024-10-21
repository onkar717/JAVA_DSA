// class recursion {
//     static int cnt = 0;
//     static void print(){

//          // Base Condition.
//          if(cnt == 3 ) return;  
//          System.out.println(cnt);

//          // Count incremented.
//          cnt = cnt+1;
//          print();

//     }
//     public static void main(String[] args) {
//         print();
//     }
// }

// print the names N times using recursion

// import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * recursion
 */
// public class recursion {

// public static void printraj(int i , int n) {
// if (i>n) {
// return;
// }

// System.out.println("raj");
// printraj(i+1 , n);
// }

// public static void main(String[] args) {
// int n = 4;
// printraj(1,n);
// }

// }

// Printing The number from n to i and i to n
// public class recursion {

// public static void printn(int i, int n) {
// if ( i == n) {
// return;
// }
// System.out.println(i);
// printn(i+1, n);
// System.out.println();

// }
// public static void printreversen(int n ,int i) {
// if (i == n) {
// return;
// }
// System.out.println(n);
// printreversen(n-1, i);
// System.out.println();
// }

// public static void printagain(int n, int i) {
// if ( i == n) {
// return;
// }

// printagain(n-1 , i);
// System.out.println(n);
// }

// public static void main(String[] args) {
// int n = 10;
// printn(1 , n);
// printreversen(n,0);
// printagain(n , 0);
// }
// }

// print the number from 0 to n and n to 0
// public class recursion {

// public static void recur(int n) {
// if ( n == 10) {
// return;
// }
// System.out.println(n);
// recur(n + 1);
// }

// public static void recurb(int i) {
// if (i == 0) {
// return;
// }
// System.out.println(i);
// recurb(i - 1);
// }

// public static void main(String[] args) {
// int n = 0;
// int i = 10;
// recur(n);
// recurb(i);
// }
// }

// finding the factorial

// public class recursion {

// public static int factorial(int n) {
// if (n==0) {
// return 1;
// }
// return n * factorial(n - 1);
// }

// public static void main(String[] args) {
// int n = 5;
// System.out.println(factorial(n));
// }
// }

// Reverse an Array
// public class recursion {

// public static void reverseArray(int i, int[] arr, int n) {
// if (i >= n / 2) {
// return;
// }

// // Swap elements at i and n indices
// int temp = arr[i];
// arr[i] = arr[n];
// arr[n] = temp;

// // Recur for the remaining array
// reverseArray(i + 1, arr, n-1);
// }

// public static void main(String[] args) {
// int[] arr = {1, 2, 3, 4, 5};
// int i = 0;
// int n = arr.length - 1;
// reverseArray(i, arr, n);

// // Print the reversed array
// for (int j = 0; j < arr.length; j++) {
// System.out.print(arr[j] + " ");
// }
// System.out.println();
// }
// }

// check weather the string is palindrome or not
// public class recursion {

// public static boolean isPalindrome(int i, String name,int a) {
// if (i >= name.length() / 2) {
// return true;
// }

// if (name.charAt(i) != name.charAt(a)) {
// return false;
// }

// return isPalindrome(i + 1, name , a-1);
// }

// public static void main(String[] args) {
// String name = "MAM";
// int a = name.length()-1;
// System.out.print(isPalindrome(0, name,a));
// }
// }

// public class recursion {

// public static int fibonacii(int n) {
// if (n <= 1) {
// return n;
// }
// int last = fibonacii( n -1);
// int secondlast = fibonacii( n - 2);
// return last + secondlast;
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int n = scanner.nextInt();
// System.out.println(fibonacii(n));
// }
// }

// public class recursion {

// public static int fibonacii(int n) {
// if (n <= 1) {
// return n;
// }
// int last = fibonacii( n -1);
// // return ;
// // System.out.println(last);
// return last;

// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int n = scanner.nextInt();
// System.out.println(fibonacii(n));
// // fibonacii(n);
// }
// }

//

// You are given two numbers ’x’(it’s a float), and ’n’(it’s a integer).
// Your task is to calculate ‘x’ raised to power ‘n’, and return it.
// The expected time complexity is ’O(logn)’, and the expected space complexity
// is ’O(1)’, where ‘n’ is the power to which the number should be raised.

// public class recursion {

// public static double mypow(double x , int n) {
// double ans = 1.0;
// long nn = n;
// while (nn != 0) {
// if (nn % 2 == 1) {
// ans = ans * x;
// }
// // else {
// x = x * x;
// nn = nn / 2;
// // }
// }
// return ans;
// }

// public static void main(String[] args) {
// int n = 4;
// double x = 10;
// System.out.println(mypow(x, n));
// }
// }

// Problem statement
// A number is called good if it's every digit (except the rightmost digit) is
// larger than the sum of digits on the right side of that digit.
// Find all the good numbers in the range from 'a' to 'b' (both inclusive), such
// that none of them contains 'digit' as a digit.

// public class recursion {
// private long MOD = 1_000_000_007;

// public long countGoodNumbers(long n) {
// long even = (n + 1) / 2;
// long odd = n / 2;
// long first = pow(5, even);
// long second = pow(4, odd);
// return (first * second) % MOD;
// }

// private long pow(long x, long n) {
// if (n == 0) {
// return 1;
// }
// long temp = pow(x, n / 2) % MOD;
// if (n % 2 == 0) {
// return (temp * temp) % MOD;
// } else {
// return (x * temp * temp) % MOD;
// }
// }

// public static void main(String[] args) {
// recursion solution = new recursion();
// System.out.println(solution.countGoodNumbers(50));
// }
// }

// public class recursion {
// private static final long MOD = 1_000_000_007;

// public static long countGoodNumbers(long n) {
// long even = (n + 1) / 2;
// long odd = n / 2;
// long first = pow(5, even);
// long second = pow(4, odd);
// return (first * second) % MOD;
// }

// private static long pow(long x, long n) {
// if (n == 0) {
// return 1;
// }
// long temp = pow(x, n / 2) % MOD;
// if (n % 2 == 0) {
// return (temp * temp) % MOD;
// } else {
// return (x * temp * temp) % MOD;
// }
// }

// public static void main(String[] args) {
// long result = countGoodNumbers(50);
// System.out.println(result);
// }
// }

// public class recursion {

// public static void findGoodNumbers(int a, int b, int digit) {
// for (int number = a; number <= b; number++) {
// if (String.valueOf(number).contains(String.valueOf(digit))) {
// continue; // Skip numbers containing the forbidden digit
// }
// if (isGoodNumber(number)) {
// System.out.print(number + " ");
// }
// }
// }

// private static boolean isGoodNumber(int number) {
// String numberStr = String.valueOf(number);
// for (int i = 0; i < numberStr.length() - 1; i++) {
// int currentDigit = Character.getNumericValue(numberStr.charAt(i));
// int sum = 0;
// for (int j = i + 1; j < numberStr.length(); j++) {
// sum += Character.getNumericValue(numberStr.charAt(j));
// }
// if (currentDigit <= sum) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// int a = 840;
// int b = 850;
// int digit = 6;
// findGoodNumbers(a, b, digit);
// }
// }

// import java.util.Stack;
// public class recursion {

// public static void sortStack(Stack<Integer> stack) {
// if (!stack.isEmpty()) {
// int temp = stack.pop();
// sortStack(stack);
// insertInSortedOrder(stack, temp);
// }
// }

// public static void insertInSortedOrder(Stack<Integer> stack, int value) {
// if (stack.isEmpty() || stack.peek() <= value) {
// stack.push(value);
// } else {
// int temp = stack.pop();
// insertInSortedOrder(stack, value);
// stack.push(temp);
// }
// }
// public static void main(String[] args) {
// Stack<Integer> stack = new Stack<>();
// stack.push(5);
// stack.push(3);
// stack.push(8);
// stack.push(1);
// stack.push(2);

// sortStack(stack);

// // Print sorted stack
// System.out.println("Sorted Stack:");
// // while (!stack.isEmpty()) {
// // System.out.println(stack.pop());
// // }
// for(int i=0; i<stack.size(); i++){
// System.out.println(stack.get(i)+" ");
// }
// }
// }

// Sort The Stack
// import java.util.Stack;

// public class recursion {

// public static void reverseStack(Stack<Integer> stack) {
// if (!stack.isEmpty()) {
// int temp = stack.pop();
// reverseStack(stack);
// insertAtBottom(stack, temp);
// }
// }

// public static void insertAtBottom(Stack<Integer> stack, int value) {
// if (stack.isEmpty()) {
// stack.push(value);
// } else {
// int temp = stack.pop();
// insertAtBottom(stack, value);
// stack.push(temp);
// }
// }

// public static void main(String[] args) {
// Stack<Integer> stack = new Stack<>();
// stack.push(1);
// stack.push(2);
// stack.push(3);
// stack.push(4);
// stack.push(5);
// reverseStack(stack);
// while (!stack.isEmpty()) {
// System.out.println(stack.pop());
// }
// }
// }

// Reversed Stack
// public class recursion {

// public static void reverseStack(Stack<Integer> stack) {
// if (!stack.isEmpty()) {
// int temp = stack.pop();
// reverseStack(stack);
// insertAtBottom(stack, temp);
// }
// }

// public static void insertAtBottom(Stack<Integer> stack, int value) {
// if (stack.isEmpty()) {
// stack.push(value);
// } else {
// int temp = stack.pop();
// insertAtBottom(stack, value);
// stack.push(temp);
// }
// }

// public static void printstack(Stack<Integer> stack) {
// Stack<Integer> tempStack = new Stack<>();
// while (!stack.isEmpty()) {
// tempStack.push(stack.pop());
// }
// while (!tempStack.isEmpty()) {
// int value = tempStack.pop();
// System.out.print(value + " ");
// stack.push(value);
// }
// System.out.println();
// }

// }

// Power Set
// import java.util.*;
// public class recursion{
// public static ArrayList<String> AllPossibleStrings(String s) {
// int n = s.length();
// ArrayList<String>ans=new ArrayList<>();
// for (int num = 0; num < (1 << n); num++) {
// String sub = "";
// for (int i = 0; i < n; i++) {
// //check if the ith bit is set or not
// if ((num & (1 << i))!=0) {
// sub += s.charAt(i);
// }
// }
// if (sub.length() > 0) {
// ans.add(sub);
// }
// }
// Collections.sort(ans);
// return ans;
// }
// public static void main(String args[])
// {

// String s="abc";
// ArrayList<String>ans = AllPossibleStrings(s);
// //printint all the subsequence.
// System.out.println("All possible subsequences are ");
// for (String it : ans) {
// System.out.print( it+" ");
// }
// System.out.println();

// }
// }

// Given an integer array nums of unique elements, return all possible
// subsets
// (the power set).
// The solution set must not contain duplicate subsets. Return the solution in
// any order.

// import java.util.Arrays;

// public class recursion {
// public static String[] allPossibleStrings(String s) {
// int n = s.length();
// // Calculating the number of subsequences
// int totalSubsequences = (int) Math.pow(2, n);

// String[] ans = new String[totalSubsequences];

// for (int num = 1; num <= totalSubsequences; num++) {
// StringBuilder sub = new StringBuilder();
// for (int i = 0; i < n; i++) {
// // Check if the ith bit is set or not
// if ((num & (1 << i)) != 0) {
// sub.append(s.charAt(i));
// }
// }
// ans[num - 1] = sub.toString();
// }
// // Sorting the array
// Arrays.sort(ans);
// return ans;
// }

// public static void main(String args[]) {
// String s = "abc";
// String[] ans = allPossibleStrings(s);
// // Printing all the subsequences.
// System.out.println("All possible subsequences are ");
// for (int i = 0; i < ans.length; i++) {
// System.out.print(ans[i] + " ");
// }
// }
// }

// public class recursion {

// public static String [] allPossibleString(String s) {
// int n = s.length();
// int totalSubsequences = (int) Math.pow(2 , n);
// String ans [] = new String[totalSubsequences];

// for(int num=1; num<=totalSubsequences; num++){
// StringBuilder sub = new StringBuilder();
// for(int i=0; i<n; i++){
// if ((num & 1<<i)!= 0) {
// sub.append(s.charAt(i));
// }
// }
// ans[num-1] = sub.toString();
// }
// Arrays.sort(ans);
// return ans;
// }

// public static void main(String[] args) {
// String s = "abc";
// // String ans [] = allPossibleStrings(s);
// String ans [] = allPossibleString(s);

// for(int i=0; i<ans.length; i++){
// System.out.print(ans[i]+" ");
// }
// }
// }

// import java.util.*;

// public class recursion {

// public static List<String> allPossibleString(String s) {
// int n = s.length();
// int totalSubsequences = (int) Math.pow(2 , n);
// List<String> ans = new ArrayList<>();

// for(int num = 0; num < totalSubsequences; num++) {
// StringBuilder sub = new StringBuilder();
// for(int i = 0; i < n; i++) {
// if ((num & (1 << i)) != 0) {
// sub.append(s.charAt(i));
// }
// }
// ans.add(sub.toString());
// }
// Collections.sort(ans);
// return ans;
// }

// public static void main(String[] args) {
// String s = "abc";
// List<String> ans = allPossibleString(s);

// for(String str : ans) {
// System.out.println(str);
// }
// }
// }

// You are given two strings 'A' and 'B' of length 'N' and 'M' respectively.
// Return the string that has more distinct subsequences,
// if both strings have the same number of distinct subsequences, then return
// 'A'.

// public class recursion {
// // Function to count distinct subsequences
// public static int countSubsequences(String string) {
// int[] dp = new int[string.length() + 1];
// dp[0] = 1;
// int[] lastOccurrence = new int[256]; // Assuming ASCII characters

// for (int i = 0; i < 256; i++) {
// lastOccurrence[i] = -1; // Initialize all indices to -1
// }

// for (int i = 0; i < string.length(); i++) {
// dp[i + 1] = 2 * dp[i];
// char ch = string.charAt(i);
// if (lastOccurrence[ch] != -1) {
// dp[i + 1] -= dp[lastOccurrence[ch]];
// }
// lastOccurrence[ch] = i;
// }

// return dp[string.length()];
// }

// // Function to find the string with more distinct subsequences
// public static String distinctSubsequences(String A, String B) {
// // Count distinct subsequences for A and B
// int countA = countSubsequences(A);
// int countB = countSubsequences(B);

// // Return the string with more distinct subsequences or A if they are equal
// if (countA >= countB) {
// return A;
// } else {
// return B;
// }
// }

// public static void main(String[] args) {
// int N = 2;
// int M = 2;
// String A = "f";
// String B = "egg";
// String result = distinctSubsequences(A, B);
// System.out.println(result);
// }
// }

// public class recursion {

// public static void findCombination(int index , int n , int target , int ans
// [] , int arr []) {
// if (index == n) {
// if (target == 0) {

// }
// }
// }

// public static void main(String[] args) {
// int arr [] = {1,2,3};
// int index = 0;
// int n = arr.length;
// int target = 5;
// int ans[] = new int[4];
// findCombination(index , n , target , ans , arr);
// }
// }

// Find Combination-I

// import java.io.*;
// import java.util.*;
// class Solution {

// private void findCombinations(int ind, int[] arr, int target, List < List <
// Integer >> ans, List < Integer > ds) {
// if (ind == arr.length) {
// if (target == 0) {
// ans.add(new ArrayList < > (ds));
// }
// return;
// }

// if (arr[ind] <= target) {
// ds.add(arr[ind]);
// findCombinations(ind, arr, target - arr[ind], ans, ds);
// ds.remove(ds.size() - 1);
// }
// findCombinations(ind + 1, arr, target, ans, ds);
// }
// public List < List < Integer >> combinationSum(int[] candidates, int target)
// {
// List < List < Integer >> ans = new ArrayList < > ();
// findCombinations(0, candidates, target, ans, new ArrayList < > ());
// return ans;
// }
// }
// public class recursion {
// public static void main(String[] args) {
// int arr[] = {2,3,6,7};
// int target = 7;
// Solution sol = new Solution();
// List < List < Integer >> ls = sol.combinationSum(arr, target);
// System.out.println("Combinations are: ");
// for (int i = 0; i < ls.size(); i++) {
// for (int j = 0; j < ls.get(i).size(); j++) {
// System.out.print(ls.get(i).get(j) + " ");
// }
// System.out.println();
// }
// }
// }

// public class recursion {

// public static void findCombination(int index, int n, int target, int[] ans,
// int[] arr) {
// if (index == n) {
// if (target == 0) {
// // Print the combination
// for (int i = 0; i < ans.length; i++) {
// if (ans[i] > 0) {
// System.out.print(ans[i] + " ");
// }
// }
// System.out.println();
// }
// return;
// }
// // Include current element
// if (arr[index] <= target) {
// ans[index] = arr[index];
// findCombination(index + 1, n, target - arr[index], ans, arr);
// ans[index] = 0; // Reset for backtracking
// }
// // Exclude current element
// findCombination(index + 1, n, target, ans, arr);
// }

// public static void main(String[] args) {
// int[] arr = {2, 3, 6 ,7};
// int index = 0;
// int n = arr.length;
// int target = 7;
// int[] ans = new int[n]; // Changed size to match n
// findCombination(index, n, target, ans, arr);
// }
// }

// class Solution {
// public List<List<Integer>> combinationSum(int[] candidates, int target) {
// List<List<Integer>> result = new ArrayList<>();
// backtrack(result, new ArrayList<>(), candidates, target, 0);
// return result;
// }

// private void backtrack(List<List<Integer>> result, List<Integer> tempList,
// int[] candidates, int target, int start) {
// if (target < 0) return;
// else if (target == 0) result.add(new ArrayList<>(tempList));
// else {
// for (int i = start; i < candidates.length; i++) {
// tempList.add(candidates[i]);
// backtrack(result, tempList, candidates, remain - candidates[i], i);
// tempList.remove(tempList.size() - 1);
// }
// }
// }
// }

// Find Combination-II;

// public class recursion {

// public static void findCombinations(int indx ,int arr [] , int target ,
// List<List<Integer>> ans , List<Integer> ds) {
// if (target == 0) {
// ans.add(new ArrayList<>(ds));
// return;
// }

// for(int i=indx; i < arr.length; i++){
// if ( i > indx && arr[i] == arr[i-1]) {
// continue;
// }
// if (arr[i] > target) {
// break;
// }

// ds.add(arr[i]);
// findCombinations(i+1, arr, target - arr[i], ans, ds);
// ds.remove(ds.size() - 1);
// }
// }

// public static List<List<Integer>> combinationaum2(int arr[] , int target){
// List<List<Integer>> ans = new ArrayList<>();
// Arrays.sort(arr);
// findCombinations(0 , arr , target , ans , new ArrayList<>());
// return ans;
// }

// public static void main(String[] args) {
// int arr [] = {1,1,1,2,2};
// int target = 4;
// System.out.println(combinationaum2(arr, target));
// }
// }

// public class recursion {

// public static void subsetI(int index ,int sum , int arr [] , int n , int
// subset []) {
// if (index == n) {
// subset = sum;
// return;
// }
// // Pick The Element
// subsetI(index + 1, sum+=arr[index], arr, n, subset);
// // Dont Pick The Element
// subsetI(index + 1, sum, arr, n, subset);
// }

// public static void main(String[] args) {
// int arr [] = {1 , 2 , 3};
// int n = arr.length;
// int sum = 0;
// int subset [] = new int[null];
// // System.out.println(subsetI(0, arr, n));
// subsetI(0, sum , arr, n ,subset);
// }
// }

// subset-I

// import java.util.*;
// class TUF {
// static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int
// N, ArrayList < Integer > sumSubset) {
// if (ind == N) {
// sumSubset.add(sum);
// return;
// }

// // pick the element
// subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

// // Do-not pick the element
// subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
// }

// public static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int
// N) {

// ArrayList < Integer > sumSubset = new ArrayList < > ();
// subsetSumsHelper(0, 0, arr, N, sumSubset);
// Collections.sort(sumSubset);
// return sumSubset;
// }

// public static void main(String args[]) {
// ArrayList < Integer > arr = new ArrayList < > ();
// arr.add(12);
// arr.add(15);
// arr.add(20);
// ArrayList < Integer > ans = subsetSums(arr, arr.size());
// // Collections.sort(ans);
// System.out.println("The sum of each subset is ");
// for (int i = 0; i < ans.size(); i++)
// System.out.print(ans.get(i) + " ");
// }

// }

// Subset-II
// Problem statement
// You are given an sorted integer array of size 'n'.
// Your task is to find and return all the unique subsets of the input array.
// Subsets are arrays of length varying from 0 to 'n', that contain elements of
// the array. But the order of elements should remain the same as in the input
// array.
// Note:
// The order of subsets is not important. You can retzurn the subsets in any
// order. However, in the output, you will see the subsets in lexicographically
// sorted order.
// Output: [[], [12], [12, 15], [12, 15, 20], [12, 20], [15], [15, 20], [20]]

// public class recursion {

// public static void findsubset(int index ,int arr [] , int ds [] , int ans [])
// {
// for(int i=0; i<arr.length; i++){
// if (i != index && arr[i] == arr[i-1]) {
// continue;
// }
// ds = arr[i];
// findsubset(index + 1, arr, ds, ans);
// }
// }

// public static int [] Subset(int arr []) {
// Arrays.sort(arr);
// int [] ds = new int[0];
// int [] ans = new int[0];
// findsubset(0 , arr , ds , ans);
// return ds;
// }

// public static void main(String[] args) {
// int arr [] = {12,15,20};
// Subset(arr);
// }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class recursion {

// public static void findSubsets(int index, int[] arr, List<Integer> ds,
// List<List<Integer>> anslist) {
// anslist.add(new ArrayList<>(ds));
// for (int i = index; i < arr.length; i++) {
// if (i != index && arr[i] == arr[i - 1]) continue; // Avoid duplicate subsets
// ds.add(arr[i]);
// findSubsets(i + 1, arr, ds, anslist); // Pass i + 1 instead of index + 1
// ds.remove(ds.size() - 1);
// }
// }

// public static List<List<Integer>> subset(int[] arr) {
// Arrays.sort(arr);
// List<List<Integer>> anslist = new ArrayList<>();
// findSubsets(0, arr, new ArrayList<>(), anslist);
// return anslist;
// }

// public static void main(String[] args) {
// int[] arr = {12, 15, 20};
// List<List<Integer>> subsets = subset(arr);
// for (List<Integer> subset : subsets) {
// System.out.print(subset);
// }
// }
// }

// import java.util.ArrayList;
// import java.util.List;

// public class recursion {
// public static void printSubsets(int input[]) {
// List<List<Integer>> subsets = new ArrayList<>();
// generateSubsets(input, 0, new ArrayList<>(), subsets);
// for (List<Integer> subset : subsets) {
// for (int num : subset) {
// System.out.print(num + " ");
// }
// System.out.println();
// }
// }

// private static void generateSubsets(int[] input, int index, List<Integer>
// current, List<List<Integer>> subsets) {
// subsets.add(new ArrayList<>(current));
// for (int i = index; i < input.length; i++) {
// current.add(input[i]);
// generateSubsets(input, i + 1, current, subsets);
// current.remove(current.size() - 1);
// }
// }
// public static void main(String[] args) {
// int input [] = {12,15,20};
// printSubsets(input);
// }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// public class recursion {
// // class Solution {
// public List<List<Integer>> subsetsWithDup(int[] nums) {
// Arrays.sort(nums);
// List<List<Integer>> anslist = new ArrayList<>();
// findsubsets(0,nums, new ArrayList<>(), anslist);
// return anslist;

// }
// public static void findsubsets(int index , int nums [] , List<Integer> ds ,
// List<List<Integer>> anslist){
// anslist.add(new ArrayList<>(ds));
// for(int i=0; i<nums.length; i++){
// if(i > index && nums[i] == nums[i-1])
// {
// continue;
// }
// ds.add(nums[i]);
// findsubsets(i + 1, nums , ds , anslist);
// ds.remove(ds.size() - 1);
// }
// }
// public static void main(String[] args) {
// int nums [] = {12,15,20};
// subsetsWithDup(nums);
// }
// }

// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
// public List<List<Integer>> subsetsWithDup(int[] nums) {
// Arrays.sort(nums);
// List<List<Integer>> anslist = new ArrayList<>();
// findsubsets(0, nums, new ArrayList<>(), anslist);
// return anslist;
// }

// public void findsubsets(int index, int nums[], List<Integer> ds,
// List<List<Integer>> anslist) {
// anslist.add(new ArrayList<>(ds));
// for (int i = index; i < nums.length; i++) {
// if (i > index && nums[i] == nums[i - 1])
// continue; // Skip duplicates
// ds.add(nums[i]);
// findsubsets(i + 1, nums, ds, anslist);
// ds.remove(ds.size() - 1);
// }
// }
// }

// public class recursion {

//         public static List<List<String>> partition(String s) {
//                 List<List<String>> res = new ArrayList<>();
//                 List<String> path = new ArrayList<>();
//                 func(0, s, path, res);
//                 return res;
//         }

//         public static void func(int index, String s, List<String> path, List<List<String>> res) {
//                 if (index == s.length()) {
//                         res.add(new ArrayList<>(path));
//                         return;
//                 }
//                 for (int i = index; i < s.length(); i++) {
//                         if (ispalindrome(s, index, i)) {
//                                 path.add(s.substring(index, i + 1));
//                                 func(i + 1, s, path, res);
//                                 path.remove(path.size() - 1);
//                         }
//                 }
//         }

//         public static boolean ispalindrome(String s, int start, int end) {
//                 while (start <= end) {
//                         if (s.charAt(start) != s.charAt(end)) {
//                                 return false;
//                         }
//                         start++;
//                         end--;
//                 }
//                 return true;
//         }

//         public static void main(String[] args) {
//                 String s = "aab";
//                 List<List<String>> result = partition(s);
//                 System.out.println(result);
//         }
// }




// Problem statement
// You are given 'N', and for a given 'N x N' chessboard. Find a configuration of 'N' queens such that no queen can attack any other queen on the chess board.



// A queen can be killed when it lies in the same row, or same column, or the same diagonal of any of the other queens. You have to return all such configurations.



// Note:
// If no such configuration is present return an empty array, it will be represented as 'No Configuration' in the output.
// For Example:
// For a chessboard of size 4*4
// The configurations are 



// Every Column and Row should Have a Queen
// None of the Queen attack with each others 


public class recursion {

        public static void main(String[] args) {

        }
}