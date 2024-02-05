package org.schoolproject;

import org.schoolproject.car.parts.SportsEngine;
import org.schoolproject.car.parts.SuvEngine;

public class Director {
  public void makeSUV(Builder builder) {
    builder.reset();
    builder.setSeats(8);
    builder.setEngine(new SuvEngine());
    builder.setTripComputer();
    builder.setGps();
  }

  public void makeSportsCar(Builder builder) {
    builder.reset();
    builder.setSeats(2);
    builder.setEngine(new SportsEngine());
    builder.setTripComputer();
    builder.setGps();
  }
}
