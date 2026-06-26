import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    static class Edge {
        int src, dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph, int vertices) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];

        q.add(0); // starting from vertex 0
        
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                
                for(int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for(int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));

        System.out.println("BFS Traversal:");
        bfs(graph, vertices);
    }
}
