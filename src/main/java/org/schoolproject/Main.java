package org.schoolproject;

import org.schoolproject.car.CarBuilder;
import org.schoolproject.manual.CarManualBuilder;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    CarManualBuilder carManualBuilder = new CarManualBuilder();

    director.makeSUV(carBuilder);
    director.makeSUV(carManualBuilder);
    System.out.println(carBuilder.getResult());
    System.out.println(carManualBuilder.getResult());

    director.makeSportsCar(carBuilder);
    director.makeSportsCar(carManualBuilder);
    System.out.println(carBuilder.getResult());
    System.out.println(carManualBuilder.getResult());
  }
}
