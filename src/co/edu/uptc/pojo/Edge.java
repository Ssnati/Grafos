package co.edu.uptc.pojo;

public class Edge {
    private Node origin;
    private Node destine;
    private double speed;
    private WayType wayType;
    private Direction direction;

    public Edge() {
    }

    public Edge(Node origin, Node destine, double speed, WayType wayType, Direction direction) {
        this.origin = origin;
        this.destine = destine;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public WayType getWayType() {
        return wayType;
    }

    public void setWayType(WayType wayType) {
        this.wayType = wayType;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
