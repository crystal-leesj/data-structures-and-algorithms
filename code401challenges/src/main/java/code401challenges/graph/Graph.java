package code401challenges.graph;

import java.util.*;

// RESOURCE : https://www.geeksforgeeks.org/implementing-generic-graph-in-java/, https://algorithms.tutorialhorizon.com/weighted-graph-implementation-java/

public class Graph<T> {
//    public static void main (String[] args) {
//        // Object of graph is created.
//        Graph<String> g = new Graph<>();
//
//        g.addEdge("A", "B",null);
//        g.addEdge("A", "D",null);
//        g.addEdge("B", "D", null);
//        g.addEdge("B", "C",null);
//        g.addEdge("C", "G", null);
//        g.addEdge("D", "E", null);
//        g.addEdge("D", "F", null);
//        g.addEdge("D", "H", null);
//        g.addEdge("F", "H", null);
//
//        // print the graph.
//        System.out.println("Graph:\n" + g.toString());
//
//        // gives the no of vertices in the graph.
//        System.out.println("The graph has " + g.getNodeSize() + " vertex");
//
//        System.out.println("The graph has " + g.getNodes() + " nodes");
//
//        g.getNeighbors("Pandora");
//
//        System.out.println("The graph has BST " + g.getBFTraversal("A"));
//
//        System.out.println("The graph has DST " + g.getDFTraversal("A"));
//
//
//
//    }

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

    public Set<String> getDFTraversal(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);

                for (T v : getNeighbors((T) vertex)) {
                    stack.push(v.toString());
                }
            }

        }
        return visited;
    }
//    A, B, C, G, D, E, H, F

    public String getEdge(List<String> travel) {
        String result;
        for (String city : travel) {
            if (!map.containsKey(city)) {
                result = "False, $0";
                return result;
            }
        }

        int total = 0;
        for (int i = 0; i < travel.size()-1; i++) {
            if (!getNeighbors((T)travel.get(i)).contains(travel.get(i+1))) {
                result = "False, $0";
                return result;
            } else {
                T w = map.get(travel.get(i)).get(travel.get(i+1));
                total += Integer.parseInt((String) w);
            }
        }
        result = "True, $" + total;

        return result;
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
