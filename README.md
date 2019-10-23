# practice-programs
Inheritance examples

Report:
1) A: Modifier public not allowed here.          
   B: Can't have private methods in an interface. 
   C: An interface can only have public methods, so there is no point declairing it public.

2) A: Interface abstract methods cannot have body.
   B: Interfaces only have constant variables and abstract methods.

3) A: Circle is not abstract and does not override abstract method getType().
   B: Because Circle is not abstract.

4) A: An abstract class is a class that has abstract methods. An abstract method is a method that is declared, 
   but contains no implementation. It serves as a place holder for a method that must
   be defined in all nonabstract derived classes.
   B: Because ShapeBase is a base class.

5) A: The benefit of having ShapeBase an abstract class is that it functions as a base for other classes.
   B: Circle and Rectangle are classes derived from ShapeBase class, and ShapeBase class implements Shape class.

6)It is overriding Object's to String method. The java toString() method is used when we need a 
  string representation of an object.
