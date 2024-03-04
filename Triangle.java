public class Triangle {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Triangle(double sLength) {
        s1 = sLength;
        s2 = sLength;
        s3 = sLength;
    }

    // getters
    public double getS1() {
        return s1;
    }
    public double getS2() {
        return s2;
    }
    public double getS3() {
        return s3;
    }

    // methods
    public boolean isScalene() {
        if(s1 != s2 && s1 != s3 && s2 != s3) {
            return true;
        }
        return false;
    }

    public boolean isIsosceles() {
        if(s1 == s2 || s1 == s3 || s2 == s3) {
            return true;
        }
        return false;
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    public void dilate(double SF) {
        s1 *= SF;
        s2 *= SF;
        s3 *= SF;
    }

    public boolean isCongruent(Triangle t2) {
        if(s1 == t2.s1 && s2 == t2.s2 && s3 == t2.s3) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Side 1: " + s1 + "\nSide 2: " + s2 + "\nSide 3: " + s3;
    }

}
