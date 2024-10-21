// public class LinkedList {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;
//     // Methods


//     // Add()
//     // Add First 
//     public void addFirst(int data){
//         // Step=1 = create a new node 
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         // Step-2 = newNode next = head 
//         newNode.next = head;// Link 
//         // step-3 = head = newNode 
//         head = newNode;
//     }
//     // Add Last
//     public void addLast (int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }


//     // Print()
//     public void print (){
//         if (head  == null) {
//             System.out.println("Linked List is Empty");
//         }
//         Node temp = head;
//         size++;
//         while (temp != null) {
//             System.out.print(temp.data+"->");
//             temp = temp.next;
//         }
//         System.out.println("Null");
//     }

//     // Add in the Middle 
//     public void add(int idx , int data) {
//         if (idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         Node temp = head;
//         int i = 0;
//         while ( i < idx -1) {
//             temp = temp.next;
//             i++;
//         }

//         // i = idx-1; temp -> prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // Remove()

//     // Remove First()
//     public int Reomvefirst(){
//         if (size == 0) {
//             System.out.print("Linked List Is Empty");
//             return Integer.MIN_VALUE;
//         }
//         else if ( size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }
//     // Remove Last()

//     public int RemoveLast(){
//         if (size == 0) {
//             System.out.print("Linked List is Empty");
//         }
//         else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         Node prev = head;
//         for(int i=0; i<size-2; i++){
//             prev = prev.next;
//         }
//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }


//     // Search()

//     // public int iteraticvesearch(int key){
//     //     Node temp = head;
//     //     int i = 0;
//     //     while (temp != null) {
//     //         if (temp.data == key) {
//     //             return i;
//     //         }
//     //         temp = temp.next;
//     //         i++;
//     //     }
//     //     // key not found 
//     //     return -1;
//     // }




//     // Recursive Search

//     // public int helper(Node head , int key ){
//     //     if (head == null) {
//     //         return -1;
//     //     }
//     //     if (head.data == key) {
//     //         return 0;
//     //     }

//     //     int idx = helper(head.next, key);
//     //     if (idx == -1) {
//     //         return -1;
//     //     }
//     //     return idx+1;
//     // }

//     // public int RecursiveSearch(int key){
//     //     return helper(head, key);
//     // }


//     // Reverse LinkedList 

//     // public void ReverseLinkedlist() {
//     //     Node prev = null;
//     //     Node curr = tail = head;
//     //     Node next;

//         // while (curr != null) {
//         //     next = curr.next;
//         //     curr.next = prev;
//         //     prev = curr;
//         //     curr = next;
//         // }
//         // head = prev;
//     // }


//     // Delete Nth node from End 

//     // public void deleNthfromEnd(int n){
//     //     // calculate size 
//     //     int sz = 0;
//     //     Node temp = head;
//     //     while (temp != null) {
//     //         temp = temp.next;
//     //         sz++;
//     //     }



//     //     if (n == sz) {
//     //         head = head.next; // remove head if n == head 
//     //         return;
//     //     }

//     //     //sz-n
//     //     int i = 1;
//     //     int iToFind = sz - n;
//     //     Node prev = head;
//     //     while (i < iToFind) {
//     //         prev = prev.next;
//     //         i++;
//     //     }

//     //     prev.next = prev.next.next;
//     //     return;

//     // }

    
//     // Check if LL is a palindrome 

//     // Slow-fast Approch
//     public Node findMid(Node head) {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         return slow; // slow is my midnode
//     }
    

//     public boolean checkpalindrome(){
//         if (head == null || head.next == null) {
//             return true;
//         }
//         // step 1 = find mid 

//         Node midllNode = findMid(head);

//         // step 2 = reverse 2nd half 
//         Node prev = null;
//         Node curr = midllNode;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }


//         Node right = prev; // right half head 
//         Node left = head;

//         // step 3 = check left half and Right half 
//         while (right != null) {
//             if (left.data != right.data) {
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }


//     public static void main(String[] args) {
//         LinkedList l1 = new LinkedList();    
//         // l1.print();
//         l1.addFirst(2);
//         // l1.print();
//         l1.addFirst(1);
//         // l1.print();
//         l1.addLast(2);
//         // l1.print();
//         l1.addLast(1);
//         // l1.add(2, 3);
//         l1.print();
//         // l1.Reomvefirst();
//         // l1.RemoveLast();
//         // l1.print();
//         // System.out.println(l1.size);


//         // Iterative Search 
//         // System.out.println(l1.iteraticvesearch(3));
//         // System.out.println(l1.iteraticvesearch(10));


//         // Recursive Search
//         // System.out.println(l1.RecursiveSearch(3));
//         // System.out.println(l1.RecursiveSearch(10));

//         // ReverseLinkedlist
//         // l1.ReverseLinkedlist();
//         // l1.print();

//         // l1.deleNthfromEnd(3);
//         // l1.print();


//         System.out.println(l1.checkpalindrome());

//     }
// }


//     class Node {
//         int data;
//         Node next;

//         Node (int data1 , Node next1){
//             this.data = data1;
//             this.next = next1;
//         }

//         Node (int data1){
//             this.data  = data1;
//             this.next = null;
//         }
//     }
// public class LinkedList {
    // private static Node convertArr2(int [] arr) {
    //     Node head = new Node(arr[0]);
    //     Node mover = head;
    //     for(int i=1; i<arr.length; i++){
    //         Node temp = new Node(arr[i]);
    //         mover.next = temp;
    //         mover = temp;
    //     }
    //     return head;
    // }

//     public static int lenght(Node head){
//         int cnt = 0;
//         Node temp = head;
//         while ( temp != null) {
//             temp = temp.next;
//             cnt++;
//         }
//         return cnt;
//     }

//     public static int search(Node head , int k){
//         Node temp = head;
//         while (temp != null) {
//             if (temp.data == k) {
//                 return 1;
//             }
//             temp = temp.next;
//         }
//         return 0;
//     }

//     private static void print(Node head){
//         while (head != null) {
//             System.out.print(head.data +" ");
//             head = head.next;
//         }
//         System.out.println();
//     }

//     private static Node removeNodehead(Node head){
//         if (head == null) {
//             return head;
//         }
//         head = head.next;
//         return head;
//     }

//     private static Node removNodetail(Node head){
//         if (head == null || head.next == null) {
//             return null;
//         }

//         Node temp = head;
//         while (temp.next.next != null) {
//             temp = temp.next;
//         }
//         temp.next = null;

//         return head;
//     }


//     private static Node removekthele(Node head , int k){
//         if (head == null) {
//             return head;
//         }
//         if ( k == 1) {
//             head = head.next;
//             return head;
//         }
//         int cnt = 0;
//         Node temp = head;
//         Node prev = null;
//         while (temp != null) {
//             cnt++;
//             if (cnt == k) {
//                 prev.next = prev.next.next;
//                 break;
//             }
//             prev = temp;
//             temp = temp.next;
//         }
//         return head;
//     }
//     private static Node insetNodeHead(Node head , int val){
//         // if (head == null) {
//         //     return new Node(val);
//         // }
//         Node temp = new Node(val , head);
//         return temp;
//     }

//     public static Node insertiontail(Node head ,int val) {
//         if (head == null) {
//             return new Node(val);
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         Node newnode = new Node(val);
//         temp.next = newnode;
//         return head;
//     }

//     private static Node insertionatkth(Node head , int el , int k ){
//         if (head == null) {
//             if (k == 1) {
//                 return new Node(el);
//             }
//             else{
//                 return head;
//             }
//         }
//         if (k == 1 ) {
//             Node newNode = new Node(el , head);
//             return newNode;
//         }
//         int cnt = 0;
//         Node temp = head;
//         while ( temp != null) {
//             cnt++;
//             if (cnt == k - 1) {
//                 Node x = new Node(el , temp.next);
//                 temp.next = x;
//                 break;
//             }
//             temp = temp.next;
//         }
//         return head;
//     }


//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4};
//         Node head = convertArr2(arr);
//         // System.out.println(head.data);

//         // Print size of linkedlist 
//         // System.out.println(lenght(head));

//         // print linkedlist 
//         // Node temp = head;
//         // while (temp != null) {
//         //     System.out.print(temp.data + " ");
//         //     temp = temp.next;
//         // }
//         // System.out.println();
        
//         // Search Element in the Linkedlist 
//         // System.out.print(search(head, 0));

//         // print the Linkedlist 
//         print(head);


//         // remove the element from head-side in linkedlist
//         // head = removeNodehead(head);
//         // print(head);

//         // remove the element from tail-side in linkedlist
//         // removNodetail(head);
//         // print(head);

//         // remove the element from tail-side in linkedlist
//         // removekthele(head , 1);
//         // print(head);

//         // Add a new Node from the head side 
//         // insetNodeHead(head , 10);
//         // print(head);

//         // Add new Node at the end of the linkedlist 
//         // insertiontail(head , 6);
//         // print(head);

//         insertionatkth(head , 100 , 1);
//         print(head);

//     }
// }























// Doubly Linked List 

class Node {
    int data ;
    Node next;
    Node back;

    Node (int data1 , Node next1 , Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        data = data1;
        next = null;
        back = null;
    }
}


public class LinkedList {

    private static Node convertarr2DLL(int arr []){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i] , null , prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    
    private static void print(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        Node head = convertarr2DLL(arr);
        print(head);
    }
}