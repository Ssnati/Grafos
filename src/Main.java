import co.edu.uptc.model.Graph;
import co.edu.uptc.pojo.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(new Node(1, "Tunja", 0, 0));
        graph.addNode(new Node(1, "Tunja2", 0, 0));
        graph.addNode(new Node(2, "Paipa", 0, 1));
        graph.addNode(new Node(3, "Duitama", 1, 0));
        graph.addNode(new Node(4, "Sogamoso", 1, 1));
        graph.addNode(new Node(5, "Sogamoso2", 1, 1));
        for (Node node : graph.getNodes()) {
            System.out.println(toString(node));
        }
        graph.addEdge(graph.getNodes().get(0), graph.getNodes().get(1), 50, WayType.PAVEMENT, Direction.BIDIRECTIONAL);
        graph.addEdge(graph.getNodes().get(1), graph.getNodes().get(2), 20, WayType.PAVEMENT, Direction.BIDIRECTIONAL);
        graph.addEdge(graph.getNodes().get(2), graph.getNodes().get(3), 30, WayType.PAVEMENT, Direction.ORIGIN_TO_DESTINE);

        graph.removeNode(graph.getNodes().get(0));
        System.out.println("--------------------------------------------------");
        for (Node node : graph.getNodes()) {
            System.out.println(toString(node));
        }
        graph.removeNode(graph.getNodes().get(4));
        System.out.println("--------------------------------------------------");
        for (Node node : graph.getNodes()) {
            System.out.println(toString(node));
        }
//        toString(graph);
    }

    private static void toString(Graph graph) {
        for (Node node : graph.getNodes()) {
            System.out.println(toString(node));
            for (Edge edge : graph.getEdges(node)) {
                System.out.println("\t" + toString(edge) + "\n");
            }
        }
    }

    private static String toString(Edge edge) {
        return "Edge{" +
                "origin=" + toString(edge.getOrigin()) + ",\n\t" +
                "destine=" + toString(edge.getDestine()) +
                ", speed=" + edge.getSpeed() +
                ", wayType=" + edge.getWayType() +
                ", direction=" + edge.getDirection() +
                '}';
    }

    private static String toString(Node node) {
        return "Node{" +
                "id=" + node.getId() +
                ", name='" + node.getName() + '\'' +
                ", latitude=" + node.getLatitude() +
                ", longitude=" + node.getLongitude() +
                '}';
    }
}
