package chapter10_demo;

public class Apple extends Fruit {

  private double appleSlices;

  public double getAppleSlices(){
    return appleSlices;
  }

  public void setAppleSlices(double appleSlices){
    this.appleSlices = appleSlices;
  }

  public Apple(){}

  public Apple(double appleSlices){
    setAppleSlices(appleSlices);
  }

  @Override
  public void makeJuice(){
    System.out.println("Here's apple juice");
  }

  public void makeSlices(double appleSlices){
    System.out.println("Here's " + appleSlices + " apple slices for ya!");
  }



}
