package chapter10_demo;

public class Fruit {

  private double calories;

  public Fruit(){}

  public Fruit(double calories){
    setCalories(calories);
  }

  public double getCalories(){
    return calories;
  }

  public void setCalories(double calories){
    this.calories = calories;
  }

  public void makeJuice(){
    System.out.println("Juice is made.");
  }
}
