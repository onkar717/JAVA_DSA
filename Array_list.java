// import java.util.ArrayList;
// import java.util.*;
// import java.util.Collections;

// public class Array_list {

//     public static void Swap_in_Arrylist(ArrayList<Integer> list, int indexa , int indexb ) {
//         int temp = list.get(indexa);
//         list.set(indexa , list.get(indexb));
//         list.set(indexb, temp);
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         // ArrayList<String> list1 = new ArrayList<>();
//         // ArrayList<Boolean> list2 = new ArrayList<>();

//         // ADD element and its time-complexicity is O(n)
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);

//         //to add the number at specific index 
//         list.add(4,8);
//         // System.out.println(list);


//         // // get Operation to get element from list its time complexity is O(n)
//         // int element = list.get(2);
//         // System.out.println(element);

//         // // To Remove Element from the list TP=O(n)
//         // // list.remove(2);
//         // // System.out.println(list);

//         // // Set Element at a Specific Index 
//         // // list.set(2,6);
//         // // System.out.println(list);

//         // // Contains Elemnet means to check wheather the element is exixts is not in the list 
//         // System.out.println(list.contains(1));
//         // System.out.println(list.contains(24));

//         // //  Size of ArrayList;

//         // System.out.println("The Size of the List is : "+list.size());
//         // // print an asending order array
//         // for(int i=0; i<list.size(); i++){
//         //     System.out.print(list.get(i) + " ");
//         // }
//         // System.out.println();
//         // // Print an Reverse Array
//         // for(int i=list.size()-1; i>=0; i--){
//         //     System.out.print(list.get(i)+" ");
//         // }
//         // System.out.println();

//         // To find the largest Number From the given Array 
//         // int max = Integer.MIN_VALUE;
//         // int max2 = Integer.MIN_VALUE;
//         // for(int i=0; i<list.size(); i++){
//         //     if (max < list.get(i)) {
//         //         max = list.get(i);
//         //     }
//         //     max2 = Math.max(max, list.get(i));
//         // }
//         // System.out.println("max Element: " + max);
//         // System.out.println("max2 Element: " + max2);
//         // System.out.println();


//         // Swap 2 Numbers 
//         // int indexa = 1 , indexb = 2;
//         // System.out.println(list);
//         // Swap_in_Arrylist(list, indexa, indexb);
//         // System.out.println(list);

//         // In-built Sorting 
//         // System.out.println(list);
//         // Collections.sort(list);
//         // System.out.println(list);
//         // Collections.sort(list , Collections.reverseOrder());
//         // System.out.println(list);

//         // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//         // ArrayList<Integer> List = new ArrayList<>();
//         // List.add(1);
//         // List.add(2);
//         // mainlist.add(List);
//         // ArrayList<Integer> List1 = new ArrayList<>();
//         // List1.add(3);
//         // List1.add(4);
//         // mainlist.add(List1);

//         // for(int i=0; i<mainlist.size(); i++){
//         //     ArrayList<Integer> currentlist = mainlist.get(i);
//         //     for(int j=0; j<currentlist.size(); j++){
//         //         System.out.print(currentlist.get(j)+ " ");
//         //     }
//         //     System.out.println();
//         // }

//         ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//         ArrayList<Integer> List = new ArrayList<>();
//         mainlist.add(List);
//         ArrayList<Integer> List1 = new ArrayList<>();
//         mainlist.add(List1);
//         ArrayList<Integer> List2 = new ArrayList<>();
//         mainlist.add(List2);

//         for(int i=1; i<=5; i++){
//             List.add(i * 1);
//             List1.add(i * 2);
//             List2.add(i * 3);
//         }

//         System.out.println(mainlist);
//         System.out.println();
//         for(int i=0; i<mainlist.size(); i++){
//             ArrayList<Integer> currentlist = mainlist.get(i);
//             for(int j=1; j<currentlist.size(); j++){
//                 System.out.print(currentlist.get(j)+" ");
//             }
//             System.out.println();
//         }

//     }
// }

// import java.util.ArrayList;

// public class Array_list {

//     // public static int storeed_water(ArrayList<Integer> Height) {
//     //     int maxwater = 0;
//     //     for(int i=0; i<Height.size(); i++){
//     //         for(int j=i+1; j<Height.size(); j++){
//     //             int waterheight = Math.min(Height.get(i), Height.get(j));
//     //             int width = j-i;
//     //             int total = waterheight * width;
//     //             maxwater = Math.max(maxwater,total);
//     //         }
//     //     }
//     //     return maxwater;
//     // }
    
//     public static int storedwater_by_pointer_approch(ArrayList<Integer> Height) {
//         int maxwater = 0;
//         int lp = 0;
//         int rp = Height.size()-1;
//         while ( lp < rp) {
//             // calculate water area 
//             int ht = Math.min(Height.get(lp), Height.get(rp));
//             int width = rp-lp;
//             int currenwater = ht * width;
//             maxwater = Math.max(maxwater, currenwater);

//             // Update ptr 
//             if(Height.get(lp) < Height.get(rp)){
//                 lp++;
//             }
//             else{
//                 rp--;
//             }
//         }
//         return maxwater;
//     }

//     public static void main(String[] args) {
//         //1,8,6,2,5,4,8,3,7
//         ArrayList<Integer> Height = new ArrayList<>();
//         Height.add(1);
//         Height.add(8);
//         Height.add(6);
//         Height.add(2);
//         Height.add(5);
//         Height.add(4);
//         Height.add(8);
//         Height.add(3);
//         Height.add(7);
//         // System.out.println(storeed_water(Height));
//         System.out.println(storedwater_by_pointer_approch(Height));
//     }
// }


//Two-Pointer  Approach for Pair-sum Question

// import java.util.ArrayList;

// public class Array_list {

//     public static boolean two_poinetr_pairsum(ArrayList<Integer> arr , int target) {
//         int lp = 0;
//         int rp = arr.size()-1;
//         while ( lp < rp) {
//             // case_1
//             if (arr.get(lp) + arr.get(rp) == target) {
//                 return true;
//             }
//             else if ( arr.get(lp) + arr.get(rp) < target) {
//                 lp++;
//             }
//             else{
//                 rp--;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(1);
//         arr.add(2);
//         arr.add(3);
//         arr.add(4);
//         arr.add(5);
//         arr.add(6);
//         int target = 11;
//         System.out.print(two_poinetr_pairsum(arr , target));
//     }
// }


// public class Array_list {

//     public static boolean Array_list_pair_sum2(ArrayList<Integer> Heighta , int Target) {
//         int piviot_BP = -1;
//         int n = Heighta.size();
//         for(int i=0; i<Heighta.size()-1; i++){
//             if (Heighta.get(i) > Heighta.get(i+1)) {
//                 piviot_BP = i;
//                 break;
//             }
//         }
//         int lp = piviot_BP + 1;
//         int rp = piviot_BP;

//         while (lp != rp) {
//             // case1
//             if (Heighta.get(lp) + Heighta.get(rp) == Target) {
//                 return true;
//             }
//             // case-2
//             else if (Heighta.get(lp) + Heighta.get(rp) < Target) {
//                 lp = (lp+1) % n;
//             }
//             else{
//                 // case 
//                 rp = (n+rp-1) % n;
//             }
//         }
//         return false;

//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> Heighta = new ArrayList<>();
//         Heighta.add(11);
//         Heighta.add(15);
//         Heighta.add(6);
//         Heighta.add(8);
//         Heighta.add(9);
//         Heighta.add(10);
//         int Target = 50;
//         System.out.println(Heighta);
//         System.out.println(Array_list_pair_sum2(Heighta , Target));

//     }
// }

// import java.util.ArrayList;

// public class Array_list {

//     public static boolean pair_2_sum_pointer(ArrayList<Integer> List , int Target) {
//         int bp = -1;
//         int n = List.size();
//         for(int i=0; i<List.size(); i++){
//             if (List.get(i) > List.get(i+1)) {
//                 bp = i;
//                 break;
//             }
//         }
//         int lp = bp+1;
//         int rp = bp;

//         while (lp != rp) {
//             if (List.get(lp) + List.get(rp) == Target) {
//                 return true;
//             }
//             else if (List.get(lp) + List.get(rp) < Target) {
//                 lp = (lp+1) % n;
//             }
//             else{
//                 rp = (n+rp-1) % n;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> List = new ArrayList<>();
//         List.add(11);
//         List.add(15);
//         List.add(6);
//         List.add(8);
//         List.add(9);
//         List.add(10);

//         int Target = 16;
//         System.out.println(pair_2_sum_pointer(List ,Target));

//     }
// }