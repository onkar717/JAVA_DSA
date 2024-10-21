// import java.util.ArrayList;

// public class Bst {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static Node insert(Node root , int val){
//         if (root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if (root.data > val) {
//             root.left = insert(root.left, val);
//         }

//         if (root.data < val) {
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inorder(Node root){
//         if (root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//         // System.out.println();
//     }

//     public static boolean search(Node root , int key){
//         if (root == null) {
//             return false;
//         }

//         if (root.data == key) {
//             return true;
//         }

//         if (root.data > key) {
//             return search(root.left, key);
//         }
//         else {
//             return search(root.right, key);
//         }
        
//     }

//     public static Node delNode(Node root , int val){
//         if (root.data < val) {
//             root.right = delNode(root.right, val);
//         }
//         else if (root.data > val) {
//             root.left = delNode(root.left, val);
//         }
//         else{ 
//             //CASE -1 // leaf node
//             if (root.left == null && root.right == null) {
//                 return null;
//             }
//             //case -2 // single chiled
//             if (root.left == null) {
//                 return root.right;
//             }
//             else if (root.right == null) {
//                 return root.left;
//             }

//             // case - 3
//             Node Is = findInorderSuccessor(root.right);
//             root.data = Is.data;
//             root.right = delNode(root.right, Is.data);
//         }
//         return root;
//     }

//     public static Node findInorderSuccessor(Node root){
//         while (root.left != null) {
//             root = root.left;
//         }
//         return root;
//     }

//     public static void printinrange(Node root , int k1 , int k2){
//         if (root == null) {
//             return;
//         }

//         if (root.data >= k1 && root.data <= k2) {
//             printinrange(root.left, k1, k2);
//             System.out.print(root.data+" ");
//             printinrange(root.right, k1, k2);
//         }
//         else if (root.data < k1) {
//             printinrange(root.left, k1, k2);
//         }
//         else{
//             printinrange(root.right, k1, k2);
//         }
//     }

//     public static void printpath(ArrayList<Integer> path){
//         for(int i=0; i<path.size(); i++){
//             System.out.print(path.get(i)+" ");
//         }
//         System.out.println("Null");
//     }

//     public static void printRoot2Leaf(Node root , ArrayList<Integer> path){
//         if (root == null) {
//             return;
//         }
//         path.add(root.data);
//         if (root.left == null && root.right == null) {
//             printpath(path);
//         }
//         printRoot2Leaf(root.left, path);
//         printRoot2Leaf(root.right, path);
//         path.remove(path.size()-1);
//     }


//     public static boolean isValidBest(Node root , Node min , Node max){
//         if (root == null) {
//             return true;
//         }

//         if (min != null && root.data <= min.data) {
//             return false;
//         }
//         else if (max != null && root.data >= max.data) {
//             return false;
//         }

//         return isValidBest(root.left, min, root) && isValidBest(root.right, root, max);
//     }

//     public static Node mirrorbst(Node root){

//         Node left = mirrorbst(root.left);
//         Node right = mirrorbst(root.right);

//         root.left = right;
//         root.right = left;

//         return root;
//     }


//     public static void main(String[] args) {
//         int values [] = {8,5,3,1,4,6,10,11,14};
//         Node root = null;

//         for(int i=0; i<values.length; i++){
//             root = insert(root, values[i]);
//         }

//         inorder(root);


//         // if (search(root, 6)) {
//         //     System.out.println("Found");
//         // }
//         // else{
//         //     System.out.println("Not Found");
//         // }


//         // root = delNode(root, 5);
//         // System.out.println();

//         // inorder(root);

//         // printinrange(root, 5, 12);
//         // printRoot2Leaf(root, new ArrayList<>());

//         if (isValidBest(root, null, null)) {
//             System.out.println("Valid bst");
//         }
//         else{
//             System.out.println("Not valid");
//         }
//     }
    
// }
 



/**
 * Bst
 */
public class Bst {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node mirrorbst(Node root){

        if (root == null) {
            return null;
        }

        Node left = mirrorbst(root.left);
        Node right = mirrorbst(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static void preorderr(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preorderr(root.left);
        preorderr(root.right);
    }


    public static void main(String[] args) {
        Node newNode = new Node(8);
        newNode.left = new Node(5);
        newNode.right = new Node(10);
        newNode.left.left = new Node(3);
        newNode.right.right = new Node(11);

        newNode = mirrorbst(newNode);
        preorderr(newNode);
    }
}