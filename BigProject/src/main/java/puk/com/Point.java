package puk.com;

public class Point{
    private double lat;
    private double lon;
    private String name;
    public Point (double lat; double lon; String name) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
     }
    public String getName(){
        return this.name;
    }
    public double getLat(){
        return this.lat;
    }
    public double getLon(){
        return this.lon;
    }
    public void setName(String newName){
        this.name = newName;
    }
}