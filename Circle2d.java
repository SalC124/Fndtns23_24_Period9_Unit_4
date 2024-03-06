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
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
    public double getCircumference() {
        return (2 * radius * Math.PI);
    }

    // methods
    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }
    public void expand(double amt) {
        radius += amt;
    }
    public double distance(Circle2d c2) {
        return Math.pow(Math.pow(Math.abs(x - c2.getX()),2) + Math.pow(Math.abs(y - c2.getY()),2),0.5);
    }
    public boolean contains(double x, double y) {
        return Math.pow(Math.pow(Math.abs(this.x - x), 2) + Math.pow(Math.abs(this.y - y), 2), 0.5) == radius;
    }

// toString (yes, it get's its own section)
    public String toString() {
        return "Circle: (" + x + ", " + y + "); Radius: " + radius;
    }

}