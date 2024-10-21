// implementation of queue using array

// public class Queues {

//     static class QueuesB {
//         static int arr [];
//         static int size;
//         static int rear;
//         static int front;
//     QueuesB(int n){
//         arr = new int [n];
//         size = n;
//         rear = -1;
//         front = -1;
//         }

//         public static boolean isempty(){
//             return rear == -1 && front == -1 ;
//         }

// public static boolean isfull(){
//     return (rear + 1) % size == front;
// }

//         public static void add(int data){
//             if (isfull()) {
//                 System.out.print("Queue is Full");
//             }
//             if (front == -1) {
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         // remove funtion 

//         public static int remove(){
//             if (isempty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             // int front = arr[0];
//             // for(int i=0; i<rear; i++){
//             //     arr[i] = arr[i+1];
//             // }
//             int result = arr[front];
//             // rear = rear - 1;
//             // last el delete
//             if (rear == front) {
//                 rear = front = -1;
//             }
//             else{
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         public static int peek(){
//             if (isempty()) {
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return arr[front];
//         }

//     }
//     public static void main(String[] args) {
//         QueuesB q = new QueuesB(5);
//         q.add(0);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(2);

//         while (!q.isempty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// using linked list implentaion of queue 
// public class Queues {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class QueuesB{
//         // static int arr [];
//         // static int size;
//         // static int rear;
//         // static int front;

//         // QueuesB(int n){
//         //     arr = new int[n];
//         //     size = n;
//         //     rear = -1;
//         //     front = -1;
//         // }

//         static Node head = null;
//         static Node tail = null;

//         public static boolean isempty(){
//             // return rear == -1 && front == -1;
//             return head == null && tail == null;
//         }

//         // add 
//         public static void add(int data){
//             Node newnode = new Node(data);
//             if (head == null) {
//                 head = tail = newnode;
//             }
//             tail.next = newnode;
//             tail = newnode;
//         }

//         // remove 
//         public static int remove(){
//             if (isempty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int front = head.data;
//             // single element in queue
//             if (head == tail) {
//                 head = tail = null;
//             }
//             else{
//                 head = head.next;
//             }
//             return front;
//         }

//         // peek
//         public static int peek(){
//             if (isempty()) {
//                 System.out.println("The queue is empty");
//                 return -1;
//             }
//             return head.data;
//         }

//     }  

//     public static void main(String[] args) {
//         QueuesB q = new QueuesB();
//         q.add(0);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while (!q.isempty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }

// Using java collection framework;

// import java.util.*;

// public class Queues {

//     public static void main(String[] args) {
//         // Queue<Integer> q = new LinkedList<>();
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// Question=2

// import java.util.*;

// public class Queues {

//     static class QueuesB {

//         static Stack<Integer> stack1 = new Stack<>();
//         static Stack<Integer> stack2 = new Stack<>();

//         public static boolean isEmpty() {
//             return stack1.isEmpty();
//         }

//         // add
//         public static void add(int data) {
//             while (!stack1.isEmpty()) {
//                 stack2.push(stack1.pop());
//             }

//             stack1.push(data);

//             while (!stack2.isEmpty()) {
//                 stack1.push(stack2.pop());
//             }
//         }

//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("is empty");
//                 return -1;
//             }
//             return stack1.pop();
//         }

//         // peeek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("is empty");
//                 return -1;
//             }
//             return stack1.peek();
//         }
//     }

//     public static void main(String[] args) {
//         QueuesB q = new QueuesB();
//         q.add(0);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }
// }

// Question=3

// import java.util.LinkedList;
// import java.util.Queue;

// public class Queues {

//     static class Stack{
//         // static Queue<Integer> q1 = new LinkedList<>();
//         // static Queue<Integer> q2 = new LinkedList<>();
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         public static void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }
//             else {
//                 q2.add(data);
//             }
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 System.out.print("Queue is Empty");
//                 return -1;
//             }
//             int top = -1;
//             // case 
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }
//             else{ // case2
//                 while(!q2.isEmpty()){
//                     top = q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }
//             return top;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 System.out.print("Queue is Empty");
//                 return -1;
//             }
//             int top = -1;
//             // case 
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             }
//             else{ // case2
//                 while(!q2.isEmpty()){
//                     top = q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }

//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// Question = 4

// import java.util.LinkedList;
// import java.util.Queue;

// public class Queues {

//     public static void firstprint(String str) {
//         int freq[] = new int[26];
//         Queue<Character> q = new LinkedList<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a']++;
//             while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
//                 q.remove();
//             }
//             if (q.isEmpty()) {
//                 System.out.print(-1 + " ");
//             } else {
//                 System.out.print(q.peek() + " ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         String str = "aabccxb";
//         firstprint(str);
//     }
// }

// Question = 5 

// import java.util.LinkedList;
// import java.util.Queue;

// public class Queues {

//     public static void intervals(Queue<Integer> q){
//         Queue<Integer> firsyhalf = new LinkedList<>();
//         int n = q.size();
//         int size = n / 2;
//         for(int i=0; i<size; i++){
//             firsyhalf.add(q.remove());
//         }
//         while (!firsyhalf.isEmpty()) {
//             q.add(firsyhalf.remove());
//             q.add(q.remove());
//         }
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
//         intervals(q);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// Question = 6

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

// public class Queues {

//     public static void reversedqueue(Queue<Integer> q){
//         Stack<Integer> stack = new Stack<>();
//         while (!q.isEmpty()) {
//             stack.push(q.remove());
//         }
//         System.out.println("Reversed Queue");
//         while (!stack.isEmpty()) {
//             System.out.println(stack.pop());
//         }
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         reversedqueue(q);

//     }
// }

// Question = 7
// Deque 

// import java.util.Deque;
// import java.util.LinkedList;

// public class Queues {

//     public static void main(String[] args) {
//         Deque<Integer> D = new LinkedList<>();
//         D.addLast(3);
//         D.addFirst(2);
//         D.addFirst(1);
//         System.out.println(D);
//         D.removeFirst();
//         D.removeLast();
//         System.out.println(D);
//         System.out.println(D.getFirst());
//         System.out.println(D.getLast());
//     }
// }

//  Stack and Queue using the Deque

// Stack Using Deque 

// import java.util.Deque;
// import java.util.LinkedList;

// public class Queues {

//     static class Stack {

//         static Deque<Integer> deque = new LinkedList<>();

//         //Push 
//         public static void push(int data){
//             deque.addLast(data);
//         }

//         public static int pop(){
//             return deque.removeLast();
//         }

//         public static int peek(){
//             return deque.getLast();
//         }

//     }

//     public static void main(String[] args) {
//         Stack stack = new  Stack();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         System.out.println("peek "+ stack.peek());
//         System.out.println(stack.pop());
//         System.out.println(stack.pop());
//         System.out.println(stack.pop());
//     }
// }

// Queue using deque 

// import java.util.Deque;
// import java.util.LinkedList;

// public class Queues {

//     static class Queue{
//         static Deque<Integer> deque = new LinkedList<>();

//         // add 
//         public static void push(int data){
//             deque.addLast(data);
//         }

//         // reomve
//         public static int remove(){
//             return deque.removeFirst();
//         }

//         //peek
//         public static int peek(){
//             return deque.getFirst();
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.push(1);
//         q.push(2);
//         q.push(3);
//         q.push(4);

//         System.out.println("peek " + q.peek());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//     }
//  }

// -----------------------------------Revesion----------------------------

/**
 * Queues
//  */
// class Queues {

//     // static class Queue{
//     // static int arr [];
//     // static int size;
//     // static int rear;
//     // static int front;

//     // Queue(int n){
//     // arr = new int[n];
//     // size = n;
//     // rear = -1;
//     // front = -1;
//     // }

//     // // operations

//     // //isempty
//     // public static boolean isempty(){
//     // return rear == -1 && front == -1;
//     // }

//     // //is full
//     // public static boolean isfull(){
//     // return (rear + 1) % size == front;
//     // }

//     // //add
//     // public static void add(int data){
//     // if (isfull()) {
//     // System.out.println("Land ahes tu he full ahe bhau");
//     // return;
//     // }

//     // rear = rear + 1;
//     // arr[rear] = data;
//     // }

//     // //remove
//     // public static int remove(){
//     // if (isempty()) {
//     // System.out.println("Kand ahes tu");
//     // return -1;
//     // }

//     // int front = arr[0];
//     // for(int i=0; i<rear; i++){
//     // arr[i] = arr[i+1];
//     // }
//     // rear = rear - 1;
//     // return front;
//     // }

//     // //peek

//     // public static int peek(){
//     // if (isempty()) {
//     // System.out.println("Empty ahe leka");
//     // return -1;
//     // }
//     // return arr[0];
//     // }
//     // }

//     // using Linkedlist

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         // // is empty
//         // public static boolean isEmpty(){
//         // return head == null && tail == null;
//         // }

//         // //add
//         // public static void add(int data){
//         // Node newnNode = new Node(data);
//         // if (head == null) {
//         // tail = head = newnNode;
//         // }
//         // tail.next = newnNode;
//         // tail = newnNode;
//         // }

//         // //remove
//         // public static int removed(){
//         // if (isEmpty()) {
//         // System.out.println("Empty q");
//         // return -1;
//         // }

//         // int front = head.data;
//         // if (head == tail) {
//         // head = tail = null;
//         // }
//         // else{
//         // head = head.next;
//         // }
//         // return front;
//         // }

//         // //peek
//         // public static int peek(){
//         // if (isEmpty()) {
//         // System.out.println("EMpty ahea bhau he ");
//         // return -1;
//         // }
//         // return head.data;
//         // }

//         public static boolean isempty() {
//             // return rear == -1 && front == -1;
//             return head == null && tail == null;
//         }

//         // add
//         public static void add(int data) {
//             Node newnode = new Node(data);
//             if (head == null) {
//                 head = tail = newnode;
//             }
//             tail.next = newnode;
//             tail = newnode;
//         }

//         // remove
//         public static int remove() {
//             if (isempty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int front = head.data;
//             // single element in queue
//             if (head == tail) {
//                 head = tail = null;
//             } else {
//                 head = head.next;
//             }
//             return front;
//         }

//         // peek
//         public static int peek() {
//             if (isempty()) {
//                 System.out.println("The queue is empty");
//                 return -1;
//             }
//             return head.data;
//         }

//     }

//     public static void main(String[] args) {
//         // Queue q = new Queue(5);
//         // q.add(0);
//         // q.add(1);
//         // q.add(2);
//         // q.add(3);
//         // q.add(4);

//         // while (!q.isempty()) {
//         // System.out.println(q.peek());
//         // q.remove();
//         // }
//         // System.out.println();

//         // linkedlist
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while (!q.isempty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//         System.out.println();

//     }
// }


// using built-in

/**
 * Queues
 */
// import java.util.*;

// public class Queues {

//     public static void main(String[] args) {
//         // Queue<Integer> q = new LinkedList<>();
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// import java.util.Stack;

// /**
//  * Queues
//  */
// class Queues {
//     static class Queue{
//             static Stack<Integer> s1 = new Stack<>();
//             static Stack<Integer> s2 = new Stack<>();

//         //isempty
//         public static boolean isempty() {
//             return s1.isEmpty();
//         }

//         //push
//         public static void add(int data){
//             while (!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         //pop
//         public static int remove(){
//             if (isempty()) {
//                 System.out.println("Land kah nah");
//                 return -1;
//             }

//             return s1.pop();

//         }
//         //peek
//         public static int peeek(){
//             if (isempty()) {
//                 System.out.println("Land kah nah");
//                 return -1;
//             }

//             return s1.peek();
//         }

//     }
    
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(0);
//         q.add(1);
//         q.add(2);

//         while (!q.isempty()) {
//             System.out.println(q.peeek());
//             q.remove();
//         }
//         System.out.println();
//     }   
// }


/**
 * Queues
 */
// class Queues {

//     public static void printnonrepeating(String str) {
//         int freq[] = new int[26];
//         Queue<Character> q = new LinkedList()
//     }


//     public static void main(String[] args) {
//         String str = "aabccxb";
//     }
    
// }


/**
 * Queues
 */

// import java.util.*;
// import java.util.LinkedList;

// public class Queues {

//     public static void interleave(Queue<Integer> q){
//         Queue<Integer> firsthalf = new ArrayDeque<>();
//         int size = q.size();

//         for(int i=0; i<size/2; i++){
//             firsthalf.add(q.remove());
//         }

//         while (!firsthalf.isEmpty()) {
//             q.add(firsthalf.remove());
//             q.add(q.remove());
//         }
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
//         interleave(q);
//         while (!q.isEmpty()) {
//             System.out.print(q.peek());
//             q.remove();
//         }
//         System.out.println();
//     }
// }

import java.util.Deque;
import java.util.LinkedList;

// /**
//  * Queues
//  */
public class Queues {

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();
        // add
        // public void  add(int data){
        //     deque.addLast(data);
        // }

        // //remove 
        // public int removeLas(){
        //     return deque.removeLast();
        // }

        // //get
        // public int peek(){
        //     return deque.getLast();
        // }

        //queue 
        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            return deque.removeFirst();
        }

        public int peek(){
            return deque.removeFirst();
        }
    }
    // static class Que{
        //add 
        // public void add(int data){
        //     deque.addLast(data);
        // }

        // public int remove(){
        //     return deque.removeFirst();
        // }

        // public int peek(){
        //     return deque.removeFirst();
        // }
    // }

    public static void main(String[] args) {
        // Deque<Integer> deque = new LinkedList<>();
        // deque.addFirst(1);
        // deque.addFirst(2);
        // deque.addFirst(3);
        // deque.addLast(4);
        // deque.addLast(5);
        // System.out.println(deque);

        // deque.removeFirst();
        // deque.removeFirst();
        // deque.removeLast();
        // deque.removeLast();
        // System.out.println(deque);

        //1 stack using deque

     Stack s = new Stack();
     s.add(1);
     s.add(2);
     s.add(3);

    System.out.println(s.peek()+" ");

    }
}

// import java.util.Deque;
// import java.util.LinkedList;

// /**
//  * Queues
//  */
// class Queues {
    
//     Deque<Integer> deque = new LinkedList<>();

//     static class Queue{
//         //add 
//         public void add(int data){
//             deque.addLast(data);
//         }

//         public int remove(){
//             deque.removeFirst();
//         }

//         public int peek(){
//             deque.removeFirst();
//         }
//     }

//     public static void main(String[] args) {
        
//     }
// }