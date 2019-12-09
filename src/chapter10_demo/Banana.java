package chapter10_demo;

public class Banana extends Fruit {

  @Override
  public void makeJuice(){
    System.out.println("Ew you like banana juice??");
  }

  public void peel(){
    System.out.println("Consider peeling your banana before eating it");
  }

}
