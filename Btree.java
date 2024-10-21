// // public class Btree {

// //     static class Node {
// //         int data;
// //         Node left;
// //         Node right;

// //         Node(int data){
// //             this.data = data;
// //             this.left = null;
// //             this.right = null;
// //         }
// //     }
     
// //     static class BinaryTree{
// //         static int idx = -1;
// //         public static Node buildTree(int nodes []){
// //             idx++;
// //             if(nodes[idx] == -1) {
// //                 return null;
// //             }

// //             Node newNode = new Node(nodes[idx]);
// //             newNode.left = buildTree(nodes);
// //             newNode.right = buildTree(nodes);

// //             return newNode;
// //         }
// //     }
// //     public static void main(String[] args) {
//         // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
// //         BinaryTree tree = new BinaryTree();
// //         Node root = tree.buildTree(nodes);
// //         System.out.println(root.data);
// //     }
// // }

// import java.util.LinkedList;
// import java.util.Queue;

// public class Btree {

//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node( int data ){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int nodes []){
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }

//             Node newnNode = new Node(nodes[idx]);
//             newnNode.left = buildTree(nodes);
//             newnNode.right = buildTree(nodes);

//             return newnNode;
//         }

//         public static void preOrder(Node root){
//             // TRee Traversal 
//         // a. PreOrder 
        
//         // Root 
//         // left subtreee 
//         // right subtree 

//         if (root == null) {
//             return;
//         }

//         System.out.print(root.data+" ");
//         preOrder(root.left);
//         preOrder(root.right);
//         }

//         public static void inorder(Node root){
//             if (root == null) {
//                 return;
//             }

//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//             System.err.println();
//         }


//         public static void postorder(Node root){
//             if (root == null) {
//                 return;
//             }

//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data);
//             System.out.println();
//         }

//         //Level order traversal

//         public static void levelorder(Node root){

//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             q.add(null);

//             while (!q.isEmpty()) {
//                 Node cuurNode = q.remove();
//                 if (cuurNode == null) {
//                     System.out.println();
//                     if (q.isEmpty()) {
//                         break;
//                     }
//                     else{
//                         q.add(null);
//                     }
//                 }
//                 else{
//                     System.out.println(cuurNode.data+" ");
//                     if (cuurNode.left != null) {
//                         q.add(cuurNode.left);
//                     }
//                     if (cuurNode.right != null) {
//                         q.add(cuurNode.right);
//                     }
//                 }
//             }
//         }


//     }




//     public static void main(String[] args) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         // System.out.println(root.data);

//         // tree.preOrder(root);
//         // tree.inorder(root);
//         // tree.postorder(root);

//         //levelorder 
//         tree.levelorder(root);

//     }
// }