import java.util.ArrayList;

public class GraphDFS {
    static class Edge {
        int src, dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        // visit the current node
        System.out.print(curr + " ");
        visited[curr] = true;

        // visit neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<Edge>[] graph = new ArrayList[vertices];
        for(int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        /*
              0
             / \
            1   2
             \ /
              3
              |
              4
        */
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));
        
        graph[4].add(new Edge(4, 3));

        System.out.println("DFS Traversal:");
        dfs(graph, 0, new boolean[vertices]);
    }
}
