// public class Tries {

//     static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

        
//         Node(){
//             for(int i=0; i<children.length; i++){
//                 children[i] = null;
//             }
//         }

//     }
//     public static Node root = new Node(); 

//     public static void insert(String word){
//         Node curr = root;
//         for(int level=0; level<word.length(); level++){
//             int idx = word.charAt(level) - 'a';
//             if (curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key){
//         Node curr = root;
//         for(int level=0; level<key.length(); level++){
//             int idx = key.charAt(level) - 'a';
//             if (curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;
//     }

//      public static boolean workBreak(String key){
//         if (key.length() == 0) {
//             return true;
//         }
//         for(int i=1; i<=key.length(); i++){
//             if(search(key.substring(0, i)) &&
//                 workBreak(key.substring(i))){
//                 return true;
//             }
//         }
//         return false;
//      }

    


//     public static void main(String[] args) {
//         String word [] = {"the" , "a" , "there" , "their" , "any" , "thee"};
//         for(int i=0; i<word.length; i++){
//             insert(word[i]);
//         }

//         // System.out.println(search("thee"));
//         // System.out.println(search("b"));
//         String key = "the";
//         System.out.println(workBreak(key));
//     }
// }



/**
 * Tries
 */
// public class Tries {

//     static class Node{
//         Node Children [] = new Node[26];
//         boolean eow = false;
//         int freq;
        
//         Node (){
//             for(int i=0; i<Children.length; i++){
//                 Children[i] = null;
//             }
//             freq = 1;
//         }
        
//     }

//     public static Node root = new Node();

//     public static void insert(String word){
//         Node curr = root;
//         for(int level=0; level<word.length(); level++){
//             int idx = word.charAt(level) - 'a';
//             if (curr.Children[idx] == null) {
//                 curr.Children[idx] = new Node();
//             }
//             else {
//                 curr.Children[idx].freq++;
//             }
//             curr = curr.Children[idx];
//         }
//         curr.eow = true;
//     }

//     public static void main(String[] args) {
//         String arr [] = {"zebra" , "dog" , "duck" , "dove"};
//         for(int i=0; i<arr.length; i++){
//             System.out.println(insert(arr[i]));
//         }

//     }
// }