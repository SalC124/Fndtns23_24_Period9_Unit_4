
public class Circle2dTester {
    public static void main(String[] args) {
        Circle2d c1 = new Circle2d(4, 5, 3);
        Circle2d c2 = new Circle2d(12.5, 10.1);

        System.out.println("Quiz Results!");
        System.out.println("1 - " + c1);
        System.out.println("2 - " + c2);

        if (((int)c1.getArea()) == 28)
            System.out.println("Passed 1");
        else
            System.out.println("Failed 1");

        if (((int)c1.getCircumference()) == 18)
            System.out.println("Passed 2");
        else
            System.out.println("Failed 2");

        if (((int)c1.distance(c2)) == 9)
            System.out.println("Passed 3");
        else
            System.out.println("Failed 3");

        if (c1.contains(7,5))
            System.out.println("Passed 4");
        else
            System.out.println("Failed 4");

        if (!c1.contains(8,-1))
            System.out.println("Passed 5");
        else
            System.out.println("Failed 5");

        c1.translate(5, 2);
        if ((c1.getX() == 9) && (c1.getY() == 7))
            System.out.println("Passed 6");
        else
            System.out.println("Failed 6");

        c1.expand(5);
        if ((c1.getRadius() == 8))
            System.out.println("Passed 7");
        else
            System.out.println("Failed 7");

        if ((c2.getRadius() == 1))
            System.out.println("Passed 8");
        else
            System.out.println("Failed 8");

    }
}
