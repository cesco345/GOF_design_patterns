# Classes Refresher

**Class vs. Object**:
A **class** is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of that class will have.
An **object** is an instance of a class. It is a concrete entity that represents a specific instance of the class, with its own set of attribute values.

**Instantiating:**
Instantiating refers to the process of creating an object from a class. When you instantiate a class, you create a new instance of that class in memory.

**Stack vs. Heap Memory:**
Stack: Stack memory is used for static memory allocation, primarily for storing method calls, local variables, and references to objects. It is organized in a LIFO (Last-In, First-Out) manner and is typically limited in size.
Heap: Heap memory is used for dynamic memory allocation, primarily for storing objects and data structures. It is not organized in any particular order and is much larger than the stack memory.
Management: Stack memory is managed by the compiler and is automatically allocated and deallocated as method calls are made and completed. Heap memory is managed by the Java Virtual Machine (JVM) and requires manual memory management, such as garbage collection.

**Problems of Procedural Code:**
Procedural code can lead to code duplication, making it harder to maintain and modify.
It can also lead to tight coupling between different parts of the code, making it less reusable and less modular.
Procedural code may lack proper encapsulation, leading to potential data integrity issues and difficulty in managing complexity.

**Encapsulation:**
Encapsulation is the bundling of data (attributes) and methods (behaviors) that operate on the data into a single unit called a class. It hides the internal state of an object and only exposes the necessary functionality through well-defined interfaces (methods).

**Private Fields:**
Declaring fields as private ensures that they can only be accessed and modified within the class in which they are declared. This helps maintain data integrity and prevents unintended modification of the object's state from outside the class.

**Abstraction:**
Abstraction is the process of hiding the implementation details of a class and only showing the essential features of the object. It allows you to focus on what an object does rather than how it does it.

**Coupling:**
Coupling refers to the degree of interdependence between modules or components within a system. High coupling indicates strong dependencies between components, while low coupling indicates loose dependencies.

**Abstraction and Coupling:**
Abstraction helps reduce coupling by hiding the implementation details of a class and providing well-defined interfaces. This allows classes to interact with each other through abstract interfaces rather than relying on concrete implementations, thereby reducing dependencies.

**Constructors:**
Constructors are special methods in a class used for initializing objects. They have the same name as the class and are invoked automatically when an object is created.

**Method Overloading:**
Method overloading is the practice of defining multiple methods in a class with the same name but different parameter lists. It allows you to define methods that perform similar tasks but operate on different types or numbers of parameters.

**Static Methods:**
Static methods are methods in a class that belong to the class itself rather than to any individual object. They can be called directly using the class name and are commonly used for utility methods or operations that don't require access to instance variables.
