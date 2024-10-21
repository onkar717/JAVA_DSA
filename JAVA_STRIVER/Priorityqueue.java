// import java.util.Comparator;
// import java.util.PriorityQueue;

// public class Priorityqueue {

//     static class Student implements Comparable <Student> {
//         String name;
//         int rank;

//         public Student (String name , int rank){
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override 
//         public int compareTo(Student s2){
//             return this.rank - s2.rank;
//         }
//     }

//     public static void main(String[] args) {
//         // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//         // pq.add(1);
//         // pq.add(2);
//         // pq.add(3);
//         // pq.add(4);
//         // pq.add(5);
//         // pq.add(6);

//         // while (!pq.isEmpty()) {
//         //     System.out.println(pq.peek());
//         //     pq.remove();
//         // }




//         PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(new Student("Onkar", 0));
//         pq.add(new Student("Ekhande", 1));
//         pq.add(new Student("Desai", 2));
//         pq.add(new Student("ChinchanSure", 3));
//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek().name + " -> " + pq.peek().rank);
//             pq.remove();
//         }
//     }
// }



// In min heap

// import java.util.ArrayList;
// public class Priorityqueue {
    
//     static class Heap {
        
//         ArrayList<Integer> arr = new ArrayList<>();




        
//         // add in heap
//         public void add (int data){
//             arr.add(data);

//             int x = arr.size() - 1;
//             int par = (x-1)/2;

//             while (arr.get(x) < arr.get(par)) {
//                 // swap 
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par , temp);

//                 x = par;
//                 par = (x-1) / 2;
//             }
//         }





//         // peek function 
//         public int peek(){
//             return arr.get(0);
//         }




//         // heapify 

//         public void headpify(int i){
//             int left = 2*i+1;
//             int right = 2*i+2;
//             int minIdx = i;

//             if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
//                 minIdx = left;
//             }


//             if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
//                 minIdx = right;
//             }

//             if (minIdx != i) {
//                 // swapp

//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 headpify(minIdx);
//             }
//         }






//         // delete from the heap 
//         public int removeEle(){

//             int data = arr.get(0);

//             //step = 1 swap    
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size()-1));
//             arr.set(arr.size()-1, temp);

//             // step = 2 remove ()
//             arr.remove(arr.size()-1);

//             headpify(0);
//             return data;
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
        
//     }





//     public static void main(String[] args) {
//         Heap h = new Heap();
//         h.add(4);   
//         h.add(1);   
//         h.add(3);   
//         h.add(2);   
//         h.add(5);   

//         while (!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.removeEle();
//         }
//     }
// }



// Maximum heap

// import java.util.ArrayList;

// public class Priorityqueue {
    
//     static class Heap {
        
//         ArrayList<Integer> arr = new ArrayList<>();
        
//         // add in heap
//         public void add (int data){
//             arr.add(data);

//             int x = arr.size() - 1;
//             int par = (x-1)/2;

//             while (arr.get(x) > arr.get(par)) {
//                 // swap 
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par , temp);

//                 x = par;
//                 par = (x-1) / 2;
//             }
//         }

//         // peek function 
//         public int peek(){
//             return arr.get(0);
//         }

//         // heapify 

        // public void headpify(int i){
        //     int left = 2*i+1;
        //     int right = 2*i+2;
        //     int maxidx = i;

        //     if (left < arr.size() && arr.get(maxidx) < arr.get(left)) {
        //         maxidx = left;
        //     }


        //     if (right < arr.size() && arr.get(maxidx) < arr.get(right)) {
        //         maxidx = right;
        //     }

        //     if (maxidx != i) {
        //         // swapp

        //         int temp = arr.get(i);
        //         arr.set(i, arr.get(maxidx));
        //         arr.set(maxidx, temp);

        //         headpify(maxidx);
        //     }
//         }

//         // delete from the heap 
//         public int removeEle(){

//             int data = arr.get(0);

//             //step = 1 swap    
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size()-1));
//             arr.set(arr.size()-1, temp);

//             // step = 2 remove ()
//             arr.remove(arr.size()-1);

//             headpify(0);
//             return data;
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
        
//     }

//     public static void main(String[] args) {
//         Heap h = new Heap();
//         h.add(4);   
//         h.add(1);   
//         h.add(3);   
//         h.add(2);   
//         h.add(5);   

//         while (!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.removeEle();
//         }
//     }
// }














// public class Priorityqueue {

//     public static void heapify(int arr [] , int i , int n) {
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int maxidx = i;

//         if (left < n && arr[left] > arr[maxidx]) {
//             maxidx = left;
//         }


//         if (right < n && arr[right] > arr[maxidx]) {
//             maxidx = right;
//         }

//         if (maxidx != i) {
//             int temp = arr[i];
//             arr[i] = arr[maxidx];
//             arr[maxidx] = temp;

//             heapify( arr , maxidx, n);
//         }
//     }

//     public static void heapsort(int arr []){
//         //step-1 = build-maxheap
//         int n = arr.length;
//         for(int i=n/2; i>=0; i--){
//             heapify(arr , i , n );
//         }

//         for(int i=n-1; i>0; i--){
//             // swap 
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr ,0, i);
//         }
//     }

//     public static void main(String[] args) {
//         int arr [] = {1,2,4,5,3};
//         heapsort(arr);


//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }





// public class Priorityqueue {

//     public static void heapify(int arr [] , int i , int n){
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int maxidx = i;

//         if (left < n && arr[left] > arr[maxidx]) {
//             maxidx = left;
//         }

//         if (right < n && arr[right] > arr[maxidx]) {
//             maxidx = right;
//         }

//         if (maxidx != i) {
//             int temp = arr[i];
//             arr[i] = arr[maxidx];
//             arr[maxidx] = temp;

//             heapify(arr, maxidx, n);
//         }
//     }

//     public static void heapSort(int arr []){
//         int n = arr.length;

//         // find the maxheap
//         for(int i=n/2; i>=0; i--){
//             heapify(arr, i, n);
//         }

//         // swap the first to end
//         for(int i=n-1; i>0; i--){
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }
//     }

//     public static void main(String[] args) {
//         int arr [] = {2,1,3,5,4};
//         heapSort(arr);

//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }






// Connect N - Ropes

// import java.util.PriorityQueue;

// public class Priorityqueue {

//     public static void main(String[] args) {
//         int arr [] = {2,3,3,4,6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for(int i=0; i<arr.length; i++){
//             pq.add(arr[i]);
//         }
        
//         int cost = 0;
//         while (pq.size() > 1) {
//             int min = pq.remove();
//             int min2 = pq.remove();
//             cost += min+min2;
//             pq.add(min + min2);
//         }

//         System.out.println("The Cost is : " + cost);
//     }
// }








// Nearby cars 

// import java.util.PriorityQueue;

// public class Priorityqueue {

//     static class Point implements Comparable <Point> {
//         int x;
//         int y;
//         int distsq;
//         int idx;

//         public Point(int x ,int y , int distsq , int idx){
//             this.x = x;
//             this.y = y;
//             this.distsq = distsq;
//             this.idx = idx;
//         }

//         @Override 
//         public int compareTo(Point p2){
//             return this.distsq  - p2.distsq;
//         }
//     }

//     public static void main(String[] args) {
//         int arr [] [] = {{3,3},{5,-1},{-2,4}};
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>();
//         for(int i=0; i<arr.length; i++){
//             int distsq = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
//             pq.add(new Point( arr[i][0] , arr[i][1] , distsq , i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.println("C"+pq.remove().idx);
//         }
//     }
// }






//Weakest Solider 

// import java.util.PriorityQueue;

// public class Priorityqueue {

//     static class Row implements Comparable <Row> {
//         int solider;
//         int idx;

//         public Row (int solider , int idx){
//             this.solider = solider;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row r2){
//             if (this.solider == r2.solider) {
//                 return this.idx - r2.idx;
//             }
//             return this.solider - r2.solider;
//         }
//     }

//     public static void main(String[] args) {
//         int army [] [] = {
//             {1,0,0,0},
//             {1,1,1,1},
//             {1,0,0,0},
//             {1,0,0,0},
//         };

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
//             System.out.println("R" + pq.remove().idx);
//         }
//         System.out.println();
//     }
// }



