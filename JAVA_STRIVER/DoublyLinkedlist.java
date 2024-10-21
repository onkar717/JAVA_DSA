// import java.util.Stack;

// class Node {
//     int data;
//     Node next;
//     Node back;

//     Node(int data1 , Node next1 , Node back1){
//         this.data = data1;
//         this.next = next1;
//         this.back = back1;
//     }

//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//         this.back = null;
//     }
// }



// public class DoublyLinkedlist {

//     private static Node convert2DLL(int arr []){
//         Node head = new Node(arr[0]);
//         Node prev = head;
//         for(int i=1; i<arr.length; i++){
//             Node temp = new Node(arr[i]);
//             prev.next = temp;
//             prev = temp;
//         }
//         return head;
//     }

//     private static void print(Node head){
//         while (head != null) {
//             System.out.print(head.data+" ");
//             head = head.next;
//         }
//         System.err.println();
//     }

//     // Delete a Head node
//     private static Node deleteheadNode(Node head){
//         if (head == null || head.next == null) {
//             return null;
//         }
//         Node prev = head;
//         head = head.next;

         
//         head.back = null;
//         prev.next = null;

//         return head;  
//     }

//     // Delete Tail Node 
//     private static Node deletetailNode(Node head){
//         if (head == null || head.next == null) {
//             return null;
//         }

//         Node tail = head;
//         while (tail.next != null) {
//             tail = tail.next;
//         }
//         Node prev = tail.back;
//         prev.next = null;
//         tail.back = null;

//         return head;
//     }
 

//     // Deelete The Kth node from the Doubled linked list
//     private static Node deletekthele(Node head, int k) {
//         if (head == null) {
//             return null;
//         }
//         int cnt = 0;
//         Node KNode = head;
//         while (KNode != null) {
//             cnt++;
//             if (cnt == k) break;
//             KNode = KNode.next;
//         }
//         if (KNode == null) {
//             return head; // k is greater than the length of the list
//         }
//         Node prev = KNode.back;
//         Node fNode = KNode.next;
    
//         if (prev == null && fNode == null) {
//             return null;
//         } else if (prev == null) {
//             return deleteheadNode(head);
//         } else if (fNode == null) {
//             return deletetailNode(head);
//         }
    
//         prev.next = fNode;
//         fNode.back = prev;
    
//         KNode.next = null;
//         KNode.back = null;
    
//         return head;
//     }
    
//     private static void deleteNode(Node temp){
//         Node prev = temp.back;
//         Node front = temp.next;
//         if(front == null){
//             prev.next = null;
//             temp.back = null;
//             return;
//         }

//         prev.next = front;
//         front.back = prev;

//         temp.next = temp.back = null;
//     }

//     // Insertion in doubly linkedlist before 

//     // Insertion before the head 
//     public static Node headinsertion(Node head , int k){
//         Node newhead = new Node(k , head , null);
//         head.back = newhead;
//         return newhead;
//     }


//     //Insertion from the tail , before tail 
//     public static Node tailInsertion(Node head , int k){
//           if (head.next == null) {
//             return headinsertion(head, k);
//           }

//           Node tail = head;
//           Node prev = null;
//           while (tail.next != null) {
//               prev = tail;
//               tail = tail.next;
//           }

//           Node newNode = new Node(k , tail , prev);

//           prev.next = newNode;
//           tail.back = newNode;

//           return head;

//     }

//     // Insertion before the kth Element 

//     public static Node insertionkthele(Node head , int k){
//         if (head == null) {
//             return null;
//         }
//         if (k == 1) {
//             return headinsertion(head, k);
//         }

//         Node temp = head;
//         int cnt = 0;
//         Node prev = null;
//         while (temp.next != null) {
//             cnt = cnt + 1;
//             if (cnt == k) {
//                 break;
//             }
//             prev = temp;
//             temp = temp.next;
//         }

//         Node newNode = new Node(k , temp , prev);

//         prev.next = newNode;
//         temp.back = newNode;

//         return head;
//     }


//     // Reversed Doubly Linked list 

//     // Using Stack reversed the Doubly Linked list 
//     public static Node reversedDLL(Node head) {
//         if (head == null || head.next == null) {
//             return head; // If the list is empty or has only one node, return it as it is already reversed
//         }
//         Node temp = head;
//         Stack<Integer> stack = new Stack<>();
//         // Push all the data values of the doubly linked list onto the stack
//         while (temp != null) {
//             stack.push(temp.data);
//             temp = temp.next;
//         }
//         temp = head; // Reset temp to the head of the list
//         // Pop elements from the stack and update the data values of the nodes in reverse order
//         while (temp != null) {
//             temp.data = stack.pop();
//             temp = temp.next;
//         }
    
//         return head; // Return the head of the reversed list
//     }


//     // Optimized soluton 

//     // public static Node optimizedreversed(Node head) {
//     //     if (head == null || head.next == null) {
//     //         return head;
//     //     }

//     //     Node last = nu;
//     //     // if (last == null) {
//     //     //     return head;
//     //     // }

//     //     Node current = head;
        

//     //     while (current .next != null) {
//     //         last = current.back;
//     //         current.back = current.next;
//     //         current.next = last;
//     //         current = current.back;
//     //     }

//     //     Node newhead = last.back;
//     //     return head;
//     // }

//     // Adding two number of the Linked list 

//     public static Node addtwNode(Node head , Node head1){
//         // Node t1 = head;
//         // Node t2 = head1;



//         Node dummyNode = new Node(-1);
//         Node current = dummyNode;
//         int carry = 0;
//         while (head != null || head1 != null ) {
//             int sum = 0;
//             if (head != null) {
//                 sum += head.data;
//                 head = head.next;
//             }
//             if (head1 != null) {
//                 sum += head1.data;
//                 head1 = head1.next;
//             }
//             sum += carry;
//             carry = sum / 10;
//             Node newNode = new Node(sum % 10);
//             current.next = newNode;
//             current = current.next;
//         }
//         return dummyNode.next;

//     }

//     // sort the Linked list 0's , 1's and 2's
//     public static Node sortLL(Node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         Node temp = head;
//         int cnt0 = 0;
//         int cnt1 = 0;
//         int cnt2 = 0;
    
//         // Count the occurrences of each digit
//         while (temp != null) {
//             if (temp.data == 0) {
//                 cnt0++;
//             } else if (temp.data == 1) {
//                 cnt1++;
//             } else {
//                 cnt2++;
//             }
//             temp = temp.next;
//         }
    
//         // Update node values based on the counts
//         temp = head;
//         while (temp != null) {
//             if (cnt0 > 0) {
//                 temp.data = 0;
//                 cnt0--;
//             } else if (cnt1 > 0) {
//                 temp.data = 1;
//                 cnt1--;
//             } else {
//                 temp.data = 2;
//                 cnt2--;
//             }
//             temp = temp.next;
//         }
    
//         return head;
//     }

//     public static Node removenthnodefromend(Node head , int n){
//         int cnt = 0;
//         Node temp = head;
//         while (temp.next != null) {
//             cnt++;
//             temp = temp.next;
//         }
//         if (cnt == n || n == 1) {
//             // Node newhead = head.next;
//             // return newhead;
//             return head.next;
//         }
//         int res = cnt - n;
//         temp = head;
//         while (temp.next != null) {
//             res--;
//             if (res == 0) {
//                 break;
//             }
//             temp = temp.next;
//         }
//         // Node deleteNode = temp.next;
//         temp.next = temp.next.next;
//         return head;
//     }
    
//     // there is also the way using the two pointer approch 

//     // public static Node deleteOccurences(Node head , int key){
//     //    if (head != null)
//     //                 head.prev = null;
//     // }
   
   

//     public static void main(String[] args) {
//          int arr [] = {1,5,5,4,5};
//         // int arr [] = {0,1,2,0,0,2,1,2};
//         //  int arr1 [] = {5,4,3,2,1};
//          Node head = convert2DLL(arr);
//         //  Node head1 = convert2DLL(arr1);
//          print(head);
//         //  print(head1);
//         // Remove the Head node from Double Linkedlist 
//         // head  = deleteheadNode(head);
//         // print(head);

//         // Remove the tail node from Double Linkedlist 
//         // head = deletetailNode(head);
//         // print(head);



//         //  remove the Kth Element from the DLL
//         // head = deletekthele(head, 2);
//         // print(head);

//         // deleteNode(head.next.next);
//         // print(head);

//         // Insertion from the head side 
//         // head = headinsertion(head , 6);
//         // print(head);

//         // Insertion from the tail side 
//         // head = tailInsertion(head , 6);
//         // print(head);

//         // Insertion before the kth element 
//         // head = insertionkthele(head, 3);
//         // print(head);

//         // reversed the Doubly Linked list using the two stacks 
//         // reversedDLL(head);
//         // print(head);

//         // addition of the Two Head Nodes 
//         // head = addtwNode(head, head1);
//         // print(head);


//         // Sort the Linked List 0's , 1's and 2's 
//         // sortLL(head);
//         // print(head);

//         // Remove the nth node from the end 
//         // head = removenthnodefromend(head, 3);
//         // print(head);


//         // Reversed the Linked List 
//         // reversedLL(head);
//         // print(head);


//         // Delelte all the Occurences of the DLL 
//         // head = deleteOccurences(head, 5);
//         // print(head);
//     }
// }
