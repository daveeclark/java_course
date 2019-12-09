package chapter10_demo;

import chapter10.Dog;

public class Market {

  public static void main(String[] args) {
    Apple gala = new Apple();
    gala.makeJuice();
    gala.makeSlices(6);

    Fruit banana = new Banana();
    banana.makeJuice();

    banana = new Apple();
    banana.makeJuice();
  }

}
