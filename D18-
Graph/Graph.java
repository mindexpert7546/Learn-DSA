import java.util.*;

class Graph {
    private int V; 
    private LinkedList<Integer>[] adj;

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); 
    }

   
    void BFS(int s) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        
        visited[s] = true;
        queue.add(s);
        
        System.out.println("Breadth-First Traversal starting from vertex " + s + ":");
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");
            
            for (Integer n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

public class SimpleGraphExample {
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

       
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.BFS(0);
    }
}
