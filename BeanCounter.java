public class BeanCounter {
    // instance variables
    private String name;
    private int beanCount;

    // constructor
    public BeanCounter(String name, int beanCount) {
        this.name = name;
        this.beanCount = beanCount;
    }
    // overloaded constructor
    public BeanCounter(String name) {
        this.name = name;
        beanCount = 0;
    }

    // toString method
    public String toString() {
        return "name: " + name + " Bean Count: " + beanCount;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getBeanCount() {
        return beanCount;
    }

    // mutators
    public void count() {
        beanCount++;
    }

    // setters
    public void setName(String newName) {
        name = newName;
    }
}