public class BeanCounterDemo {
    public static void main(String[] args) {
        BeanCounter counter1 = new BeanCounter("John Doe", 100);
        System.out.println("Counter1: " + counter1);

        // explicit use of toString() method
        System.out.println(counter1.toString() + "explicit");
        // implicit use of toString() method
        System.out.println(counter1 + "implicit");

        BeanCounter counter2 = new BeanCounter("Jane Doe");
        System.out.println("Counter2: " + counter2);

        System.out.println("Name of the Counter2: " + counter2.getName());
        System.out.println("Name of the Counter1: " + counter1.getName());

        System.out.println("Beans of the Counter2: " + counter2.getBeanCount());

        for(int i = 0; i < 5; i++) {
            counter2.count();
        }
        System.out.println("The count for counter2: " + counter2.getBeanCount());

        // set the counter 1's name to Jack
        counter1.setName("Jack");

        System.out.println("The updated name of counter1: " + counter1.getName());
    }
}
