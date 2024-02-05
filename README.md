Builder is a Java implementation of [builder creational design pattern](https://refactoring.guru/design-patterns/builder).

This version shows the power of Builder Design Pattern on a Car / CarManual architecture.

### Description:
Let's assume that you are a car enthusiast.
In order to get a car, you have two main choices, either building it from scratch or asking someone to do it for you.
For the former choice, you can create you own car by creating a baseCar ( CarBuilder) and specifying all your needs :
    What kind of engine ?, how many seats ? will there be a TripComputer ?
    you have complete control over your car.

However, if you have got lesser time, you can also ask a Director to do it for you.
Then you will tell the Director to give you a SportsCar or an SUV and he will do it by himself.

### Features:
    * Build a Car from scratch
    * Build a Car via the Director
    * Build a CarManual from scratch
    * Build a CarManual from a Director

### Technologies:
    * Java 17 and junit5.9.1

### Code formatter:
    The code formatting follows google-java-format-1.18.1 and is executed as follows to format the entire project's java files :
```shell
./format.sh
```

### Testing:
    the testing is done via junit, and is rendered is CI via github actions

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)
