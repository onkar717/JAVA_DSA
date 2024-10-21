// public class OOPS {

//     public static void main(String[] args) {
//       Pen p1 = new Pen(); // created a pen Object called p1  
//       p1.setcolor("Blue");
//       System.out.println(p1.getColor());
//       p1.settip(5);
//       System.out.println(p1.getTip());

//     //   Student S1 = new Student();
//     //   S1.calcPercentage(5,5,5);
//     //   System.out.println(S1.percentage);

//     //   Bankaccount B1 = new Bankaccount();
//     //   B1.username = "Onkar";
//     //   B1.setpassowrd("onkar");
//     }                                                                                                                                                                                                                                                                                                                        

// }


// // class Bankaccount {
// //     public String username;
// //     private int password;

// //     public void setpassowrd( String pwd){
// //         password = pwd;
// //     }
// // }


// class Pen {
//     private String color;
//     private int tip;

//     // Getters 
//     String getColor(){
//         return this.color;
//     }

//     int getTip(){
//         return this.tip;
//     }

//     //Setters 
//     void setcolor(String newColor){
//         this.color = newColor;
//     }

//     void settip(int newTip){
//         this.tip = newTip;
//     }

// }


// // class Student {
// //     String name;
// //     int age;
// //     float percentage;

// //     void calcPercentage(int phy , int chem , int math){
// //         percentage = (phy + chem + math) / 3;
// //     }

// // }





/// Constructor 

// public class OOPS {

//     public static void main(String[] args) {
//         // Student s1 = new Student("Shradha");
//         Student s1 = new Student();
//         s1.name = "onkar";
//         s1.age = 19;
//         s1.makrs[0] = 100;
//         s1.makrs[1] = 90;
//         s1.makrs[2] = 80;
//         // System.out.println(s1.name);
//         // Student s1 = new Student(); //Non- Paramterized consructor
//         // Student s2 = new Student("Onkar"); //Paramterized consructor
//         // System.out.println(s2.name);
//         // Student s3 = new Student(19); //Paramterized consructor
//         // System.out.println(s3.age);

//         // Student s4 = new Student(s1); // Copy Paramterized consructor
//         // s4.name = "Onkar";
//         // s4.age = 123; 
      

//         Student s5 = new Student(s1);
//         s5.password = 12345;

//         System.out.println(s5.password);

//         // for(int i=0; i<3; i++){
//         //     System.out.println(s5.makrs[i]);
//         // }
//     }
// }

// class Student {
//     String name;
//     int age;
//     int makrs[];
//     int password;
    

//     Student(){
//             // this.name = name; // pass name parameter 
//             System.out.println("COnstructor is Called");
//         }
        
//     // Non-parameterized Constructor 
//     // Student (){
//     //     System.out.println("Non Parameterized Constructor");
//     // }


//     //parameterized Constructor 
//     // Student (String name){
//     //     makrs = new int[3];
//     //     this.name = name;
//     // }


//     //parameterized Constructor 
//     // Student (String name , int makrs [] ,int age , int password){
//     //     makrs = new int[3];
//     //     this.name = name;
//     //     this.age = age;
//     //     this.password = password;
//     // }

//     // Student (int password){
//     //     this.password = password;
//     // }




//     //copy Constructor 
//     Student(Student s1){
//         makrs = new int[3];
//         this.name = s1.name;
//         this.age = s1.age;
//         this.makrs = s1.makrs;
//     }
// }


//  INHERITANCE - PART 


// public class OOPS {
//     public static void main(String[] args) {
        // SINGLE-INHERITANCE
        // Fish shark = new Fish();
        // shark.eat();
        
        // MULTILEVEL-INHERITANCE
        // Dogs dobby = new Dogs();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // HIERARCHIAL-INHERITANCE
//     }
// }


// SINGLE_INHERITANVE

// BASE-CLASS
// class Animal {
//     String color;
    
//     void eat () {
//         System.out.println("eats");
//     }

//     void breathe () {
//         System.out.println("breathe");
//     }

// }


// //  DERIVED-CLASS

// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swim in Water");
//     }
// }


// MULTI_LEVEL_INHERITANceeat

// class Animal {
//     String color;
    
//     void eat () {
//         System.out.println("eats");
//     }

//     void breathe () {
//         System.out.println("breathe");
//     }

// }


// class Mamalas extends Animal {
//     int legs;
// }

// class Dogs extends Mamalas {
//     int mouth;
// }



// HIERARCHIAL-INHERITANCE


// BASE-CLASS
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("Eat");
//     }

//     void breathe () {
//         System.out.println(" Breathe");
//     }
// }

// // DERIVED-CLASS
// class Mamaml extends Animal {
//     void walks() {
//         System.out.println("walks");
//     }
// }

// // DERIVED-CLASS
// class Fish extends Animal {
//     void walks() {
//         System.out.println("walks");
//     }
// }

// // DERIVED-CLASS
// class Bird extends Animal {
//     void fly() {
//         System.out.println("flying");
//     }
// }


// HYBRID-INHEITANCE


// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eating");
//     }
//     void breathe() {
//         System.out.println("breathe");
//     }
// }

// class Fish extends Animal {
//     int fins;
// }


// class Bird extends Animal {
//     int fly;
// }

// class peacock extends Bird {
//     int pieace;
// }

// class Mamalas extends Animal {
//     int hands;
// }

// class Dog extends Mamalas {
//     int mouth;
// }

// class Human extends Mamalas {
//     int teethe;
// }