import java.lang.Math;
public class Circle2d {
    private double x;
    private double y;
    private double radius;

    public Circle2d(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2d(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    // getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }

    // methods
    public void translate(double dx, double dy) {
        x += dx;
        y += dy; 
    }
    public void expand(double amt) {
        radius += amt;
    }




}