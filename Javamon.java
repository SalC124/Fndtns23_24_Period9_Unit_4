// By Sal
// help used: Circle2d to see if what I was typing was in the right format
import java.lang.Math;
public class Javamon {
    private String name = null;
    private int health = 100;
    private int strength = 20;
    private double accuracy = 0.8;

    public Javamon(String name) {
        this.name = name;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    } 
    public int getStrength() {
        return strength;
    }
    public double getAccuracy() {
        return accuracy;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
        nonNegativeHealth();
    }
    public void setStrength(int strength) {
        this.strength = strength;
        nonNegativeStrength();
    }
    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
        keepAccuracyInRange();
    }

    // setters (extra)
    public void nonNegativeHealth() {
        if(health < 0) {
            health = 0;
        }
    }
    public void nonNegativeStrength() {
        if(strength < 1) {
            strength = 1;
        }
    }
    public void keepAccuracyInRange() {
        if(accuracy < 0.01) {
            accuracy = 0.01;
        }
        if(accuracy > 1.0) {
            accuracy = 1.0;
        }
    }

    // toString (special boy)
    public String toString() {
        return name + " [" + health + "]";
    }

    // methods
    public void takeDamage(int damage) {
        health -= damage;
        nonNegativeHealth();
    }
    public boolean isDefeated() {
        return health == 0;
    }
    public int calculateAttackDamage() {
        return (int)(Math.random() * strength) + 1;
    }
    public boolean calculateAttackSuccess() {
        return (int)(Math.random() * 100) < accuracy * 100;
    }
    public String attemptAttack(Javamon enemy) {
        if(calculateAttackSuccess()) {
            int damageTemp = calculateAttackDamage();
            enemy.health -= damageTemp;
            enemy.nonNegativeHealth();
            return "\t" + getName() + " attacks " + enemy.getName() + " and deals " + damageTemp + " damage.";
        } else {
            return "\t" + getName() + " attacks " + enemy.getName() + " - but the attack misses!";
        }
    }
}