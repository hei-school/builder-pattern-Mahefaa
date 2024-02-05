package org.schoolproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.schoolproject.car.Car;
import org.schoolproject.car.CarBuilder;
import org.schoolproject.car.parts.SportsEngine;
import org.schoolproject.car.parts.SuvEngine;

public class CarTest {
  static Car expectedCar() {
    Car result = new Car();
    result.setEngine(new SportsEngine());
    result.setSeats(10);
    result.setHasGps(true);
    return result;
  }

  static Car suv() {
    Car suv = new Car();
    suv.setSeats(8);
    suv.setEngine(new SuvEngine());
    suv.setHasTripComputer(true);
    suv.setHasGps(true);
    return suv;
  }

  static Car sportsCar() {
    Car sports = new Car();
    sports.setSeats(2);
    sports.setEngine(new SportsEngine());
    sports.setHasTripComputer(true);
    sports.setHasGps(true);
    return sports;
  }

  @Test
  public void client_build_car_ok() {
    CarBuilder carBuilder = new CarBuilder();

    carBuilder.setEngine(new SportsEngine());
    carBuilder.setGps();
    carBuilder.setSeats(10);

    Car result = carBuilder.getResult();
    assertEquals(expectedCar(), result);
  }

  @Test
  public void client_build_car_via_director_ok() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();

    director.makeSUV(carBuilder);
    Car makeSuvResult = carBuilder.getResult();
    director.makeSportsCar(carBuilder);
    Car makeSportsCarResult = carBuilder.getResult();

    assertEquals(suv(), makeSuvResult);
    assertEquals(sportsCar(), makeSportsCarResult);
  }
}
