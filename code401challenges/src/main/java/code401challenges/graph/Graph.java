package code401challenges.graph;

import java.util.*;

// RESOURCE : https://www.geeksforgeeks.org/implementing-generic-graph-in-java/

public class Graph<T> {
    public static void main (String[] args) {
        // Object of graph is created.
        Graph<Integer> g = new Graph<Integer>();

        // edges are added.
        // Since the graph is bidirectional,
        // so boolean bidirectional is passed as true.
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // print the graph.
        System.out.println("Graph:\n" + g.toString());

        // gives the no of vertices in the graph.
        System.out.println("The graph has " + g.getNodeSize() + " vertex");

    }

    // We use Hashmap to store the edges in the graph
    private Map<T, List<T>> map = new HashMap<>();

    // This function adds a new vertex to the graph
    public T addNode(T newNode) {
        map.put(newNode, new LinkedList<T>());
        return newNode;
    }

    // This function adds the edge
    // between source to destination
    public void addEdge(T source, T destination) {

        // when there is no connections
        if (!map.containsKey(source)) {
            addNode(source);
        }
        if (!map.containsKey(destination)) {
            addNode(destination);
        }

        map.get(source).add(destination);
        map.get(destination).add(source);
    }

    public Set<T> getNodes() {
        return map.keySet();
    }

    // This function gives the count of vertices
    public int getNodeSize() {
        return map.keySet().size();
    }

    public List<T> getNeighbors(LinkedList<T> node) {
        return map.get(node);
    }



    // Prints the adjancency list of each vertex.
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }

}
