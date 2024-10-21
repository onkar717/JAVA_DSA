// import java.util.ArrayList;

// public class Greedyalgo {

//     public static void main(String[] args) {
//         int start [] = {1,3,0,5,8,5};
//         int end [] = {2,4,6,7,9,9};

//         int activites [][] = new int[start.length][3];

//         for(int i=0; i<start.length; i++){
//             activites[i][0] = i;
//             activites[i][1] = start[i];
//             activites[i][2] = end[i];
//         }

//         int macAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         macAct = 1;
//         ans.add(activites[0][0]);
//         int lastEnd = activites[0][2];
//         for(int i=1; i<start.length; i++){
//             if (activites[i][1] >= lastEnd) {
//                 macAct++;
//                 ans.add(activites[i][0]);
//                 lastEnd = activites[i][2];
//             }
//         }
//         System.out.println("Total Activites: ");
//         for(int i=0; i<ans.size(); i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }
//         System.out.println();
//     }
// }

// import java.util.Arrays;
// import java.util.Comparator;

// public class Greedyalgo {

//     public static void main(String[] args) {
//         int value[] = {60,100,120};
//         int weight [] = {10,20,30};
//         int w = 50;

//         double ratio [] [] = new double[value.length][2];
//         for(int i=0; i<value.length; i++){
//             ratio[i][0] = i;
//             ratio[i][1] = value[i] / (double)weight[i];
//         }

//         Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

//         int capacity = w;
//         int finalvalue = 0;
//         for(int i = ratio.length-1; i>=0; i--){
//             int index = (int)ratio[i][0];
//             if (capacity >= weight[index]) {
//                 finalvalue += value[index];
//                 capacity -= weight[index];
//             }
//             else {
//                 finalvalue += (ratio[i][1] * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }

//         System.out.println("Final Value " + finalvalue);
//     }
// }


//Question = 3
// import java.util.Arrays;

// public class Greedyalgo {

//     public static void main(String[] args) {
//         int A [] = {1,2,3};
//         int B [] = {3,1,2};

//         Arrays.sort(A);
//         Arrays.sort(B);

//         int mindiff = 0;
//         for(int i=0; i<A.length; i++){
//             mindiff = Math.abs(A[i] - B[i]);
//         }

//         System.out.println("The Minimum Differrnee "+ mindiff);
//     }
// }




// import java.util.Arrays;
// import java.util.Comparator;

// public class Greedyalgo{
//     public static void main(String[] args){
//         int arr [][] = { {5,24} , {39,60}, {5,28} , {27,40} , {50,90}};

//         Arrays.sort(arr , Comparator.comparingDouble(o -> o[1]));
//         int chainlen = 1;
//         int chainend = arr[0][1];
//         for(int i=1; i<arr.length; i++){
//             if (arr[i][0] >= chainend) {
//                 chainlen++;
//                 chainend = arr[i][1];
//             }
//         }
//         System.out.println("maximum chain length is  " + chainlen);
//     }
// }


// Indian Coins

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;

// public class Greedyalgo {

//     public static void main(String[] args) {
//         Integer coins [] = {1,2,5,10,20,50,100,500,2000};

//         Arrays.sort(coins , Comparator.reverseOrder());

//         int countcoins = 0;
//         int amount = 1059;
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i=0; i<coins.length; i++){
//             if (coins[i] <= amount) {
//                 while (coins[i] <= amount) {
//                     countcoins++;
//                     ans.add(coins[i]);
//                     amount -= coins[i];
//                 }
//             }
//         }
//         System.out.println("Total number of countcoins " + countcoins);
//         for(int i=0; i<ans.size(); i++){
//             System.out.print(ans.get(i)+" ");
//         }
//         System.out.println();
//     }
// }







// import java.util.ArrayList;
// import java.util.Collections;

// public class Greedyalgo {

//     static class Job {
//         int deadline;
//         int profit;
//         int id; // 1(A) , 2(B) , 3(C) , 4(D)
        
//         public Job(int i, int d , int p){
//             id = i;
//             profit = p;
//             deadline = d;
//         }
//     }

//     public static void main(String[] args) {
//         int jobsinfo [][] = {{4,20},{1,10},{1,40},{1,30}};
//         // Job jobs [] = new Job [jobsinfo.length];
        

//         ArrayList<Job> jobs = new ArrayList<>();

//         for(int i=0; i<jobsinfo.length; i++){
//             jobs.add( new Job(i , jobsinfo[i][0] , jobsinfo[i][1]));
//         }

//         Collections.sort(jobs , (a , b) -> b.profit - a.profit);
//         //Descending order 

//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;
//         for(int i=0; i<seq.size(); i++){
//             Job curr = jobs.get(i);
//             if (curr.deadline > time) {
//                 seq.add(curr.id);
//                 time++;
//             }
//         }

//         //preint seq
//         System.out.println("Maxi Jobs " + seq.size());
//         for(int i=0; i<seq.size(); i++){
//             System.out.print(seq.get(i)+" ");
//         }
//         System.out.println();
//     }
// }










// chocals problem 

// import java.util.Arrays;
// import java.util.Collections;

// public class Greedyalgo {

//     public static void main(String[] args) {
//         Integer costVer [] = {2,1,3,1,4};
//         Integer costHor [] = {4,1,2};

//         Arrays.sort(costHor , Collections.reverseOrder());
//         Arrays.sort(costVer , Collections.reverseOrder());

//         int h = 0;
//         int v = 0;
//         int hp = 1;
//         int vp  = 1;
//         int cost = 0;

//         while (h < costHor.length && v < costVer.length) {
//             if (costVer[v] <= costHor[h]) {
//                 cost += (costHor[h] * vp);
//                 hp++;
//                 h++;
//             }
//             else {
//                 cost += (costVer[v] * hp);
//                 vp++;
//                 v++;
//             }
//         }

//         while (h < costHor.length) {
//             cost += (costHor[h] * vp);
//             hp++;
//             h++;
//         }
//         while (v < costVer.length) {
//             cost += (costVer[v] * hp);
//             vp++;
//             v++;    
//         }
//         System.out.println("Cost " + cost);
//     }
// }











// ----------------------Revesion--------------------------

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Greedyalgo
//  */
// public class Greedyalgo {

//     public static void main(String[] args) {
//         int strat [] = {1,3,0,5,8,5};
//         int end [] = {2,4,6,7,9,9};

//         int activites [] [] = new int[strat.length][3];

//         for(int i=0; i<strat.length;i++){
//             activites[i][0] = i;
//             activites[i][1] = strat[i];
//             activites[i][2] = end[i];
//         }

//         //lambda function 
//         Arrays.sort(activites , Comparator.comparingDouble(o -> o[2]));

//         //end time sorted 
//         int macAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         macAct = 1;
//         ans.add(activites[0][0]);
//         int endlast = activites[0][2];

//         for(int i=1; i<end.length; i++){
//             if (activites[i][1] >= endlast) {
//                 macAct++;
//                 ans.add(activites[i][0]);
//                 endlast = activites[i][2];
//             }
//         }

//         System.out.println("Max Activites " + macAct);
//         for(int i=0; i<ans.size(); i++){
//             System.out.println("A"+ans.get(i)+" ");
//         }
//         System.out.println();
//     }
// }



//2
/**
 * Greedyalgo
//  */
// public class Greedyalgo {

//     public static void main(String[] args) {
//         int value [] = {60,100,120};
//         int weight [] = {10,20,30};
//         int w = 50;
//         double ratio [][] = new double[value.length][2];

//         //0th coloumn index  and 1st column ratio
//         for(int i=0; i<weight.length; i++){
//             ratio[i][0] = i;
//             ratio[i][1] = value[i] / (double)weight[i];
//         }

//         //ascending order 
//         Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

//         int capacity = w;
//         int finalvalue = 0;

//         for(int i=ratio.length-1; i>=0; i--){
//             int idx = (int)ratio[i][0];
//             if (capacity >= weight[idx]) {
//                 finalvalue += value[idx];
//                 capacity -= weight[idx];
//             }
//             else{
//                 finalvalue += (ratio[i][1]  * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }
//         System.out.println("Final Value " + finalvalue);
//     }
// }



// Absoulute differnece 

/**
 * Greedyalgo
 */
// public class Greedyalgo {

//     public static void main(String[] args) {
//         int A [] = {1,3,2};
//         int B [] = {2,1,3};

//         int mindiffernce = 0;

//         Arrays.sort(A);
//         Arrays.sort(B);
        
//         for(int i=0; i<A.length; i++){
//             mindiffernce -= Math.abs(A[i] - B[i]);
//         }

//         System.out.println("The Minimum Differnce is " + mindiffernce);
//     }
// }




// chain similar to activity 

/**
 * Greedyalgo
//  */
// public class Greedyalgo {

//     public static int chainend(int [][] pairs){
        
//         Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));
        
//         int macAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         macAct = 1;
//         ans.add(pairs[0][0]);
//         int lastEnd = pairs[0][1];

//         for(int i=0; i<pairs.length; i++){
//             if (pairs[i][0] >= lastEnd) {
//                 macAct++;
//                 lastEnd = pairs[i][1];
//             }
//         }
//         return macAct;

//     }

//     public static void main(String[] args) {
//         int pairs [][] = {{5,24} , {39,60} , {5,28} , {27, 40} , {50 , 90}};
//         int result = chainend(pairs);
//         System.out.println(result);
//     }
// }


// coins 

/**
 * Greedyalgo
//  */
// public class Greedyalgo {

//     public static void main(String[] args) {
//         Integer coins [] = {1,2,5,10,20,50,100,200,500,2000};

//         Arrays.sort(coins , Comparator.reverseOrder());

//         ArrayList<Integer> ans = new ArrayList<>();

//         int  amount = 500;
//         int countcoins = 0;

//         for(int i=0; i<coins.length; i++){
//             if (coins[i] <= amount) {
//                 while (coins[i] <= amount) {
//                     countcoins++;
//                     ans.add(coins[i]);
//                     amount -= coins[i];
//                 }
//             }
//         }

//         System.out.println("Countcoint total is " + countcoins);

//         for(int i=0; i<ans.size(); i++){
//             System.out.println(ans.get(i));
//         }
//         System.out.println();
//     }
// }


/**
 * Greedyalgo
 */
public class Greedyalgo {

    static class job {
    
        int id;
        int deadline;
        int profit;

        public job(int i , int d , int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsinfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();

        for(int i=0; i<jobsinfo.length; i++){
            jobs.add(new job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }

        Collections.sort(jobs , (obj1 , obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            job curr = jobs.get(i);
            if (curr.deadline > time) {
                ans.add(curr.id);
                time++;
            }
        }

        //print 
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
        System.out.println();
    }
}