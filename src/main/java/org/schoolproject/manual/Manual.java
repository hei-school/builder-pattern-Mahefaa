package org.schoolproject.manual;

import org.schoolproject.car.parts.Engine;

public class Manual {
  private int seats;
  private Engine engine;
  private boolean hasTripComputer;
  private boolean hasGps;

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public boolean isHasTripComputer() {
    return hasTripComputer;
  }

  public void setHasTripComputer(boolean hasTripComputer) {
    this.hasTripComputer = hasTripComputer;
  }

  public boolean isHasGps() {
    return hasGps;
  }

  public void setHasGps(boolean hasGps) {
    this.hasGps = hasGps;
  }

  @Override
  public String toString() {
    return "Manual{"
        + "seats="
        + seats
        + ", engine="
        + engine
        + ", hasTripComputer="
        + hasTripComputer
        + ", hasGps="
        + hasGps
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Manual manual = (Manual) o;

    if (seats != manual.seats) return false;
    if (hasTripComputer != manual.hasTripComputer) return false;
    if (hasGps != manual.hasGps) return false;
    return engine.equals(manual.engine);
  }

  @Override
  public int hashCode() {
    int result = seats;
    result = 31 * result + engine.hashCode();
    result = 31 * result + (hasTripComputer ? 1 : 0);
    result = 31 * result + (hasGps ? 1 : 0);
    return result;
  }
}
