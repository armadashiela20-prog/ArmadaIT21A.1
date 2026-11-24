Polymorphism and Abstraction

PolymorphismDemo.java This program demonstrates polymorphism using a payment system. It has one parent class named "Payment" and two child classes named "CashPayment" and "OnlinePayment". Both child classes use the same method called "makePayment()", but they perform different actions. CashPayment displays a message about paying with cash, while OnlinePayment displays a message about paying through online banking.
How Polymorphism Works in My Code: The parent class is "Payment", while the child classes are "CashPayment" and "OnlinePayment". The method "makePayment()" is overridden in both child classes using "@Override". I used parent-class references to create and call different child objects. This shows that the same method can produce different results depending on the object.

AbstractionDemo.java This program demonstrates abstraction using a transportation system. It has an abstract class named "Vehicle" and two child classes named "Car" and "Motorcycle". The abstract method is "startEngine()", while the concrete method is "stopVehicle()". Each child class provides its own implementation of the abstract method.
How Abstraction Works in My Code: The abstract class is "Vehicle". It's abstract method is "startEngine()", which does not have a method body. The "Car" and "Motorcycle" classes extend the "Vehicle" class and provide their own implementations of "startEngine()". Then the concrete method "stopVehicle()" is already provided by the parent class and can be used by both child classes. This makes the program easier to organize because the common behavior is placed in one parent class.

Difference Between Polymorphism and Abstraction For me, polymorphism is about using the same method name but allowing different classes to perform different actions. The abstraction is about hiding unnecessary details and showing only the important parts of a program. Both concepts help make Java programs more organized and easier to understand, but they have different purposes.

Questions :

Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method? Method overriding is important because it allows each child class to have its own behavior even if they use the same method name. If a child class does not override the parent's method, it will use the original method from the parent class instead.

Why can't we create an object directly from an abstract class? What is the purpose of this restriction? We cannot create an object directly from an abstract class because it may contain methods without complete implementations. The purpose is to make child classes provide the missing behaviors before they can be used as actual objects.

If you need to add another child class to your polymorphism program, how would your existing code handle it? I can add another child class that extends the Payment class.,i only need to override the makePayment() method and provide a new payment behavior. The program can then use a Payment reference to call that new child object.

Can polymorphism and abstraction work together in a single program? Explain how and provide an example. Yes, polymorphism and abstraction can work together in one program. For example: I can create an abstract class named Vehicle with an abstract method called startEngine(). Then, I can create Car and Motorcycle classes that extend Vehicle and provide different implementations of startEngine()., Using a Vehicle reference to call the method of each object demonstrates polymorphism.

As a future programmer, when would you use polymorphism, and when would you use abstraction? As a future programmer, I would like to use polymorphism when I need different classes to perform different actions using the same method. Then I would use abstraction when I want to hide unnecessary implementation details and provide a common structure for related classes. The polymorphism and abstraction are both useful when creating organized and maintainable programs.
