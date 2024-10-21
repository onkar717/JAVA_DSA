// import java.util.Stack;

// class Node {
//     int data;
//     Node next;

//     Node(int data1 , Node next1){
//         this.data = data1;
//         this.next = next1;
//     }

//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }

// // class Node {
// //     public int data;
// //     public Node next;
// //     public Node child;

// //     Node()
// //     {
// //         this.data = 0;
// //         this.next = null;
// //         this.child = null;
// //     }
// //     Node(int data)
// //     {
// //         this.data = data;
// //         this.next = null;
// //         this.child = null;
// //     }
// //     Node(int data, Node next, Node child)
// //     {
// //         this.data = data;
// //         this.next = next;
// //         this.child = child;
// //     }
// // }

// public class Linkedlist {

//     private static Node converttoLL(int arr []){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i=1; i<arr.length; i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;
//         }
//         return head;
//     }

//     public static void print(Node head){
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static Node reversedLL(Node head){
//         Node temp = head;
//         Node prev = null;
//         while (temp != null) {
//             Node front = temp.next;
//             temp.next = prev;
//             prev = temp;
//             temp = front;
//         }
//         return prev;
//     }

//     // Reversed the linked list using the Recursion

//     public static Node reverseLLREcursuve(Node head){
//         if (head == null || head.next == null) {
//             return head;
//         }

//         Node newhead = reverseLLREcursuve(head.next);
//         Node front = head.next;
//         front.next = head;
//         head.next = null;

//         return newhead;
//     }

//     // checked weather linkedlist is palindrome or not 

//     public static boolean checkpalindrome(Node head){
//         Stack<Integer> stack =  new Stack<>();
//         Node temp = head;
//         while (temp != null) {
//             stack.push(temp.data);
//             temp = temp.next;
//         }

//         temp = head;
//         while (temp != null) {
//             if (temp.data != stack.pop()) {
//                 return false;
//             }
//             temp = temp.next;
//         }
//         return true;
//     }

//     // optimized for palindrome 

//     public static boolean isPalindrome(Node head) {
//         Node slow = head;
//         Node fast = head;

//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next;
//             fast = fast.next.next;

//         }
//         Node newhead = reverseLLREcursuve(slow.next);
//         Node first = head;
//         Node second = newhead;

//         while (second != null ) {
//             if (first.data != second.data) {
//                 reverseLLREcursuve(newhead);
//                 return false;
//             }
//             first = first.next;
//             second = second.next;
//         }
//         reverseLLREcursuve(newhead);
//         return true;

//     }    

//     // Add 1 in the Linked List 
//     public static Node add1_2LL(Node head){
//         head = reverseLLREcursuve(head);
//         Node temp = head;
//         int carry = 1;
//         while ( temp != null) {
//             temp.data = temp.data + carry;
//             if (temp.data < 10) {
//                 carry = 0;
//             }
//             else{
//                 temp.data = 0;
//                 carry = 1;
//             }
//             temp = temp.next;
//         }

//         if (carry == 1) {
//             Node newnode = new Node(1);
//             head = reverseLLREcursuve(head);
//             newnode.next = head;
//             return newnode;
//         }
//         head = reverseLLREcursuve(head);
//         return head;
//     }

//     public static Node byrecursive(Node head){
//     int carry = helper(head);
//                 if (carry == 1) {
//             Node newNode = new Node(1);
//             newNode.next = head;
//             return newNode;
//         }
//         return head;
//     }
//     public static int helper(Node temp){
//         if (temp == null) {
//             return 1;
//         }
//         int carry = helper(temp.next);
//         temp.data = temp.data + carry;
//         if (temp.data < 10) {
//             return 0;
//         }
//         temp.data = 0;
//         return 1;
//     }

//     //  find the intersection of the linked list 
//     public static Node optimized(Node head, Node head1) {
//         if (head == null || head1 == null) {
//             return null;
//         }

//         Node t1 = head;
//         Node t2 = head1;

//         while (t1 != t2) {
//             t1 = (t1 == null) ? head1 : t1.next;
//             t2 = (t2 == null) ? head : t2.next;
//         }

//         return t1;
//     }

// ////// FInd the Middle Node of the LinkedList 
//     // public static Node findMiddle(Node head){
//     //     Node temp = head;
//     //     int cnt = 0;
//     //     while (temp != null) {
//     //         cnt++;
//     //         temp = temp.next;
//     //     }

//     //     Node midnode = (cnt / 2) + 1;

//     //     temp = head;
//     //     while (temp != null) {
//     //         midnode = midnode--;
//     //         if (midnode == 0) {
//     //             break;
//     //         }
//     //         temp = temp.next;
//     //     }
//     //     return temp;
//     // }

//     // optimized solution  using TurtoiseHare Method 
//     public static Node optimized(Node head){
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public static boolean detectloop(Node head){
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static Node deleteMiddle(Node head) {
//          if (head == null || head.next == null){
//             return null;
//         }
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast =  fast.next.next;
//         }
//         if(slow.next != null) {
//             slow.next = slow.next.next;
//         }
//         return head;
//     }

//     public static Node mergeLL(Node head, Node head1) {
//         Node t1 = head;
//         Node t2 = head1;
//         Node dummyNode = new Node(-1);
//         Node temp = dummyNode;

//         while (t1 != null && t2 != null) {
//             if (t1.data < t2.data) {
//                 temp.next = t1;
//                 temp = t1;
//                 t1 = t1.next;
//             } else {
//                 temp.next = t2;
//                 temp = t2;
//                 t2 = t2.next;
//             }
//         }

//         if (t1 != null) {
//             temp.next = t1;
//         } else {
//             temp.next = t2;
//         }

//         return dummyNode.next;
//     }

//     public static Node findMiddle(Node head) {
//         if (head == null) {
//             return null;
//         }
//         Node slow = head;
//         Node fast = head;

//         while (fast.next != null && fast.next.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public static Node sortLL(Node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         Node middle = findMiddle(head);
//         Node right = middle.next;
//         middle.next = null;
//         Node left = head;

//         left = sortLL(left);
//         right = sortLL(right);

//         return mergeLL(left, right);
//     }

//     private static Node getkthNode(Node temp , int k){
//         k -= 1;
//         while (temp != null && k > 0) {
//             k--;
//             temp = temp.next;
//         }
//         return temp;
//     }

//     public static Node kreverse(Node head , int k){
//         Node temp = head;
//         Node prev = null;
//         while (temp != null) {
//             Node kthNode = getkthNode(temp , k);
//             if (kthNode == null) {
//                 if (prev != null) {
//                     prev.next = temp;
//                 }
//                 break;
//             }
//             Node nextNode = kthNode.next;
//             kthNode.next = null;
//             reversedLL(temp);
//             if (temp == head) {
//                 head = kthNode;
//             }
//             else{
//                 prev.next = kthNode;
//             }
//             prev = temp;
//             temp = nextNode;
//         }
//         return head;
//     }

//     // public static Node merge(Node list1 , Node list2){
//     //     Node dummyNode = new Node(-1);
//     //     Node res = dummyNode;
//     //     while (list1 != null && list2 != null) {
//     //         if (list1.data < list2.data) {

//     //         }
//     //     }
//     // }

//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9,10};
//         // int[] arr1 = {1, 2, 3};
//         Node head = converttoLL(arr);
//         // Node head1 = converttoLL(arr1);
//         print(head);
//         // print(head1);
//         // Reversed the Linked List 
//         // head = reversedLL(head);
//         // print(head);

//         // reversed the Linked list using the recursive 
//         // head = reverseLLREcursuve(head);
//         // print(head);

//         // check weather the LinkedList is palindrome or not
//         // boolean isPalindrome = checkpalindrome(head);
//         // if (isPalindrome) {
//         //     System.out.println("The linked list is a palindrome.");
//         // } else {
//         //     System.out.println("The linked list is not a palindrome.");
//         // }     

//          // check weather the LinkedList is palindrome or not
//         //  boolean isPalindrome = isPalindrome(head);
//         //  if (isPalindrome) {
//         //      System.out.println("The linked list is a palindrome.");
//         //  } else {
//         //      System.out.println("The linked list is not a palindrome.");
//         //  } 

//         // Add 1 to the Linked List 
//         // add1_2LL(head);
//         // print(head);
//         // By recursion 
//         // byrecursive(head);
//         // print(head);

//         // Find the intersection of linkedlist
//         // head = optimized(head, head1);
//         // if (head != null) {
//         //     System.out.println("Intersection Node Data: " + head.data);
//         // } else {
//         //     System.out.println("No intersection found.");
//         // }

//         // optimized(head);
//         // print(head);

//         // detectloop(head);

//         // deleteMiddle(head);
//         // print(head);

//         // Merger the Two Nodes
//         // mergeLL(head, head1);
//         // print(head1);

//         // sortLL(head);
//         // print(head);

//         // head = kreverse(head, 3);
//         // print(head);
//     }
// }

// -----------------------------------Revesion-------------------------------------

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
//     // Add First

//     // public void addfirst (int data){
//     // // step = 1 = create a new Node
//     // Node newNode = new Node(data);
//     // if (head == null) {
//     // head = tail = newNode;
//     // return;
//     // }
//     // //step - 2 newNode next -> head
//     // newNode.next = head; // Link

//     // //ste-3 head - newNode
//     // head = newNode;

//     // }

//     public void addfirst(int data) {
//         // step - 1
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         // step -2
//         newNode.next = head;

//         // step - 3
//         head = newNode;
//     }

//     // Add Last
//     // public void addLast(int data){
//     // //create a new node

//     // // step - 1
//     // Node newNode1 = new Node(data);

//     // //step-2
//     // tail.next = newNode1;

//     // //step-3
//     // tail = newNode1;
//     // }

//     public void addlast(int data) {
//         // step-1
//         Node newNode = new Node(data);
//         size++;

//         // step-2
//         tail.next = newNode;

//         // stp-3
//         tail = newNode;
//     }

//     public void printdata() {
//         Node temp = head;
//         if (head == null) {
//             System.out.println("LL is EMpty");
//             return;
//         }
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // add in midle
//     // public void addmidle(int data , int idx){
//     // Node newnode = new Node(data);
//     // if (idx == 0) {
//     // addfirst(data);
//     // }
//     // Node temp = head;
//     // int i =0;
//     // while (i < idx - 1) {
//     // temp = temp.next;
//     // i++;
//     // }

//     // newnode.next = temp.next;
//     // temp.next = newnode;
//     // }

//     public void addmidle(int data, int idx) {
//         if (idx == 0) {
//             addfirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;

//         while (i < idx - 1) {
//             temp = temp.next;
//             i++;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;

//     }

//     // Remove first
//     public int removefirst() {
//         if (size == 0) {
//             System.out.println("Lavdya mokla ahea he");
//             return Integer.MAX_VALUE;
//         } else if (size == 1) {
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

//     // Remove last
//     public int removelast() {
//         if (size == 0) {
//             System.out.println("Land ahea hite");
//             return Integer.MIN_VALUE;
//         }

//         else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size--;
//             return val;
//         }

//         Node prev = head;
//         for (int i = 0; i < size - 2; i++) {
//             prev = prev.next;
//         }

//         int val = prev.next.data;
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;

//     }

//     public int search(int key) {
//         int i = 0;
//         Node temp = head;
//         while (temp != null) {
//             if (temp.data == key) {
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }

//     // recursive search

//     public int helper(Node head, int key) {
//         if (head == null) {
//             return -1;
//         }
//         if (head.data == key) {
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if (idx == -1) {
//             return -1;
//         }
//         return idx + 1;

//     }

//     public int recursivesearc(int key) {
//         return helper(head, key);
//     }

//     // reverse ll
//     public void reverse() {
//         Node curr = tail = head;
//         Node prev = null;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }

//     // fin & remove nth node

//     public void findnth(int key) {
//         int sz = 0;
//         Node temp = head;
//         while (temp != null) {
//             temp = temp.next;
//             sz++;
//         }

//         if (key == sz) {
//             head = head.next;
//             return;
//         }

//         // sz=n
//         int i = 1;
//         Node prev = head;
//         int tofind = sz - key;
//         while (i < tofind) {
//             prev = prev.next;
//             i++;
//         }

//         prev.next = prev.next.next;
//         return;
//     }

//     // slow fast approch
//     public Node findmiddle(Node head) {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public boolean checkpalindrome() {
//         if (head == null || head.next == null) {
//             return true;
//         }

//         // step-1
//         Node miNode = findmiddle(head);

//         // step-2
//         Node prev = null;
//         Node curr = miNode;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         // step - 3
//         Node right = prev;
//         Node left = head;

//         while (right != null) {
//             if (left.data != right.data) {
//                 return false;
//             } else {
//                 left = left.next;
//                 right = right.next;
//             }
//         }
//         return true;
//     }

//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 return true;
//             }
//         }
//         return false; // cycle dosent exiist
//     }

//     // detect a lloop
//     public static void removeloop() {
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 cycle = true;
//                 break;
//             }
//         }
//         if (cycle == false) {
//             return;
//         }

//         slow = head;
//         Node prev = null;
//         while (slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         prev.next = null;
//     }


//     // do this in the bult-in linkedlist data structure 
//     // public Node getMid() {
//     //     Node slow = head;
//     //     Node fast = head;

//     //     while (fast != null && fast.next != null) {
//     //         slow = slow.next;
//     //         fast = fast.next.next;
//     //     }

//     //     return slow;
//     // }

//     // private Node merge(Node head1, Node head2) {
//     //     Node mergedll = new Node(-1);
//     //     Node temp = mergedll;

//     //     while (head1 != null && head2 != null) {
//     //         if (head1.data <= head2.data) {
//     //             temp.next = head1.next;
//     //             temp = temp.next;
//     //         } else {
//     //             temp.next = head2;
//     //             head2 = head2.next;
//     //             temp = temp.next;
//     //         }
//     //     }

//     //     while (head1 != null) {
//     //         temp.next = head1.next;
//     //         temp = temp.next;
//     //     }
//     //     while (head2 != null) {
//     //         temp.next = head2;
//     //         head2 = head2.next;
//     //         temp = temp.next;
//     //     }

//     //     return mergedll.next;
//     // }

//     // public Node mergesort(Node head) {
//     //     if (head == null || head.next == null) {
//     //         return  head;
//     //     }
//     //     // find mid

//     //     Node mid = getMid();

//     //     // left/right MS

//     //     Node righthead = mid.next;
//     //     mid.next = null;
//     //     Node newleft = mergesort(head);
//     //     Node newright = mergesort(righthead);

//     //     // merge
//     //     return merge(newleft, newright);
//     // }


//     //zig - zag 
//     public void zigzag(){
//         //Find midnode 
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         Node midnode = slow;

//         // reverse 
//         Node curr = midnode.next;
//         midnode.next = null;
//         Node prev = null;
//         Node next;
//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node left = head;
//         Node right = prev;
//         Node nextL , nextR;

//         while (left != null && right != null) {
//             nextL = left.next;
//             left.next = right;
//             nextR = right.next;
//             right.next = nextL;

//             left = nextL;
//             right = nextR;

//         }

//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.addfirst(2);
//         // ll.printdata();
//         ll.addfirst(1);
//         // ll.printdata();
//         ll.addlast(4);
//         // ll.printdata();
//         ll.addlast(5);
//         // ll.printdata();
//         // ll.addmidle(3, 2);
//         // ll.printdata();
//         // ll.removefirst();
//         // ll.printdata();;
//         // ll.removelast();
//         // ll.printdata();
//         // System.out.println(size + " Size of the LinkedList");
//         // // ll.printdata();
//         // System.out.println(ll.search(2));
//         // System.out.println(ll.search(10));

//         // System.out.println(ll.recursivesearc(2));
//         // ll.reverse();
//         // ll.printdata();
//         // ll.findnth(3);
//         ll.printdata();
//         ll.zigzag();
//         ll.printdata();
//         // System.out.println(ll.checkpalindrome());




//         // ------------For loop ------------------------
//         // head = new Node(1);
//         // Node temp = new Node(2);
//         // head.next = temp;
//         // head.next.next = new Node(3);
//         // head.next.next.next = temp;

//         // System.out.println(isCycle());
//         // removeloop();
//         // System.out.println(isCycle());
//     }
// }
















class LinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addd first

    public void addfirst(int data){
        
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void printdatad(){
        Node temp = head;
        while (temp != null) {
        System.out.print(temp.data + "<->");
        temp = temp.next;
        }
        System.out.println();
    }

    //add last 
    public void adddlast(int data){
        Node newNode = new Node(data);

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    // removefirst

    public int removedll(){
        if (head  == null) {
            System.out.println("Land ahes tu");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
        int val = head.data;
        head = tail = null; 
        size--;
        return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //removed last 

    public int removelast(){
        if (head == null) {
            System.out.println("Land aheas tu");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        tail = tail.prev;
        tail.next = null;

        return val;
    }


    //reversed dll

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList dl = new LinkedList();
        dl.addfirst(1);
        dl.addfirst(2);
        dl.addfirst(3);
        dl.addfirst(4);
        dl.addfirst(5);
        dl.adddlast(6);
        // dl.printdatad();
        // dl.removedll();
        // dl.printdatad();
        System.out.println("Size of it is " + size);
        // dl.reverse();
        dl.printdatad(); 
        dl.removelast();
        dl.printdatad();
    }
    
}