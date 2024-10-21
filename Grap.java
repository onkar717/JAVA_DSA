// // // google maps 
// // // amazon delivery app
// // // routing 
// // //  machine learning 
// // // Dependency graph



// // // create Graph 

// // // Adjanceny List 

// // // import java.util.ArrayList;

// // // public class Grap {

// // //     static class Edge {
// // //         int src;
// // //         int dest;
// // //         int wt;

// // //         public Edge(int s, int d , int w){
// // //             this.src = s;
// // //             this.dest = d;
// // //             this.wt = w;
// // //         }
        
// // //     }

// // //     public static void main(String[] args) {
// // //         int V = 5;
// // //         // int arr[] = new arr[V]
// // //         ArrayList<Edge> [] graph = new ArrayList[V];
        
// // //         //to stored the single edge 
// // //         for(int i=0; i<V; i++){
// // //             graph[i] = new ArrayList<>();
// // //         }

// //         // // 0 - vertex
// //         // graph[0].add(new Edge(0, 1, 5));

// //         // // 1 - Vertex
// //         // graph[1].add(new Edge(1, 0, 5));
// //         // graph[1].add(new Edge(1, 2, 1));
// //         // graph[1].add(new Edge(1, 3, 3));


// //         // /// Vertex - 2
// //         // graph[2].add(new Edge(2, 1, 1));
// //         // graph[2].add(new Edge(2, 3, 1));
// //         // graph[2].add(new Edge(2,4, 4));


// //         // //Vertex - 3
// //         // graph[3].add(new Edge(3, 1, 3));
// //         // graph[3].add(new Edge(3, 2, 1));


// //         // //Vertex - 4
// //         // graph[4].add(new Edge(4, 2, 2));

// //         // // 2's neighbours

// //         // for(int i=0; i<graph[2].size(); i++){
// //         //     Edge e = graph[2].get(i);
// //         //     System.out.println(e.dest);
// //         // }

// // //     }
       
// // // }


// // // Graph Traversal 

// // // -- Bfs 
// // // -- Dfs

// // import java.util.ArrayList;
// // import java.util.LinkedList;
// // import java.util.Queue;

// // public class Grap {

// //     static class Edge{
// //         int src;
// //         int dest;
// //         int wt;

// //         public Edge(int s , int d , int w){
// //             this.src = s;
// //             this.dest = d;
// //             this.wt = w;
// //         }
// //     }

// //     public static void bfs(ArrayList<Edge> [] grap){
// //         Queue<Integer> q = new LinkedList<>();
// //         boolean vis[] = new boolean[grap.length];

// //         q.add(0);

// //         while (!q.isEmpty()) {
// //             int curr = q.remove();
// //             if (!vis[curr]) {
// //                 System.out.print(curr+" ");
// //                 vis[curr] = true;
// //                 for(int i=0; i<grap[curr].size(); i++){
// //                     Edge e = grap[curr].get(i);
// //                     q.add(e.dest);
// //                 }
// //             }
// //         }
// //     }

// //     public static void dfs(ArrayList<Edge> [] graph , int curr , boolean vis []){
// //         System.out.print(curr+" ");
// //         vis[curr] = true;

// //         for(int i=0; i<graph[curr].size(); i++){
// //             Edge e = graph[curr].get(i);
// //             if (!vis[e.dest]) {
// //                 dfs(graph, e.dest, vis);
// //             }
// //         }          
// //     }

// //     public static boolean hasMap(ArrayList<Edge> [] graph , int src , int dest , boolean vis []){
// //         if (src == dest) {
// //             return true;
// //         }

// //         vis[src] = true;
// //         for(int i=0; i<graph[src].size(); i++){
// //             Edge e = graph[src].get(i);
// //             if (!vis[e.dest] && hasMap(graph, e.dest, dest, vis)) {
// //                 return true;
// //             }
// //         }
// //         return false;
// //     }

// //     public static void main(String[] args) {
// //         int V  = 5;

// //         ArrayList<Edge> [] graph  = new ArrayList[V];

// //         for(int i=0; i<V; i++){
// //             graph[i] = new ArrayList<>();
// //         }


// //         // 0 - vertex
// //         graph[0].add(new Edge(0, 1, 5));

// //         // 1 - Vertex
// //         graph[1].add(new Edge(1, 0, 5));
// //         graph[1].add(new Edge(1, 2, 1));
// //         graph[1].add(new Edge(1, 3, 3));


// //         /// Vertex - 2
// //         graph[2].add(new Edge(2, 1, 1));
// //         graph[2].add(new Edge(2, 3, 1));
// //         graph[2].add(new Edge(2,4, 4));


// //         //Vertex - 3
// //         graph[3].add(new Edge(3, 1, 3));
// //         graph[3].add(new Edge(3, 2, 1));


// //         //Vertex - 4
// //         graph[4].add(new Edge(4, 2, 2));


        
// //         // Bfs 
// //         // bfs(graph);
// //         // Dfs
// //         // dfs(graph, 0, new boolean [V]);
// //         // haspath 
// //         System.out.println(hasMap(graph, 0, 5, new boolean[V]));


// //     }
// // }



// // // lecture two 

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

// /**
//   * Grap
//   */
//  public class Grap {
 
//     static class Edge{
//         int src;
//         int dest;

//         public Edge(int s , int d){
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void cretaeGraph(ArrayList<Edge> graph []){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();  
//         }

//         graph[0].add(new Edge(0, 3)); 
//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));
//         // graph[1].add(new Edge(1, 3));

//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));
//     }

//     public static boolean detectCycle(ArrayList<Edge> graph []){
//         boolean vis [] = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++){
//             if (!vis[i]) {
//                 if (detectutilsCycle(graph , vis , i , -1)) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
  
//     public static boolean detectutilsCycle( ArrayList<Edge> graph [] , boolean vis [] , int curr , int par){
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             //case-3
//             if (!vis[e.dest]) {
//                 if (detectutilsCycle(graph, vis, e.dest, curr)) {
//                     return true; 
//                 }
//             }
//             else if (vis[e.dest] && e.dest != par) {
//                 return true;
//             }
//             //case - 2 -- Eat 5 Star Do Nothing     
//         }
//         return false;
//     } 

//     public static boolean isBipartite(ArrayList<Edge> [] grap){
//         // Queue<Integer> q = new LinkedList<>();
//         //   int col [] = new int[grap.length];
//         //   for(int i=0; i<col.length; i++){
//         //     col[i] = -1;
//         //   }

//         //   for(int i=0; i<grap.length; i++){
//         //     if (col[i] == -1) {
//         //         q.add(i);
//         //         col[i] = 0; //Yellow 
//         //         while (!q.isEmpty()) {
//         //             int curr = q.remove();
//         //             for(int j=0; j<grap[curr].size(); j++){
//         //                 Edge e = grap[curr].get(j);
//         //                 if (col[e.dest] == -1) {
//         //                     int nextCol = col[curr] == 0 ? 1 : 0;
//         //                     col[e.dest] = nextCol;
//         //                     q.add(e.dest);
//         //                 }
//         //                 else if (col[e.dest] == col[curr]) {
//         //                     return false; //Not bipartite 
//         //                 }
//         //             }
//         //         }
//         //     }
//         //   }
//         //   return true;

//         Queue<Integer> q = new LinkedList<>();
//         int col [] = new int[grap.length];

//         for(int i=0; i<col.length; i++){
//             col[i] = -1;
//         }

//         for(int i=0; i<grap.length; i++){
//             if (col[i] == -1) {
//                 q.add(i);
//                 col[i] = 0; //yeelow

//                 while (!q.isEmpty()) {
//                     int curr = q.remove();
//                     for(int j=0; j<grap[curr].size(); j++){
//                         Edge e = grap[curr].get(j);
//                         if (col[e.dest] == -1) {
//                             int nextCol = col[curr] == 0 ? 1 : 0;
//                             col[e.dest] = nextCol;
//                             q.add(e.dest);
//                         }
//                         else if (col[curr] == col[e.dest]) {
//                             return false; // not bipatrite 
//                         }
//                     }
//                 }
//             }
//         }
//         return true;
//     }
    
//     public static void topSort(ArrayList<Edge> [] grap){
//         boolean vis [] = new boolean[grap.length];
//         Stack<Integer> s = new  Stack<>();

//         for(int i=0; i<grap.length; i++){
//             if (!vis[i]) {
//                 topSortUtil(grap , i , vis , s); // modifie Dfs
//             }
//         }
//         System.out.println();
//         while (!s.empty()) {
//             System.out.print(s.pop()+" ");
//         }
//         System.out.println();
//     }

//     public static void topSortUtil(ArrayList<Edge> [] grap , int curr , boolean vis [] , Stack<Integer> s){
//         vis[curr] = true;

//         for (int i=0; i<grap[curr].size(); i++) {
//             Edge e = grap[curr].get(i);
//              if (!vis[e.dest]) {
//                 topSortUtil(grap, e.dest, vis, s);
//              }
//         }
//         s.push(curr);
//     }

//     public static void calIndex(ArrayList<Edge>[] graph, int[] index) {
//         for (int i = 0; i < graph.length; i++) {
//             int v = i;
//             for (int j = 0; j < graph[v].size(); j++) {
//                 Edge e = graph[v].get(j);
//                 index[e.dest]++;
//             }
//         }
//     }

//     public static void topSorted(ArrayList<Edge>[] graph) {
//         int[] index = new int[graph.length];
//         calIndex(graph, index);
//         Queue<Integer> q = new LinkedList<>();

//         for (int i = 0; i < index.length; i++) {
//             if (index[i] == 0) {
//                 q.add(i);
//             }
//         }

//         // BFS
//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             System.out.print(curr + " ");

//             for (int i = 0; i < graph[curr].size(); i++) {
//                 Edge e = graph[curr].get(i);
//                 index[e.dest]--;
//                 if (index[e.dest] == 0) {
//                     q.add(e.dest);
//                 }
//             }
//         }
//         System.out.println();
//     }

//     public static void printallPaths(ArrayList<Edge> graph [] , int src , int dest , String str){
//         if (src == dest) {
//             System.out.println(str+dest);
//             return;
//         }

//         for(int i=0; i<graph[src].size(); i++){
//             Edge e = graph[src].get(i);
//             printallPaths(graph, e.dest, dest, src+str);
//         }


//     }

  
//     public static void main(String[] args) {
//         int V = 6;
//         ArrayList<Edge> [] grap = new ArrayList[V];
//         cretaeGraph(grap);
//         // System.out.println(detectCycle(grap));
//         // System.out.println(isBipartite(grap));
//         // topSort(grap);
//         // topSorted(grap);
//         printallPaths(grap, 5, 1, "");
//     }
//  }

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Grap
 */
public class Grap {

    static class Edge {
        int src , dest , wt;

        public Edge(int s , int d , int wt){
            this.src = s;
            this.wt = wt;
            this.dest = d;
        }
    }

    public static void cretaeGraph(ArrayList<Edge> [] grap){
        for(int i=0; i<grap.length; i++){
            grap[i] = new ArrayList<>();
        }

        grap[0].add(new Edge(0, 1 , 2));
        grap[0].add(new Edge(0, 2 , 4));

        grap[1].add(new Edge(1, 3 , 7));
        grap[1].add(new Edge(1, 2 , 1));

        grap[2].add(new Edge(2, 4 , 3));

        grap[3].add(new Edge(3 , 5 , 1));

        grap[4].add(new Edge(4,3,2));
        grap[4].add(new Edge(4,5,5));


    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n , int p){
            this.n = n;
            this.path = p;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }


    public static void djkstra(ArrayList<Edge> grap [] , int src ){

        int dist[] = new  int[grap.length];

        for(int i=0; i<grap.length; i++){
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis [] = new boolean[grap.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                //neighbours
                for(int i=0; i<grap[curr.n].size(); i++){
                    Edge e = grap[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u]+wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> grap [] = new ArrayList[V];

        cretaeGraph(grap);
        djkstra(grap, 0);

    }
}