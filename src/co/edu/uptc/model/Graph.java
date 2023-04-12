package co.edu.uptc.model;

import co.edu.uptc.pojo.Direction;
import co.edu.uptc.pojo.Edge;
import co.edu.uptc.pojo.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Node, List<Edge>> graph = new HashMap<>();

    public void addNode(Node Node) {
        graph.put(Node, new ArrayList<>());
    }

    public void addEdge(Node origin, Node destine, double distance, double speed, String wayType, Direction direction) {
        Edge Edge = new Edge(origin, destine, distance, speed, wayType, direction);
        graph.get(origin).add(Edge);
        graph.get(destine).add(Edge);
    }

    public List<Edge> getEdges(Node Node) {
        return graph.get(Node);
    }

    public List<Node> getNodes() {
        return new ArrayList<>(graph.keySet());
    }

}
