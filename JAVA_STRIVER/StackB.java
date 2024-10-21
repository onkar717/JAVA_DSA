
// // import java.util.*;

// // public class Stack {

// //     public static void main(String[] args) {

// //         stack s = new stack();
// //         s.push(6);
// //         s.push(3);
// //         s.push(7);
// //         System.out.println("Top of the stack before deleting any element " + s.top());
// //         System.out.println("Size of the stack before deleting any element " + s.size());
// //         System.out.println("The element deleted is " + s.pop());
// //         System.out.println("Size of the stack after deleting an element " + s.size());
// //         System.out.println("Top of the stack after deleting an element " + s.top());
// //     }
// // }
// // class stack {
// //     int size = 10000;
// //     int arr[] = new int[size];
// //     int top = -1;
// //     public void push(int x) {
// //         top++;
// //         arr[top] = x;
// //     }
// //     public int pop() {
// //         int x = arr[top];
// //         top--;
// //         return x;
// //     }
// //     public int top() {
// //         return arr[top];
// //     }
// //     public int size() {
// //         return top + 1;
// //     }
// // }



// import java.util.*;
// public class Stack {

//     public static void main(String[] args) {
//         stack s = new stack();
//         s.push(7);
//         s.push(5);
//         s.push(6);
//         System.out.println(s.size());
//         System.out.println(s.top());
//         System.out.println(s.pop());
//         System.out.println(s.size());
//         System.out.println(s.top());
//     }
// }

// class stack {
//     int size = 1000;
//     int arr[] = new int[size];
//     int top = -1;
//     public void push(int x){
//         top++;
//         arr[top] = x;
//     }
//     public int pop(){
//         int x = arr[top];
//         top--;
//         return x;
//     }
//     public int top(){
//         return arr[top];
//     }
//     public int size(){
//         return top + 1;
//     }
//     public int isempty(){
//         return top == -1;
//     }
// }




// import java.util.*;;
// class Stack {
//         int[] arr; // Array to hold stack elements
//         int top;   // Index of the top element
//         int capacity; // Maximum capacity of the stack
        
//         // Constructor to initialize the stack with a given capacity
//         Stack(int capacity) {
//             this.capacity = capacity;
//             this.arr = new int[capacity];
//             this.top = -1; // Initialize top index to -1 to indicate an empty stack
//         }
        
//         // Method to check if the stack is empty
//         public int isEmpty() {
//             if (top == -1)
//                 return 1; // Stack is empty
//             else
//                 return 0; // Stack is not empty
//         }
        
//         // Method to check if the stack is full
//         public int isFull() {
//             if (top == capacity - 1)
//                 return 1; // Stack is full
//             else
//                 return 0; // Stack is not full
//         }
        
//         // Method to push an element onto the stack
//         public void push(int num) {
//             if (isFull() == 1) {
//                 System.out.println("Stack is full. Cannot push " + num);
//                 return;
//             }
//             top++;
//             arr[top] = num;
//             System.out.println(num + " pushed into stack");
//         }
        
//         // Method to pop an element from the stack
//         public int pop() {
//             if (isEmpty() == 1) {
//                 System.out.println("Stack is empty. Cannot pop");
//                 return -1; // Return a sentinel value to indicate failure
//             }
//             int poppedElement = arr[top];
//             top--;
//             return poppedElement;
//         }
        
//         // Method to get the top element of the stack without removing it
//         public int top() {
//             if (isEmpty() == 1) {
//                 System.out.println("Stack is empty. No top element");
//                 return -1; // Return a sentinel value to indicate failure
//             }
//             return arr[top];
//         }
//     public static void main(String[] args) {
//         Stack stack = new Stack(5);

//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         System.out.println("Top element of stack: " + stack.top());
//         System.out.println("Stack size: " + (stack.top + 1));

//         System.out.println("Popped element: " + stack.pop());
//         System.out.println("Top element of stack: " + stack.top());
//         System.out.println("Stack size: " + (stack.top + 1));
//     }
// }




// stack by Sharadhha 

// import java.util.ArrayList;


// class Node {
//     int data;
//     Node next;

//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }

// public class StackB {

//     // Stack implementation using ArrayList
//     // static class Stack {
//     //     static ArrayList<Integer> list = new ArrayList<>();

//     //     // empty
//     //     public static boolean isEmpty(){
//     //         return list.size() == 0;
//     //     }
//     //     // push
//     //     public static void push(int data){
//     //         list.add(data);
//     //     }
//     //     //pop
//     //     public static int pop(){
//     //         if (isEmpty()) {
//     //             return -1;
//     //         }
//     //         int top = list.get(list.size() - 1);
//     //         list.remove(list.size() - 1);
//     //         return top;
//     //     }

//     //     // peek()
//     //     public static int peek(){
//     //         if (isEmpty()) {
//     //             return -1;
//     //         }
//     //         return list.get(list.size() - 1);
//     //     }
//     // }































//     // Stack implementaion using LinkedList
  
//     static class Stack {
//         static Node head = null;

//         // is Empty ()
//         public static boolean isEmpty(){
//             return head == null;
//         }

//         // Push
//         public static void push(int data){
//             Node newNode = new Node(data);

//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         // pop()
//         public static int pop(){
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         public int peek(){
//             if (isEmpty()) {
//                 return -1;
//             }

//             return head.data;
//         }

//     }

//     public static void main(String[] args) {
//         Stack stack = new Stack();
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);
//         stack.push(4);

//         // Corrected the condition in the while loop
//         while (!stack.isEmpty()) {
//             System.out.println(stack.peek());
//             stack.pop();
//         }
//     }
// }
























// import java.util.*;

// public class StackB {

//     public static void pushAtBottom(Stack<Integer> stack , int data){
//         if (stack.isEmpty()) {
//             stack.push(data);
//             return;
//         }

//         int top = stack.pop();
//         pushAtBottom(stack, data);
//         stack.push(top);
//     }

//     public static String reverseString(String str){
//         Stack<Character> stack = new Stack<>();
//         int idx = 0;
//         while (idx < str.length()) {
//             stack.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");

//         while (!stack.isEmpty()) {
//             char curr = stack.pop();
//             result.append(curr);
//         }

//         return result.toString();
//     }

//     public static void reverseStack(Stack<Integer> stack){
//         if (stack.isEmpty()) {
//             return;
//         }

//         int top = stack.pop();
//         reverseStack(stack);
//         pushAtBottom(stack, top);
//     }

//     public static void printstack(Stack<Integer> stack){
//         while (!stack.isEmpty()) {
//             System.out.println(stack.pop());
//         }
//     }


//     //Stock span Problem
//     public static void stockspan(int stock [] , int span []){
//         Stack<Integer> stack = new Stack<>();
//         span[0] = 1;
//         stack.push(0);

//         for(int i=1; i<stock.length; i++){
//             int cuuprice = stock[i];
//             while (!stack.isEmpty() && cuuprice > stock[stack.peek()]) {
//                 stack.pop();
//             }
//             if (stack.isEmpty()) {
//                 span[i] = i+1;
//             }
//             else{
//                 int prevhigh = stack.peek();
//                 span[i] = i - prevhigh;
//             }
//             stack.push(i);
//         }
//     }

//     public static void main(String[] args) {
//         // Push At Bottom
//         // Stack<Integer> stack = new Stack<>();
//         // stack.push(1);
//         // stack.push(2);
//         // stack.push(3);

//         // pushAtBottom(stack , 4);
//         // while (!stack.isEmpty()) {
//         //     System.out.println(stack.pop());
//         // }
//         // System.out.println();

//         //Reverse a String 
//         // String str = "OnkaR";
//         // String result  = reverseString(str);
//         // System.out.println(result);


//         // Reverse a Stack 
//         // Stack<Integer> stack = new Stack<>();
//         // stack.push(1);
//         // stack.push(2);
//         // stack.push(3);

//         // printstack(stack);
//         // reverseStack(stack);
//         // printstack(stack);


//         // stock span problem
//         int stock [] = {100,80,60,70,60,85,100};
//         int span [] = new int[stock.length];
//         stockspan(stock, span);

//         for(int i=0; i<span.length; i++){
//             System.out.print(span[i]+" ");
//         }
//         System.out.println();

//     }
// }





















// import java.util.*;
// public class StackB {

//     public static void main(String[] args) {
//         int arr [] = {6,8,0,1,3};
//         Stack<Integer> stack = new Stack<>();
//         int nxtgreater [] = new int[arr.length];

//         for(int i=arr.length - 1; i>=0; i--){
//             // While 
//             while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
//                 stack.pop();
//             }
//             if (stack.isEmpty()) {
//                 nxtgreater[i] = -1;
//             }
//             else{
//                 nxtgreater[i] = arr[stack.peek()];
//             }
//             stack.push(i);
//         }

//         for(int i=0; i<nxtgreater.length; i++){
//             System.out.print(nxtgreater[i]+" ");
//         }
//         System.out.println();
//     }
// }







// import java.util.*;

// public class StackB {

//     public static boolean isValid(String str){
//         Stack<Character> stack = new Stack<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
            
//             if (ch == '(' || ch == '{' || ch == '[') {//opening
//                 stack.push(ch);
//             }
//             else {
//                 // clossing
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']')) {
//                     return true;
//                 }
//                 else {
//                     return false;
//                 }
//             }
//         }
//         if (stack.isEmpty()) {
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
    
//     public static void main(String[] args) {
//         String str = "{([)}";
//         System.out.println(isValid(str));
//     }
// }

// import java.util.Stack;

// public class StackB {

//     public static boolean isValid(String str) {
//         Stack<Character> st = new Stack<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             //opening
//             if (ch == '[' || ch == '{' || ch == '(') {
//                 st.push(ch);
//             }
//             //closing
//             else{
//                 if (st.isEmpty()) {
//                     return false;
//                 }
//                 if ((st.peek() == '[' && ch == ']')|| (st.peek() == '{' && ch == '}') || (st.peek() == '(' && ch == ')')) {
//                     return true;
//             }
//             else{
//                 return false;
//             }
//         }
//     }
//     if (st.isEmpty()) {
//         return true;
//     }
//     else{
//         return false;
//     }
// }

//     public static void main(String[] args) {
//         String str = "({[]})";
//         System.out.println(isValid(str));
//     }
// }

// import java.util.*;

// public class StackB {

//     public static boolean isduplicate(String str) {
//         Stack<Character> stack = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             //closing
//             if (ch == ')') {
//                 int count = 0;
//                 while (stack.peek() != '(') {
//                     stack.pop();
//                     count++;
//                 }
//                 System.out.println(count);
//                 if (count < 1) {
//                     return true;
//                 }
//                 else{
//                     stack.pop();
//                 }
//             }
//             else{
//                 stack.push(ch);//opening
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         String str = "((a+b))"; // true
//         String str1 = "((a+b) + (b+c))"; // fasle
//         System.out.println(isduplicate(str1));
//     }
// }


// import java.util.*;;

// public class StackB {

//     public static void maxArea(int arr []){
//         int maxarea = 0;
//         // Next smaller left
//         int nsl [] = new int[arr.length];
//         // Next smaller Right
//         int nsr [] = new int[arr.length];

//         Stack<Integer> satck = new Stack<>();

//         for(int i=arr.length-1; i>=0; i--){
//             while (!satck.isEmpty() && arr[satck.peek()] >= arr[i]) {
//                 satck.pop();
//             }
//             if (satck.isEmpty()) {
//                 nsr[i] = arr.length;
//             }
//             else {
//                 nsr[i] = satck.peek();
//             }
//             satck.push(i);
//         }

//         satck = new Stack<>();

//         for(int i=0; i<arr.length; i++){
//             while (!satck.isEmpty() && arr[satck.peek()] >= arr[i]) {
//                 satck.pop();
//             }
//             if (satck.isEmpty()) {
//                 nsl[i] = -1;
//             }
//             else {
//                 nsl[i] = satck.peek();
//             }
//             satck.push(i);
//         }

//         //current area 
//         // width = j-i-1
//         // nsr[i]-nsl[i]-1

//         for(int i=0; i<arr.length; i++){
//             int heigth = arr[i];
//             int width =  nsr[i]-nsl[i]-1;
//             int currentarea = heigth * width;
//             maxarea = Math.max(maxarea, currentarea);
//         }
//         System.out.println("maximum area in histogram " + maxarea);
//     }

//     public static void main(String[] args) {
//         int arr [] = {2,1,5,6,2,3}; // heigths of histogram
//         maxArea(arr);
//     }
// }














// --------------------------Revesion----------------------------------

// import java.util.ArrayList;
// import java.util.Stack;

// /**
//  * StackB
//  */
// public class StackB {


//     //by using Arraylist 
//     // static class Stack {
//     //     static ArrayList<Integer> list = new ArrayList<>();

//     //     //is empty 
//     //     public static boolean isEmpty(){
//     //         return list.size() == 0;
//     //     }

//     //     //push
//     //     public static void push(int data){
//     //         list.add(data);
//     //     }

//     //     // pop
//     //     public static int pop(){
//     //         int top = list.get(list.size() - 1);
//     //         list.remove(top);
//     //         return top;
//     //     }

//     //     //peek()
//     //     public static int peeek(){
//     //         return list.get(list.size() - 1);
//     //     }

//     // }



//     //Linked list using Stack 

//     // static class Node {
//     //     int data;
//     //     Node next;

//     //     Node(int data){
//     //         this.data = data;
//     //         this.next = null;
//     //     }
//     // }

//     // static class Stack {
//     //     static Node head = null;

//     //     //isempty 
//     //     public static boolean isempty(){
//     //         return head == null;
//     //     }

//     //     //push 
//     //     public static void push(int data){
//     //         Node newNode = new Node(data);
//     //         if (isempty()) {
//     //             head = newNode;
//     //             return;
//     //         }

//     //         newNode.next = head;
//     //         head = newNode;
//     //     }

//     //     // pop()

//     //     public static int pop(){
//     //         if (isempty()) {
//     //             return -1;
//     //         } 
//     //         int top = head.data;
//     //         head = head.next;
//     //         return top;
//     //     }

//     //     //peek()
//     //     public static int peek(){
//     //         if (isempty()) {
//     //             return -1;
//     //         } 
//     //         return head.data;
//     //     }
//     // }


//     // push at bottom 

//     public static void stackpush(Stack<Integer> s , int data){
//         if (s.isEmpty()) {
//             s.push(data);
//             return;
//         }

//         int top = s.pop();
//         stackpush(s, data);
//         s.push(top);
//     }


//     public static String reversestring (String s){
//         Stack<Character> ans = new Stack<>();

//         // for(int i=0; i<s.length(); i++){
//         //     char ch = s.charAt(i);
//         //     ans.push(ch);
//         // }
//         // while (!ans.isEmpty()) {
//         //     System.out.print(ans.peek());
//         //     ans.pop();
//         // }
//         // System.out.println();

//         int idx = 0;
//         while (idx < s.length()) {
//             ans.push(s.charAt(idx));
//             idx++;
//         }

//         StringBuilder a = new StringBuilder();
//         while (!ans.isEmpty()) {
//             char curr = ans.pop();
//             a.append(curr);
//         }
//         return a.toString();
//     }

//     // reversed a stack 

//     public static void revered(Stack<Integer> s){
//         if (s.isEmpty()) {
//             return;
//         }

//         int top = s.pop();
//         revered(s);
//         stackpush(s , top);
//     }

//     public static void printdata(Stack<Integer> s){
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
    

//     // 4 

//     public static void stockpan(int [] stock , int [] span){

//         Stack<Integer> ans = new Stack<>();
//         span[0] = 1;
//         ans.push(0);

//         for(int i=1; i<stock.length; i++){
//             int currprice = stock[i];
//             while (!ans.isEmpty() && currprice > stock[ans.peek()]) {
//                 ans.pop();
//             }

//             if (ans.isEmpty()) {
//                 span[i] = i + 1;
//             }
//             else{
//                 int prevhigh = ans.peek();
//                 span[i] = i - prevhigh;
//             }
//             ans.push(i);
//      }


     
     
//     }

//     // 6 
//     public static boolean validparenthesis(String valid){
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<valid.length(); i++){
//             char ch = valid.charAt(i);
//             if (ch == '(' || ch == '[' || ch == '{') {
//                 s.push(ch);
//             }
//             else {
//                 if (s.isEmpty()) {
//                     return true;
//                 }
//                 if ((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']') || (s.peek() == '{' && ch == '}')) {
//                     return true;
//                 }
//                 else{
//                return false;
//                 }
//             }
//         }
//         if (s.isEmpty()) {
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     // 7
//     public static boolean isDuplicate(String str1){
//        Stack<Character> s = new Stack<>();

//        for(int i=0; i<str1.length(); i++){
//         char ch = str1.charAt(i);
//         //closing
//         if (ch == ')') {
//             int count = 0;
//             while (s.pop() != '(') {
//                 // s.pop();
//                 count++;
//             }
//             if (count < 1) {
//                 return true;
//             }
//             // else {
//             //     s.pop();
//             // }
//         }
//         //opening 
//         else{
//             s.push(ch);
//         }
//     }
//     return false;

//     }
//     public static void main(String[] args) {
//     // For Array List
//         // Stack s = new Stack();
//         // s.push(0);
//         // s.push(1);
//         // s.push(2);
//         // s.push(3);


//         // while (!s.isEmpty()) {
//         //     System.out.println(s.peeek());
//         //     s.pop();
//         // }

//         // for linked list 
//         // Stack ll = new Stack();
//         // ll.push(0);
//         // ll.push(1);
//         // ll.push(2);
//         // ll.push(3);

//         // while (!ll.isempty()) {
//         //     System.out.println(ll.peek());
//         //     ll.pop();
//         // }


//         // By built-in method

//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         //1
//         // stackpush(s, 5);

//         // while (!s.isEmpty()) {
//         //     System.out.println(s.peek());
//         //     s.pop();
//         // }


//         //2

//         // String result = reversestring("Onkar");
//         // System.out.println(result);

//         // 3 
//         // revered(s);
//         // printdata(s);

//         //4 
//         int stock [] = {100,80,60,70,60,85,100};
//         int span[] = new int[stock.length];
//         stockpan(stock, span);

//         for(int i=0; i<span.length; i++){
//             System.out.print(span[i]+" ");
//         }
//         System.out.println();

//         // 5 

//         int arr [] = {6,8,0,1,3};
//         int nextgreater [] = new int[arr.length];

//         Stack<Integer> stack = new Stack<>();

//         for(int i=arr.length-1; i>=0; i--){
//             //while
//             while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
//                 stack.pop();
//             }
//             //if else {}
//             if (stack.isEmpty()) {
//                 nextgreater [i] = -1;
//             }
//             else {
//                 nextgreater [i] = arr[stack.peek()]; 
//             }
//             //push
//             stack.push(i);
//         }
        
//         for(int i=0; i<nextgreater.length; i++){
//             System.out.print(nextgreater[i]+" ");
//         }
//         System.out.println();


//         // 6 = valid parenthesis 
//         // done 

//         // 7 
//         String str1 = "((a+b))";
//         String str2 = "(a+b)";
//         System.out.println(isDuplicate(str1));

//         String valid = "{([)}";
//         System.out.println(validparenthesis(valid));
        
//     }
// }









// ---------------------------Revesion-------------------------------------
