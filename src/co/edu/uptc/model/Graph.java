package co.edu.uptc.model;

import co.edu.uptc.pojo.Direction;
import co.edu.uptc.pojo.Edge;
import co.edu.uptc.pojo.Node;
import co.edu.uptc.pojo.WayType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Node, List<Edge>> graph;

    public Graph(Map<Node, List<Edge>> graph) {
        this.graph = graph;
    }

    public Graph() {
        graph = new HashMap<>();
    }

    public void addNode(Node node) {
        if (validateNodeNotExists(node)) graph.put(node, new ArrayList<>());
    }

    private boolean validateNodeNotExists(Node node) {
        for (Node Node : graph.keySet()) {
            if (Node.getId() == node.getId()) {
                return false;
            }
        }
        return true;
    }

    public void removeNode(Node node) {
        if (graph.get(node).isEmpty()) graph.remove(node);
    }
    public void addEdge(Node origin, Node destine, double speed, WayType wayType, Direction direction) {
        Edge Edge = new Edge(origin, destine, speed, wayType, direction);
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
