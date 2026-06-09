package pekan9_2511533015;

import java.util.*;

public class GraphTraversal_2511533015 {

    private Map<String, List<String>> graph = new HashMap<>();

    // Menambahkan edge (graf tak terarah)
    public void addEdge(String node1, String node2) {
        graph.putIfAbsent(node1, new ArrayList<>());
        graph.putIfAbsent(node2, new ArrayList<>());

        graph.get(node1).add(node2);
        graph.get(node2).add(node1);
    }

    // Menampilkan graf
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List): ");

        for (String node : graph.keySet()) {
            System.out.print(node + " -> ");
            List<String> neighbors = graph.get(node);
            System.out.println(String.join(", ", neighbors));
        }

        System.out.println();
    }

    // DFS Rekursif
    public void dfs(String start) {
        Set<String> visited = new HashSet<>();

        System.out.println("Penelusuran DFS: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(String current, Set<String> visited) {

        if (visited.contains(current))
            return;

        visited.add(current);
        System.out.print(current + " ");

        for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            dfsHelper(neighbor, visited);
        }
    }

    // BFS Iteratif
    public void bfs(String start) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        System.out.println("Penelusuran BFS: ");

        while (!queue.isEmpty()) {

            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    // Main
    public static void main(String[] args) {

        GraphTraversal_2511533015 graph =
                new GraphTraversal_2511533015();

        // Contoh graf
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "C");

        // Cetak graf
        System.out.println("Graf awal adalah:");
        graph.printGraph();

        // Traversal
        graph.dfs("A");
        graph.bfs("A");
    }
}