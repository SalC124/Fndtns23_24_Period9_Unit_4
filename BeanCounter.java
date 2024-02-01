public class BeanCounter {
    // instance variables
    private String name;
    private int beanCount;

    // constructor
    public BeanCounter(String name, int beanCount) {
        this.name = name;
        this.beanCount = beanCount;
    }

    // toString method
    public String toString() {
        return "name: " + name + " Bean Count: " + beanCount;
    }
}