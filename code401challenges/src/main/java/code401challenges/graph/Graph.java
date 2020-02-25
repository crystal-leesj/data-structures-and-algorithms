package code401challenges.graph;

import java.util.*;

// RESOURCE : https://www.geeksforgeeks.org/implementing-generic-graph-in-java/, https://algorithms.tutorialhorizon.com/weighted-graph-implementation-java/

public class Graph<T> {
    public static void main (String[] args) {
        // Object of graph is created.
        Graph<String> g = new Graph<String>();

        g.addEdge("Pandora", "Arendelle",null);
        g.addEdge("Arendelle", "Metroville", null);
        g.addEdge("Arendelle", "Monstroplolis",null);
        g.addEdge("Metroville", "Monstroplolis", null);
        g.addEdge("Metroville", "Narnia", null);
        g.addEdge("Metroville", "Naboo", null);
        g.addEdge("Monstroplolis", "Naboo", null);
        g.addEdge("Narnia", "Naboo", null);

        // print the graph.
        System.out.println("Graph:\n" + g.toString());

        // gives the no of vertices in the graph.
        System.out.println("The graph has " + g.getNodeSize() + " vertex");

        System.out.println("The graph has " + g.getNodes() + " nodes");

        g.getNeighbors("Pandora");

//        g.getBFTraversal("Pandora");
        System.out.println("The graph has BST " + g.getBFTraversal("Pandora"));
    }

    // We use Hashmap to store the edges in the graph
    private Map<T, Map<T, T>> map = new HashMap<>();

    public Graph() {

    }

    // This function adds a new vertex to the graph
    public T addNode(T newNode) {
        map.put(newNode, new HashMap<>());
        return newNode;
    }

    // This function adds the edge
    // between source to destination
    public void addEdge(T source, T destination, T weight) {

        // when there is no connections
        if (!map.containsKey(source)) {
            T node = addNode(source);
        }
        if (!map.containsKey(destination)) {
            T node = addNode(destination);
        }

        map.get(source).put(destination, weight);
        map.get(destination).put(source, weight);
    }

    public Set<T> getNodes() {
        return map.keySet();
    }

    // This function gives the count of vertices
    public int getNodeSize() {
        return map.keySet().size();
    }

    public List<T> getNeighbors(T node) {
        List<T> llist= new LinkedList<>();
        for (T v : map.keySet()) {
            if (v == node) {
                for (T w : map.get(v).keySet()) {
//                    System.out.println("w.toString() = " + w.toString());
                    llist.add(w);
                }
            }
        }
        return llist;
    }

    public Set<String> getBFTraversal(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();

            for (T v : getNeighbors((T) vertex)) {
                if (!visited.contains(v.toString())) {
                    visited.add(v.toString());
                    queue.add(v.toString());
                }
            }
        }
        return visited;
    }



    // Prints the adjancency list of each vertex.
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v).keySet()) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        System.out.println("entrySet = " + map.entrySet());

        return (builder.toString());
    }

}
