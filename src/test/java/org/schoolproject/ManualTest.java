package org.schoolproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.schoolproject.car.parts.SportsEngine;
import org.schoolproject.car.parts.SuvEngine;
import org.schoolproject.manual.CarManualBuilder;
import org.schoolproject.manual.Manual;

public class ManualTest {
  static Manual expectedCarManual() {
    Manual result = new Manual();
    result.setEngine(new SportsEngine());
    result.setSeats(10);
    result.setHasGps(true);
    return result;
  }

  static Manual suvManual() {
    Manual suvManual = new Manual();
    suvManual.setSeats(8);
    suvManual.setEngine(new SuvEngine());
    suvManual.setHasTripComputer(true);
    suvManual.setHasGps(true);
    return suvManual;
  }

  static Manual sportsCarManual() {
    Manual sportsManual = new Manual();
    sportsManual.setSeats(2);
    sportsManual.setEngine(new SportsEngine());
    sportsManual.setHasTripComputer(true);
    sportsManual.setHasGps(true);
    return sportsManual;
  }

  @Test
  public void client_build_car_manual_ok() {
    CarManualBuilder builder = new CarManualBuilder();

    builder.setEngine(new SportsEngine());
    builder.setGps();
    builder.setSeats(10);

    Manual result = builder.getResult();
    assertEquals(expectedCarManual(), result);
  }

  @Test
  public void client_build_car_via_director_ok() {
    Director director = new Director();
    CarManualBuilder carManualBuilder = new CarManualBuilder();

    director.makeSUV(carManualBuilder);
    Manual makeSuvResult = carManualBuilder.getResult();
    director.makeSportsCar(carManualBuilder);
    Manual makeSportsCarResult = carManualBuilder.getResult();

    assertEquals(suvManual(), makeSuvResult);
    assertEquals(sportsCarManual(), makeSportsCarResult);
  }
}
