package org.schoolproject.car.parts;

import java.util.Objects;

public class SportsEngine implements Engine {
  @Override
  public String getType() {
    return "V8 Sports biturbo";
  }

  @Override
  public String toString() {
    return "SportsEngine{" + "type" + getType() + '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getType());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof SportsEngine obj1)) {
      return false;
    }
    return this.getType().equals(obj1.getType());
  }
}
