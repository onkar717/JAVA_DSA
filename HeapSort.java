// import java.util.Comparator;
// import java.util.PriorityQueue;

// public class HeapSort { 

//     static class Student implements Comparable<Student> {
//     String name;
//     int rank;

//     public Student(String name , int rank){
//         this.name = name;
//         this.rank = rank;
//     }

//     @Override
//     public int compareTo(Student s2){
//         return this.rank - s2.rank;
//     }
//     }

//     public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
//         // pq.add(1);
//         // pq.add(2);
//         // pq.add(3);
//         // pq.add(4);
//         // pq.add(5);

//         // while (!pq.isEmpty()) {
//         //     System.out.println(pq.peek());
//         //     pq.remove();
//         // }

//         pq.add(new Student("A" , 4 ));
//         pq.add(new Student("B" , 5 ));
//         pq.add(new Student("C" , 2 ));
//         pq.add(new Student("D" , 12 ));

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek().name + " -> " + pq.peek().rank);
//             pq.remove();
//         }
//     }
// // }
// import java.util.ArrayList;

// public class HeapSort {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data){
//             arr.add(data);

//             int x = arr.size() - 1; // child index
//             int par = (x - 1) / 2; // parent index

//             while (x > 0 && arr.get(x) < arr.get(par)) {
//                 // Swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x - 1) / 2;
//             }
//         }

//         public int peek(){
//             return arr.get(0);
//         }

//         public int remove(){
//             if (arr.size() == 0) {
//                 throw new IllegalStateException("Heap is empty");
//             }

//             int data = arr.get(0);

//             // Swap first and last
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size() - 1));
//             arr.set(arr.size() - 1, temp);

//             // Delete last
//             arr.remove(arr.size() - 1);

//             // Heapify
//             heapify(0);
//             return data;
//         }

//         public void heapify(int index){
//             int left = 2 * index + 1;
//             int right = 2 * index + 2;
//             int minIdx = index;

//             if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
//                 minIdx = left;
//             }
//             if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
//                 minIdx = right;
//             }

//             if (minIdx != index) {
//                 // Swap
//                 int temp = arr.get(index);
//                 arr.set(index, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);
//             }
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
//     }

//     public static void main(String[] args) {
//         Heap pq = new Heap();
//         pq.add(3);
//         pq.add(4);
//         pq.add(1);
//         pq.add(5);

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }

// Max Heap 

// import java.util.ArrayList;

// public class HeapSort {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data){
//             arr.add(data);

//             int x = arr.size() - 1; // child index
//             int par = (x - 1) / 2; // parent index

//             while (x > 0 && arr.get(x) > arr.get(par)) {
//                 // Swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x - 1) / 2;
//             }
//         }

//         public int peek(){
//             return arr.get(0);
//         }

//         public int remove(){
//             if (arr.size() == 0) {
//                 throw new IllegalStateException("Heap is empty");
//             }

//             int data = arr.get(0);

//             // Swap first and last
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size() - 1));
//             arr.set(arr.size() - 1, temp);

//             // Delete last
//             arr.remove(arr.size() - 1);

//             // Heapify
//             heapify(0);
//             return data;
//         }

//         public void heapify(int index){
//             int left = 2 * index + 1;
//             int right = 2 * index + 2;
//             int maxIdx = index;

//             if (left < arr.size() && arr.get(left) > arr.get(maxIdx)) {
//                 maxIdx = left;
//             }
//             if (right < arr.size() && arr.get(right) > arr.get(maxIdx)) {
//                 maxIdx = right;
//             }

//             if (maxIdx != index) {
//                 // Swap
//                 int temp = arr.get(index);
//                 arr.set(index, arr.get(maxIdx));
//                 arr.set(maxIdx, temp);

//                 heapify(maxIdx);
//             }
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
//     }

//     public static void main(String[] args) {
//         Heap pq = new Heap();
//         pq.add(3);
//         pq.add(4);
//         pq.add(1);
//         pq.add(5);

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }

// 

// public class HeapSort {

//     public static void heapify(int arr [] , int i , int size){
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int minIdx = i;

//         if (left < size && arr[left] > arr[minIdx]) {
//             minIdx = left;
//         }

//         if (right < size && arr[right] > arr[minIdx]) {
//             minIdx = right;
//         }

//         if (minIdx != i) {
//             //swap
//             int temp = arr[i];
//             arr[i] = arr[minIdx];
//             arr[minIdx] = temp;

//             heapify(arr, minIdx, size);
//         }
//     }

//     public static void heapsort(int arr[]){
//         //step1 - build max- heap
//         int n = arr.length;
//         for(int i=n/2; i>=0; i--){
//             heapify(arr, i , n);
//         }

//         //step-2 push largest at the end
//         for(int i=n-1; i>0; i--){
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr , 0 , i);
//         }

//     }

//     public static void main(String[] args) {
//         int arr [] = { 4,1 , 2 , 3  , 5};

//         heapsort(arr);

//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         System.out.println();
//     }
// }

//q=3
// import java.util.PriorityQueue;

// public class HeapSort {

//     static class Point implements Comparable<Point>{

//         int x;
//         int y;
//         int disq;
//         int indx;

//         public Point(int x , int y , int disq , int indx){
//             this.x = x;
//             this.y = y;
//             this.disq = disq;
//             this.indx = indx;
//         }

//         @Override

//         public int compareTo(Point p2){
//             return this.disq - p2.disq;
//         }
//     }

//     public static void main(String[] args) {
//         int points [] [] = {{3,3} , {5,-1} , {-2 , 4}};
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>();
//         for(int i=0; i<points.length; i++){
//             int disq = points[i][0] * points[i][0] + points[i][1]*points[i][1];
//             pq.add(new Point(points[i][0], points[i][1], disq , i));
//         }

//         //nearest 
//         for(int i=0; i<k; i++){
//             System.out.println("C"+pq.remove().indx);
//         }
//     System.out.println();        
//     }
// }

// Conect N Ropes

// import java.util.PriorityQueue;

// public class HeapSort {

//     public static void main(String[] args) {
//         int ropes [] = {2,3,3,4,6};;

//         PriorityQueue<Integer> pq =  new PriorityQueue<>();
//         for(int i=0; i<ropes.length; i++){
//             pq.add(ropes[i]);
//         }

//         int cost = 0;

//         while (pq.size() > 1) {
//             int min = pq.remove();
//             int min2 = pq.remove();
//             cost += min + min2;
//             pq.add(min+min2);
//         }

//         System.out.println("The Total Cost is " + cost);

//     }
// }

// weakesh solider 

// import java.util.PriorityQueue;

// public class HeapSort {
//     static class Row implements Comparable<Row> {
//         int solider;
//         int idx;

//         public Row(int solider , int idx){
//             this.solider = solider;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row A2){
//             if (this.solider == A2.solider) {
//                 return this.idx - A2.idx;
//             }
//             else {
//                 return this.solider - A2.solider;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int army[][] = {{ 1, 0, 0, 0 },
//                         { 1, 1, 1, 1 }, 
//                         { 1, 0, 0, 0 }, 
//                         { 1, 0, 0, 0 } };

//         int k = 2;

//         PriorityQueue<Row> pq = new PriorityQueue<>();
//         for(int i=0; i<army.length; i++){
//             int count = 0;
//             for(int j=0; j<army[0].length; j++){
//                 count += army[i][j] == 1 ? 1 : 0;
//             }
//             pq.add(new Row(count, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.println("R"+ pq.remove().idx);
//         }
//         System.out.println();
//     }
// }