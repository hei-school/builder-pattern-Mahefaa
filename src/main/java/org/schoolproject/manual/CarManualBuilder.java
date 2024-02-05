package org.schoolproject.manual;

import org.schoolproject.Builder;
import org.schoolproject.car.parts.Engine;

public class CarManualBuilder implements Builder<Manual> {
  public CarManualBuilder() {
    this.manual = new Manual();
  }

  public CarManualBuilder(Manual manual) {
    this.manual = manual;
  }

  private Manual manual;

  @Override
  public void reset() {
    this.manual = new Manual();
  }

  @Override
  public void setSeats(Integer number) {
    this.manual.setSeats(number);
  }

  @Override
  public void setEngine(Engine engine) {
    this.manual.setEngine(engine);
  }

  @Override
  public void setTripComputer() {
    this.manual.setHasTripComputer(true);
  }

  @Override
  public void setGps() {
    this.manual.setHasGps(true);
  }

  @Override
  public Manual getResult() {
    return this.manual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CarManualBuilder that = (CarManualBuilder) o;

    return manual.equals(that.manual);
  }

  @Override
  public int hashCode() {
    return manual.hashCode();
  }
}
