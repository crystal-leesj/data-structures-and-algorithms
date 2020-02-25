package code401challenges.graph;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {
        Graph<Integer> g = new Graph<>();
        int actual = g.addNode(0);
        assertEquals(0, actual);
        actual = g.addNode(1);
        assertEquals(1, actual);
    }

    @Test
    public void testAddEdge() {
        Graph<Integer> g = new Graph<>();
        g.addEdge(0, 1,1);

        List<Integer> llist;
        llist = g.getNeighbors(0);
        assertEquals(1, llist.size());
        assertEquals(1, llist.get(0).intValue());

        llist = g.getNeighbors(1);
        assertEquals(1, llist.size());
        assertEquals(0, llist.get(0).intValue());
    }

    @Test
    public void testGetNodes() {
        Graph<Integer> g = new Graph<>();
        g.addEdge(0, 1,1);
        g.addEdge(0, 4, 2);
        g.addEdge(1, 2,1);
        g.addEdge(1, 3, 1);
        g.addEdge(1, 4, 1);
        g.addEdge(2, 3, 2);
        g.addEdge(3, 4, 1);

        assertEquals(5, g.getNodes().size());
        assertTrue(g.getNodes().contains(0));
        assertTrue(g.getNodes().contains(1));
        assertTrue(g.getNodes().contains(2));
        assertTrue(g.getNodes().contains(3));
        assertTrue(g.getNodes().contains(4));
        assertFalse(g.getNodes().contains(5));
    }

    @Test
    public void testGetNeighbors() {
        Graph<Integer> g = new Graph<>();
        g.addEdge(0, 1,1);
        g.addEdge(0, 4, 2);
        g.addEdge(1, 2,1);
        g.addEdge(1, 3, 1);
        g.addEdge(1, 4, 1);
        g.addEdge(2, 3, 2);
        g.addEdge(3, 4, 1);

        assertEquals(2, g.getNeighbors(0).size());
        assertEquals(4, g.getNeighbors(1).size());
        assertEquals(2, g.getNeighbors(2).size());
        assertEquals(3, g.getNeighbors(3).size());
        assertEquals(3, g.getNeighbors(4).size());
    }

    @Test
    public void testSize() {
        Graph<Integer> g = new Graph<>();
        assertEquals(0, g.getNodeSize());
        g.addEdge(0, 1,1);
        assertEquals(2, g.getNodeSize());
        g.addEdge(0, 4, 2);
        assertEquals(3, g.getNodeSize());
        g.addEdge(1, 2,1);
        assertEquals(4, g.getNodeSize());
        g.addEdge(1, 3, 1);
        assertEquals(5, g.getNodeSize());
        g.addEdge(1, 4, 1);
        assertEquals(5, g.getNodeSize());
        g.addEdge(2, 3, 2);
        assertEquals(5, g.getNodeSize());
        g.addEdge(3, 4, 1);
        assertEquals(5, g.getNodeSize());
    }

    @Test
    public void testGetBFTraversal() {
        Graph<String> g = new Graph<String>();
        assertEquals(0, g.getNodeSize());
        g.addEdge("Pandora", "Arendelle",null);
        g.addEdge("Arendelle", "Metroville", null);
        g.addEdge("Arendelle", "Monstroplolis",null);
        g.addEdge("Metroville", "Monstroplolis", null);
        g.addEdge("Metroville", "Narnia", null);
        g.addEdge("Metroville", "Naboo", null);
        g.addEdge("Monstroplolis", "Naboo", null);
        g.addEdge("Narnia", "Naboo", null);
        assertEquals(6, g.getNodeSize());
        assertTrue(g.getNodes().contains("Pandora"));
        assertTrue(g.getNodes().contains("Arendelle"));
        assertTrue(g.getNodes().contains("Metroville"));
        assertTrue(g.getNodes().contains("Monstroplolis"));
        assertTrue(g.getNodes().contains("Narnia"));
        assertTrue(g.getNodes().contains("Naboo"));
        Set<String> s = new HashSet<>();
        s = g.getBFTraversal("Pandora");
        int n = s.size();
        List<String> actual = new ArrayList<String>(n);
        for (String x : s)
            actual.add(x);

        LinkedList<String> expected = new LinkedList<>();
        expected.add("Pandora");
        expected.add("Arendelle");
        expected.add("Metroville");
        expected.add("Monstroplolis");
        expected.add("Narnia");
        expected.add("Naboo");
        assertEquals(expected, actual);
    }
}