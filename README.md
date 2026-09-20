# Factory Method & Abstract Factory Assignment

## Course
Software Design Patterns

## Assignment
Assignment #2 — Factory Method & Abstract Factory

## Description
This project demonstrates two creational design patterns in Java:

1. Factory Method
2. Abstract Factory

The project uses a vehicle-related example.

---

## Part 1 — Factory Method

The Factory Method pattern is used to create different types of vehicles.

### Product
- Vehicle

### Concrete Products
- TwoWheeler
- FourWheeler

### Creator
- VehicleFactory

### Concrete Creators
- TwoWheelerFactory
- FourWheelerFactory

Each concrete factory creates its own type of vehicle.

---

## Part 2 — Abstract Factory

The Abstract Factory pattern is used to create families of related vehicle parts.

### Abstract Products
- Engine
- Wheel

### Sport Family
- SportEngine
- SportWheel

### City Family
- CityEngine
- CityWheel

### Abstract Factory
- VehiclePartsFactory

### Concrete Factories
- SportPartsFactory
- CityPartsFactory

The VehiclePartsClient works with abstract interfaces instead of depending directly on concrete products.

---

## Clean Code Principles

The project demonstrates the following Clean Code principles:

1. Meaningful Names
2. Programming to Interfaces
3. Avoiding unnecessary conditional logic
4. Small Methods / Single Responsibility
5. DRY (Don't Repeat Yourself)

---

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3.  JDK 17 must be selected.
4. Run `Main.java`.

Expected output:

```text
Factory Method
Driving a two-wheeler vehicle
Driving a four-wheeler vehicle

Abstract Factory
Starting sport engine
Rotating sport wheel
Starting city engine
Rotating city wheel