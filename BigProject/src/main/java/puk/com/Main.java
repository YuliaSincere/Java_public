
import java.io.*;
import java.util.*;

public class Main {
    public void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lat");

        Point p = new Point(0, 0, "");

        p.getLat();
        System.out.println("enter lon");
        p.getLon();
        System.out.println("enter name");
        p.getName();
        System.out.println(p.getLat() + " " + p.getLon() + " " + name);
        System.out.println("enter new name");
        p.setName();
        System.out.println(lat + " " + lon + " " + name);
    }
}