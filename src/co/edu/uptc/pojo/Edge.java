package co.edu.uptc.pojo;

public class Edge {
    private Node origin;
    private Node destine;
    private double distance;
    private double speed;
    private String wayType;
    private Direction direction;

    public Edge() {
    }

    public Edge(Node origin, Node destine, double distance, double speed, String wayType, Direction direction) {
        this.origin = origin;
        this.destine = destine;
        this.distance = distance;
        this.speed = speed;
        this.wayType = wayType;
        this.direction = direction;
    }

    public Node getOrigin() {
        return origin;
    }

    public void setOrigin(Node origin) {
        this.origin = origin;
    }

    public Node getDestine() {
        return destine;
    }

    public void setDestine(Node destine) {
        this.destine = destine;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getWayType() {
        return wayType;
    }

    public void setWayType(String wayType) {
        this.wayType = wayType;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
