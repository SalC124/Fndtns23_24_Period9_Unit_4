public class BeanCounterDemo {
    public static void main(String[] args) {
        BeanCounter counter1 = new BeanCounter("John Doe", 100);
        System.out.println("Counter1: " + counter1);

        // explicit use of toString() method
        System.out.println(counter1.toString() + "explicit");
        // implicit use of toString() method
        System.out.println(counter1 + "implicit");
    }
}
