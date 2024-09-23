Design principles are guidelines that help in creating software that is scalable, maintainable, and flexible. They promote good practices in object-oriented design and improve the quality of code.

Here are some core object-oriented design principles:

### 1. **Single Responsibility Principle (SRP)**:
- **Definition**: A class should have **one and only one reason to change**, meaning it should only have one job or responsibility.
- **Explanation**: Each class should be focused on a single task. If a class has multiple responsibilities, it becomes harder to maintain and debug.
- **Example**: A class that handles both user authentication and user database operations violates SRP because these are two different responsibilities.

**Before (Violation of SRP)**:
   ```java
   class UserManager {
       void authenticateUser(String username, String password) {
           // Authentication logic
       }

       void saveUser(User user) {
           // Database logic
       }
   }
   ```

**After (Following SRP)**:
   ```java
   class Authenticator {
       void authenticateUser(String username, String password) {
           // Authentication logic
       }
   }

   class UserRepository {
       void saveUser(User user) {
           // Database logic
       }
   }
   ```

### 2. **Open/Closed Principle (OCP)**:
- **Definition**: Software entities (classes, modules, functions) should be **open for extension, but closed for modification**.
- **Explanation**: You should be able to extend the behavior of a class without modifying its source code. This is often achieved through inheritance or interfaces.
- **Example**: If you want to add new functionality, you should extend the class, not alter the existing class logic.

**Before (Violation of OCP)**:
   ```java
   class Shape {
       String type;

       double area() {
           if (type.equals("circle")) {
               // Calculate circle area
           } else if (type.equals("square")) {
               // Calculate square area
           }
           return 0;
       }
   }
   ```

**After (Following OCP)**:
   ```java
   abstract class Shape {
       abstract double area();
   }

   class Circle extends Shape {
       double area() {
           // Calculate circle area
           return Math.PI * radius * radius;
       }
   }

   class Square extends Shape {
       double area() {
           // Calculate square area
           return side * side;
       }
   }
   ```

### 3. **Liskov Substitution Principle (LSP)**:
- **Definition**: Subtypes must be substitutable for their base types without affecting the correctness of the program.
- **Explanation**: Derived classes should be able to replace base classes without altering the desired behavior. In other words, objects of a subclass should behave just like objects of the superclass.
- **Example**: If a class `Square` inherits from `Rectangle`, it should still behave as a `Rectangle` (but in reality, a square isn't exactly interchangeable with a rectangle).

**Before (Violation of LSP)**:
   ```java
   class Rectangle {
       private int width;
       private int height;

       public void setWidth(int width) {
           this.width = width;
       }

       public void setHeight(int height) {
           this.height = height;
       }

       public int getArea() {
           return width * height;
       }
   }

   class Square extends Rectangle {
       @Override
       public void setWidth(int width) {
           super.setWidth(width);
           super.setHeight(width);  // Violation of LSP
       }

       @Override
       public void setHeight(int height) {
           super.setHeight(height);
           super.setWidth(height);  // Violation of LSP
       }
   }
   ```

**After (Following LSP)**:
   ```java
   class Shape {
       int area() {
           return 0;
       }
   }

   class Rectangle extends Shape {
       private int width;
       private int height;

       public void setWidth(int width) {
           this.width = width;
       }

       public void setHeight(int height) {
           this.height = height;
       }

       @Override
       int area() {
           return width * height;
       }
   }

   class Square extends Shape {
       private int side;

       public void setSide(int side) {
           this.side = side;
       }

       @Override
       int area() {
           return side * side;
       }
   }
   ```

### 4. **Interface Segregation Principle (ISP)**:
- **Definition**: No client should be forced to depend on methods it does not use.
- **Explanation**: It’s better to create smaller, more specific interfaces rather than a large, general-purpose interface. Classes should not be forced to implement methods they don't need.
- **Example**: If you have a `Vehicle` interface, not all vehicles may need all methods like `fly()` or `sail()`.

**Before (Violation of ISP)**:
   ```java
   interface Vehicle {
       void drive();
       void fly();
       void sail();
   }

   class Car implements Vehicle {
       public void drive() {
           // Driving logic
       }

       public void fly() {
           // Violation: Cars can't fly
       }

       public void sail() {
           // Violation: Cars can't sail
       }
   }
   ```

**After (Following ISP)**:
   ```java
   interface Drivable {
       void drive();
   }

   interface Flyable {
       void fly();
   }

   interface Sailable {
       void sail();
   }

   class Car implements Drivable {
       public void drive() {
           // Driving logic
       }
   }
   ```

### 5. **Dependency Inversion Principle (DIP)**:
- **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions. Additionally, abstractions should not depend on details; details should depend on abstractions.
- **Explanation**: Instead of having high-level components directly depend on low-level components, both should depend on abstractions such as interfaces or abstract classes. This allows for loose coupling between components.
- **Example**: Instead of directly instantiating classes inside other classes, use dependency injection (pass dependencies via constructors or setters).

**Before (Violation of DIP)**:
   ```java
   class CreditCardPayment {
      public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
      }
}

    class PayPalPayment {
      public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
      }
    }
    
    class PaymentService {
      private CreditCardPayment creditCardPayment = new CreditCardPayment();
      private PayPalPayment payPalPayment = new PayPalPayment();
    
      public void processCreditCardPayment(double amount) {
        creditCardPayment.processPayment(amount);
      }
    
      public void processPayPalPayment(double amount) {
        payPalPayment.processPayment(amount);
      }
    }
    
    public class Main {
      public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processCreditCardPayment(100);
        paymentService.processPayPalPayment(150);
      }
    }

   ```

**After (Following DIP)**:
   ```java
    // Abstraction: PaymentMethod interface
    interface PaymentMethod {
      void processPayment(double amount);
    }
    
    // Concrete implementations of PaymentMethod
    class CreditCardPayment implements PaymentMethod {
      @Override
      public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
      }
    }
    
    class PayPalPayment implements PaymentMethod {
      @Override
      public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
      }
    }
    
    class BitcoinPayment implements PaymentMethod {
      @Override
      public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
      }
    }

    // High-level module: PaymentService now depends on PaymentMethod abstraction
    class PaymentService {
      private PaymentMethod paymentMethod;
    
      // Dependency Injection via constructor
      public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
      }
    
      public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
      }
    }

    public class Main {
      public static void main(String[] args) {
        // We can now switch between payment methods without changing PaymentService
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();
        PaymentMethod bitcoinPayment = new BitcoinPayment();
    
        // Injecting the desired payment method at runtime
        PaymentService paymentService = new PaymentService(creditCardPayment);
        paymentService.processPayment(100);
    
        paymentService = new PaymentService(payPalPayment);
        paymentService.processPayment(150);
    
        paymentService = new PaymentService(bitcoinPayment);
        paymentService.processPayment(200);
      }
    }
   ```

### Additional Design Principles:

- **DRY (Don’t Repeat Yourself)**:
    - Avoid duplicating code. Code should be reusable, and common functionality should be abstracted into separate methods or classes.

- **KISS (Keep It Simple, Stupid)**:
    - Simplicity is key. Avoid making your code unnecessarily complex.

- **YAGNI (You Aren’t Gonna Need It)**:
    - Don’t add functionality until it is necessary. Premature optimization can lead to over-engineering.

- **Composition Over Inheritance**:
    - Prefer composition (using objects of other classes as members) over inheritance where possible, as it leads to more flexible designs.
