package co.edu.uptc.model;

import co.edu.uptc.pojo.Edge;
import co.edu.uptc.pojo.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Node, List<Edge>> grafo = new HashMap<>();

    public void addNode(Node Node) {
        grafo.put(Node, new ArrayList<>());
    }

    public void addEdge(Node origin, Node destine, double distance, double speed, String wayType) {
        Edge Edge = new Edge(origin, destine, distance, speed, wayType);
        grafo.get(origin).add(Edge);
        grafo.get(destine).add(Edge);
    }

    public List<Edge> getEdges(Node Node) {
        return grafo.get(Node);
    }

    public List<Node> getNodes() {
        return new ArrayList<>(grafo.keySet());
    }

}
