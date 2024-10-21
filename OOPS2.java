// public class OOPS2 {
    
//     public static void main(String[] args) {
//         // Method Overloading / Function Overloading 
//         // Calculator calc = new Calculator();
//         // System.out.println(calc.sum(1, 2));
//         // System.out.println(calc.sum((float)1.3 , (float)2.7));
//         // System.out.println(calc.sum(1, 2 , 3));
        
//         // Mehtod-Overriding 
//         // Deer de = new Deer();
//         // de.eat();
//     }
// }


// POLYMORPHISIM

// Method Overloading / Function Overloading 
// class Calculator {
//     int sum(int a , int b){
//         return a + b;
//     }
//     float sum(float a , float b){
//         return a + b;
//     }
//     int sum(int a , int b , int c){
//         return a + b + c;
//     }
// }


// Mehtod-Overriding 
// class Animal {
//     void eat () {
//         System.out.println("easts Anything");
//     }
// }

// class Deer extends Animal {
//     void eat () {
//         System.out.println("eats grass");
//     }
// }

// Pacakages 

// import java.util.Scanner;

// public class OOPS2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(a);
//     }
// }



// ABSTRACTION 

// public class OOPS2 {

//      public static void main(String[] args) {
//         Horse h = new Horse();
//         h.eat();
//         h.walks();

//         Chicken ch = new Chicken();
//         ch.eat();
//         ch.walks();
//      }
// }


// abstract class Animal {
//     void eat() {
//         System.out.println("Animal Eats");
//     }
    
//     abstract void walks();

// }

// class Horse extends Animal {
//     void walks() {
//         System.out.println("walks on 4 leg");
//     }
// }

// class Chicken extends Animal {
//     void walks() {
//         System.out.println("walks on 2 leg");
//     }
// }


// INTERFACES
// public class OOPS2 {

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.moves();
//     }
// }

// interface chessplayer {
//     void moves();
// }

// class Queue implements chessplayer {
//     public void moves() {
//         System.out.println("up , down , left , right , diagonal");
//     }
// }

// class Rook implements chessplayer {
//     public void moves() {
//         System.out.println("up , down , left , right");
//     }
// }


// class King implements chessplayer {
//     public void moves() {
//         System.out.println("up , down , left , right , diagonal by - 1 step");
//     }
// }




// STATIC KEYWORD
// public class OOPS2 {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.schoolname = "JEMS";

//         Student s2 = new Student();
//         System.out.println(s2.schoolname);
//     }
// }

// class Student {
//     String name;
//     int roll;
//     static String schoolname;
    
//     void setName(String name){
//         this.name = name;
//     }
//     String getname() {
//         return this.name;
//     }
// }



 /// SUper-Keyword

// public class OOPS2 {

//     public static void main(String[] args) {
//         Horse h = new Horse();
//     }
// }

// class Animal {
//     Animal() {
//         System.out.println("Constructor of Animal Class");
//     }
// }


// class Horse extends Animal {
//     Horse () {
//         // super();
//         System.out.println("Constructor of Horse Class");
//     }
// }