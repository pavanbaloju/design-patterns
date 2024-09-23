## Classes and Objects

### Class
A blueprint for creating objects. It contains fields (attributes) and methods to define the behavior and state of objects.

### Object
An instance of a class. Objects represent real-world entities

### Example
```java
class Car {
  // Fields (attributes)
  String brand;
  String model;

  // Constructor
  Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  // Method (behavior)
  void displayInfo() {
    System.out.println("Car: " + brand + ", Model: " + model);
  }
}
```

## Encapsulation

Encapsulation is the mechanism of wrapping the data (variables) and behaviour (methods) together as a single unit. 
It restricts direct access to some of the object's components. Encapsulation helps in achieving data hiding and abstraction.
In Java, encapsulation is achieved by:
- Making class variables private.
- Providing public getter and setter methods to modify and view the variables

### Example
```java
class Person {
    // Private fields
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
```

### Inheritance

Inheritance is a mechanism in which one class acquires the properties and behavior of another class. 

### Example
```java
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```

### Polymorphism

Polymorphism is the ability of an object to take on multiple forms. 
In Java, polymorphism is achieved by 
- Method overriding : Defining multiple methods with the same name but different parameters.
- Method overloading : Providing a specific implementation for a method in a subclass that is already defined in the superclass

### Example
```java
// Method overriding
class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}
```

```java
// Method overloading
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

### Abstraction

Abstraction is the concept of hiding the complex implementation details and showing only the necessary features of an object.
In Java, abstraction is achieved by using abstract classes and interfaces.

### Example
```java
// Abstract class
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}
```

