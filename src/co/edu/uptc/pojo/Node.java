package co.edu.uptc.pojo;

public class Node {
    private int id;
    private String name;
    private double latitud;
    private double longitud;

    public Node() {
    }
    public Node(int id, String name, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.latitud = latitude;
        this.longitud = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
