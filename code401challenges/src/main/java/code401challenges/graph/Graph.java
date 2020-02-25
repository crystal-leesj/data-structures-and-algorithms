package code401challenges.graph;

import java.util.*;

// RESOURCE : https://www.geeksforgeeks.org/implementing-generic-graph-in-java/, https://algorithms.tutorialhorizon.com/weighted-graph-implementation-java/

public class Graph<T> {
    public static void main (String[] args) {
        // Object of graph is created.
        Graph<Integer> g = new Graph<Integer>();

        // edges are added.
        // Since the graph is bidirectional,
        // so boolean bidirectional is passed as true.
        g.addEdge(0, 1,1);
        g.addEdge(0, 4, 2);
        g.addEdge(1, 2,1);
        g.addEdge(1, 3, 1);
        g.addEdge(1, 4, 1);
        g.addEdge(2, 3, 2);
        g.addEdge(3, 4, 1);

        // print the graph.
        System.out.println("Graph:\n" + g.toString());

        // gives the no of vertices in the graph.
        System.out.println("The graph has " + g.getNodeSize() + " vertex");

        System.out.println("The graph has " + g.getNodes() + " nodes");

        g.getNeighbors(0);

    }

    // We use Hashmap to store the edges in the graph
    private Map<T, Map<T, T>> map = new HashMap<>();

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
