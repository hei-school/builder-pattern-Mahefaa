package org.schoolproject;

import org.schoolproject.car.parts.Engine;

public interface Builder<T> {
  void reset();

  void setSeats(Integer number);

  void setEngine(Engine engine);

  void setTripComputer();

  void setGps();

  T getResult();
}
