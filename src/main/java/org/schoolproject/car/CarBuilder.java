package org.schoolproject.car;

import org.schoolproject.Builder;
import org.schoolproject.car.parts.Engine;

public class CarBuilder implements Builder<Car> {
  public CarBuilder(Car car) {
    this.car = car;
  }

  public CarBuilder() {
    this.car = new Car();
  }

  private Car car;

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeats(Integer number) {
    car.setSeats(number);
  }

  @Override
  public void setEngine(Engine engine) {
    car.setEngine(engine);
  }

  @Override
  public void setTripComputer() {
    car.setHasTripComputer(true);
  }

  @Override
  public void setGps() {
    car.setHasGps(true);
  }

  @Override
  public Car getResult() {
    return car;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CarBuilder that = (CarBuilder) o;

    return car.equals(that.car);
  }

  @Override
  public int hashCode() {
    return car.hashCode();
  }
}
