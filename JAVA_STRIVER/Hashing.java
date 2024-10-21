// import java.util.HashMap;
// import java.util.Set;

// public class Hashing {

//     public static void main(String[] args) {

//         HashMap<String , Integer> hm = new HashMap<>();
//         // Insert 
//         hm.put("India", 96);
//         hm.put("China", 99);
//         hm.put("Pak", 69);
//         System.out.println(hm);

//         //Get - O(1)
//         System.out.println(hm.get("India"));
//         System.out.println(hm.get("Indias"));

//         // Contains 
//         System.out.println(hm.containsKey("India"));
//         System.out.println(hm.containsKey("Inida"));

//         //Remove 0(1)
//         hm.remove("India");
//         System.out.println(hm);

//         // Size 
//         System.out.println(hm.size());

//         // Is Empty
//         System.out.println(hm.isEmpty());

//         // Clear = u can clear all the key values from the hashmap
//         // hm.clear();
//         // System.out.println(hm);

//         // Iteration on Hashmap 

//         Set<String> keys = hm.keySet();
//         // for-each for iteration
//         for (String k : keys) {
//             System.out.print(" Key= " + k + "," + " value= " + hm.get(k));
//         }
//         System.out.println();

//     }
// }

// import java.util.LinkedList;

// public class Hashing {

//     static class HashMap<K , V> {
//         private class Node {
//             K key;
//             V value;

//             public Node(K key , V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }
//         private int n; // n
//         private int N;
//         private LinkedList<Node> buckets[];

//         @SuppressWarnings("unchecked")
//         public HashMap(){
//             // this.size = 0;
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i=0; i<4; i++){
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         public int hashFuction(K key){
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         public int SearchInLL(K key , int bi){
//             LinkedList<Node> ll = buckets[bi];
//             int di = 0;
//              for(int i=0; i<ll.size(); i++){
//                 Node node = ll.get(i);
//                 if (node.key == key) {
//                     return di;
//                 }
//              }
//              return -1;
//         }

//         private rehash(){
//             LinkedList<Node> oldBuck = buckets;
//         }

//         public void put (K key ,V value){
//             int bi = hashFuction(key);
//             int di = SearchInLL(key , bi);
//             if (di != -1) {
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             }
//             else {
//                 buckets[bi].add(new Node(key, value));
//                 n++;
//             }

//             double lambda = (double)n  / N;
//             if (lambda > 2.0) {
//                 rehash();
//             }
//         }
//     }

//     public static void main(String[] args) {

//     }
// }

// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.TreeMap;

// public class Hashing {

//     public static void main(String[] args) {
//         // LINKEDHASHMAP
//         // LinkedHashMap<String , Integer> Lhm = new LinkedHashMap<>();
//         // Lhm.put("Onkar", 100);
//         // Lhm.put("paras", 150);
//         // Lhm.put("aanna", 200);

//         // HashMap<String ,Integer> hm = new HashMap<>();
//         // hm.put("Onkar", 100);
//         // hm.put("paras", 150);
//         // hm.put("aanna", 200);

//         // TREEMAP 
//         TreeMap<String , Integer> Tlm = new TreeMap<>();
//         Tlm.put("ccc", 100);
//         Tlm.put("aaa", 150);
//         Tlm.put("bbb", 200);

//         // System.out.println(Lhm);
//         System.out.println(Tlm);
//         // System.out.println(hm);

//     }
// }

// import java.util.HashMap;
// import java.util.Set;

// public class Hashing {

//     public static void main(String[] args) {
// int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
// HashMap<Integer, Integer> map = new HashMap<>();

//         // for (int i = 0; i < arr.length; i++) {
//         //     if (map.containsKey(arr[i])) {
//         //         map.put(arr[i], map.get(arr[i]) + 1);
//         //     } else {
//         //         map.put(arr[i], 1);
//         //     }
//         // }

//         for(int i=0; i<arr.length; i++){
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         // Set<Integer> keyset = map.keySet();
//         for (Integer key : map.keySet()) {
//             if (map.get(key) > arr.length / 3) {
//                 System.out.println(key);
//             }
//         }

//     }
// }

// import java.util.HashMap;

// public class Hashing {

// public static boolean isAnagram(String s1 , String s2) {
//     HashMap<Character , Integer > map = new HashMap<>();

//     for(int i=0; i<s1.length(); i++){
//         char ch = s1.charAt(i);
//         map.put(ch, map.getOrDefault(ch, 0) + 1);
//     }

//     for(int i=0; i<s2.length(); i++){
//         char ch = s2.charAt(i);
//         if (map.get(ch) != null) {
//             if (map.get(ch) == 1) {
//                 map.remove(ch);
//             }
//             else {
//                 map.put(ch, map.get(ch) - 1);
//             }
//         }
//         else {
//             return false;
//         }
//     }

//     return map.isEmpty();
// }

//     public static boolean isAnagram(String s1 , String s2) {
//         HashMap<Character ,Integer > map = new HashMap<>();

//         for(int i=0; i<s1.length(); i++){
//             char ch = s1.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for(int i=0; i<s2.length(); i++){
//             char ch = s2.charAt(i);
//             if (map.get(ch) != null) {
//                 if (map.get(ch) == 1) {
//                     map.remove(ch);
//                 }
//                 else {
//                     map.put(ch, map.get(ch) - 1);
//                 }
//             }
//             else {
//                 return false;
//             }
//         }

//         return map.isEmpty();
//     }

//     public static void main(String[] args) {
//         String s1 = "race";
//         String s2 = "care";

//         System.out.println(isAnagram(s1, s2));
//     }
// }

// import java.util.HashSet;
// import java.util.*;

// public class Hashing {

//     public static void main(String[] args) {
// HashSet<Integer> hs = new HashSet<>();
// // add
// hs.add(10);
// hs.add(11);
// hs.add(12);
// hs.add(12);
// hs.add(12);

// System.out.println(hs);

// // Size 
// System.out.println(hs.size());

// //Contains 
// if (hs.contains(12)) {
//     System.out.println("set contains");
// }
// if (hs.contains(16)) {
//     System.out.println("set contains");
// }

// // remove()
// hs.remove(10);
// System.out.println(hs);

// // isEmpty()
// System.out.println(hs.isEmpty());

// // Clear
// hs.clear();
// System.out.println(hs);

//trversing // iterating 

// HashSet<String> cities = new HashSet<>();

// cities.add("b");
// cities.add("a");
// cities.add("d");
// cities.add("c");
// System.out.println(cities);

// // Using iterator 
// Iterator it = cities.iterator();
//         while (it.hasNext()) {
//     System.out.println(it.next());
// }

// // Advanced enhanced for loop 
// for (String city : cities) {
//     System.out.println(city);
// }

// Linked HashSet
// LinkedHashSet<String> lhs = new LinkedHashSet<>();

// lhs.add("B");
// lhs.add("C");
// lhs.add("D");
// lhs.add("A");
// System.out.println(lhs);

// TreeSet<String> ts = new TreeSet<>();

// ts.add("B");
// ts.add("C");
// ts.add("D");
// ts.add("A");
// System.out.println(ts);

//     }
// }

// Counts the unique elements from array using hasset

// import java.util.HashSet;

// public class Hashing {

//     public static void main(String[] args) {
//         int nums [] = {1,2,3,4,5,6,7,8,9,1,2};

//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums.length; i++){
//             set.add(nums[i]);
//         }

//         System.out.println(set.size());
//     }
// }

// Union and Intersection

// import java.util.HashSet;

// public class Hashing {

//     public static void main(String[] args) {
//         int arr1 [] = {7 , 3 , 9};
//         int arr2 [] = {6 , 3 , 9 , 2 , 9 , 4};

//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0; i<arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++){
//             set.add(arr2[i]);
//         }

//         System.out.println("uninon = "+ set.size());

//         // intersection 
//         set.clear();

//         for(int i=0; i<arr1.length; i++){
//             set.add(arr1[i]);
//         }

//         int count = 0;
//         for(int i=0; i<arr2.length; i++){
//             if (set.contains(arr2[i])) {
//                 count++;
//                 set.remove(arr2[i]);
//             }
//         }
//         System.out.println("Intersection = " + count);
//     }
// }

// Find the Iternity from the tickets 

// import java.util.HashMap;

// public class Hashing {

//     public static String getFirst (HashMap<String , String > tickets ){
//         HashMap<String , String > revMap = new HashMap<>();

//         for (String  key : tickets.keySet()) {
//             revMap.put(tickets.get(key), key);
//         }

//         for(String key : tickets.keySet()){
//             if (!revMap.containsKey(key)) {
//                 return key;
//             }
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         HashMap<String , String > tickets = new HashMap<>();

//         tickets.put("Chennai", "Bengluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getFirst(tickets);
//         System.out.print(start);
//         for (String key : tickets.keySet()) {
//             System.out.print("-> " + tickets.get(start));
//             start = tickets.get(start);
//         }
//         System.out.println();

//     }
// }

// Largest subarray with sum 

// import java.util.HashMap;

// public class Hashing {

//     public static void main(String[] args) {
//         int arr [] = {15 , -2 , 2 , -8 , 1 , 7 , 10 , 23};

//         HashMap<Integer , Integer> map = new HashMap<>();

//         int sum = 0;
//         int len = 0;

//         for(int j=0; j<arr.length; j++){
//             sum += arr[j];
//             if (map.containsKey(sum)) {
//                 len = Math.max(len, j - map.get(sum));
//                 // len = Math.max(len, j); 
//             }
//             else {
//                 map.put(sum, j);
//             }
//         }

//         System.out.println(" The Largest Sub Array is = " + len);
//     }
// }

// Subarray sum equals to K 

// import java.util.HashMap;

// public class Hashing {

//     public static void main(String[] args) {
//         int arr [] = {10 , 2 , -2 , -20 , 10};
//         int  k = -10;

//         HashMap<Integer , Integer> map = new HashMap<>();

//         map.put(0, 1);

//         int sum = 0;
//         int ans = 0;

//         for(int j=0; j<arr.length; j++){
//             sum += arr[j];
//             if (map.containsKey(sum - k)) {
//                 ans += map.get(sum - k);
//             }
//             else {
//                 map.put(sum, map.getOrDefault(sum, 0) + 1);
//             }
//         }
//         System.out.println("Total Subarray " + ans);
//     }
// }

// ---------------------Revesion ------------------------------

//Hashing
// - Map -
// - HashMap
// - LINKEDHASHMAP
// - TreeMap
// - Set
// - HashSet
// - LinkedHashSet
// - TreeSet

// import java.util.HashMap;
// import java.util.Set;

// public class Hashing {

//         public static void main(String[] args) {
//                 HashMap<String , Integer> hm = new HashMap<>();
//                 // Insert O(1) 
//                 hm.put("onkar", 0);
//                 hm.put("Paras", 1);
//                 hm.put("Tejas", 2);
//                 hm.put("Rohan", 3);
//                 hm.put("Aniket", 4);
//                 // HashMap is Unorderd
//                 System.out.println(hm);

//                 // Get - O(1)
//                 // int poulation = hm.get("onkar");
//                 // System.out.println(poulation);

//                 // // ContainsKey - O(1)
//                 // System.out.println(hm.containsKey("onkar"));
//                 // System.out.println(hm.containsKey("suraj"));

//                 // // Remove - O(1)
//                 // System.out.println(hm.remove("onkar"));
//                 // System.out.println(hm);

//                 // // Size 
//                 // System.out.println(hm.size());

//                 // // IsEmpty 
//                 // System.out.println(hm.isEmpty());

//                 // Clear
//                 // hm.clear();
//                 // System.out.println(hm);

//                 // Iteration in HashMap
//                 Set<String> keys = hm.keySet();
//                 System.out.println(keys);

//                 for (String k : keys) {
//                         System.out.println("Key= " +k+ ", Value= "+ hm.get(k));
//                 }
//         }
// }

// LinkedHashmap 
// ordered

// import java.util.LinkedHashMap;

// public class Hashing {

//         public static void main(String[] args) {
//                 LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
//                 lhm.put("onkar", 0);
//                 lhm.put("Paras", 1);
//                 lhm.put("Tejas", 2);
//                 lhm.put("Rohan", 3);
//                 lhm.put("Aniket", 4);
//                 System.out.println(lhm);

//         }
// }

// Tree map 
// keys are sorted

// import java.util.TreeMap;

// /**
//  * Hashing
//  */
// public class Hashing {

//         public static void main(String[] args) {
//                 TreeMap<String , Integer> thm = new TreeMap<>();
//                 thm.put("Aniket", 4);
//                 thm.put("Tejas", 2);
//                 thm.put("Onkar", 0);
//                 thm.put("Rohan", 3);
//                 thm.put("Paras", 1);
//                 System.out.println(thm);
//         }
// }

// Majority Element 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hashing
 * //
 */
// public class Hashing {

// public static void main(String[] args) {
// int arr [] = {1,3,2,5,1,3,1,5,1};

// HashMap<Integer , Integer> map = new HashMap<>();
// for(int i=0; i<arr.length; i++){
// // if (map.containsKey(arr[i])) {
// // map.put(arr[i], map.get(arr[i]) + 1);
// // }
// // else{
// // map.put(arr[i], 1);
// // }

// map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
// }

// Set<Integer> keyset = map.keySet();
// for (Integer key : keyset) {
// if (map.get(key) > arr.length / 3) {
// System.out.println(key);
// }
// }
// }
// }


// // is ValidAnagram
// public class Hashing {

//         public static boolean IsAnagram(String s, String a) {
//                 HashMap<Character, Integer> map = new HashMap<>();

//                 if (s.length() != a.length()) {
//                         return false;
//                 }

//                 for (int i = 0; i < s.length(); i++) {
//                         char ch = s.charAt(i);
//                         map.put(ch, map.getOrDefault(ch, 0) + 1);
//                 }

//                 for (int i = 0; i < a.length(); i++) {
//                         char ch = a.charAt(i);
//                         if (map.get(ch) != null) {
//                                 if (map.get(ch) == 1) {
//                                         map.remove(ch);
//                                 } else {
//                                         map.put(ch, map.get(ch) - 1);
//                                 }
//                         }
//                 }
//                 return map.isEmpty();
//         }

//         public static void main(String[] args) {
//                 String s = "race";
//                 String a = "car";

//                 System.out.println(IsAnagram(s, a));
//         }
// }














// HasSet 

/**
 * Hashing
 */
// public class Hashing {

//         public static void main(String[] args) {
                // HashSet<Integer> hs = new HashSet<>();

                // hs.add(0);
                // hs.add(1);
                // hs.add(2);
                // hs.add(4);
                // hs.add(3);
                // hs.add(2);

//                 System.out.println(hs);

//                 hs.remove(2);
//                 //hs.clear();
//                 System.out.println(hs.size());
//                 System.out.println(hs.isEmpty());
//                 if (hs.contains(2)) {
//                        System.out.println("set contains 2"); 
//                 }
//                 if (hs.contains(3)) {
//                         System.out.println("set contains 3"); 
//                  }

                
//         }
// }



// Iteration on hashSet

/**
 * Hashing
//  */
// public class Hashing {
        
//         public static void main(String[] args) {
                
//                 HashSet<Integer> hs = new HashSet<>();
                
//                 hs.add(0);
//                 hs.add(1);
//                 hs.add(2);
//                 hs.add(4);
//                 hs.add(3);
//                 hs.add(2);
                
//                 // using Iterators 
//                 // Iterator it = hs.iterator();
//                 // while (it.hasNext()) {
//                 //         System.out.println(it.next());
//                 // }


//                 // using Enhanced for loops 

//                 // for (Integer integer : hs) {
//                 //         System.out.println(integer);
//                 // }
//         }
// }




/**
 * Linked Hashing
//  */
// public class Hashing {

//         public static void main(String[] args) {
//          LinkedHashSet<String> lhs = new  LinkedHashSet<>();
//          lhs.add("Onkar");
//          lhs.add("Pune");
//          lhs.add("Mumbai");
//          lhs.add("Banglore");
//          lhs.add("Germany");

//          System.out.println(lhs);

//         }
        
// }



// Tree Ste 
// sorted in ascending order 
// Null Values allow 

/**
 * Hashing
 */
// public class Hashing {

//         public static void main(String[] args) {
//                 TreeSet<String> ts = new TreeSet<>();
//                 ts.add("Onkar");
//                 ts.add("Pune");
//                 ts.add("Mumbai");
//                 ts.add("Banglore");
//                 ts.add("Germany");

//                 System.out.println(ts);
//         }
// }




 