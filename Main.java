import java.util.*;

public class Main {
  public static void main (String[] args) {
    
  }
  
  public static abstract class Beverage {
    protected int currentML;
    protected final int maxCapacity;
    protected abstract String getML();
    protected abstract String getName();
    
    public Beverage() {
      maxCapacity = 500;
      currentML = 500;
    }
    
    public Beverage(int maxCapacity) {
      this.maxCapacity = maxCapacity;
      currentML = maxCapacity;
    }
    
    public void drink() {
      int amount = currentML;
      currentML -= currentML;
      System.out.println("You drank " + amount + "ml");
    }
    
    public void drink(int ml) {}
    
    public void refill() {}
    
    public void refill(int ml) {}
    
    public int getCurrentML() {
      return currentML;
    }
    
    public int getMaxCapacity() {
      return maxCapacity;
    }
  }
}
